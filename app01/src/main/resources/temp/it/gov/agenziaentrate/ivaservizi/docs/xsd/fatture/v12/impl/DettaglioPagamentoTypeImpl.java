/*
 * XML Type:  DettaglioPagamentoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DettaglioPagamentoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DettaglioPagamentoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType
{
    private static final long serialVersionUID = 1L;
    
    public DettaglioPagamentoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BENEFICIARIO$0 = 
        new javax.xml.namespace.QName("", "Beneficiario");
    private static final javax.xml.namespace.QName MODALITAPAGAMENTO$2 = 
        new javax.xml.namespace.QName("", "ModalitaPagamento");
    private static final javax.xml.namespace.QName DATARIFERIMENTOTERMINIPAGAMENTO$4 = 
        new javax.xml.namespace.QName("", "DataRiferimentoTerminiPagamento");
    private static final javax.xml.namespace.QName GIORNITERMINIPAGAMENTO$6 = 
        new javax.xml.namespace.QName("", "GiorniTerminiPagamento");
    private static final javax.xml.namespace.QName DATASCADENZAPAGAMENTO$8 = 
        new javax.xml.namespace.QName("", "DataScadenzaPagamento");
    private static final javax.xml.namespace.QName IMPORTOPAGAMENTO$10 = 
        new javax.xml.namespace.QName("", "ImportoPagamento");
    private static final javax.xml.namespace.QName CODUFFICIOPOSTALE$12 = 
        new javax.xml.namespace.QName("", "CodUfficioPostale");
    private static final javax.xml.namespace.QName COGNOMEQUIETANZANTE$14 = 
        new javax.xml.namespace.QName("", "CognomeQuietanzante");
    private static final javax.xml.namespace.QName NOMEQUIETANZANTE$16 = 
        new javax.xml.namespace.QName("", "NomeQuietanzante");
    private static final javax.xml.namespace.QName CFQUIETANZANTE$18 = 
        new javax.xml.namespace.QName("", "CFQuietanzante");
    private static final javax.xml.namespace.QName TITOLOQUIETANZANTE$20 = 
        new javax.xml.namespace.QName("", "TitoloQuietanzante");
    private static final javax.xml.namespace.QName ISTITUTOFINANZIARIO$22 = 
        new javax.xml.namespace.QName("", "IstitutoFinanziario");
    private static final javax.xml.namespace.QName IBAN$24 = 
        new javax.xml.namespace.QName("", "IBAN");
    private static final javax.xml.namespace.QName ABI$26 = 
        new javax.xml.namespace.QName("", "ABI");
    private static final javax.xml.namespace.QName CAB$28 = 
        new javax.xml.namespace.QName("", "CAB");
    private static final javax.xml.namespace.QName BIC$30 = 
        new javax.xml.namespace.QName("", "BIC");
    private static final javax.xml.namespace.QName SCONTOPAGAMENTOANTICIPATO$32 = 
        new javax.xml.namespace.QName("", "ScontoPagamentoAnticipato");
    private static final javax.xml.namespace.QName DATALIMITEPAGAMENTOANTICIPATO$34 = 
        new javax.xml.namespace.QName("", "DataLimitePagamentoAnticipato");
    private static final javax.xml.namespace.QName PENALITAPAGAMENTIRITARDATI$36 = 
        new javax.xml.namespace.QName("", "PenalitaPagamentiRitardati");
    private static final javax.xml.namespace.QName DATADECORRENZAPENALE$38 = 
        new javax.xml.namespace.QName("", "DataDecorrenzaPenale");
    private static final javax.xml.namespace.QName CODICEPAGAMENTO$40 = 
        new javax.xml.namespace.QName("", "CodicePagamento");
    
    
    /**
     * Gets the "Beneficiario" element
     */
    public java.lang.String getBeneficiario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BENEFICIARIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Beneficiario" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType xgetBeneficiario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType)get_store().find_element_user(BENEFICIARIO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Beneficiario" element
     */
    public boolean isSetBeneficiario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BENEFICIARIO$0) != 0;
        }
    }
    
    /**
     * Sets the "Beneficiario" element
     */
    public void setBeneficiario(java.lang.String beneficiario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BENEFICIARIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BENEFICIARIO$0);
            }
            target.setStringValue(beneficiario);
        }
    }
    
    /**
     * Sets (as xml) the "Beneficiario" element
     */
    public void xsetBeneficiario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType beneficiario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType)get_store().find_element_user(BENEFICIARIO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType)get_store().add_element_user(BENEFICIARIO$0);
            }
            target.set(beneficiario);
        }
    }
    
    /**
     * Unsets the "Beneficiario" element
     */
    public void unsetBeneficiario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BENEFICIARIO$0, 0);
        }
    }
    
    /**
     * Gets the "ModalitaPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType.Enum getModalitaPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODALITAPAGAMENTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ModalitaPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType xgetModalitaPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType)get_store().find_element_user(MODALITAPAGAMENTO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ModalitaPagamento" element
     */
    public void setModalitaPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType.Enum modalitaPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODALITAPAGAMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODALITAPAGAMENTO$2);
            }
            target.setEnumValue(modalitaPagamento);
        }
    }
    
    /**
     * Sets (as xml) the "ModalitaPagamento" element
     */
    public void xsetModalitaPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType modalitaPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType)get_store().find_element_user(MODALITAPAGAMENTO$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ModalitaPagamentoType)get_store().add_element_user(MODALITAPAGAMENTO$2);
            }
            target.set(modalitaPagamento);
        }
    }
    
    /**
     * Gets the "DataRiferimentoTerminiPagamento" element
     */
    public java.util.Calendar getDataRiferimentoTerminiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARIFERIMENTOTERMINIPAGAMENTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataRiferimentoTerminiPagamento" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataRiferimentoTerminiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATARIFERIMENTOTERMINIPAGAMENTO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataRiferimentoTerminiPagamento" element
     */
    public boolean isSetDataRiferimentoTerminiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATARIFERIMENTOTERMINIPAGAMENTO$4) != 0;
        }
    }
    
    /**
     * Sets the "DataRiferimentoTerminiPagamento" element
     */
    public void setDataRiferimentoTerminiPagamento(java.util.Calendar dataRiferimentoTerminiPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATARIFERIMENTOTERMINIPAGAMENTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATARIFERIMENTOTERMINIPAGAMENTO$4);
            }
            target.setCalendarValue(dataRiferimentoTerminiPagamento);
        }
    }
    
    /**
     * Sets (as xml) the "DataRiferimentoTerminiPagamento" element
     */
    public void xsetDataRiferimentoTerminiPagamento(org.apache.xmlbeans.XmlDate dataRiferimentoTerminiPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATARIFERIMENTOTERMINIPAGAMENTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATARIFERIMENTOTERMINIPAGAMENTO$4);
            }
            target.set(dataRiferimentoTerminiPagamento);
        }
    }
    
    /**
     * Unsets the "DataRiferimentoTerminiPagamento" element
     */
    public void unsetDataRiferimentoTerminiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATARIFERIMENTOTERMINIPAGAMENTO$4, 0);
        }
    }
    
    /**
     * Gets the "GiorniTerminiPagamento" element
     */
    public int getGiorniTerminiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIORNITERMINIPAGAMENTO$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "GiorniTerminiPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType xgetGiorniTerminiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType)get_store().find_element_user(GIORNITERMINIPAGAMENTO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "GiorniTerminiPagamento" element
     */
    public boolean isSetGiorniTerminiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIORNITERMINIPAGAMENTO$6) != 0;
        }
    }
    
    /**
     * Sets the "GiorniTerminiPagamento" element
     */
    public void setGiorniTerminiPagamento(int giorniTerminiPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GIORNITERMINIPAGAMENTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GIORNITERMINIPAGAMENTO$6);
            }
            target.setIntValue(giorniTerminiPagamento);
        }
    }
    
    /**
     * Sets (as xml) the "GiorniTerminiPagamento" element
     */
    public void xsetGiorniTerminiPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType giorniTerminiPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType)get_store().find_element_user(GIORNITERMINIPAGAMENTO$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.GiorniTerminePagamentoType)get_store().add_element_user(GIORNITERMINIPAGAMENTO$6);
            }
            target.set(giorniTerminiPagamento);
        }
    }
    
    /**
     * Unsets the "GiorniTerminiPagamento" element
     */
    public void unsetGiorniTerminiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIORNITERMINIPAGAMENTO$6, 0);
        }
    }
    
    /**
     * Gets the "DataScadenzaPagamento" element
     */
    public java.util.Calendar getDataScadenzaPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASCADENZAPAGAMENTO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataScadenzaPagamento" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataScadenzaPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATASCADENZAPAGAMENTO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataScadenzaPagamento" element
     */
    public boolean isSetDataScadenzaPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATASCADENZAPAGAMENTO$8) != 0;
        }
    }
    
    /**
     * Sets the "DataScadenzaPagamento" element
     */
    public void setDataScadenzaPagamento(java.util.Calendar dataScadenzaPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATASCADENZAPAGAMENTO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATASCADENZAPAGAMENTO$8);
            }
            target.setCalendarValue(dataScadenzaPagamento);
        }
    }
    
    /**
     * Sets (as xml) the "DataScadenzaPagamento" element
     */
    public void xsetDataScadenzaPagamento(org.apache.xmlbeans.XmlDate dataScadenzaPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATASCADENZAPAGAMENTO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATASCADENZAPAGAMENTO$8);
            }
            target.set(dataScadenzaPagamento);
        }
    }
    
    /**
     * Unsets the "DataScadenzaPagamento" element
     */
    public void unsetDataScadenzaPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATASCADENZAPAGAMENTO$8, 0);
        }
    }
    
    /**
     * Gets the "ImportoPagamento" element
     */
    public java.math.BigDecimal getImportoPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTOPAGAMENTO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportoPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTOPAGAMENTO$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImportoPagamento" element
     */
    public void setImportoPagamento(java.math.BigDecimal importoPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTOPAGAMENTO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTOPAGAMENTO$10);
            }
            target.setBigDecimalValue(importoPagamento);
        }
    }
    
    /**
     * Sets (as xml) the "ImportoPagamento" element
     */
    public void xsetImportoPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTOPAGAMENTO$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPORTOPAGAMENTO$10);
            }
            target.set(importoPagamento);
        }
    }
    
    /**
     * Gets the "CodUfficioPostale" element
     */
    public java.lang.String getCodUfficioPostale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODUFFICIOPOSTALE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodUfficioPostale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetCodUfficioPostale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(CODUFFICIOPOSTALE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodUfficioPostale" element
     */
    public boolean isSetCodUfficioPostale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODUFFICIOPOSTALE$12) != 0;
        }
    }
    
    /**
     * Sets the "CodUfficioPostale" element
     */
    public void setCodUfficioPostale(java.lang.String codUfficioPostale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODUFFICIOPOSTALE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODUFFICIOPOSTALE$12);
            }
            target.setStringValue(codUfficioPostale);
        }
    }
    
    /**
     * Sets (as xml) the "CodUfficioPostale" element
     */
    public void xsetCodUfficioPostale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type codUfficioPostale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(CODUFFICIOPOSTALE$12, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(CODUFFICIOPOSTALE$12);
            }
            target.set(codUfficioPostale);
        }
    }
    
    /**
     * Unsets the "CodUfficioPostale" element
     */
    public void unsetCodUfficioPostale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODUFFICIOPOSTALE$12, 0);
        }
    }
    
    /**
     * Gets the "CognomeQuietanzante" element
     */
    public java.lang.String getCognomeQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COGNOMEQUIETANZANTE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CognomeQuietanzante" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetCognomeQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(COGNOMEQUIETANZANTE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "CognomeQuietanzante" element
     */
    public boolean isSetCognomeQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COGNOMEQUIETANZANTE$14) != 0;
        }
    }
    
    /**
     * Sets the "CognomeQuietanzante" element
     */
    public void setCognomeQuietanzante(java.lang.String cognomeQuietanzante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COGNOMEQUIETANZANTE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COGNOMEQUIETANZANTE$14);
            }
            target.setStringValue(cognomeQuietanzante);
        }
    }
    
    /**
     * Sets (as xml) the "CognomeQuietanzante" element
     */
    public void xsetCognomeQuietanzante(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType cognomeQuietanzante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(COGNOMEQUIETANZANTE$14, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(COGNOMEQUIETANZANTE$14);
            }
            target.set(cognomeQuietanzante);
        }
    }
    
    /**
     * Unsets the "CognomeQuietanzante" element
     */
    public void unsetCognomeQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COGNOMEQUIETANZANTE$14, 0);
        }
    }
    
    /**
     * Gets the "NomeQuietanzante" element
     */
    public java.lang.String getNomeQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMEQUIETANZANTE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NomeQuietanzante" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetNomeQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(NOMEQUIETANZANTE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "NomeQuietanzante" element
     */
    public boolean isSetNomeQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOMEQUIETANZANTE$16) != 0;
        }
    }
    
    /**
     * Sets the "NomeQuietanzante" element
     */
    public void setNomeQuietanzante(java.lang.String nomeQuietanzante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMEQUIETANZANTE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMEQUIETANZANTE$16);
            }
            target.setStringValue(nomeQuietanzante);
        }
    }
    
    /**
     * Sets (as xml) the "NomeQuietanzante" element
     */
    public void xsetNomeQuietanzante(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType nomeQuietanzante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(NOMEQUIETANZANTE$16, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(NOMEQUIETANZANTE$16);
            }
            target.set(nomeQuietanzante);
        }
    }
    
    /**
     * Unsets the "NomeQuietanzante" element
     */
    public void unsetNomeQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOMEQUIETANZANTE$16, 0);
        }
    }
    
    /**
     * Gets the "CFQuietanzante" element
     */
    public java.lang.String getCFQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CFQUIETANZANTE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CFQuietanzante" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType xgetCFQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType)get_store().find_element_user(CFQUIETANZANTE$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "CFQuietanzante" element
     */
    public boolean isSetCFQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CFQUIETANZANTE$18) != 0;
        }
    }
    
    /**
     * Sets the "CFQuietanzante" element
     */
    public void setCFQuietanzante(java.lang.String cfQuietanzante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CFQUIETANZANTE$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CFQUIETANZANTE$18);
            }
            target.setStringValue(cfQuietanzante);
        }
    }
    
    /**
     * Sets (as xml) the "CFQuietanzante" element
     */
    public void xsetCFQuietanzante(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType cfQuietanzante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType)get_store().find_element_user(CFQUIETANZANTE$18, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscalePFType)get_store().add_element_user(CFQUIETANZANTE$18);
            }
            target.set(cfQuietanzante);
        }
    }
    
    /**
     * Unsets the "CFQuietanzante" element
     */
    public void unsetCFQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CFQUIETANZANTE$18, 0);
        }
    }
    
    /**
     * Gets the "TitoloQuietanzante" element
     */
    public java.lang.String getTitoloQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITOLOQUIETANZANTE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TitoloQuietanzante" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType xgetTitoloQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType)get_store().find_element_user(TITOLOQUIETANZANTE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "TitoloQuietanzante" element
     */
    public boolean isSetTitoloQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITOLOQUIETANZANTE$20) != 0;
        }
    }
    
    /**
     * Sets the "TitoloQuietanzante" element
     */
    public void setTitoloQuietanzante(java.lang.String titoloQuietanzante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITOLOQUIETANZANTE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITOLOQUIETANZANTE$20);
            }
            target.setStringValue(titoloQuietanzante);
        }
    }
    
    /**
     * Sets (as xml) the "TitoloQuietanzante" element
     */
    public void xsetTitoloQuietanzante(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType titoloQuietanzante)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType)get_store().find_element_user(TITOLOQUIETANZANTE$20, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType)get_store().add_element_user(TITOLOQUIETANZANTE$20);
            }
            target.set(titoloQuietanzante);
        }
    }
    
    /**
     * Unsets the "TitoloQuietanzante" element
     */
    public void unsetTitoloQuietanzante()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITOLOQUIETANZANTE$20, 0);
        }
    }
    
    /**
     * Gets the "IstitutoFinanziario" element
     */
    public java.lang.String getIstitutoFinanziario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTITUTOFINANZIARIO$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IstitutoFinanziario" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType xgetIstitutoFinanziario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().find_element_user(ISTITUTOFINANZIARIO$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "IstitutoFinanziario" element
     */
    public boolean isSetIstitutoFinanziario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISTITUTOFINANZIARIO$22) != 0;
        }
    }
    
    /**
     * Sets the "IstitutoFinanziario" element
     */
    public void setIstitutoFinanziario(java.lang.String istitutoFinanziario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISTITUTOFINANZIARIO$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISTITUTOFINANZIARIO$22);
            }
            target.setStringValue(istitutoFinanziario);
        }
    }
    
    /**
     * Sets (as xml) the "IstitutoFinanziario" element
     */
    public void xsetIstitutoFinanziario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType istitutoFinanziario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().find_element_user(ISTITUTOFINANZIARIO$22, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().add_element_user(ISTITUTOFINANZIARIO$22);
            }
            target.set(istitutoFinanziario);
        }
    }
    
    /**
     * Unsets the "IstitutoFinanziario" element
     */
    public void unsetIstitutoFinanziario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISTITUTOFINANZIARIO$22, 0);
        }
    }
    
    /**
     * Gets the "IBAN" element
     */
    public java.lang.String getIBAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IBAN$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IBAN" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType xgetIBAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType)get_store().find_element_user(IBAN$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "IBAN" element
     */
    public boolean isSetIBAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IBAN$24) != 0;
        }
    }
    
    /**
     * Sets the "IBAN" element
     */
    public void setIBAN(java.lang.String iban)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IBAN$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IBAN$24);
            }
            target.setStringValue(iban);
        }
    }
    
    /**
     * Sets (as xml) the "IBAN" element
     */
    public void xsetIBAN(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType iban)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType)get_store().find_element_user(IBAN$24, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IBANType)get_store().add_element_user(IBAN$24);
            }
            target.set(iban);
        }
    }
    
    /**
     * Unsets the "IBAN" element
     */
    public void unsetIBAN()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IBAN$24, 0);
        }
    }
    
    /**
     * Gets the "ABI" element
     */
    public java.lang.String getABI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABI$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ABI" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType xgetABI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType)get_store().find_element_user(ABI$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "ABI" element
     */
    public boolean isSetABI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ABI$26) != 0;
        }
    }
    
    /**
     * Sets the "ABI" element
     */
    public void setABI(java.lang.String abi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ABI$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ABI$26);
            }
            target.setStringValue(abi);
        }
    }
    
    /**
     * Sets (as xml) the "ABI" element
     */
    public void xsetABI(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType abi)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType)get_store().find_element_user(ABI$26, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ABIType)get_store().add_element_user(ABI$26);
            }
            target.set(abi);
        }
    }
    
    /**
     * Unsets the "ABI" element
     */
    public void unsetABI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ABI$26, 0);
        }
    }
    
    /**
     * Gets the "CAB" element
     */
    public java.lang.String getCAB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAB$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CAB" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType xgetCAB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType)get_store().find_element_user(CAB$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "CAB" element
     */
    public boolean isSetCAB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAB$28) != 0;
        }
    }
    
    /**
     * Sets the "CAB" element
     */
    public void setCAB(java.lang.String cab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAB$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAB$28);
            }
            target.setStringValue(cab);
        }
    }
    
    /**
     * Sets (as xml) the "CAB" element
     */
    public void xsetCAB(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType cab)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType)get_store().find_element_user(CAB$28, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CABType)get_store().add_element_user(CAB$28);
            }
            target.set(cab);
        }
    }
    
    /**
     * Unsets the "CAB" element
     */
    public void unsetCAB()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAB$28, 0);
        }
    }
    
    /**
     * Gets the "BIC" element
     */
    public java.lang.String getBIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIC$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BIC" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType xgetBIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType)get_store().find_element_user(BIC$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "BIC" element
     */
    public boolean isSetBIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIC$30) != 0;
        }
    }
    
    /**
     * Sets the "BIC" element
     */
    public void setBIC(java.lang.String bic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BIC$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BIC$30);
            }
            target.setStringValue(bic);
        }
    }
    
    /**
     * Sets (as xml) the "BIC" element
     */
    public void xsetBIC(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType bic)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType)get_store().find_element_user(BIC$30, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BICType)get_store().add_element_user(BIC$30);
            }
            target.set(bic);
        }
    }
    
    /**
     * Unsets the "BIC" element
     */
    public void unsetBIC()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIC$30, 0);
        }
    }
    
    /**
     * Gets the "ScontoPagamentoAnticipato" element
     */
    public java.math.BigDecimal getScontoPagamentoAnticipato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCONTOPAGAMENTOANTICIPATO$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScontoPagamentoAnticipato" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetScontoPagamentoAnticipato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(SCONTOPAGAMENTOANTICIPATO$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScontoPagamentoAnticipato" element
     */
    public boolean isSetScontoPagamentoAnticipato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCONTOPAGAMENTOANTICIPATO$32) != 0;
        }
    }
    
    /**
     * Sets the "ScontoPagamentoAnticipato" element
     */
    public void setScontoPagamentoAnticipato(java.math.BigDecimal scontoPagamentoAnticipato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCONTOPAGAMENTOANTICIPATO$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCONTOPAGAMENTOANTICIPATO$32);
            }
            target.setBigDecimalValue(scontoPagamentoAnticipato);
        }
    }
    
    /**
     * Sets (as xml) the "ScontoPagamentoAnticipato" element
     */
    public void xsetScontoPagamentoAnticipato(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType scontoPagamentoAnticipato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(SCONTOPAGAMENTOANTICIPATO$32, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(SCONTOPAGAMENTOANTICIPATO$32);
            }
            target.set(scontoPagamentoAnticipato);
        }
    }
    
    /**
     * Unsets the "ScontoPagamentoAnticipato" element
     */
    public void unsetScontoPagamentoAnticipato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCONTOPAGAMENTOANTICIPATO$32, 0);
        }
    }
    
    /**
     * Gets the "DataLimitePagamentoAnticipato" element
     */
    public java.util.Calendar getDataLimitePagamentoAnticipato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATALIMITEPAGAMENTOANTICIPATO$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataLimitePagamentoAnticipato" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataLimitePagamentoAnticipato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATALIMITEPAGAMENTOANTICIPATO$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataLimitePagamentoAnticipato" element
     */
    public boolean isSetDataLimitePagamentoAnticipato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATALIMITEPAGAMENTOANTICIPATO$34) != 0;
        }
    }
    
    /**
     * Sets the "DataLimitePagamentoAnticipato" element
     */
    public void setDataLimitePagamentoAnticipato(java.util.Calendar dataLimitePagamentoAnticipato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATALIMITEPAGAMENTOANTICIPATO$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATALIMITEPAGAMENTOANTICIPATO$34);
            }
            target.setCalendarValue(dataLimitePagamentoAnticipato);
        }
    }
    
    /**
     * Sets (as xml) the "DataLimitePagamentoAnticipato" element
     */
    public void xsetDataLimitePagamentoAnticipato(org.apache.xmlbeans.XmlDate dataLimitePagamentoAnticipato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATALIMITEPAGAMENTOANTICIPATO$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATALIMITEPAGAMENTOANTICIPATO$34);
            }
            target.set(dataLimitePagamentoAnticipato);
        }
    }
    
    /**
     * Unsets the "DataLimitePagamentoAnticipato" element
     */
    public void unsetDataLimitePagamentoAnticipato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATALIMITEPAGAMENTOANTICIPATO$34, 0);
        }
    }
    
    /**
     * Gets the "PenalitaPagamentiRitardati" element
     */
    public java.math.BigDecimal getPenalitaPagamentiRitardati()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PENALITAPAGAMENTIRITARDATI$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PenalitaPagamentiRitardati" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetPenalitaPagamentiRitardati()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(PENALITAPAGAMENTIRITARDATI$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "PenalitaPagamentiRitardati" element
     */
    public boolean isSetPenalitaPagamentiRitardati()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PENALITAPAGAMENTIRITARDATI$36) != 0;
        }
    }
    
    /**
     * Sets the "PenalitaPagamentiRitardati" element
     */
    public void setPenalitaPagamentiRitardati(java.math.BigDecimal penalitaPagamentiRitardati)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PENALITAPAGAMENTIRITARDATI$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PENALITAPAGAMENTIRITARDATI$36);
            }
            target.setBigDecimalValue(penalitaPagamentiRitardati);
        }
    }
    
    /**
     * Sets (as xml) the "PenalitaPagamentiRitardati" element
     */
    public void xsetPenalitaPagamentiRitardati(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType penalitaPagamentiRitardati)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(PENALITAPAGAMENTIRITARDATI$36, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(PENALITAPAGAMENTIRITARDATI$36);
            }
            target.set(penalitaPagamentiRitardati);
        }
    }
    
    /**
     * Unsets the "PenalitaPagamentiRitardati" element
     */
    public void unsetPenalitaPagamentiRitardati()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PENALITAPAGAMENTIRITARDATI$36, 0);
        }
    }
    
    /**
     * Gets the "DataDecorrenzaPenale" element
     */
    public java.util.Calendar getDataDecorrenzaPenale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATADECORRENZAPENALE$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataDecorrenzaPenale" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataDecorrenzaPenale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATADECORRENZAPENALE$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataDecorrenzaPenale" element
     */
    public boolean isSetDataDecorrenzaPenale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATADECORRENZAPENALE$38) != 0;
        }
    }
    
    /**
     * Sets the "DataDecorrenzaPenale" element
     */
    public void setDataDecorrenzaPenale(java.util.Calendar dataDecorrenzaPenale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATADECORRENZAPENALE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATADECORRENZAPENALE$38);
            }
            target.setCalendarValue(dataDecorrenzaPenale);
        }
    }
    
    /**
     * Sets (as xml) the "DataDecorrenzaPenale" element
     */
    public void xsetDataDecorrenzaPenale(org.apache.xmlbeans.XmlDate dataDecorrenzaPenale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATADECORRENZAPENALE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATADECORRENZAPENALE$38);
            }
            target.set(dataDecorrenzaPenale);
        }
    }
    
    /**
     * Unsets the "DataDecorrenzaPenale" element
     */
    public void unsetDataDecorrenzaPenale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATADECORRENZAPENALE$38, 0);
        }
    }
    
    /**
     * Gets the "CodicePagamento" element
     */
    public java.lang.String getCodicePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEPAGAMENTO$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodicePagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type xgetCodicePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type)get_store().find_element_user(CODICEPAGAMENTO$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodicePagamento" element
     */
    public boolean isSetCodicePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODICEPAGAMENTO$40) != 0;
        }
    }
    
    /**
     * Sets the "CodicePagamento" element
     */
    public void setCodicePagamento(java.lang.String codicePagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEPAGAMENTO$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICEPAGAMENTO$40);
            }
            target.setStringValue(codicePagamento);
        }
    }
    
    /**
     * Sets (as xml) the "CodicePagamento" element
     */
    public void xsetCodicePagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type codicePagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type)get_store().find_element_user(CODICEPAGAMENTO$40, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type)get_store().add_element_user(CODICEPAGAMENTO$40);
            }
            target.set(codicePagamento);
        }
    }
    
    /**
     * Unsets the "CodicePagamento" element
     */
    public void unsetCodicePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODICEPAGAMENTO$40, 0);
        }
    }
}
