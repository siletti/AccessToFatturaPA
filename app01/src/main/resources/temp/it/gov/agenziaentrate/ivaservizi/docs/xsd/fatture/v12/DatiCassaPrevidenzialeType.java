/*
 * XML Type:  DatiCassaPrevidenzialeType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DatiCassaPrevidenzialeType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DatiCassaPrevidenzialeType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiCassaPrevidenzialeType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("daticassaprevidenzialetype1155type");
    
    /**
     * Gets the "TipoCassa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType.Enum getTipoCassa();
    
    /**
     * Gets (as xml) the "TipoCassa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType xgetTipoCassa();
    
    /**
     * Sets the "TipoCassa" element
     */
    void setTipoCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType.Enum tipoCassa);
    
    /**
     * Sets (as xml) the "TipoCassa" element
     */
    void xsetTipoCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType tipoCassa);
    
    /**
     * Gets the "AlCassa" element
     */
    java.math.BigDecimal getAlCassa();
    
    /**
     * Gets (as xml) the "AlCassa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetAlCassa();
    
    /**
     * Sets the "AlCassa" element
     */
    void setAlCassa(java.math.BigDecimal alCassa);
    
    /**
     * Sets (as xml) the "AlCassa" element
     */
    void xsetAlCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType alCassa);
    
    /**
     * Gets the "ImportoContributoCassa" element
     */
    java.math.BigDecimal getImportoContributoCassa();
    
    /**
     * Gets (as xml) the "ImportoContributoCassa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoContributoCassa();
    
    /**
     * Sets the "ImportoContributoCassa" element
     */
    void setImportoContributoCassa(java.math.BigDecimal importoContributoCassa);
    
    /**
     * Sets (as xml) the "ImportoContributoCassa" element
     */
    void xsetImportoContributoCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoContributoCassa);
    
    /**
     * Gets the "ImponibileCassa" element
     */
    java.math.BigDecimal getImponibileCassa();
    
    /**
     * Gets (as xml) the "ImponibileCassa" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImponibileCassa();
    
    /**
     * True if has "ImponibileCassa" element
     */
    boolean isSetImponibileCassa();
    
    /**
     * Sets the "ImponibileCassa" element
     */
    void setImponibileCassa(java.math.BigDecimal imponibileCassa);
    
    /**
     * Sets (as xml) the "ImponibileCassa" element
     */
    void xsetImponibileCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType imponibileCassa);
    
    /**
     * Unsets the "ImponibileCassa" element
     */
    void unsetImponibileCassa();
    
    /**
     * Gets the "AliquotaIVA" element
     */
    java.math.BigDecimal getAliquotaIVA();
    
    /**
     * Gets (as xml) the "AliquotaIVA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetAliquotaIVA();
    
    /**
     * Sets the "AliquotaIVA" element
     */
    void setAliquotaIVA(java.math.BigDecimal aliquotaIVA);
    
    /**
     * Sets (as xml) the "AliquotaIVA" element
     */
    void xsetAliquotaIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType aliquotaIVA);
    
    /**
     * Gets the "Ritenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum getRitenuta();
    
    /**
     * Gets (as xml) the "Ritenuta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType xgetRitenuta();
    
    /**
     * True if has "Ritenuta" element
     */
    boolean isSetRitenuta();
    
    /**
     * Sets the "Ritenuta" element
     */
    void setRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum ritenuta);
    
    /**
     * Sets (as xml) the "Ritenuta" element
     */
    void xsetRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType ritenuta);
    
    /**
     * Unsets the "Ritenuta" element
     */
    void unsetRitenuta();
    
    /**
     * Gets the "Natura" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum getNatura();
    
    /**
     * Gets (as xml) the "Natura" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType xgetNatura();
    
    /**
     * True if has "Natura" element
     */
    boolean isSetNatura();
    
    /**
     * Sets the "Natura" element
     */
    void setNatura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum natura);
    
    /**
     * Sets (as xml) the "Natura" element
     */
    void xsetNatura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType natura);
    
    /**
     * Unsets the "Natura" element
     */
    void unsetNatura();
    
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
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
