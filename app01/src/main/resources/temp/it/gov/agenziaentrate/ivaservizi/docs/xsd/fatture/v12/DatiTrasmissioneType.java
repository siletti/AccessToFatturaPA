/*
 * XML Type:  DatiTrasmissioneType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DatiTrasmissioneType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DatiTrasmissioneType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiTrasmissioneType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("datitrasmissionetypee88dtype");
    
    /**
     * Gets the "IdTrasmittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType getIdTrasmittente();
    
    /**
     * Sets the "IdTrasmittente" element
     */
    void setIdTrasmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType idTrasmittente);
    
    /**
     * Appends and returns a new empty "IdTrasmittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType addNewIdTrasmittente();
    
    /**
     * Gets the "ProgressivoInvio" element
     */
    java.lang.String getProgressivoInvio();
    
    /**
     * Gets (as xml) the "ProgressivoInvio" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetProgressivoInvio();
    
    /**
     * Sets the "ProgressivoInvio" element
     */
    void setProgressivoInvio(java.lang.String progressivoInvio);
    
    /**
     * Sets (as xml) the "ProgressivoInvio" element
     */
    void xsetProgressivoInvio(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type progressivoInvio);
    
    /**
     * Gets the "FormatoTrasmissione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType.Enum getFormatoTrasmissione();
    
    /**
     * Gets (as xml) the "FormatoTrasmissione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType xgetFormatoTrasmissione();
    
    /**
     * Sets the "FormatoTrasmissione" element
     */
    void setFormatoTrasmissione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType.Enum formatoTrasmissione);
    
    /**
     * Sets (as xml) the "FormatoTrasmissione" element
     */
    void xsetFormatoTrasmissione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType formatoTrasmissione);
    
    /**
     * Gets the "CodiceDestinatario" element
     */
    java.lang.String getCodiceDestinatario();
    
    /**
     * Gets (as xml) the "CodiceDestinatario" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType xgetCodiceDestinatario();
    
    /**
     * Sets the "CodiceDestinatario" element
     */
    void setCodiceDestinatario(java.lang.String codiceDestinatario);
    
    /**
     * Sets (as xml) the "CodiceDestinatario" element
     */
    void xsetCodiceDestinatario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType codiceDestinatario);
    
    /**
     * Gets the "ContattiTrasmittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType getContattiTrasmittente();
    
    /**
     * True if has "ContattiTrasmittente" element
     */
    boolean isSetContattiTrasmittente();
    
    /**
     * Sets the "ContattiTrasmittente" element
     */
    void setContattiTrasmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType contattiTrasmittente);
    
    /**
     * Appends and returns a new empty "ContattiTrasmittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType addNewContattiTrasmittente();
    
    /**
     * Unsets the "ContattiTrasmittente" element
     */
    void unsetContattiTrasmittente();
    
    /**
     * Gets the "PECDestinatario" element
     */
    java.lang.String getPECDestinatario();
    
    /**
     * Gets (as xml) the "PECDestinatario" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType xgetPECDestinatario();
    
    /**
     * True if has "PECDestinatario" element
     */
    boolean isSetPECDestinatario();
    
    /**
     * Sets the "PECDestinatario" element
     */
    void setPECDestinatario(java.lang.String pecDestinatario);
    
    /**
     * Sets (as xml) the "PECDestinatario" element
     */
    void xsetPECDestinatario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType pecDestinatario);
    
    /**
     * Unsets the "PECDestinatario" element
     */
    void unsetPECDestinatario();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
