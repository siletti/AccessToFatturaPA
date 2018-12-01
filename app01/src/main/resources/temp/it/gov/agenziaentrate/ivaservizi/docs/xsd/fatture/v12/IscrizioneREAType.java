/*
 * XML Type:  IscrizioneREAType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML IscrizioneREAType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface IscrizioneREAType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IscrizioneREAType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("iscrizionereatypee1e7type");
    
    /**
     * Gets the "Ufficio" element
     */
    java.lang.String getUfficio();
    
    /**
     * Gets (as xml) the "Ufficio" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType xgetUfficio();
    
    /**
     * Sets the "Ufficio" element
     */
    void setUfficio(java.lang.String ufficio);
    
    /**
     * Sets (as xml) the "Ufficio" element
     */
    void xsetUfficio(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType ufficio);
    
    /**
     * Gets the "NumeroREA" element
     */
    java.lang.String getNumeroREA();
    
    /**
     * Gets (as xml) the "NumeroREA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetNumeroREA();
    
    /**
     * Sets the "NumeroREA" element
     */
    void setNumeroREA(java.lang.String numeroREA);
    
    /**
     * Sets (as xml) the "NumeroREA" element
     */
    void xsetNumeroREA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type numeroREA);
    
    /**
     * Gets the "CapitaleSociale" element
     */
    java.math.BigDecimal getCapitaleSociale();
    
    /**
     * Gets (as xml) the "CapitaleSociale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetCapitaleSociale();
    
    /**
     * True if has "CapitaleSociale" element
     */
    boolean isSetCapitaleSociale();
    
    /**
     * Sets the "CapitaleSociale" element
     */
    void setCapitaleSociale(java.math.BigDecimal capitaleSociale);
    
    /**
     * Sets (as xml) the "CapitaleSociale" element
     */
    void xsetCapitaleSociale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType capitaleSociale);
    
    /**
     * Unsets the "CapitaleSociale" element
     */
    void unsetCapitaleSociale();
    
    /**
     * Gets the "SocioUnico" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType.Enum getSocioUnico();
    
    /**
     * Gets (as xml) the "SocioUnico" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType xgetSocioUnico();
    
    /**
     * True if has "SocioUnico" element
     */
    boolean isSetSocioUnico();
    
    /**
     * Sets the "SocioUnico" element
     */
    void setSocioUnico(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType.Enum socioUnico);
    
    /**
     * Sets (as xml) the "SocioUnico" element
     */
    void xsetSocioUnico(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType socioUnico);
    
    /**
     * Unsets the "SocioUnico" element
     */
    void unsetSocioUnico();
    
    /**
     * Gets the "StatoLiquidazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType.Enum getStatoLiquidazione();
    
    /**
     * Gets (as xml) the "StatoLiquidazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType xgetStatoLiquidazione();
    
    /**
     * Sets the "StatoLiquidazione" element
     */
    void setStatoLiquidazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType.Enum statoLiquidazione);
    
    /**
     * Sets (as xml) the "StatoLiquidazione" element
     */
    void xsetStatoLiquidazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType statoLiquidazione);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
