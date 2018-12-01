/*
 * XML Type:  DatiDocumentiCorrelatiType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DatiDocumentiCorrelatiType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DatiDocumentiCorrelatiType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DatiDocumentiCorrelatiType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("datidocumenticorrelatitypeb719type");
    
    /**
     * Gets array of all "RiferimentoNumeroLinea" elements
     */
    int[] getRiferimentoNumeroLineaArray();
    
    /**
     * Gets ith "RiferimentoNumeroLinea" element
     */
    int getRiferimentoNumeroLineaArray(int i);
    
    /**
     * Gets (as xml) array of all "RiferimentoNumeroLinea" elements
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType[] xgetRiferimentoNumeroLineaArray();
    
    /**
     * Gets (as xml) ith "RiferimentoNumeroLinea" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType xgetRiferimentoNumeroLineaArray(int i);
    
    /**
     * Returns number of "RiferimentoNumeroLinea" element
     */
    int sizeOfRiferimentoNumeroLineaArray();
    
    /**
     * Sets array of all "RiferimentoNumeroLinea" element
     */
    void setRiferimentoNumeroLineaArray(int[] riferimentoNumeroLineaArray);
    
    /**
     * Sets ith "RiferimentoNumeroLinea" element
     */
    void setRiferimentoNumeroLineaArray(int i, int riferimentoNumeroLinea);
    
    /**
     * Sets (as xml) array of all "RiferimentoNumeroLinea" element
     */
    void xsetRiferimentoNumeroLineaArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType[] riferimentoNumeroLineaArray);
    
    /**
     * Sets (as xml) ith "RiferimentoNumeroLinea" element
     */
    void xsetRiferimentoNumeroLineaArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType riferimentoNumeroLinea);
    
    /**
     * Inserts the value as the ith "RiferimentoNumeroLinea" element
     */
    void insertRiferimentoNumeroLinea(int i, int riferimentoNumeroLinea);
    
    /**
     * Appends the value as the last "RiferimentoNumeroLinea" element
     */
    void addRiferimentoNumeroLinea(int riferimentoNumeroLinea);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RiferimentoNumeroLinea" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType insertNewRiferimentoNumeroLinea(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RiferimentoNumeroLinea" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType addNewRiferimentoNumeroLinea();
    
    /**
     * Removes the ith "RiferimentoNumeroLinea" element
     */
    void removeRiferimentoNumeroLinea(int i);
    
    /**
     * Gets the "IdDocumento" element
     */
    java.lang.String getIdDocumento();
    
    /**
     * Gets (as xml) the "IdDocumento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetIdDocumento();
    
    /**
     * Sets the "IdDocumento" element
     */
    void setIdDocumento(java.lang.String idDocumento);
    
    /**
     * Sets (as xml) the "IdDocumento" element
     */
    void xsetIdDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type idDocumento);
    
    /**
     * Gets the "Data" element
     */
    java.util.Calendar getData();
    
    /**
     * Gets (as xml) the "Data" element
     */
    org.apache.xmlbeans.XmlDate xgetData();
    
    /**
     * True if has "Data" element
     */
    boolean isSetData();
    
    /**
     * Sets the "Data" element
     */
    void setData(java.util.Calendar data);
    
    /**
     * Sets (as xml) the "Data" element
     */
    void xsetData(org.apache.xmlbeans.XmlDate data);
    
    /**
     * Unsets the "Data" element
     */
    void unsetData();
    
    /**
     * Gets the "NumItem" element
     */
    java.lang.String getNumItem();
    
    /**
     * Gets (as xml) the "NumItem" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetNumItem();
    
    /**
     * True if has "NumItem" element
     */
    boolean isSetNumItem();
    
    /**
     * Sets the "NumItem" element
     */
    void setNumItem(java.lang.String numItem);
    
    /**
     * Sets (as xml) the "NumItem" element
     */
    void xsetNumItem(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type numItem);
    
    /**
     * Unsets the "NumItem" element
     */
    void unsetNumItem();
    
    /**
     * Gets the "CodiceCommessaConvenzione" element
     */
    java.lang.String getCodiceCommessaConvenzione();
    
    /**
     * Gets (as xml) the "CodiceCommessaConvenzione" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetCodiceCommessaConvenzione();
    
    /**
     * True if has "CodiceCommessaConvenzione" element
     */
    boolean isSetCodiceCommessaConvenzione();
    
    /**
     * Sets the "CodiceCommessaConvenzione" element
     */
    void setCodiceCommessaConvenzione(java.lang.String codiceCommessaConvenzione);
    
    /**
     * Sets (as xml) the "CodiceCommessaConvenzione" element
     */
    void xsetCodiceCommessaConvenzione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType codiceCommessaConvenzione);
    
    /**
     * Unsets the "CodiceCommessaConvenzione" element
     */
    void unsetCodiceCommessaConvenzione();
    
    /**
     * Gets the "CodiceCUP" element
     */
    java.lang.String getCodiceCUP();
    
    /**
     * Gets (as xml) the "CodiceCUP" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type xgetCodiceCUP();
    
    /**
     * True if has "CodiceCUP" element
     */
    boolean isSetCodiceCUP();
    
    /**
     * Sets the "CodiceCUP" element
     */
    void setCodiceCUP(java.lang.String codiceCUP);
    
    /**
     * Sets (as xml) the "CodiceCUP" element
     */
    void xsetCodiceCUP(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type codiceCUP);
    
    /**
     * Unsets the "CodiceCUP" element
     */
    void unsetCodiceCUP();
    
    /**
     * Gets the "CodiceCIG" element
     */
    java.lang.String getCodiceCIG();
    
    /**
     * Gets (as xml) the "CodiceCIG" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type xgetCodiceCIG();
    
    /**
     * True if has "CodiceCIG" element
     */
    boolean isSetCodiceCIG();
    
    /**
     * Sets the "CodiceCIG" element
     */
    void setCodiceCIG(java.lang.String codiceCIG);
    
    /**
     * Sets (as xml) the "CodiceCIG" element
     */
    void xsetCodiceCIG(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type codiceCIG);
    
    /**
     * Unsets the "CodiceCIG" element
     */
    void unsetCodiceCIG();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
