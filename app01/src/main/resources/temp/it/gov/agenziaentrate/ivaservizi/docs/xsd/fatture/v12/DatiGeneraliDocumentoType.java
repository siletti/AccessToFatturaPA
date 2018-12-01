/*
 * XML Type:  DatiGeneraliDocumentoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DatiGeneraliDocumentoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DatiGeneraliDocumentoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiGeneraliDocumentoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("datigeneralidocumentotypee561type");
    
    /**
     * Gets the "TipoDocumento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType.Enum getTipoDocumento();
    
    /**
     * Gets (as xml) the "TipoDocumento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType xgetTipoDocumento();
    
    /**
     * Sets the "TipoDocumento" element
     */
    void setTipoDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType.Enum tipoDocumento);
    
    /**
     * Sets (as xml) the "TipoDocumento" element
     */
    void xsetTipoDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType tipoDocumento);
    
    /**
     * Gets the "Divisa" element
     */
    java.lang.String getDivisa();
    
    /**
     * Gets (as xml) the "Divisa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType xgetDivisa();
    
    /**
     * Sets the "Divisa" element
     */
    void setDivisa(java.lang.String divisa);
    
    /**
     * Sets (as xml) the "Divisa" element
     */
    void xsetDivisa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType divisa);
    
    /**
     * Gets the "Data" element
     */
    java.util.Calendar getData();
    
    /**
     * Gets (as xml) the "Data" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType xgetData();
    
    /**
     * Sets the "Data" element
     */
    void setData(java.util.Calendar data);
    
    /**
     * Sets (as xml) the "Data" element
     */
    void xsetData(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType data);
    
    /**
     * Gets the "Numero" element
     */
    java.lang.String getNumero();
    
    /**
     * Gets (as xml) the "Numero" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetNumero();
    
    /**
     * Sets the "Numero" element
     */
    void setNumero(java.lang.String numero);
    
    /**
     * Sets (as xml) the "Numero" element
     */
    void xsetNumero(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type numero);
    
    /**
     * Gets the "DatiRitenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType getDatiRitenuta();
    
    /**
     * True if has "DatiRitenuta" element
     */
    boolean isSetDatiRitenuta();
    
    /**
     * Sets the "DatiRitenuta" element
     */
    void setDatiRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType datiRitenuta);
    
    /**
     * Appends and returns a new empty "DatiRitenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType addNewDatiRitenuta();
    
    /**
     * Unsets the "DatiRitenuta" element
     */
    void unsetDatiRitenuta();
    
    /**
     * Gets the "DatiBollo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType getDatiBollo();
    
    /**
     * True if has "DatiBollo" element
     */
    boolean isSetDatiBollo();
    
    /**
     * Sets the "DatiBollo" element
     */
    void setDatiBollo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType datiBollo);
    
    /**
     * Appends and returns a new empty "DatiBollo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType addNewDatiBollo();
    
    /**
     * Unsets the "DatiBollo" element
     */
    void unsetDatiBollo();
    
    /**
     * Gets array of all "DatiCassaPrevidenziale" elements
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType[] getDatiCassaPrevidenzialeArray();
    
    /**
     * Gets ith "DatiCassaPrevidenziale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType getDatiCassaPrevidenzialeArray(int i);
    
    /**
     * Returns number of "DatiCassaPrevidenziale" element
     */
    int sizeOfDatiCassaPrevidenzialeArray();
    
    /**
     * Sets array of all "DatiCassaPrevidenziale" element
     */
    void setDatiCassaPrevidenzialeArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType[] datiCassaPrevidenzialeArray);
    
    /**
     * Sets ith "DatiCassaPrevidenziale" element
     */
    void setDatiCassaPrevidenzialeArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType datiCassaPrevidenziale);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiCassaPrevidenziale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType insertNewDatiCassaPrevidenziale(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiCassaPrevidenziale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType addNewDatiCassaPrevidenziale();
    
    /**
     * Removes the ith "DatiCassaPrevidenziale" element
     */
    void removeDatiCassaPrevidenziale(int i);
    
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
     * Gets the "ImportoTotaleDocumento" element
     */
    java.math.BigDecimal getImportoTotaleDocumento();
    
    /**
     * Gets (as xml) the "ImportoTotaleDocumento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoTotaleDocumento();
    
    /**
     * True if has "ImportoTotaleDocumento" element
     */
    boolean isSetImportoTotaleDocumento();
    
    /**
     * Sets the "ImportoTotaleDocumento" element
     */
    void setImportoTotaleDocumento(java.math.BigDecimal importoTotaleDocumento);
    
    /**
     * Sets (as xml) the "ImportoTotaleDocumento" element
     */
    void xsetImportoTotaleDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoTotaleDocumento);
    
    /**
     * Unsets the "ImportoTotaleDocumento" element
     */
    void unsetImportoTotaleDocumento();
    
    /**
     * Gets the "Arrotondamento" element
     */
    java.math.BigDecimal getArrotondamento();
    
    /**
     * Gets (as xml) the "Arrotondamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetArrotondamento();
    
    /**
     * True if has "Arrotondamento" element
     */
    boolean isSetArrotondamento();
    
    /**
     * Sets the "Arrotondamento" element
     */
    void setArrotondamento(java.math.BigDecimal arrotondamento);
    
    /**
     * Sets (as xml) the "Arrotondamento" element
     */
    void xsetArrotondamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType arrotondamento);
    
    /**
     * Unsets the "Arrotondamento" element
     */
    void unsetArrotondamento();
    
    /**
     * Gets array of all "Causale" elements
     */
    java.lang.String[] getCausaleArray();
    
    /**
     * Gets ith "Causale" element
     */
    java.lang.String getCausaleArray(int i);
    
    /**
     * Gets (as xml) array of all "Causale" elements
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType[] xgetCausaleArray();
    
    /**
     * Gets (as xml) ith "Causale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType xgetCausaleArray(int i);
    
    /**
     * Returns number of "Causale" element
     */
    int sizeOfCausaleArray();
    
    /**
     * Sets array of all "Causale" element
     */
    void setCausaleArray(java.lang.String[] causaleArray);
    
    /**
     * Sets ith "Causale" element
     */
    void setCausaleArray(int i, java.lang.String causale);
    
    /**
     * Sets (as xml) array of all "Causale" element
     */
    void xsetCausaleArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType[] causaleArray);
    
    /**
     * Sets (as xml) ith "Causale" element
     */
    void xsetCausaleArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType causale);
    
    /**
     * Inserts the value as the ith "Causale" element
     */
    void insertCausale(int i, java.lang.String causale);
    
    /**
     * Appends the value as the last "Causale" element
     */
    void addCausale(java.lang.String causale);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Causale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType insertNewCausale(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Causale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType addNewCausale();
    
    /**
     * Removes the ith "Causale" element
     */
    void removeCausale(int i);
    
    /**
     * Gets the "Art73" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type.Enum getArt73();
    
    /**
     * Gets (as xml) the "Art73" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type xgetArt73();
    
    /**
     * True if has "Art73" element
     */
    boolean isSetArt73();
    
    /**
     * Sets the "Art73" element
     */
    void setArt73(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type.Enum art73);
    
    /**
     * Sets (as xml) the "Art73" element
     */
    void xsetArt73(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type art73);
    
    /**
     * Unsets the "Art73" element
     */
    void unsetArt73();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
