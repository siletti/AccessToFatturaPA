/*
 * XML Type:  DatiRitenutaType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DatiRitenutaType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DatiRitenutaType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiRitenutaType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("datiritenutatypeb720type");
    
    /**
     * Gets the "TipoRitenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType.Enum getTipoRitenuta();
    
    /**
     * Gets (as xml) the "TipoRitenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType xgetTipoRitenuta();
    
    /**
     * Sets the "TipoRitenuta" element
     */
    void setTipoRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType.Enum tipoRitenuta);
    
    /**
     * Sets (as xml) the "TipoRitenuta" element
     */
    void xsetTipoRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType tipoRitenuta);
    
    /**
     * Gets the "ImportoRitenuta" element
     */
    java.math.BigDecimal getImportoRitenuta();
    
    /**
     * Gets (as xml) the "ImportoRitenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoRitenuta();
    
    /**
     * Sets the "ImportoRitenuta" element
     */
    void setImportoRitenuta(java.math.BigDecimal importoRitenuta);
    
    /**
     * Sets (as xml) the "ImportoRitenuta" element
     */
    void xsetImportoRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoRitenuta);
    
    /**
     * Gets the "AliquotaRitenuta" element
     */
    java.math.BigDecimal getAliquotaRitenuta();
    
    /**
     * Gets (as xml) the "AliquotaRitenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetAliquotaRitenuta();
    
    /**
     * Sets the "AliquotaRitenuta" element
     */
    void setAliquotaRitenuta(java.math.BigDecimal aliquotaRitenuta);
    
    /**
     * Sets (as xml) the "AliquotaRitenuta" element
     */
    void xsetAliquotaRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType aliquotaRitenuta);
    
    /**
     * Gets the "CausalePagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType.Enum getCausalePagamento();
    
    /**
     * Gets (as xml) the "CausalePagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType xgetCausalePagamento();
    
    /**
     * Sets the "CausalePagamento" element
     */
    void setCausalePagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType.Enum causalePagamento);
    
    /**
     * Sets (as xml) the "CausalePagamento" element
     */
    void xsetCausalePagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType causalePagamento);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
