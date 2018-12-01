/*
 * XML Type:  AnagraficaType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML AnagraficaType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface AnagraficaType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnagraficaType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("anagraficatype8ed5type");
    
    /**
     * Gets the "Denominazione" element
     */
    java.lang.String getDenominazione();
    
    /**
     * Gets (as xml) the "Denominazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType xgetDenominazione();
    
    /**
     * True if has "Denominazione" element
     */
    boolean isSetDenominazione();
    
    /**
     * Sets the "Denominazione" element
     */
    void setDenominazione(java.lang.String denominazione);
    
    /**
     * Sets (as xml) the "Denominazione" element
     */
    void xsetDenominazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType denominazione);
    
    /**
     * Unsets the "Denominazione" element
     */
    void unsetDenominazione();
    
    /**
     * Gets the "Nome" element
     */
    java.lang.String getNome();
    
    /**
     * Gets (as xml) the "Nome" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetNome();
    
    /**
     * True if has "Nome" element
     */
    boolean isSetNome();
    
    /**
     * Sets the "Nome" element
     */
    void setNome(java.lang.String nome);
    
    /**
     * Sets (as xml) the "Nome" element
     */
    void xsetNome(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType nome);
    
    /**
     * Unsets the "Nome" element
     */
    void unsetNome();
    
    /**
     * Gets the "Cognome" element
     */
    java.lang.String getCognome();
    
    /**
     * Gets (as xml) the "Cognome" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetCognome();
    
    /**
     * True if has "Cognome" element
     */
    boolean isSetCognome();
    
    /**
     * Sets the "Cognome" element
     */
    void setCognome(java.lang.String cognome);
    
    /**
     * Sets (as xml) the "Cognome" element
     */
    void xsetCognome(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType cognome);
    
    /**
     * Unsets the "Cognome" element
     */
    void unsetCognome();
    
    /**
     * Gets the "Titolo" element
     */
    java.lang.String getTitolo();
    
    /**
     * Gets (as xml) the "Titolo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType xgetTitolo();
    
    /**
     * True if has "Titolo" element
     */
    boolean isSetTitolo();
    
    /**
     * Sets the "Titolo" element
     */
    void setTitolo(java.lang.String titolo);
    
    /**
     * Sets (as xml) the "Titolo" element
     */
    void xsetTitolo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType titolo);
    
    /**
     * Unsets the "Titolo" element
     */
    void unsetTitolo();
    
    /**
     * Gets the "CodEORI" element
     */
    java.lang.String getCodEORI();
    
    /**
     * Gets (as xml) the "CodEORI" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType xgetCodEORI();
    
    /**
     * True if has "CodEORI" element
     */
    boolean isSetCodEORI();
    
    /**
     * Sets the "CodEORI" element
     */
    void setCodEORI(java.lang.String codEORI);
    
    /**
     * Sets (as xml) the "CodEORI" element
     */
    void xsetCodEORI(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType codEORI);
    
    /**
     * Unsets the "CodEORI" element
     */
    void unsetCodEORI();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
