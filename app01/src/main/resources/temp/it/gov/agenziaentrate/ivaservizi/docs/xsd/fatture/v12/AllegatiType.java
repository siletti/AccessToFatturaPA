/*
 * XML Type:  AllegatiType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML AllegatiType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface AllegatiType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AllegatiType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("allegatitype44e5type");
    
    /**
     * Gets the "NomeAttachment" element
     */
    java.lang.String getNomeAttachment();
    
    /**
     * Gets (as xml) the "NomeAttachment" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetNomeAttachment();
    
    /**
     * Sets the "NomeAttachment" element
     */
    void setNomeAttachment(java.lang.String nomeAttachment);
    
    /**
     * Sets (as xml) the "NomeAttachment" element
     */
    void xsetNomeAttachment(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType nomeAttachment);
    
    /**
     * Gets the "AlgoritmoCompressione" element
     */
    java.lang.String getAlgoritmoCompressione();
    
    /**
     * Gets (as xml) the "AlgoritmoCompressione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetAlgoritmoCompressione();
    
    /**
     * True if has "AlgoritmoCompressione" element
     */
    boolean isSetAlgoritmoCompressione();
    
    /**
     * Sets the "AlgoritmoCompressione" element
     */
    void setAlgoritmoCompressione(java.lang.String algoritmoCompressione);
    
    /**
     * Sets (as xml) the "AlgoritmoCompressione" element
     */
    void xsetAlgoritmoCompressione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type algoritmoCompressione);
    
    /**
     * Unsets the "AlgoritmoCompressione" element
     */
    void unsetAlgoritmoCompressione();
    
    /**
     * Gets the "FormatoAttachment" element
     */
    java.lang.String getFormatoAttachment();
    
    /**
     * Gets (as xml) the "FormatoAttachment" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetFormatoAttachment();
    
    /**
     * True if has "FormatoAttachment" element
     */
    boolean isSetFormatoAttachment();
    
    /**
     * Sets the "FormatoAttachment" element
     */
    void setFormatoAttachment(java.lang.String formatoAttachment);
    
    /**
     * Sets (as xml) the "FormatoAttachment" element
     */
    void xsetFormatoAttachment(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type formatoAttachment);
    
    /**
     * Unsets the "FormatoAttachment" element
     */
    void unsetFormatoAttachment();
    
    /**
     * Gets the "DescrizioneAttachment" element
     */
    java.lang.String getDescrizioneAttachment();
    
    /**
     * Gets (as xml) the "DescrizioneAttachment" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetDescrizioneAttachment();
    
    /**
     * True if has "DescrizioneAttachment" element
     */
    boolean isSetDescrizioneAttachment();
    
    /**
     * Sets the "DescrizioneAttachment" element
     */
    void setDescrizioneAttachment(java.lang.String descrizioneAttachment);
    
    /**
     * Sets (as xml) the "DescrizioneAttachment" element
     */
    void xsetDescrizioneAttachment(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType descrizioneAttachment);
    
    /**
     * Unsets the "DescrizioneAttachment" element
     */
    void unsetDescrizioneAttachment();
    
    /**
     * Gets the "Attachment" element
     */
    byte[] getAttachment();
    
    /**
     * Gets (as xml) the "Attachment" element
     */
    org.apache.xmlbeans.XmlBase64Binary xgetAttachment();
    
    /**
     * Sets the "Attachment" element
     */
    void setAttachment(byte[] attachment);
    
    /**
     * Sets (as xml) the "Attachment" element
     */
    void xsetAttachment(org.apache.xmlbeans.XmlBase64Binary attachment);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
