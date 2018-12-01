/*
 * XML Type:  DatiRitenutaType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiRitenutaType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiRitenutaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType
{
    private static final long serialVersionUID = 1L;
    
    public DatiRitenutaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPORITENUTA$0 = 
        new javax.xml.namespace.QName("", "TipoRitenuta");
    private static final javax.xml.namespace.QName IMPORTORITENUTA$2 = 
        new javax.xml.namespace.QName("", "ImportoRitenuta");
    private static final javax.xml.namespace.QName ALIQUOTARITENUTA$4 = 
        new javax.xml.namespace.QName("", "AliquotaRitenuta");
    private static final javax.xml.namespace.QName CAUSALEPAGAMENTO$6 = 
        new javax.xml.namespace.QName("", "CausalePagamento");
    
    
    /**
     * Gets the "TipoRitenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType.Enum getTipoRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPORITENUTA$0, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoRitenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType xgetTipoRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType)get_store().find_element_user(TIPORITENUTA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TipoRitenuta" element
     */
    public void setTipoRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType.Enum tipoRitenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPORITENUTA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPORITENUTA$0);
            }
            target.setEnumValue(tipoRitenuta);
        }
    }
    
    /**
     * Sets (as xml) the "TipoRitenuta" element
     */
    public void xsetTipoRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType tipoRitenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType)get_store().find_element_user(TIPORITENUTA$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoRitenutaType)get_store().add_element_user(TIPORITENUTA$0);
            }
            target.set(tipoRitenuta);
        }
    }
    
    /**
     * Gets the "ImportoRitenuta" element
     */
    public java.math.BigDecimal getImportoRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTORITENUTA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportoRitenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTORITENUTA$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImportoRitenuta" element
     */
    public void setImportoRitenuta(java.math.BigDecimal importoRitenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTORITENUTA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTORITENUTA$2);
            }
            target.setBigDecimalValue(importoRitenuta);
        }
    }
    
    /**
     * Sets (as xml) the "ImportoRitenuta" element
     */
    public void xsetImportoRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoRitenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTORITENUTA$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPORTORITENUTA$2);
            }
            target.set(importoRitenuta);
        }
    }
    
    /**
     * Gets the "AliquotaRitenuta" element
     */
    public java.math.BigDecimal getAliquotaRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIQUOTARITENUTA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "AliquotaRitenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetAliquotaRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALIQUOTARITENUTA$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AliquotaRitenuta" element
     */
    public void setAliquotaRitenuta(java.math.BigDecimal aliquotaRitenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIQUOTARITENUTA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIQUOTARITENUTA$4);
            }
            target.setBigDecimalValue(aliquotaRitenuta);
        }
    }
    
    /**
     * Sets (as xml) the "AliquotaRitenuta" element
     */
    public void xsetAliquotaRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType aliquotaRitenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALIQUOTARITENUTA$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().add_element_user(ALIQUOTARITENUTA$4);
            }
            target.set(aliquotaRitenuta);
        }
    }
    
    /**
     * Gets the "CausalePagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType.Enum getCausalePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAUSALEPAGAMENTO$6, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CausalePagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType xgetCausalePagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType)get_store().find_element_user(CAUSALEPAGAMENTO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CausalePagamento" element
     */
    public void setCausalePagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType.Enum causalePagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAUSALEPAGAMENTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAUSALEPAGAMENTO$6);
            }
            target.setEnumValue(causalePagamento);
        }
    }
    
    /**
     * Sets (as xml) the "CausalePagamento" element
     */
    public void xsetCausalePagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType causalePagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType)get_store().find_element_user(CAUSALEPAGAMENTO$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CausalePagamentoType)get_store().add_element_user(CAUSALEPAGAMENTO$6);
            }
            target.set(causalePagamento);
        }
    }
}
