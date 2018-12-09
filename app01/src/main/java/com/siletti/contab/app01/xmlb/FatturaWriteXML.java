package com.siletti.contab.app01.xmlb;

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.*;
//import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType;
//import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType;
//import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaDocument;
//import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType;
//import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType;
//import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl.CedentePrestatoreTypeImpl;
import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl.DatiAnagraficiCedenteTypeImpl;

public class FatturaWriteXML {

	public static void WriteFile(String fileOtpt) {

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
		
			
		File file = new File(fileOtpt);
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
