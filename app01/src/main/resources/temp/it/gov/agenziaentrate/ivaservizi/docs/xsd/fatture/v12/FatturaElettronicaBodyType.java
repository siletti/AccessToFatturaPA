/*
 * XML Type:  FatturaElettronicaBodyType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML FatturaElettronicaBodyType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface FatturaElettronicaBodyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FatturaElettronicaBodyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("fatturaelettronicabodytype2e9ftype");
    
    /**
     * Gets the "DatiGenerali" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType getDatiGenerali();
    
    /**
     * Sets the "DatiGenerali" element
     */
    void setDatiGenerali(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType datiGenerali);
    
    /**
     * Appends and returns a new empty "DatiGenerali" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType addNewDatiGenerali();
    
    /**
     * Gets the "DatiBeniServizi" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType getDatiBeniServizi();
    
    /**
     * Sets the "DatiBeniServizi" element
     */
    void setDatiBeniServizi(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType datiBeniServizi);
    
    /**
     * Appends and returns a new empty "DatiBeniServizi" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType addNewDatiBeniServizi();
    
    /**
     * Gets the "DatiVeicoli" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType getDatiVeicoli();
    
    /**
     * True if has "DatiVeicoli" element
     */
    boolean isSetDatiVeicoli();
    
    /**
     * Sets the "DatiVeicoli" element
     */
    void setDatiVeicoli(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType datiVeicoli);
    
    /**
     * Appends and returns a new empty "DatiVeicoli" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType addNewDatiVeicoli();
    
    /**
     * Unsets the "DatiVeicoli" element
     */
    void unsetDatiVeicoli();
    
    /**
     * Gets array of all "DatiPagamento" elements
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType[] getDatiPagamentoArray();
    
    /**
     * Gets ith "DatiPagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType getDatiPagamentoArray(int i);
    
    /**
     * Returns number of "DatiPagamento" element
     */
    int sizeOfDatiPagamentoArray();
    
    /**
     * Sets array of all "DatiPagamento" element
     */
    void setDatiPagamentoArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType[] datiPagamentoArray);
    
    /**
     * Sets ith "DatiPagamento" element
     */
    void setDatiPagamentoArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType datiPagamento);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiPagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType insertNewDatiPagamento(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiPagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType addNewDatiPagamento();
    
    /**
     * Removes the ith "DatiPagamento" element
     */
    void removeDatiPagamento(int i);
    
    /**
     * Gets array of all "Allegati" elements
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType[] getAllegatiArray();
    
    /**
     * Gets ith "Allegati" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType getAllegatiArray(int i);
    
    /**
     * Returns number of "Allegati" element
     */
    int sizeOfAllegatiArray();
    
    /**
     * Sets array of all "Allegati" element
     */
    void setAllegatiArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType[] allegatiArray);
    
    /**
     * Sets ith "Allegati" element
     */
    void setAllegatiArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType allegati);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Allegati" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType insertNewAllegati(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Allegati" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType addNewAllegati();
    
    /**
     * Removes the ith "Allegati" element
     */
    void removeAllegati(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
