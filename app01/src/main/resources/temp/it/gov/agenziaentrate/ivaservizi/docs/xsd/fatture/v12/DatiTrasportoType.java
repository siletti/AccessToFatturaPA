/*
 * XML Type:  DatiTrasportoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DatiTrasportoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DatiTrasportoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiTrasportoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("datitrasportotype874ctype");
    
    /**
     * Gets the "DatiAnagraficiVettore" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType getDatiAnagraficiVettore();
    
    /**
     * True if has "DatiAnagraficiVettore" element
     */
    boolean isSetDatiAnagraficiVettore();
    
    /**
     * Sets the "DatiAnagraficiVettore" element
     */
    void setDatiAnagraficiVettore(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType datiAnagraficiVettore);
    
    /**
     * Appends and returns a new empty "DatiAnagraficiVettore" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType addNewDatiAnagraficiVettore();
    
    /**
     * Unsets the "DatiAnagraficiVettore" element
     */
    void unsetDatiAnagraficiVettore();
    
    /**
     * Gets the "MezzoTrasporto" element
     */
    java.lang.String getMezzoTrasporto();
    
    /**
     * Gets (as xml) the "MezzoTrasporto" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType xgetMezzoTrasporto();
    
    /**
     * True if has "MezzoTrasporto" element
     */
    boolean isSetMezzoTrasporto();
    
    /**
     * Sets the "MezzoTrasporto" element
     */
    void setMezzoTrasporto(java.lang.String mezzoTrasporto);
    
    /**
     * Sets (as xml) the "MezzoTrasporto" element
     */
    void xsetMezzoTrasporto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType mezzoTrasporto);
    
    /**
     * Unsets the "MezzoTrasporto" element
     */
    void unsetMezzoTrasporto();
    
    /**
     * Gets the "CausaleTrasporto" element
     */
    java.lang.String getCausaleTrasporto();
    
    /**
     * Gets (as xml) the "CausaleTrasporto" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetCausaleTrasporto();
    
    /**
     * True if has "CausaleTrasporto" element
     */
    boolean isSetCausaleTrasporto();
    
    /**
     * Sets the "CausaleTrasporto" element
     */
    void setCausaleTrasporto(java.lang.String causaleTrasporto);
    
    /**
     * Sets (as xml) the "CausaleTrasporto" element
     */
    void xsetCausaleTrasporto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType causaleTrasporto);
    
    /**
     * Unsets the "CausaleTrasporto" element
     */
    void unsetCausaleTrasporto();
    
    /**
     * Gets the "NumeroColli" element
     */
    int getNumeroColli();
    
    /**
     * Gets (as xml) the "NumeroColli" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType xgetNumeroColli();
    
    /**
     * True if has "NumeroColli" element
     */
    boolean isSetNumeroColli();
    
    /**
     * Sets the "NumeroColli" element
     */
    void setNumeroColli(int numeroColli);
    
    /**
     * Sets (as xml) the "NumeroColli" element
     */
    void xsetNumeroColli(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType numeroColli);
    
    /**
     * Unsets the "NumeroColli" element
     */
    void unsetNumeroColli();
    
    /**
     * Gets the "Descrizione" element
     */
    java.lang.String getDescrizione();
    
    /**
     * Gets (as xml) the "Descrizione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetDescrizione();
    
    /**
     * True if has "Descrizione" element
     */
    boolean isSetDescrizione();
    
    /**
     * Sets the "Descrizione" element
     */
    void setDescrizione(java.lang.String descrizione);
    
    /**
     * Sets (as xml) the "Descrizione" element
     */
    void xsetDescrizione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType descrizione);
    
    /**
     * Unsets the "Descrizione" element
     */
    void unsetDescrizione();
    
    /**
     * Gets the "UnitaMisuraPeso" element
     */
    java.lang.String getUnitaMisuraPeso();
    
    /**
     * Gets (as xml) the "UnitaMisuraPeso" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetUnitaMisuraPeso();
    
    /**
     * True if has "UnitaMisuraPeso" element
     */
    boolean isSetUnitaMisuraPeso();
    
    /**
     * Sets the "UnitaMisuraPeso" element
     */
    void setUnitaMisuraPeso(java.lang.String unitaMisuraPeso);
    
    /**
     * Sets (as xml) the "UnitaMisuraPeso" element
     */
    void xsetUnitaMisuraPeso(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type unitaMisuraPeso);
    
    /**
     * Unsets the "UnitaMisuraPeso" element
     */
    void unsetUnitaMisuraPeso();
    
    /**
     * Gets the "PesoLordo" element
     */
    java.math.BigDecimal getPesoLordo();
    
    /**
     * Gets (as xml) the "PesoLordo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType xgetPesoLordo();
    
    /**
     * True if has "PesoLordo" element
     */
    boolean isSetPesoLordo();
    
    /**
     * Sets the "PesoLordo" element
     */
    void setPesoLordo(java.math.BigDecimal pesoLordo);
    
    /**
     * Sets (as xml) the "PesoLordo" element
     */
    void xsetPesoLordo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType pesoLordo);
    
    /**
     * Unsets the "PesoLordo" element
     */
    void unsetPesoLordo();
    
    /**
     * Gets the "PesoNetto" element
     */
    java.math.BigDecimal getPesoNetto();
    
    /**
     * Gets (as xml) the "PesoNetto" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType xgetPesoNetto();
    
    /**
     * True if has "PesoNetto" element
     */
    boolean isSetPesoNetto();
    
    /**
     * Sets the "PesoNetto" element
     */
    void setPesoNetto(java.math.BigDecimal pesoNetto);
    
    /**
     * Sets (as xml) the "PesoNetto" element
     */
    void xsetPesoNetto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType pesoNetto);
    
    /**
     * Unsets the "PesoNetto" element
     */
    void unsetPesoNetto();
    
    /**
     * Gets the "DataOraRitiro" element
     */
    java.util.Calendar getDataOraRitiro();
    
    /**
     * Gets (as xml) the "DataOraRitiro" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataOraRitiro();
    
    /**
     * True if has "DataOraRitiro" element
     */
    boolean isSetDataOraRitiro();
    
    /**
     * Sets the "DataOraRitiro" element
     */
    void setDataOraRitiro(java.util.Calendar dataOraRitiro);
    
    /**
     * Sets (as xml) the "DataOraRitiro" element
     */
    void xsetDataOraRitiro(org.apache.xmlbeans.XmlDateTime dataOraRitiro);
    
    /**
     * Unsets the "DataOraRitiro" element
     */
    void unsetDataOraRitiro();
    
    /**
     * Gets the "DataInizioTrasporto" element
     */
    java.util.Calendar getDataInizioTrasporto();
    
    /**
     * Gets (as xml) the "DataInizioTrasporto" element
     */
    org.apache.xmlbeans.XmlDate xgetDataInizioTrasporto();
    
    /**
     * True if has "DataInizioTrasporto" element
     */
    boolean isSetDataInizioTrasporto();
    
    /**
     * Sets the "DataInizioTrasporto" element
     */
    void setDataInizioTrasporto(java.util.Calendar dataInizioTrasporto);
    
    /**
     * Sets (as xml) the "DataInizioTrasporto" element
     */
    void xsetDataInizioTrasporto(org.apache.xmlbeans.XmlDate dataInizioTrasporto);
    
    /**
     * Unsets the "DataInizioTrasporto" element
     */
    void unsetDataInizioTrasporto();
    
    /**
     * Gets the "TipoResa" element
     */
    java.lang.String getTipoResa();
    
    /**
     * Gets (as xml) the "TipoResa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType xgetTipoResa();
    
    /**
     * True if has "TipoResa" element
     */
    boolean isSetTipoResa();
    
    /**
     * Sets the "TipoResa" element
     */
    void setTipoResa(java.lang.String tipoResa);
    
    /**
     * Sets (as xml) the "TipoResa" element
     */
    void xsetTipoResa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType tipoResa);
    
    /**
     * Unsets the "TipoResa" element
     */
    void unsetTipoResa();
    
    /**
     * Gets the "IndirizzoResa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType getIndirizzoResa();
    
    /**
     * True if has "IndirizzoResa" element
     */
    boolean isSetIndirizzoResa();
    
    /**
     * Sets the "IndirizzoResa" element
     */
    void setIndirizzoResa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType indirizzoResa);
    
    /**
     * Appends and returns a new empty "IndirizzoResa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType addNewIndirizzoResa();
    
    /**
     * Unsets the "IndirizzoResa" element
     */
    void unsetIndirizzoResa();
    
    /**
     * Gets the "DataOraConsegna" element
     */
    java.util.Calendar getDataOraConsegna();
    
    /**
     * Gets (as xml) the "DataOraConsegna" element
     */
    org.apache.xmlbeans.XmlDateTime xgetDataOraConsegna();
    
    /**
     * True if has "DataOraConsegna" element
     */
    boolean isSetDataOraConsegna();
    
    /**
     * Sets the "DataOraConsegna" element
     */
    void setDataOraConsegna(java.util.Calendar dataOraConsegna);
    
    /**
     * Sets (as xml) the "DataOraConsegna" element
     */
    void xsetDataOraConsegna(org.apache.xmlbeans.XmlDateTime dataOraConsegna);
    
    /**
     * Unsets the "DataOraConsegna" element
     */
    void unsetDataOraConsegna();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
