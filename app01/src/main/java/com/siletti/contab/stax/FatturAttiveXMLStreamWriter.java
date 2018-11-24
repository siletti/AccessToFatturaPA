package com.siletti.contab.stax;

import java.io.FileOutputStream;

import javax.xml.*;
import javax.xml.stream.*;

public class FatturAttiveXMLStreamWriter {
	
	public static void WriteFile(String fileOtpt) {
		
		try {
			XMLOutputFactory xMLOutputFactory = XMLOutputFactory.newFactory();
			XMLStreamWriter xMLStreamWriter = xMLOutputFactory.createXMLStreamWriter(new FileOutputStream(fileOtpt));
			xMLStreamWriter.writeStartDocument("1.0");
			xMLStreamWriter.writeStartElement("FatturaElettronicaHeader");
			xMLStreamWriter.writeStartElement("CedentePrestatore");
			xMLStreamWriter.writeStartElement("DatiAnagrafici");
			xMLStreamWriter.writeStartElement("IdFiscaleIVA");
				xMLStreamWriter.writeStartElement("IdPaese");
					xMLStreamWriter.writeCharacters("IT");
				xMLStreamWriter.writeEndElement();
				xMLStreamWriter.writeStartElement("IdCodice");
					xMLStreamWriter.writeCharacters("01808360026");
				xMLStreamWriter.writeEndElement();
			xMLStreamWriter.writeEndElement();
			xMLStreamWriter.writeStartElement("CodiceFiscale");
				xMLStreamWriter.writeCharacters("01808360026");
			xMLStreamWriter.writeEndElement();
			xMLStreamWriter.writeStartElement("Anagrafica");
				xMLStreamWriter.writeStartElement("Denominazione");
					xMLStreamWriter.writeCharacters("SILETTI '95 SRL");
				xMLStreamWriter.writeEndElement();
			xMLStreamWriter.writeEndElement();
			xMLStreamWriter.writeStartElement("RegimeFiscale");
				xMLStreamWriter.writeCharacters("RF01");
			xMLStreamWriter.writeEndElement();
			// End DatiAnagrafici
			xMLStreamWriter.writeEndElement();

			xMLStreamWriter.writeStartElement("Sede");
			xMLStreamWriter.writeStartElement("Indirizzo");
				xMLStreamWriter.writeCharacters("Via Quintino Sella, 6");
			xMLStreamWriter.writeEndElement();

			xMLStreamWriter.writeStartElement("CAP");
				xMLStreamWriter.writeCharacters("13888");
			xMLStreamWriter.writeEndElement();

			xMLStreamWriter.writeStartElement("Comune");
				xMLStreamWriter.writeCharacters("Mongrando");
			xMLStreamWriter.writeEndElement();

			xMLStreamWriter.writeStartElement("Provincia");
				xMLStreamWriter.writeCharacters("BI");
			xMLStreamWriter.writeEndElement();
			
			xMLStreamWriter.writeStartElement("Nazione");
			xMLStreamWriter.writeCharacters("IT");
			xMLStreamWriter.writeEndElement();
		
			// End Sede
			xMLStreamWriter.writeEndElement();
			
			// End CedentePrestatore
			xMLStreamWriter.writeEndElement();
			
			
			// End FatturaElettronicaHeader
			xMLStreamWriter.writeEndElement();
			xMLStreamWriter.flush();
			xMLStreamWriter.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
