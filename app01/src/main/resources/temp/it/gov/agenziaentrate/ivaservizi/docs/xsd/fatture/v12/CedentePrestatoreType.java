/*
 * XML Type:  CedentePrestatoreType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML CedentePrestatoreType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface CedentePrestatoreType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CedentePrestatoreType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("cedenteprestatoretypea307type");
    
    /**
     * Gets the "DatiAnagrafici" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType getDatiAnagrafici();
    
    /**
     * Sets the "DatiAnagrafici" element
     */
    void setDatiAnagrafici(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType datiAnagrafici);
    
    /**
     * Appends and returns a new empty "DatiAnagrafici" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType addNewDatiAnagrafici();
    
    /**
     * Gets the "Sede" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType getSede();
    
    /**
     * Sets the "Sede" element
     */
    void setSede(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType sede);
    
    /**
     * Appends and returns a new empty "Sede" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType addNewSede();
    
    /**
     * Gets the "StabileOrganizzazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType getStabileOrganizzazione();
    
    /**
     * True if has "StabileOrganizzazione" element
     */
    boolean isSetStabileOrganizzazione();
    
    /**
     * Sets the "StabileOrganizzazione" element
     */
    void setStabileOrganizzazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType stabileOrganizzazione);
    
    /**
     * Appends and returns a new empty "StabileOrganizzazione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType addNewStabileOrganizzazione();
    
    /**
     * Unsets the "StabileOrganizzazione" element
     */
    void unsetStabileOrganizzazione();
    
    /**
     * Gets the "IscrizioneREA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType getIscrizioneREA();
    
    /**
     * True if has "IscrizioneREA" element
     */
    boolean isSetIscrizioneREA();
    
    /**
     * Sets the "IscrizioneREA" element
     */
    void setIscrizioneREA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType iscrizioneREA);
    
    /**
     * Appends and returns a new empty "IscrizioneREA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType addNewIscrizioneREA();
    
    /**
     * Unsets the "IscrizioneREA" element
     */
    void unsetIscrizioneREA();
    
    /**
     * Gets the "Contatti" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType getContatti();
    
    /**
     * True if has "Contatti" element
     */
    boolean isSetContatti();
    
    /**
     * Sets the "Contatti" element
     */
    void setContatti(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType contatti);
    
    /**
     * Appends and returns a new empty "Contatti" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType addNewContatti();
    
    /**
     * Unsets the "Contatti" element
     */
    void unsetContatti();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
