/*
 * XML Type:  DettaglioLineeType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DettaglioLineeType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DettaglioLineeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DettaglioLineeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("dettagliolineetype9ad8type");
    
    /**
     * Gets the "NumeroLinea" element
     */
    int getNumeroLinea();
    
    /**
     * Gets (as xml) the "NumeroLinea" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType xgetNumeroLinea();
    
    /**
     * Sets the "NumeroLinea" element
     */
    void setNumeroLinea(int numeroLinea);
    
    /**
     * Sets (as xml) the "NumeroLinea" element
     */
    void xsetNumeroLinea(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType numeroLinea);
    
    /**
     * Gets the "TipoCessionePrestazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType.Enum getTipoCessionePrestazione();
    
    /**
     * Gets (as xml) the "TipoCessionePrestazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType xgetTipoCessionePrestazione();
    
    /**
     * True if has "TipoCessionePrestazione" element
     */
    boolean isSetTipoCessionePrestazione();
    
    /**
     * Sets the "TipoCessionePrestazione" element
     */
    void setTipoCessionePrestazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType.Enum tipoCessionePrestazione);
    
    /**
     * Sets (as xml) the "TipoCessionePrestazione" element
     */
    void xsetTipoCessionePrestazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType tipoCessionePrestazione);
    
    /**
     * Unsets the "TipoCessionePrestazione" element
     */
    void unsetTipoCessionePrestazione();
    
    /**
     * Gets array of all "CodiceArticolo" elements
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType[] getCodiceArticoloArray();
    
    /**
     * Gets ith "CodiceArticolo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType getCodiceArticoloArray(int i);
    
    /**
     * Returns number of "CodiceArticolo" element
     */
    int sizeOfCodiceArticoloArray();
    
    /**
     * Sets array of all "CodiceArticolo" element
     */
    void setCodiceArticoloArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType[] codiceArticoloArray);
    
    /**
     * Sets ith "CodiceArticolo" element
     */
    void setCodiceArticoloArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType codiceArticolo);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodiceArticolo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType insertNewCodiceArticolo(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodiceArticolo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType addNewCodiceArticolo();
    
    /**
     * Removes the ith "CodiceArticolo" element
     */
    void removeCodiceArticolo(int i);
    
    /**
     * Gets the "Descrizione" element
     */
    java.lang.String getDescrizione();
    
    /**
     * Gets (as xml) the "Descrizione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType xgetDescrizione();
    
    /**
     * Sets the "Descrizione" element
     */
    void setDescrizione(java.lang.String descrizione);
    
    /**
     * Sets (as xml) the "Descrizione" element
     */
    void xsetDescrizione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType descrizione);
    
    /**
     * Gets the "Quantita" element
     */
    java.math.BigDecimal getQuantita();
    
    /**
     * Gets (as xml) the "Quantita" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType xgetQuantita();
    
    /**
     * True if has "Quantita" element
     */
    boolean isSetQuantita();
    
    /**
     * Sets the "Quantita" element
     */
    void setQuantita(java.math.BigDecimal quantita);
    
    /**
     * Sets (as xml) the "Quantita" element
     */
    void xsetQuantita(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType quantita);
    
    /**
     * Unsets the "Quantita" element
     */
    void unsetQuantita();
    
    /**
     * Gets the "UnitaMisura" element
     */
    java.lang.String getUnitaMisura();
    
    /**
     * Gets (as xml) the "UnitaMisura" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetUnitaMisura();
    
    /**
     * True if has "UnitaMisura" element
     */
    boolean isSetUnitaMisura();
    
    /**
     * Sets the "UnitaMisura" element
     */
    void setUnitaMisura(java.lang.String unitaMisura);
    
    /**
     * Sets (as xml) the "UnitaMisura" element
     */
    void xsetUnitaMisura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type unitaMisura);
    
    /**
     * Unsets the "UnitaMisura" element
     */
    void unsetUnitaMisura();
    
    /**
     * Gets the "DataInizioPeriodo" element
     */
    java.util.Calendar getDataInizioPeriodo();
    
    /**
     * Gets (as xml) the "DataInizioPeriodo" element
     */
    org.apache.xmlbeans.XmlDate xgetDataInizioPeriodo();
    
    /**
     * True if has "DataInizioPeriodo" element
     */
    boolean isSetDataInizioPeriodo();
    
    /**
     * Sets the "DataInizioPeriodo" element
     */
    void setDataInizioPeriodo(java.util.Calendar dataInizioPeriodo);
    
    /**
     * Sets (as xml) the "DataInizioPeriodo" element
     */
    void xsetDataInizioPeriodo(org.apache.xmlbeans.XmlDate dataInizioPeriodo);
    
    /**
     * Unsets the "DataInizioPeriodo" element
     */
    void unsetDataInizioPeriodo();
    
    /**
     * Gets the "DataFinePeriodo" element
     */
    java.util.Calendar getDataFinePeriodo();
    
    /**
     * Gets (as xml) the "DataFinePeriodo" element
     */
    org.apache.xmlbeans.XmlDate xgetDataFinePeriodo();
    
    /**
     * True if has "DataFinePeriodo" element
     */
    boolean isSetDataFinePeriodo();
    
    /**
     * Sets the "DataFinePeriodo" element
     */
    void setDataFinePeriodo(java.util.Calendar dataFinePeriodo);
    
    /**
     * Sets (as xml) the "DataFinePeriodo" element
     */
    void xsetDataFinePeriodo(org.apache.xmlbeans.XmlDate dataFinePeriodo);
    
    /**
     * Unsets the "DataFinePeriodo" element
     */
    void unsetDataFinePeriodo();
    
    /**
     * Gets the "PrezzoUnitario" element
     */
    java.math.BigDecimal getPrezzoUnitario();
    
    /**
     * Gets (as xml) the "PrezzoUnitario" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType xgetPrezzoUnitario();
    
    /**
     * Sets the "PrezzoUnitario" element
     */
    void setPrezzoUnitario(java.math.BigDecimal prezzoUnitario);
    
    /**
     * Sets (as xml) the "PrezzoUnitario" element
     */
    void xsetPrezzoUnitario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType prezzoUnitario);
    
    /**
     * Gets array of all "ScontoMaggiorazione" elements
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType[] getScontoMaggiorazioneArray();
    
    /**
     * Gets ith "ScontoMaggiorazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType getScontoMaggiorazioneArray(int i);
    
    /**
     * Returns number of "ScontoMaggiorazione" element
     */
    int sizeOfScontoMaggiorazioneArray();
    
    /**
     * Sets array of all "ScontoMaggiorazione" element
     */
    void setScontoMaggiorazioneArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType[] scontoMaggiorazioneArray);
    
    /**
     * Sets ith "ScontoMaggiorazione" element
     */
    void setScontoMaggiorazioneArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType scontoMaggiorazione);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ScontoMaggiorazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType insertNewScontoMaggiorazione(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ScontoMaggiorazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType addNewScontoMaggiorazione();
    
    /**
     * Removes the ith "ScontoMaggiorazione" element
     */
    void removeScontoMaggiorazione(int i);
    
    /**
     * Gets the "PrezzoTotale" element
     */
    java.math.BigDecimal getPrezzoTotale();
    
    /**
     * Gets (as xml) the "PrezzoTotale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType xgetPrezzoTotale();
    
    /**
     * Sets the "PrezzoTotale" element
     */
    void setPrezzoTotale(java.math.BigDecimal prezzoTotale);
    
    /**
     * Sets (as xml) the "PrezzoTotale" element
     */
    void xsetPrezzoTotale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType prezzoTotale);
    
    /**
     * Gets the "AliquotaIVA" element
     */
    java.math.BigDecimal getAliquotaIVA();
    
    /**
     * Gets (as xml) the "AliquotaIVA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetAliquotaIVA();
    
    /**
     * Sets the "AliquotaIVA" element
     */
    void setAliquotaIVA(java.math.BigDecimal aliquotaIVA);
    
    /**
     * Sets (as xml) the "AliquotaIVA" element
     */
    void xsetAliquotaIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType aliquotaIVA);
    
    /**
     * Gets the "Ritenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum getRitenuta();
    
    /**
     * Gets (as xml) the "Ritenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType xgetRitenuta();
    
    /**
     * True if has "Ritenuta" element
     */
    boolean isSetRitenuta();
    
    /**
     * Sets the "Ritenuta" element
     */
    void setRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum ritenuta);
    
    /**
     * Sets (as xml) the "Ritenuta" element
     */
    void xsetRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType ritenuta);
    
    /**
     * Unsets the "Ritenuta" element
     */
    void unsetRitenuta();
    
    /**
     * Gets the "Natura" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum getNatura();
    
    /**
     * Gets (as xml) the "Natura" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType xgetNatura();
    
    /**
     * True if has "Natura" element
     */
    boolean isSetNatura();
    
    /**
     * Sets the "Natura" element
     */
    void setNatura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum natura);
    
    /**
     * Sets (as xml) the "Natura" element
     */
    void xsetNatura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType natura);
    
    /**
     * Unsets the "Natura" element
     */
    void unsetNatura();
    
    /**
     * Gets the "RiferimentoAmministrazione" element
     */
    java.lang.String getRiferimentoAmministrazione();
    
    /**
     * Gets (as xml) the "RiferimentoAmministrazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetRiferimentoAmministrazione();
    
    /**
     * True if has "RiferimentoAmministrazione" element
     */
    boolean isSetRiferimentoAmministrazione();
    
    /**
     * Sets the "RiferimentoAmministrazione" element
     */
    void setRiferimentoAmministrazione(java.lang.String riferimentoAmministrazione);
    
    /**
     * Sets (as xml) the "RiferimentoAmministrazione" element
     */
    void xsetRiferimentoAmministrazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type riferimentoAmministrazione);
    
    /**
     * Unsets the "RiferimentoAmministrazione" element
     */
    void unsetRiferimentoAmministrazione();
    
    /**
     * Gets array of all "AltriDatiGestionali" elements
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType[] getAltriDatiGestionaliArray();
    
    /**
     * Gets ith "AltriDatiGestionali" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType getAltriDatiGestionaliArray(int i);
    
    /**
     * Returns number of "AltriDatiGestionali" element
     */
    int sizeOfAltriDatiGestionaliArray();
    
    /**
     * Sets array of all "AltriDatiGestionali" element
     */
    void setAltriDatiGestionaliArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType[] altriDatiGestionaliArray);
    
    /**
     * Sets ith "AltriDatiGestionali" element
     */
    void setAltriDatiGestionaliArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType altriDatiGestionali);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AltriDatiGestionali" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType insertNewAltriDatiGestionali(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AltriDatiGestionali" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType addNewAltriDatiGestionali();
    
    /**
     * Removes the ith "AltriDatiGestionali" element
     */
    void removeAltriDatiGestionali(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
