/*
 * XML Type:  DatiRiepilogoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DatiRiepilogoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DatiRiepilogoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiRiepilogoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("datiriepilogotype6520type");
    
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
     * Gets the "SpeseAccessorie" element
     */
    java.math.BigDecimal getSpeseAccessorie();
    
    /**
     * Gets (as xml) the "SpeseAccessorie" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetSpeseAccessorie();
    
    /**
     * True if has "SpeseAccessorie" element
     */
    boolean isSetSpeseAccessorie();
    
    /**
     * Sets the "SpeseAccessorie" element
     */
    void setSpeseAccessorie(java.math.BigDecimal speseAccessorie);
    
    /**
     * Sets (as xml) the "SpeseAccessorie" element
     */
    void xsetSpeseAccessorie(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType speseAccessorie);
    
    /**
     * Unsets the "SpeseAccessorie" element
     */
    void unsetSpeseAccessorie();
    
    /**
     * Gets the "Arrotondamento" element
     */
    java.math.BigDecimal getArrotondamento();
    
    /**
     * Gets (as xml) the "Arrotondamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType xgetArrotondamento();
    
    /**
     * True if has "Arrotondamento" element
     */
    boolean isSetArrotondamento();
    
    /**
     * Sets the "Arrotondamento" element
     */
    void setArrotondamento(java.math.BigDecimal arrotondamento);
    
    /**
     * Sets (as xml) the "Arrotondamento" element
     */
    void xsetArrotondamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType arrotondamento);
    
    /**
     * Unsets the "Arrotondamento" element
     */
    void unsetArrotondamento();
    
    /**
     * Gets the "ImponibileImporto" element
     */
    java.math.BigDecimal getImponibileImporto();
    
    /**
     * Gets (as xml) the "ImponibileImporto" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImponibileImporto();
    
    /**
     * Sets the "ImponibileImporto" element
     */
    void setImponibileImporto(java.math.BigDecimal imponibileImporto);
    
    /**
     * Sets (as xml) the "ImponibileImporto" element
     */
    void xsetImponibileImporto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType imponibileImporto);
    
    /**
     * Gets the "Imposta" element
     */
    java.math.BigDecimal getImposta();
    
    /**
     * Gets (as xml) the "Imposta" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImposta();
    
    /**
     * Sets the "Imposta" element
     */
    void setImposta(java.math.BigDecimal imposta);
    
    /**
     * Sets (as xml) the "Imposta" element
     */
    void xsetImposta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType imposta);
    
    /**
     * Gets the "EsigibilitaIVA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType.Enum getEsigibilitaIVA();
    
    /**
     * Gets (as xml) the "EsigibilitaIVA" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType xgetEsigibilitaIVA();
    
    /**
     * True if has "EsigibilitaIVA" element
     */
    boolean isSetEsigibilitaIVA();
    
    /**
     * Sets the "EsigibilitaIVA" element
     */
    void setEsigibilitaIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType.Enum esigibilitaIVA);
    
    /**
     * Sets (as xml) the "EsigibilitaIVA" element
     */
    void xsetEsigibilitaIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType esigibilitaIVA);
    
    /**
     * Unsets the "EsigibilitaIVA" element
     */
    void unsetEsigibilitaIVA();
    
    /**
     * Gets the "RiferimentoNormativo" element
     */
    java.lang.String getRiferimentoNormativo();
    
    /**
     * Gets (as xml) the "RiferimentoNormativo" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetRiferimentoNormativo();
    
    /**
     * True if has "RiferimentoNormativo" element
     */
    boolean isSetRiferimentoNormativo();
    
    /**
     * Sets the "RiferimentoNormativo" element
     */
    void setRiferimentoNormativo(java.lang.String riferimentoNormativo);
    
    /**
     * Sets (as xml) the "RiferimentoNormativo" element
     */
    void xsetRiferimentoNormativo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType riferimentoNormativo);
    
    /**
     * Unsets the "RiferimentoNormativo" element
     */
    void unsetRiferimentoNormativo();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
