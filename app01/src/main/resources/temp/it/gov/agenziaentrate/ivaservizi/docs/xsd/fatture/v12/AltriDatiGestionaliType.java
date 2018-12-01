/*
 * XML Type:  AltriDatiGestionaliType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML AltriDatiGestionaliType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface AltriDatiGestionaliType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AltriDatiGestionaliType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("altridatigestionalitype2c27type");
    
    /**
     * Gets the "TipoDato" element
     */
    java.lang.String getTipoDato();
    
    /**
     * Gets (as xml) the "TipoDato" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetTipoDato();
    
    /**
     * Sets the "TipoDato" element
     */
    void setTipoDato(java.lang.String tipoDato);
    
    /**
     * Sets (as xml) the "TipoDato" element
     */
    void xsetTipoDato(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type tipoDato);
    
    /**
     * Gets the "RiferimentoTesto" element
     */
    java.lang.String getRiferimentoTesto();
    
    /**
     * Gets (as xml) the "RiferimentoTesto" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetRiferimentoTesto();
    
    /**
     * True if has "RiferimentoTesto" element
     */
    boolean isSetRiferimentoTesto();
    
    /**
     * Sets the "RiferimentoTesto" element
     */
    void setRiferimentoTesto(java.lang.String riferimentoTesto);
    
    /**
     * Sets (as xml) the "RiferimentoTesto" element
     */
    void xsetRiferimentoTesto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType riferimentoTesto);
    
    /**
     * Unsets the "RiferimentoTesto" element
     */
    void unsetRiferimentoTesto();
    
    /**
     * Gets the "RiferimentoNumero" element
     */
    java.math.BigDecimal getRiferimentoNumero();
    
    /**
     * Gets (as xml) the "RiferimentoNumero" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType xgetRiferimentoNumero();
    
    /**
     * True if has "RiferimentoNumero" element
     */
    boolean isSetRiferimentoNumero();
    
    /**
     * Sets the "RiferimentoNumero" element
     */
    void setRiferimentoNumero(java.math.BigDecimal riferimentoNumero);
    
    /**
     * Sets (as xml) the "RiferimentoNumero" element
     */
    void xsetRiferimentoNumero(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType riferimentoNumero);
    
    /**
     * Unsets the "RiferimentoNumero" element
     */
    void unsetRiferimentoNumero();
    
    /**
     * Gets the "RiferimentoData" element
     */
    java.util.Calendar getRiferimentoData();
    
    /**
     * Gets (as xml) the "RiferimentoData" element
     */
    org.apache.xmlbeans.XmlDate xgetRiferimentoData();
    
    /**
     * True if has "RiferimentoData" element
     */
    boolean isSetRiferimentoData();
    
    /**
     * Sets the "RiferimentoData" element
     */
    void setRiferimentoData(java.util.Calendar riferimentoData);
    
    /**
     * Sets (as xml) the "RiferimentoData" element
     */
    void xsetRiferimentoData(org.apache.xmlbeans.XmlDate riferimentoData);
    
    /**
     * Unsets the "RiferimentoData" element
     */
    void unsetRiferimentoData();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
