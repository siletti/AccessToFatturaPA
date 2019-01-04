package com.siletti.contab.app01.xmlb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

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
import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum;

public class FatturaWriteXML {

	public static String WriteFile(File fatture) {
		String risultato = "";
		try (Database db = DatabaseBuilder.open(fatture);) {

			Table table = db.getTable("tmpTesta");
			for (Row row : table) {
				// Per ogni fattura
				//System.out.println("Look a row: " + row);
				
				// Recupero dati 
				String cliente = row.getString("CodiceCliente");
				String clienteDenominazione = row.getString("RagioneSociale1");
				String clienteIva = row.getString("PartitaIva");
				String clienteNazione = clienteIva.substring(0, 2);
				String clienteIndirizzo = row.getString("Indirizzo");
				String clienteCap = row.getString("CAP");
				String clienteCitta = row.getString("Citta");
				String clienteProvincia = row.getString("Provincia");
				Date dataDocumento = row.getDate("DataDocumento");
				Short NumeroDocumento = row.getShort("NumeroDocumento");
				String clienteNFattura = Integer.toString(NumeroDocumento);
				String codiceDestinatario = row.getString("Vettore3");
				String pecDestinatario = row.getString("Vettore2");
				Integer chiaveDocumento = row.getInt("ChiaveDocumento");
				
				String sconto = row.getString("Sconto");
//				BigDecimal totaleMerceLordo = row.getBigDecimal("TotaleMerceLordo"); 
//				BigDecimal totaleMerceNetto = row.getBigDecimal("TotaleMerceNetto"); 
//				BigDecimal totaleIva = row.getBigDecimal("TotaleIva"); 
//				BigDecimal totaleImponibile = row.getBigDecimal("TotaleImponibile"); 
				BigDecimal trasporto = row.getBigDecimal("Trasporto"); 
				BigDecimal varie = row.getBigDecimal("Varie"); 
				BigDecimal esenti = row.getBigDecimal("Esenti"); 
				
				// Recupero 2.1.8   <DatiDDT> per ogni riga/fattura 
				Map<List<Object>, List<Integer>> datiDDT = new HashMap<>();
				Table table2 = db.getTable("DatiDDT");
				Cursor cursor = CursorBuilder.createCursor(table2);
				while (cursor.findNextRow(Collections.singletonMap("NumeroFattura", NumeroDocumento))) {
				    Row row2 = cursor.getCurrentRow();
				    List<Object> key = new ArrayList<>();
				    key.add(row2.getString("NumeroDDT"));
				    key.add(row2.getDate("DataDDT"));
				    Integer riferimentoNumeroLinea = (int) row2.getShort("RiferimentoNumeroLinea");
				    List<Integer> value =new ArrayList<>();
				    value.add(riferimentoNumeroLinea);
				    List<Integer> value2= datiDDT.putIfAbsent(key, value);
				    if (value2!=null) {value2.add(riferimentoNumeroLinea);}
				}
				// Recupero 2.2 <DatiBeniServizi>						


				// Recupero 2.2.2   <DatiRiepilogo> 
			    List<Map<String , String>> datiRiepilogo  = new ArrayList<Map<String,String>>();
			    for(int i=1; i<7; i++){
			    		Map<String,String> myMap1 = new HashMap<String, String>();
			    		myMap1.put("rAliquota", row.getBigDecimal("rAliquota"+i).toPlainString());
			    		myMap1.put("rImponibile", row.getBigDecimal("rImponibile"+i).toPlainString());
			    		myMap1.put("rImposta", row.getBigDecimal("rImposta"+i).toPlainString());
			    		myMap1.put("rDescrizione", row.getString("rDescrizione"+i));
			    		myMap1.put("rSpeseAcc", row.getBigDecimal("rSpeseAccessorie"+i).toPlainString());
			    		myMap1.put("rCodiceIva", row.getString("rCodiceIva"+i));
			    		datiRiepilogo.add(i-1,myMap1);
			    }

			 // ATTENZIONE Attuale fatturazione ha sempre UN UNICAM aliquota Iva da applicare alle Spese accessorie
				BigDecimal aliquotaIva = row.getBigDecimal("rAliquota1"); 
//				String descrizioneIva = row.getString("rDescrizione1"); 
				Enum naturaIva = null ; 
				int codiceIva = Integer.parseInt(row.getString("rCodiceIva1").trim());
	    		if (aliquotaIva.compareTo(BigDecimal.ZERO) == 0) {
	    			switch (codiceIva) {
					case 41:
						naturaIva = NaturaType.N_3;
						break;
					case 8:
						naturaIva = NaturaType.N_2;
						break;
					default:
						return "FAT."+ clienteNFattura + " rCodiceIva1 non riconosciuto";
	    			}
	    		}

			    //  Recupero 2.4   <DatiPagamento>						
	    		List<Map<String , String>> datiPagamento  = new ArrayList<Map<String,String>>();
			    for(int i=1; i<7; i++){
			    		BigDecimal importo = row.getBigDecimal("ImportoScadenza"+i);
			    		if (importo.compareTo(BigDecimal.ZERO) == 0) 
		    		   		{continue;}
			    		Map<String,String> myMap1 = new HashMap<String, String>();
			    		String asGmt = Long.toString((row.getDate("DataScadenza"+i)).getTime());
			    		myMap1.put("DataScadenzaPagamento", asGmt);
			    		myMap1.put("ImportoPagamento", importo.toPlainString());
			    		datiPagamento.add(i-1,myMap1);
			    }

				
				
				// Nuova Fattura 
				XmlOptions options = new XmlOptions();
				options.put( XmlOptions.SAVE_PRETTY_PRINT );
				options.put( XmlOptions.SAVE_PRETTY_PRINT_INDENT, 3 );
				//options.setUseDefaultNamespace();
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
					myDatiTrasmissioneType.setCodiceDestinatario("0000000");
					myDatiTrasmissioneType.setPECDestinatario(pecDestinatario);
				} else {
					return "FAT."+ clienteNFattura +" Manca Codice e Pec Destinatario";
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
				IscrizioneREAType myIscrizioneREA =  myCedentePrestatore.addNewIscrizioneREA();
				myIscrizioneREA.setUfficio("BI");
				myIscrizioneREA.setNumeroREA("165610");
				myIscrizioneREA.setUfficio("BI");
				myIscrizioneREA.setSocioUnico(SocioUnicoType.SM);
				myIscrizioneREA.setStatoLiquidazione(StatoLiquidazioneType.LN);
				BigDecimal capitaleSociale = new BigDecimal("30600");
				myIscrizioneREA.setCapitaleSociale(capitaleSociale.setScale(2, BigDecimal.ROUND_HALF_UP));

				// CessionarioCommittente
				CessionarioCommittenteType myCessionarioCommittente = myFatturaElettronicaHeader.addNewCessionarioCommittente();
				DatiAnagraficiCessionarioType myDatiAnagrafici1 = myCessionarioCommittente.addNewDatiAnagrafici();
				myDatiAnagrafici1.addNewIdFiscaleIVA().setIdPaese(clienteNazione);
				myDatiAnagrafici1.getIdFiscaleIVA().setIdCodice(clienteIva.substring(2));
				myDatiAnagrafici1.addNewAnagrafica().setDenominazione(clienteDenominazione);
				IndirizzoType mySede1 = myCessionarioCommittente.addNewSede();
				mySede1.setIndirizzo(clienteIndirizzo);
				mySede1.setCAP(clienteCap);
				mySede1.setComune(clienteCitta);
				if (clienteNazione.equals("IT")) mySede1.setProvincia(clienteProvincia);
				mySede1.setNazione(clienteNazione);
				
		// 2   <FatturaElettronicaBody>							

				FatturaElettronicaBodyType myFatturaElettronicaBody = myFatturaElettronica.addNewFatturaElettronicaBody();
				DatiGeneraliType myDatiGenerali = myFatturaElettronicaBody.addNewDatiGenerali();
					// DatiGeneraliDocumento
				DatiGeneraliDocumentoType myDatiGeneraliDocumento = myDatiGenerali.addNewDatiGeneraliDocumento();
				myDatiGeneraliDocumento.setTipoDocumento(TipoDocumentoType.TD_01);
				myDatiGeneraliDocumento.setDivisa("EUR");
//	    		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	    		Calendar calDataDocumento = Calendar.getInstance(TimeZone.getDefault());
	    		calDataDocumento.setTime(dataDocumento);		
				myDatiGeneraliDocumento.setData(calDataDocumento);
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
					Calendar cal = Calendar.getInstance(TimeZone.getDefault());
					cal.setTime((Date) k.get(1));		
					myDatiDDT.setDataDDT(cal);
					Integer[] array = e.toArray(new Integer[e.size()]);
					int[] intArray = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
					myDatiDDT.setRiferimentoNumeroLineaArray(intArray);
		        });
				
				// 2.2   <DatiBeniServizi>						
				DatiBeniServiziType myDatiBeniServizi = myFatturaElettronicaBody.addNewDatiBeniServizi();
				//2.2.1   <DettaglioLinee>					
				Table table3 = db.getTable("tmpCorpo");
				Cursor cursor3 = CursorBuilder.createCursor(table3);
				int numeroLinea = 1; 
				while (cursor3.findNextRow(Collections.singletonMap("ChiaveDocumento", chiaveDocumento))) {
					Row row3 = cursor3.getCurrentRow();
					String uMisura = row3.getString("UnitaMisura");
					if (!uMisura.isEmpty()) {
						DettaglioLineeType dettaglioLinee = myDatiBeniServizi.addNewDettaglioLinee();
						dettaglioLinee.setNumeroLinea(numeroLinea);
						numeroLinea++;
						CodiceArticoloType codiceArticolo = dettaglioLinee.addNewCodiceArticolo();
						codiceArticolo.setCodiceTipo("Interno");
						codiceArticolo.setCodiceValore(row3.getString("Codice"));
						dettaglioLinee.setDescrizione(row3.getString("Descrizione1"));
						if (uMisura.equals("Mt")) {
							dettaglioLinee.setQuantita(row3.getBigDecimal("Metri"));
							dettaglioLinee.setUnitaMisura(uMisura);
						} else if (uMisura.equals("Capi")) {
							BigDecimal quantita = new BigDecimal(row3.getShort("Capi").toString());
							dettaglioLinee.setQuantita(quantita.setScale(2, BigDecimal.ROUND_HALF_UP));
						} else {
							return "FAT."+ clienteNFattura + " UnitaMisura Error";
						}
						dettaglioLinee.setPrezzoUnitario(row3.getBigDecimal("Prezzo"));
						dettaglioLinee.setPrezzoTotale(row3.getBigDecimal("Importo"));
						BigDecimal iva = new BigDecimal(row3.getString("DescIva"));
						dettaglioLinee.setAliquotaIVA(iva.setScale(2, BigDecimal.ROUND_HALF_UP));
						if (iva.compareTo(BigDecimal.ZERO) == 0) {
							switch (row3.getString("CodiceIva")) {
								case "41":
									dettaglioLinee.setNatura(NaturaType.N_3);
									break;
								case "8":
									dettaglioLinee.setNatura(NaturaType.N_3);
									break;
								default:
									return "FAT."+ clienteNFattura + " Cod.Iva non riconosciuto";
							}
						}
					}
				}
				// tutte righe fatture con stessa IVA !
				// SPESE DI TRASPORTO 
				if (trasporto.compareTo(BigDecimal.ZERO) == 1) {
					DettaglioLineeType dettaglioLinee = myDatiBeniServizi.addNewDettaglioLinee();
					dettaglioLinee.setNumeroLinea(numeroLinea);
					numeroLinea++;
					dettaglioLinee.setTipoCessionePrestazione(TipoCessionePrestazioneType.AC);
					dettaglioLinee.setDescrizione("SPESE DI TRASPORTO");
					dettaglioLinee.setPrezzoUnitario(trasporto.setScale(2, BigDecimal.ROUND_HALF_UP));
					dettaglioLinee.setPrezzoTotale(trasporto.setScale(2, BigDecimal.ROUND_HALF_UP));
					dettaglioLinee.setAliquotaIVA(aliquotaIva.setScale(2, BigDecimal.ROUND_HALF_UP));
					if (aliquotaIva.compareTo(BigDecimal.ZERO)==0) dettaglioLinee.setNatura(naturaIva);
				}

				// SPESE  VARIE 
				if (varie.compareTo(BigDecimal.ZERO) == 1) {
					DettaglioLineeType dettaglioLinee = myDatiBeniServizi.addNewDettaglioLinee();
					dettaglioLinee.setNumeroLinea(numeroLinea);
					numeroLinea++;
					dettaglioLinee.setTipoCessionePrestazione(TipoCessionePrestazioneType.AC);
					dettaglioLinee.setDescrizione("SPESE DI INCASSO");
					dettaglioLinee.setPrezzoUnitario(varie.setScale(2, BigDecimal.ROUND_HALF_UP));
					dettaglioLinee.setPrezzoTotale(varie.setScale(2, BigDecimal.ROUND_HALF_UP));
					dettaglioLinee.setAliquotaIVA(aliquotaIva.setScale(2, BigDecimal.ROUND_HALF_UP));
					if (aliquotaIva.compareTo(BigDecimal.ZERO)==0) dettaglioLinee.setNatura(naturaIva);
				}

				// SPESE   ESENTI
				if (esenti.compareTo(BigDecimal.ZERO) == 1) {
					DettaglioLineeType dettaglioLinee = myDatiBeniServizi.addNewDettaglioLinee();
					dettaglioLinee.setNumeroLinea(numeroLinea);
					numeroLinea++;
					dettaglioLinee.setTipoCessionePrestazione(TipoCessionePrestazioneType.AC);
					dettaglioLinee.setDescrizione("SPESE ESENTI");
					dettaglioLinee.setPrezzoUnitario(esenti.setScale(2, BigDecimal.ROUND_HALF_UP));
					dettaglioLinee.setPrezzoTotale(esenti.setScale(2, BigDecimal.ROUND_HALF_UP));
					dettaglioLinee.setAliquotaIVA(BigDecimal.ZERO.setScale(2, BigDecimal.ROUND_HALF_UP));
					dettaglioLinee.setNatura(NaturaType.N_4);
					if (aliquotaIva.compareTo(BigDecimal.ZERO) == 1) {
						DatiRiepilogoType datiR = myDatiBeniServizi.addNewDatiRiepilogo();
						datiR.setAliquotaIVA(BigDecimal.ZERO.setScale(2, BigDecimal.ROUND_HALF_UP));
			    		datiR.setImponibileImporto(esenti.setScale(2, BigDecimal.ROUND_HALF_UP));
			    		datiR.setImposta(BigDecimal.ZERO.setScale(2, BigDecimal.ROUND_HALF_UP));
			    		datiR.setNatura(NaturaType.N_4);
			    		datiR.setRiferimentoNormativo("SPESE ART. 15");
					}
				}

				
				
				
				// 2.2.2   <DatiRiepilogo>					
			    for (Map<String, String> map : datiRiepilogo) {
			    		if(map.get("rCodiceIva").trim().isEmpty()) 
			    			{continue;}

			    		DatiRiepilogoType datiR = myDatiBeniServizi.addNewDatiRiepilogo();
			    		
			    		int rCodiceIva = Integer.parseInt(map.get("rCodiceIva").trim());
			    		
			    		BigDecimal aliquota = new BigDecimal(map.get("rAliquota"));
			    		datiR.setAliquotaIVA(aliquota.setScale(2, BigDecimal.ROUND_HALF_UP));

			    		BigDecimal rImponibile = new BigDecimal(map.get("rImponibile"));
			    		
			    		if (aliquota.compareTo(BigDecimal.ZERO) == 0) {
			    			datiR.setRiferimentoNormativo(map.get("rDescrizione"));
			    			switch (rCodiceIva) {
							case 41:
								datiR.setNatura(NaturaType.N_3);
								break;
							case 8:
								datiR.setNatura(NaturaType.N_3);
								break;
							default:
								return "FAT."+ clienteNFattura + " rCodiceIva: "+rCodiceIva+" non riconosciuto";
			    			}
			    		}
			    		
			    		BigDecimal rSpeseAcc = new BigDecimal(map.get("rSpeseAcc"));
			    		datiR.setSpeseAccessorie(rSpeseAcc.setScale(2, BigDecimal.ROUND_HALF_UP));
			    		datiR.setImponibileImporto(rImponibile.setScale(2, BigDecimal.ROUND_HALF_UP));
			    		BigDecimal rImposta = new BigDecimal(map.get("rImposta"));
			    		datiR.setImposta(rImposta.setScale(2, BigDecimal.ROUND_HALF_UP));
			    }
				
			    //  2.4   <DatiPagamento>						
			    DatiPagamentoType myDatiPagamento = myFatturaElettronicaBody.addNewDatiPagamento();
			    if (datiPagamento.size()>1) {
			    	myDatiPagamento.setCondizioniPagamento(CondizioniPagamentoType.TP_01);
			    } else {
			    	myDatiPagamento.setCondizioniPagamento(CondizioniPagamentoType.TP_02);
			    }
// TODO
			    for (Map<String, String> map : datiPagamento) {
			    	BigDecimal importoPagamento = new BigDecimal(map.get("ImportoPagamento"));
			    	if (importoPagamento.compareTo(BigDecimal.ZERO) == 0) 
			    		   	{continue;}
		    		DettaglioPagamentoType myDettaglioPagamento = myDatiPagamento.addNewDettaglioPagamento();
		    		myDettaglioPagamento.setModalitaPagamento(ModalitaPagamentoType.MP_05);
		    		myDettaglioPagamento.setImportoPagamento(importoPagamento.setScale(2, BigDecimal.ROUND_HALF_UP));
		    		Calendar cal1 = Calendar.getInstance(TimeZone.getDefault());
					cal1.setTimeInMillis(Long.parseLong(map.get("DataScadenzaPagamento")));
					myDettaglioPagamento.setDataScadenzaPagamento(cal1);
					myDettaglioPagamento.setIstitutoFinanziario("UniCredit S.p.A.");
					myDettaglioPagamento.setIBAN("IT78N0200822310000004100960");					
		 	    }
			    
			    
			    // Salva file finale
			    
				// Aggiunta foglio stile etc
				ByteArrayOutputStream stream = new ByteArrayOutputStream();
				myDoc.save(stream,options);
				String myDocString = new String(stream.toByteArray());
//				String regex = new String(Files.readAllBytes(Paths.get(fatture.getParent() + java.io.File.separatorChar +"testaold.xml")), StandardCharsets.UTF_8);
//				String replacement = new String(Files.readAllBytes(Paths.get(fatture.getParent() + java.io.File.separatorChar +"testa.xml")), StandardCharsets.UTF_8);
//				String myDocCorretto = myDocString.replace(regex, replacement);
				String myDocCorretto = myDocString.replace("FatturaElettronica xmlns", "FatturaElettronica versione=\"FPR12\" xmlns");

				String fileNameNew = fatture.getParent() + java.io.File.separatorChar + calDataDocumento.get(Calendar.YEAR)  + "-"+String.format("%04d", NumeroDocumento) + "-"+cliente  +".xml";
				File file = new File(fileNameNew);

				try {    
			           FileWriter fw=new FileWriter(file);    
			           fw.write(myDocCorretto);    
			           fw.close();
			           risultato += fileNameNew;
			           risultato += "\r\n";
			         } catch(Exception e){
			        	 System.out.println(e);
			        	 risultato = e.getMessage();
			        	 }   
				
//				try {
//					myDoc.save(file,options);
//					risultato += fileNameNew;
//			        risultato += "\r\n";
//				} catch (IOException e) {
//					e.printStackTrace();
//					risultato = e.getMessage();
//					}
				
			}

		} catch (IOException e) {
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
