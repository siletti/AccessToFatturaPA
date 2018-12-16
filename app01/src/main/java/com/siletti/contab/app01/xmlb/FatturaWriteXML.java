package com.siletti.contab.app01.xmlb;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;
import com.healthmarketscience.jackcess.Row;
import com.healthmarketscience.jackcess.Table;

import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.*;

public class FatturaWriteXML {

	public static void WriteFile(File fatture) {

        // errore file non trovato 
		//FatturaElettronicaDocument rootDoc = (FatturaElettronicaDocument)FatturaWriteXML.parseXml(fileOtpt);

		FatturaElettronicaDocument myDoc = FatturaElettronicaDocument.Factory.newInstance();
		FatturaElettronicaType myFatturaElettronica = myDoc.addNewFatturaElettronica();
		FatturaElettronicaHeaderType myFatturaElettronicaHeader = myFatturaElettronica.addNewFatturaElettronicaHeader();
		// manca DatiTrasmissione
		
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
		
		// cliente
		  try (Database db = DatabaseBuilder.open(fatture);) {
			
			Table table = db.getTable("tmpTesta");
			for(Row row : table) {
			    System.out.println("Look ma, a row: " + row);
			    String cliente = row.getString("CodiceCliente");
			    String clienteDenominazione = row.getString("RagioneSociale1");
			    String clienteIva = row.getString("PartitaIva");
			    String clienteIndirizzo = row.getString("Indirizzo");
			    String clienteCap = row.getString("CAP");
			    String clienteCitta = row.getString("Citta");
			    String clienteProvincia = row.getString("Provincia");
			    
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
				
				FatturaElettronicaBodyType myBody = myFatturaElettronica.addNewFatturaElettronicaBody();
				DatiGeneraliDocumentoType myDatiGeneraliDocumento =  myBody.addNewDatiGenerali().addNewDatiGeneraliDocumento();
				myDatiGeneraliDocumento.setTipoDocumento(TipoDocumentoType.TD_01);
				myDatiGeneraliDocumento.setDivisa("EUR");
				myDatiGeneraliDocumento.setData(null);
				myDatiGeneraliDocumento.setNumero(clienteProvincia);
				
			    
			    
			  }
			
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
       String fileNameNew = fatture.getAbsolutePath() + ".xml"; 
	
       File file = new File(fileNameNew);
       try {
			myDoc.save(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	 public static XmlObject parseXml(String xmlFilePath)
	    {
	        File xmlFile = new File(xmlFilePath);
	        XmlObject xml = null;
	        try
	        {
	            xml = XmlObject.Factory.parse(xmlFile);
	        } catch (XmlException e)
	        {
	            e.printStackTrace();
	        } catch (IOException e)
	        {
	            e.printStackTrace();
	        }
	        return xml;
	    }

}
