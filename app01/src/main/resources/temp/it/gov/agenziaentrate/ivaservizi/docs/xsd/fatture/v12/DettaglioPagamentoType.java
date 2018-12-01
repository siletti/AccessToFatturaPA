/*
 * XML Type:  DettaglioPagamentoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML DettaglioPagamentoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public interface DettaglioPagamentoType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DettaglioPagamentoType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("dettagliopagamentotype0ecdtype");
    
    /**
     * Gets the "Beneficiario" element
     */
    java.lang.String getBeneficiario();
    
    /**
     * Gets (as xml) the "Beneficiario" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType xgetBeneficiario();
    
    /**
     * True if has "Beneficiario" element
     */
    boolean isSetBeneficiario();
    
    /**
     * Sets the "Beneficiario" element
     */
    void setBeneficiario(java.lang.String beneficiario);
    
    /**
     * Sets (as xml) the "Beneficiario" element
     */
    void xsetBeneficiario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType beneficiario);
    
    /**
     * Unsets the "Beneficiario" element
     */
    void unsetBeneficiario();
    
    /**
     * Gets the "ModalitaPagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType.Enum getModalitaPagamento();
    
    /**
     * Gets (as xml) the "ModalitaPagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType xgetModalitaPagamento();
    
    /**
     * Sets the "ModalitaPagamento" element
     */
    void setModalitaPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType.Enum modalitaPagamento);
    
    /**
     * Sets (as xml) the "ModalitaPagamento" element
     */
    void xsetModalitaPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType modalitaPagamento);
    
    /**
     * Gets the "DataRiferimentoTerminiPagamento" element
     */
    java.util.Calendar getDataRiferimentoTerminiPagamento();
    
    /**
     * Gets (as xml) the "DataRiferimentoTerminiPagamento" element
     */
    org.apache.xmlbeans.XmlDate xgetDataRiferimentoTerminiPagamento();
    
    /**
     * True if has "DataRiferimentoTerminiPagamento" element
     */
    boolean isSetDataRiferimentoTerminiPagamento();
    
    /**
     * Sets the "DataRiferimentoTerminiPagamento" element
     */
    void setDataRiferimentoTerminiPagamento(java.util.Calendar dataRiferimentoTerminiPagamento);
    
    /**
     * Sets (as xml) the "DataRiferimentoTerminiPagamento" element
     */
    void xsetDataRiferimentoTerminiPagamento(org.apache.xmlbeans.XmlDate dataRiferimentoTerminiPagamento);
    
    /**
     * Unsets the "DataRiferimentoTerminiPagamento" element
     */
    void unsetDataRiferimentoTerminiPagamento();
    
    /**
     * Gets the "GiorniTerminiPagamento" element
     */
    int getGiorniTerminiPagamento();
    
    /**
     * Gets (as xml) the "GiorniTerminiPagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType xgetGiorniTerminiPagamento();
    
    /**
     * True if has "GiorniTerminiPagamento" element
     */
    boolean isSetGiorniTerminiPagamento();
    
    /**
     * Sets the "GiorniTerminiPagamento" element
     */
    void setGiorniTerminiPagamento(int giorniTerminiPagamento);
    
    /**
     * Sets (as xml) the "GiorniTerminiPagamento" element
     */
    void xsetGiorniTerminiPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType giorniTerminiPagamento);
    
    /**
     * Unsets the "GiorniTerminiPagamento" element
     */
    void unsetGiorniTerminiPagamento();
    
    /**
     * Gets the "DataScadenzaPagamento" element
     */
    java.util.Calendar getDataScadenzaPagamento();
    
    /**
     * Gets (as xml) the "DataScadenzaPagamento" element
     */
    org.apache.xmlbeans.XmlDate xgetDataScadenzaPagamento();
    
    /**
     * True if has "DataScadenzaPagamento" element
     */
    boolean isSetDataScadenzaPagamento();
    
    /**
     * Sets the "DataScadenzaPagamento" element
     */
    void setDataScadenzaPagamento(java.util.Calendar dataScadenzaPagamento);
    
    /**
     * Sets (as xml) the "DataScadenzaPagamento" element
     */
    void xsetDataScadenzaPagamento(org.apache.xmlbeans.XmlDate dataScadenzaPagamento);
    
    /**
     * Unsets the "DataScadenzaPagamento" element
     */
    void unsetDataScadenzaPagamento();
    
    /**
     * Gets the "ImportoPagamento" element
     */
    java.math.BigDecimal getImportoPagamento();
    
    /**
     * Gets (as xml) the "ImportoPagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoPagamento();
    
    /**
     * Sets the "ImportoPagamento" element
     */
    void setImportoPagamento(java.math.BigDecimal importoPagamento);
    
    /**
     * Sets (as xml) the "ImportoPagamento" element
     */
    void xsetImportoPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoPagamento);
    
    /**
     * Gets the "CodUfficioPostale" element
     */
    java.lang.String getCodUfficioPostale();
    
    /**
     * Gets (as xml) the "CodUfficioPostale" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetCodUfficioPostale();
    
    /**
     * True if has "CodUfficioPostale" element
     */
    boolean isSetCodUfficioPostale();
    
    /**
     * Sets the "CodUfficioPostale" element
     */
    void setCodUfficioPostale(java.lang.String codUfficioPostale);
    
    /**
     * Sets (as xml) the "CodUfficioPostale" element
     */
    void xsetCodUfficioPostale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type codUfficioPostale);
    
    /**
     * Unsets the "CodUfficioPostale" element
     */
    void unsetCodUfficioPostale();
    
    /**
     * Gets the "CognomeQuietanzante" element
     */
    java.lang.String getCognomeQuietanzante();
    
    /**
     * Gets (as xml) the "CognomeQuietanzante" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetCognomeQuietanzante();
    
    /**
     * True if has "CognomeQuietanzante" element
     */
    boolean isSetCognomeQuietanzante();
    
    /**
     * Sets the "CognomeQuietanzante" element
     */
    void setCognomeQuietanzante(java.lang.String cognomeQuietanzante);
    
    /**
     * Sets (as xml) the "CognomeQuietanzante" element
     */
    void xsetCognomeQuietanzante(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType cognomeQuietanzante);
    
    /**
     * Unsets the "CognomeQuietanzante" element
     */
    void unsetCognomeQuietanzante();
    
    /**
     * Gets the "NomeQuietanzante" element
     */
    java.lang.String getNomeQuietanzante();
    
    /**
     * Gets (as xml) the "NomeQuietanzante" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetNomeQuietanzante();
    
    /**
     * True if has "NomeQuietanzante" element
     */
    boolean isSetNomeQuietanzante();
    
    /**
     * Sets the "NomeQuietanzante" element
     */
    void setNomeQuietanzante(java.lang.String nomeQuietanzante);
    
    /**
     * Sets (as xml) the "NomeQuietanzante" element
     */
    void xsetNomeQuietanzante(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType nomeQuietanzante);
    
    /**
     * Unsets the "NomeQuietanzante" element
     */
    void unsetNomeQuietanzante();
    
    /**
     * Gets the "CFQuietanzante" element
     */
    java.lang.String getCFQuietanzante();
    
    /**
     * Gets (as xml) the "CFQuietanzante" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType xgetCFQuietanzante();
    
    /**
     * True if has "CFQuietanzante" element
     */
    boolean isSetCFQuietanzante();
    
    /**
     * Sets the "CFQuietanzante" element
     */
    void setCFQuietanzante(java.lang.String cfQuietanzante);
    
    /**
     * Sets (as xml) the "CFQuietanzante" element
     */
    void xsetCFQuietanzante(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType cfQuietanzante);
    
    /**
     * Unsets the "CFQuietanzante" element
     */
    void unsetCFQuietanzante();
    
    /**
     * Gets the "TitoloQuietanzante" element
     */
    java.lang.String getTitoloQuietanzante();
    
    /**
     * Gets (as xml) the "TitoloQuietanzante" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType xgetTitoloQuietanzante();
    
    /**
     * True if has "TitoloQuietanzante" element
     */
    boolean isSetTitoloQuietanzante();
    
    /**
     * Sets the "TitoloQuietanzante" element
     */
    void setTitoloQuietanzante(java.lang.String titoloQuietanzante);
    
    /**
     * Sets (as xml) the "TitoloQuietanzante" element
     */
    void xsetTitoloQuietanzante(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType titoloQuietanzante);
    
    /**
     * Unsets the "TitoloQuietanzante" element
     */
    void unsetTitoloQuietanzante();
    
    /**
     * Gets the "IstitutoFinanziario" element
     */
    java.lang.String getIstitutoFinanziario();
    
    /**
     * Gets (as xml) the "IstitutoFinanziario" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType xgetIstitutoFinanziario();
    
    /**
     * True if has "IstitutoFinanziario" element
     */
    boolean isSetIstitutoFinanziario();
    
    /**
     * Sets the "IstitutoFinanziario" element
     */
    void setIstitutoFinanziario(java.lang.String istitutoFinanziario);
    
    /**
     * Sets (as xml) the "IstitutoFinanziario" element
     */
    void xsetIstitutoFinanziario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType istitutoFinanziario);
    
    /**
     * Unsets the "IstitutoFinanziario" element
     */
    void unsetIstitutoFinanziario();
    
    /**
     * Gets the "IBAN" element
     */
    java.lang.String getIBAN();
    
    /**
     * Gets (as xml) the "IBAN" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType xgetIBAN();
    
    /**
     * True if has "IBAN" element
     */
    boolean isSetIBAN();
    
    /**
     * Sets the "IBAN" element
     */
    void setIBAN(java.lang.String iban);
    
    /**
     * Sets (as xml) the "IBAN" element
     */
    void xsetIBAN(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType iban);
    
    /**
     * Unsets the "IBAN" element
     */
    void unsetIBAN();
    
    /**
     * Gets the "ABI" element
     */
    java.lang.String getABI();
    
    /**
     * Gets (as xml) the "ABI" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType xgetABI();
    
    /**
     * True if has "ABI" element
     */
    boolean isSetABI();
    
    /**
     * Sets the "ABI" element
     */
    void setABI(java.lang.String abi);
    
    /**
     * Sets (as xml) the "ABI" element
     */
    void xsetABI(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType abi);
    
    /**
     * Unsets the "ABI" element
     */
    void unsetABI();
    
    /**
     * Gets the "CAB" element
     */
    java.lang.String getCAB();
    
    /**
     * Gets (as xml) the "CAB" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType xgetCAB();
    
    /**
     * True if has "CAB" element
     */
    boolean isSetCAB();
    
    /**
     * Sets the "CAB" element
     */
    void setCAB(java.lang.String cab);
    
    /**
     * Sets (as xml) the "CAB" element
     */
    void xsetCAB(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType cab);
    
    /**
     * Unsets the "CAB" element
     */
    void unsetCAB();
    
    /**
     * Gets the "BIC" element
     */
    java.lang.String getBIC();
    
    /**
     * Gets (as xml) the "BIC" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType xgetBIC();
    
    /**
     * True if has "BIC" element
     */
    boolean isSetBIC();
    
    /**
     * Sets the "BIC" element
     */
    void setBIC(java.lang.String bic);
    
    /**
     * Sets (as xml) the "BIC" element
     */
    void xsetBIC(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType bic);
    
    /**
     * Unsets the "BIC" element
     */
    void unsetBIC();
    
    /**
     * Gets the "ScontoPagamentoAnticipato" element
     */
    java.math.BigDecimal getScontoPagamentoAnticipato();
    
    /**
     * Gets (as xml) the "ScontoPagamentoAnticipato" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetScontoPagamentoAnticipato();
    
    /**
     * True if has "ScontoPagamentoAnticipato" element
     */
    boolean isSetScontoPagamentoAnticipato();
    
    /**
     * Sets the "ScontoPagamentoAnticipato" element
     */
    void setScontoPagamentoAnticipato(java.math.BigDecimal scontoPagamentoAnticipato);
    
    /**
     * Sets (as xml) the "ScontoPagamentoAnticipato" element
     */
    void xsetScontoPagamentoAnticipato(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType scontoPagamentoAnticipato);
    
    /**
     * Unsets the "ScontoPagamentoAnticipato" element
     */
    void unsetScontoPagamentoAnticipato();
    
    /**
     * Gets the "DataLimitePagamentoAnticipato" element
     */
    java.util.Calendar getDataLimitePagamentoAnticipato();
    
    /**
     * Gets (as xml) the "DataLimitePagamentoAnticipato" element
     */
    org.apache.xmlbeans.XmlDate xgetDataLimitePagamentoAnticipato();
    
    /**
     * True if has "DataLimitePagamentoAnticipato" element
     */
    boolean isSetDataLimitePagamentoAnticipato();
    
    /**
     * Sets the "DataLimitePagamentoAnticipato" element
     */
    void setDataLimitePagamentoAnticipato(java.util.Calendar dataLimitePagamentoAnticipato);
    
    /**
     * Sets (as xml) the "DataLimitePagamentoAnticipato" element
     */
    void xsetDataLimitePagamentoAnticipato(org.apache.xmlbeans.XmlDate dataLimitePagamentoAnticipato);
    
    /**
     * Unsets the "DataLimitePagamentoAnticipato" element
     */
    void unsetDataLimitePagamentoAnticipato();
    
    /**
     * Gets the "PenalitaPagamentiRitardati" element
     */
    java.math.BigDecimal getPenalitaPagamentiRitardati();
    
    /**
     * Gets (as xml) the "PenalitaPagamentiRitardati" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetPenalitaPagamentiRitardati();
    
    /**
     * True if has "PenalitaPagamentiRitardati" element
     */
    boolean isSetPenalitaPagamentiRitardati();
    
    /**
     * Sets the "PenalitaPagamentiRitardati" element
     */
    void setPenalitaPagamentiRitardati(java.math.BigDecimal penalitaPagamentiRitardati);
    
    /**
     * Sets (as xml) the "PenalitaPagamentiRitardati" element
     */
    void xsetPenalitaPagamentiRitardati(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType penalitaPagamentiRitardati);
    
    /**
     * Unsets the "PenalitaPagamentiRitardati" element
     */
    void unsetPenalitaPagamentiRitardati();
    
    /**
     * Gets the "DataDecorrenzaPenale" element
     */
    java.util.Calendar getDataDecorrenzaPenale();
    
    /**
     * Gets (as xml) the "DataDecorrenzaPenale" element
     */
    org.apache.xmlbeans.XmlDate xgetDataDecorrenzaPenale();
    
    /**
     * True if has "DataDecorrenzaPenale" element
     */
    boolean isSetDataDecorrenzaPenale();
    
    /**
     * Sets the "DataDecorrenzaPenale" element
     */
    void setDataDecorrenzaPenale(java.util.Calendar dataDecorrenzaPenale);
    
    /**
     * Sets (as xml) the "DataDecorrenzaPenale" element
     */
    void xsetDataDecorrenzaPenale(org.apache.xmlbeans.XmlDate dataDecorrenzaPenale);
    
    /**
     * Unsets the "DataDecorrenzaPenale" element
     */
    void unsetDataDecorrenzaPenale();
    
    /**
     * Gets the "CodicePagamento" element
     */
    java.lang.String getCodicePagamento();
    
    /**
     * Gets (as xml) the "CodicePagamento" element
     */
    it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type xgetCodicePagamento();
    
    /**
     * True if has "CodicePagamento" element
     */
    boolean isSetCodicePagamento();
    
    /**
     * Sets the "CodicePagamento" element
     */
    void setCodicePagamento(java.lang.String codicePagamento);
    
    /**
     * Sets (as xml) the "CodicePagamento" element
     */
    void xsetCodicePagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type codicePagamento);
    
    /**
     * Unsets the "CodicePagamento" element
     */
    void unsetCodicePagamento();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
