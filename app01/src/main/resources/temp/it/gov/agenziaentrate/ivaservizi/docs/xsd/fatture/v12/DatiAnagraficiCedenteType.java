/*
 * XML Type:  DatiAnagraficiCedenteType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DatiAnagraficiCedenteType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DatiAnagraficiCedenteType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiAnagraficiCedenteType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("datianagraficicedentetype025ftype");
    
    /**
     * Gets the "IdFiscaleIVA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType getIdFiscaleIVA();
    
    /**
     * Sets the "IdFiscaleIVA" element
     */
    void setIdFiscaleIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType idFiscaleIVA);
    
    /**
     * Appends and returns a new empty "IdFiscaleIVA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType addNewIdFiscaleIVA();
    
    /**
     * Gets the "CodiceFiscale" element
     */
    java.lang.String getCodiceFiscale();
    
    /**
     * Gets (as xml) the "CodiceFiscale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType xgetCodiceFiscale();
    
    /**
     * True if has "CodiceFiscale" element
     */
    boolean isSetCodiceFiscale();
    
    /**
     * Sets the "CodiceFiscale" element
     */
    void setCodiceFiscale(java.lang.String codiceFiscale);
    
    /**
     * Sets (as xml) the "CodiceFiscale" element
     */
    void xsetCodiceFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType codiceFiscale);
    
    /**
     * Unsets the "CodiceFiscale" element
     */
    void unsetCodiceFiscale();
    
    /**
     * Gets the "Anagrafica" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType getAnagrafica();
    
    /**
     * Sets the "Anagrafica" element
     */
    void setAnagrafica(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType anagrafica);
    
    /**
     * Appends and returns a new empty "Anagrafica" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType addNewAnagrafica();
    
    /**
     * Gets the "AlboProfessionale" element
     */
    java.lang.String getAlboProfessionale();
    
    /**
     * Gets (as xml) the "AlboProfessionale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetAlboProfessionale();
    
    /**
     * True if has "AlboProfessionale" element
     */
    boolean isSetAlboProfessionale();
    
    /**
     * Sets the "AlboProfessionale" element
     */
    void setAlboProfessionale(java.lang.String alboProfessionale);
    
    /**
     * Sets (as xml) the "AlboProfessionale" element
     */
    void xsetAlboProfessionale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType alboProfessionale);
    
    /**
     * Unsets the "AlboProfessionale" element
     */
    void unsetAlboProfessionale();
    
    /**
     * Gets the "ProvinciaAlbo" element
     */
    java.lang.String getProvinciaAlbo();
    
    /**
     * Gets (as xml) the "ProvinciaAlbo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType xgetProvinciaAlbo();
    
    /**
     * True if has "ProvinciaAlbo" element
     */
    boolean isSetProvinciaAlbo();
    
    /**
     * Sets the "ProvinciaAlbo" element
     */
    void setProvinciaAlbo(java.lang.String provinciaAlbo);
    
    /**
     * Sets (as xml) the "ProvinciaAlbo" element
     */
    void xsetProvinciaAlbo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType provinciaAlbo);
    
    /**
     * Unsets the "ProvinciaAlbo" element
     */
    void unsetProvinciaAlbo();
    
    /**
     * Gets the "NumeroIscrizioneAlbo" element
     */
    java.lang.String getNumeroIscrizioneAlbo();
    
    /**
     * Gets (as xml) the "NumeroIscrizioneAlbo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type xgetNumeroIscrizioneAlbo();
    
    /**
     * True if has "NumeroIscrizioneAlbo" element
     */
    boolean isSetNumeroIscrizioneAlbo();
    
    /**
     * Sets the "NumeroIscrizioneAlbo" element
     */
    void setNumeroIscrizioneAlbo(java.lang.String numeroIscrizioneAlbo);
    
    /**
     * Sets (as xml) the "NumeroIscrizioneAlbo" element
     */
    void xsetNumeroIscrizioneAlbo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type numeroIscrizioneAlbo);
    
    /**
     * Unsets the "NumeroIscrizioneAlbo" element
     */
    void unsetNumeroIscrizioneAlbo();
    
    /**
     * Gets the "DataIscrizioneAlbo" element
     */
    java.util.Calendar getDataIscrizioneAlbo();
    
    /**
     * Gets (as xml) the "DataIscrizioneAlbo" element
     */
    org.apache.xmlbeans.XmlDate xgetDataIscrizioneAlbo();
    
    /**
     * True if has "DataIscrizioneAlbo" element
     */
    boolean isSetDataIscrizioneAlbo();
    
    /**
     * Sets the "DataIscrizioneAlbo" element
     */
    void setDataIscrizioneAlbo(java.util.Calendar dataIscrizioneAlbo);
    
    /**
     * Sets (as xml) the "DataIscrizioneAlbo" element
     */
    void xsetDataIscrizioneAlbo(org.apache.xmlbeans.XmlDate dataIscrizioneAlbo);
    
    /**
     * Unsets the "DataIscrizioneAlbo" element
     */
    void unsetDataIscrizioneAlbo();
    
    /**
     * Gets the "RegimeFiscale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType.Enum getRegimeFiscale();
    
    /**
     * Gets (as xml) the "RegimeFiscale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType xgetRegimeFiscale();
    
    /**
     * Sets the "RegimeFiscale" element
     */
    void setRegimeFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType.Enum regimeFiscale);
    
    /**
     * Sets (as xml) the "RegimeFiscale" element
     */
    void xsetRegimeFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType regimeFiscale);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
