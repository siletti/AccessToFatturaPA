package com.siletti.contab.app01.xmlb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;

import com.healthmarketscience.jackcess.Cursor;
import com.healthmarketscience.jackcess.CursorBuilder;
import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;

import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.*;

public class FatturaWriteXML {

	public static String WriteFile(File fatture) {
		String risultato = "";
		try (Database db = DatabaseBuilder.open(fatture);) {

			Table table = db.getTable("tmpTesta");
			for (Row row : table) {
				//	System.out.println("Look ma, a row: " + row);
				
				// Recupero dati 
				String cliente = row.getString("CodiceCliente");
				String clienteDenominazione = row.getString("RagioneSociale1");
				String clienteIva = row.getString("PartitaIva");
				String clienteIndirizzo = row.getString("Indirizzo");
				String clienteCap = row.getString("CAP");
				String clienteCitta = row.getString("Citta");
				String clienteProvincia = row.getString("Provincia");
				Date dataDocumento = row.getDate("DataDocumento");
				Short NumeroDocumento = row.getShort("NumeroDocumento");
				String clienteNFattura = Integer.toString(NumeroDocumento);
				String codiceDestinatario = row.getString("Vettore3");
				String pecDestinatario = row.getString("Vettore2");
				String sconto = row.getString("Sconto");
					// dati ddt per ogni fattura
				Table table2 = db.getTable("DatiDDT");
				Cursor cursor = CursorBuilder.createCursor(table2);
				Map<List<Object>, List<Integer>> datiDDT = new HashMap<>();
				while (cursor.findNextRow(Collections.singletonMap("NumeroFattura", NumeroDocumento))) {
				    Row row2 = cursor.getCurrentRow();
				    List<Object> key = new ArrayList<>();
				    key.add(row2.getString("NumeroDDT"));
				    key.add(row2.getDate("DataDDT"));
				    Integer riferimentoNumeroLinea = (int) row2.getShort("RiferimentoNumeroLinea");
				    List<Integer> value =new ArrayList<>();
				    value.add(riferimentoNumeroLinea);
				  //  List<String> list = Arrays.asList("one", "two", "three")
				    List<Integer> value2= datiDDT.putIfAbsent(key, value);
				    if (value2!=null) {
				    	value2.add(riferimentoNumeroLinea);
				    
				    }
				    
				    System.out.println(String.format(
				            "Numero='%s', Data='%s', Riga='%s'.",
				            row2.get("NumeroDDT"), 
				            row2.get("DataDDT"),
				            row2.get("RiferimentoNumeroLinea")
				            ));
				}
				
				
				
				
				
				// Nuova Fattura 
				XmlOptions options = new XmlOptions();
				options.put( XmlOptions.SAVE_PRETTY_PRINT );
				options.put( XmlOptions.SAVE_PRETTY_PRINT_INDENT, 3 );
				FatturaElettronicaDocument myDoc = FatturaElettronicaDocument.Factory.newInstance(options);
				FatturaElettronicaType myFatturaElettronica = myDoc.addNewFatturaElettronica();
				FatturaElettronicaHeaderType myFatturaElettronicaHeader = myFatturaElettronica.addNewFatturaElettronicaHeader();
				
				// DatiTrasmissione
				DatiTrasmissioneType myDatiTrasmissioneType = myFatturaElettronicaHeader.addNewDatiTrasmissione();
				myDatiTrasmissioneType.addNewIdTrasmittente().setIdPaese("IT");
				myDatiTrasmissioneType.getIdTrasmittente().setIdCodice("01808360026");
				myDatiTrasmissioneType.setProgressivoInvio(clienteNFattura);
				myDatiTrasmissioneType.setFormatoTrasmissione(FormatoTrasmissioneType.FPR_12);
				if (!codiceDestinatario.isEmpty()) {
					myDatiTrasmissioneType.setCodiceDestinatario(codiceDestinatario);
				} else if (!pecDestinatario.isEmpty()){
					myDatiTrasmissioneType.setPECDestinatario(pecDestinatario);
				} else {
					return "Manca Codice e Pec Destinatario";
				}
				myDatiTrasmissioneType.addNewContattiTrasmittente().setTelefono("015666253");
				myDatiTrasmissioneType.getContattiTrasmittente().setEmail("info@siletti.it");

				// CedentePrestatore
				CedentePrestatoreType myCedentePrestatore = myFatturaElettronicaHeader.addNewCedentePrestatore();
				DatiAnagraficiCedenteType myDatiAnagrafici = myCedentePrestatore.addNewDatiAnagrafici();
				myDatiAnagrafici.addNewIdFiscaleIVA().setIdPaese("IT");
				myDatiAnagrafici.getIdFiscaleIVA().setIdCodice("01808360026");
				myDatiAnagrafici.addNewAnagrafica().setDenominazione("SILETTI '95 SRL");
				myDatiAnagrafici.setRegimeFiscale(RegimeFiscaleType.RF_01);
				IndirizzoType mySede = myCedentePrestatore.addNewSede();
				mySede.setIndirizzo("Via Quintino Sella 6");
				mySede.setCAP("13888");
				mySede.setComune("MONGRANDO");
				mySede.setProvincia("BI");
				mySede.setNazione("IT");

				// CessionarioCommittente
				CessionarioCommittenteType myCessionarioCommittente = myFatturaElettronicaHeader.addNewCessionarioCommittente();
				DatiAnagraficiCessionarioType myDatiAnagrafici1 = myCessionarioCommittente.addNewDatiAnagrafici();
				myDatiAnagrafici1.addNewIdFiscaleIVA().setIdPaese(clienteIva.substring(0, 2));
				myDatiAnagrafici1.getIdFiscaleIVA().setIdCodice(clienteIva.substring(2));
				myDatiAnagrafici1.addNewAnagrafica().setDenominazione(clienteDenominazione);
				IndirizzoType mySede1 = myCessionarioCommittente.addNewSede();
				mySede1.setIndirizzo(clienteIndirizzo);
				mySede1.setCAP(clienteCap);
				mySede1.setComune(clienteCitta);
				mySede1.setProvincia(clienteProvincia);
				mySede1.setNazione(clienteIva.substring(0, 2));
				
				// FatturaElettronicaBody
				FatturaElettronicaBodyType myFatturaElettronicaBody = myFatturaElettronica.addNewFatturaElettronicaBody();
				DatiGeneraliType myDatiGenerali = myFatturaElettronicaBody.addNewDatiGenerali();
					// DatiGeneraliDocumento
				DatiGeneraliDocumentoType myDatiGeneraliDocumento = myDatiGenerali.addNewDatiGeneraliDocumento();
				myDatiGeneraliDocumento.setTipoDocumento(TipoDocumentoType.TD_01);
				myDatiGeneraliDocumento.setDivisa("EUR");
				Calendar cal = Calendar.getInstance();
				cal.setTime(dataDocumento);		
				myDatiGeneraliDocumento.setData(cal);
				myDatiGeneraliDocumento.setNumero(clienteNFattura);
				if ( !sconto.isEmpty()  ) {
					double scontoD = Double.parseDouble(sconto);
					ScontoMaggiorazioneType scontoMaggiorazione = myDatiGeneraliDocumento.addNewScontoMaggiorazione();
					scontoMaggiorazione.setTipo(TipoScontoMaggiorazioneType.SC);
					scontoMaggiorazione.setPercentuale(BigDecimal.valueOf(scontoD));
				}
					// 2.1.8   <DatiDDT>
				
				datiDDT.forEach((k, e) -> {
					DatiDDTType myDatiDDT = myDatiGenerali.addNewDatiDDT();
					myDatiDDT.setNumeroDDT((String) k.get(0));
					cal.setTime((Date) k.get(1));		
					myDatiDDT.setDataDDT(cal);
					Integer[] array = e.toArray(new Integer[e.size()]);
					int[] intArray = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
					myDatiDDT.setRiferimentoNumeroLineaArray(intArray);
		        });
				
				
				
				
				// DatiBeniServizi
				DatiBeniServiziType myDatiBeniServizi = myFatturaElettronicaBody.addNewDatiBeniServizi();
				DettaglioLineeType DettaglioLinee = myDatiBeniServizi.addNewDettaglioLinee();
				
				
				
				
				// Aggiunta foglio stile etc
				ByteArrayOutputStream stream = new ByteArrayOutputStream();
				myDoc.save(stream,options);
				String myDocString = new String(stream.toByteArray());
				String regex = new String(Files.readAllBytes(Paths.get(fatture.getParent() + java.io.File.separatorChar +"testaold.xml")), StandardCharsets.UTF_8);
				String replacement = new String(Files.readAllBytes(Paths.get(fatture.getParent() + java.io.File.separatorChar +"testa.xml")), StandardCharsets.UTF_8);
				String myDocCorretto = myDocString.replace(regex, replacement);

				// Salva file finale
				String fileNameNew = fatture.getParent() + java.io.File.separatorChar + cal.get(Calendar.YEAR)  + "-"+String.format("%04d", NumeroDocumento) + "-"+cliente  +".xml";
				File file = new File(fileNameNew);
				try {    
			           FileWriter fw=new FileWriter(file);    
			           fw.write(myDocCorretto);    
			           fw.close();
			           risultato = "OK: " + fileNameNew;
			         } catch(Exception e){
			        	 System.out.println(e);
			        	 risultato = e.getMessage();
			        	 }   
				
				/*
				try {
					myDoc.save(file);
				} catch (IOException e) {e.printStackTrace();}
*/
				
				
				
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			risultato = e.getMessage();
		}
		return risultato;
	}

	public static XmlObject parseXml(String xmlFilePath) {
		File xmlFile = new File(xmlFilePath);
		XmlObject xml = null;
		try {
			xml = XmlObject.Factory.parse(xmlFile);
		} catch (XmlException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xml;
	}

}
