/*
 * XML Type:  FatturaElettronicaHeaderType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML FatturaElettronicaHeaderType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface FatturaElettronicaHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FatturaElettronicaHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("fatturaelettronicaheadertype8bcatype");
    
    /**
     * Gets the "DatiTrasmissione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType getDatiTrasmissione();
    
    /**
     * Sets the "DatiTrasmissione" element
     */
    void setDatiTrasmissione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType datiTrasmissione);
    
    /**
     * Appends and returns a new empty "DatiTrasmissione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType addNewDatiTrasmissione();
    
    /**
     * Gets the "CedentePrestatore" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType getCedentePrestatore();
    
    /**
     * Sets the "CedentePrestatore" element
     */
    void setCedentePrestatore(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType cedentePrestatore);
    
    /**
     * Appends and returns a new empty "CedentePrestatore" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType addNewCedentePrestatore();
    
    /**
     * Gets the "RappresentanteFiscale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType getRappresentanteFiscale();
    
    /**
     * True if has "RappresentanteFiscale" element
     */
    boolean isSetRappresentanteFiscale();
    
    /**
     * Sets the "RappresentanteFiscale" element
     */
    void setRappresentanteFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType rappresentanteFiscale);
    
    /**
     * Appends and returns a new empty "RappresentanteFiscale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType addNewRappresentanteFiscale();
    
    /**
     * Unsets the "RappresentanteFiscale" element
     */
    void unsetRappresentanteFiscale();
    
    /**
     * Gets the "CessionarioCommittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType getCessionarioCommittente();
    
    /**
     * Sets the "CessionarioCommittente" element
     */
    void setCessionarioCommittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType cessionarioCommittente);
    
    /**
     * Appends and returns a new empty "CessionarioCommittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType addNewCessionarioCommittente();
    
    /**
     * Gets the "TerzoIntermediarioOSoggettoEmittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType getTerzoIntermediarioOSoggettoEmittente();
    
    /**
     * True if has "TerzoIntermediarioOSoggettoEmittente" element
     */
    boolean isSetTerzoIntermediarioOSoggettoEmittente();
    
    /**
     * Sets the "TerzoIntermediarioOSoggettoEmittente" element
     */
    void setTerzoIntermediarioOSoggettoEmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType terzoIntermediarioOSoggettoEmittente);
    
    /**
     * Appends and returns a new empty "TerzoIntermediarioOSoggettoEmittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType addNewTerzoIntermediarioOSoggettoEmittente();
    
    /**
     * Unsets the "TerzoIntermediarioOSoggettoEmittente" element
     */
    void unsetTerzoIntermediarioOSoggettoEmittente();
    
    /**
     * Gets the "SoggettoEmittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType.Enum getSoggettoEmittente();
    
    /**
     * Gets (as xml) the "SoggettoEmittente" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType xgetSoggettoEmittente();
    
    /**
     * True if has "SoggettoEmittente" element
     */
    boolean isSetSoggettoEmittente();
    
    /**
     * Sets the "SoggettoEmittente" element
     */
    void setSoggettoEmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType.Enum soggettoEmittente);
    
    /**
     * Sets (as xml) the "SoggettoEmittente" element
     */
    void xsetSoggettoEmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType soggettoEmittente);
    
    /**
     * Unsets the "SoggettoEmittente" element
     */
    void unsetSoggettoEmittente();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
