package com.siletti.contab.app01.xmlb;

import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaDocument;
import it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType;

public class FatturaWriteXML {

	public static void WriteFile(String fileOtpt) {

		FatturaElettronicaDocument myDoc;
		myDoc = FatturaElettronicaDocument.Factory.newInstance();
		FatturaElettronicaType myDetails = myDoc.addNewFatturaElettronica();
		
	}

}
