/*
 * XML Type:  DatiCassaPrevidenzialeType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiCassaPrevidenzialeType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiCassaPrevidenzialeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType
{
    private static final long serialVersionUID = 1L;
    
    public DatiCassaPrevidenzialeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPOCASSA$0 = 
        new javax.xml.namespace.QName("", "TipoCassa");
    private static final javax.xml.namespace.QName ALCASSA$2 = 
        new javax.xml.namespace.QName("", "AlCassa");
    private static final javax.xml.namespace.QName IMPORTOCONTRIBUTOCASSA$4 = 
        new javax.xml.namespace.QName("", "ImportoContributoCassa");
    private static final javax.xml.namespace.QName IMPONIBILECASSA$6 = 
        new javax.xml.namespace.QName("", "ImponibileCassa");
    private static final javax.xml.namespace.QName ALIQUOTAIVA$8 = 
        new javax.xml.namespace.QName("", "AliquotaIVA");
    private static final javax.xml.namespace.QName RITENUTA$10 = 
        new javax.xml.namespace.QName("", "Ritenuta");
    private static final javax.xml.namespace.QName NATURA$12 = 
        new javax.xml.namespace.QName("", "Natura");
    private static final javax.xml.namespace.QName RIFERIMENTOAMMINISTRAZIONE$14 = 
        new javax.xml.namespace.QName("", "RiferimentoAmministrazione");
    
    
    /**
     * Gets the "TipoCassa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType.Enum getTipoCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOCASSA$0, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoCassa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType xgetTipoCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType)get_store().find_element_user(TIPOCASSA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TipoCassa" element
     */
    public void setTipoCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType.Enum tipoCassa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOCASSA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOCASSA$0);
            }
            target.setEnumValue(tipoCassa);
        }
    }
    
    /**
     * Sets (as xml) the "TipoCassa" element
     */
    public void xsetTipoCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType tipoCassa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType)get_store().find_element_user(TIPOCASSA$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCassaType)get_store().add_element_user(TIPOCASSA$0);
            }
            target.set(tipoCassa);
        }
    }
    
    /**
     * Gets the "AlCassa" element
     */
    public java.math.BigDecimal getAlCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALCASSA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "AlCassa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetAlCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALCASSA$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AlCassa" element
     */
    public void setAlCassa(java.math.BigDecimal alCassa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALCASSA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALCASSA$2);
            }
            target.setBigDecimalValue(alCassa);
        }
    }
    
    /**
     * Sets (as xml) the "AlCassa" element
     */
    public void xsetAlCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType alCassa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALCASSA$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().add_element_user(ALCASSA$2);
            }
            target.set(alCassa);
        }
    }
    
    /**
     * Gets the "ImportoContributoCassa" element
     */
    public java.math.BigDecimal getImportoContributoCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTOCONTRIBUTOCASSA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportoContributoCassa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoContributoCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTOCONTRIBUTOCASSA$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImportoContributoCassa" element
     */
    public void setImportoContributoCassa(java.math.BigDecimal importoContributoCassa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTOCONTRIBUTOCASSA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTOCONTRIBUTOCASSA$4);
            }
            target.setBigDecimalValue(importoContributoCassa);
        }
    }
    
    /**
     * Sets (as xml) the "ImportoContributoCassa" element
     */
    public void xsetImportoContributoCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoContributoCassa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTOCONTRIBUTOCASSA$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPORTOCONTRIBUTOCASSA$4);
            }
            target.set(importoContributoCassa);
        }
    }
    
    /**
     * Gets the "ImponibileCassa" element
     */
    public java.math.BigDecimal getImponibileCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPONIBILECASSA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImponibileCassa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImponibileCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPONIBILECASSA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ImponibileCassa" element
     */
    public boolean isSetImponibileCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPONIBILECASSA$6) != 0;
        }
    }
    
    /**
     * Sets the "ImponibileCassa" element
     */
    public void setImponibileCassa(java.math.BigDecimal imponibileCassa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPONIBILECASSA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPONIBILECASSA$6);
            }
            target.setBigDecimalValue(imponibileCassa);
        }
    }
    
    /**
     * Sets (as xml) the "ImponibileCassa" element
     */
    public void xsetImponibileCassa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType imponibileCassa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPONIBILECASSA$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPONIBILECASSA$6);
            }
            target.set(imponibileCassa);
        }
    }
    
    /**
     * Unsets the "ImponibileCassa" element
     */
    public void unsetImponibileCassa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPONIBILECASSA$6, 0);
        }
    }
    
    /**
     * Gets the "AliquotaIVA" element
     */
    public java.math.BigDecimal getAliquotaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIQUOTAIVA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "AliquotaIVA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetAliquotaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALIQUOTAIVA$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AliquotaIVA" element
     */
    public void setAliquotaIVA(java.math.BigDecimal aliquotaIVA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIQUOTAIVA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIQUOTAIVA$8);
            }
            target.setBigDecimalValue(aliquotaIVA);
        }
    }
    
    /**
     * Sets (as xml) the "AliquotaIVA" element
     */
    public void xsetAliquotaIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType aliquotaIVA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALIQUOTAIVA$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().add_element_user(ALIQUOTAIVA$8);
            }
            target.set(aliquotaIVA);
        }
    }
    
    /**
     * Gets the "Ritenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum getRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RITENUTA$10, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ritenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType xgetRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType)get_store().find_element_user(RITENUTA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "Ritenuta" element
     */
    public boolean isSetRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RITENUTA$10) != 0;
        }
    }
    
    /**
     * Sets the "Ritenuta" element
     */
    public void setRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum ritenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RITENUTA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RITENUTA$10);
            }
            target.setEnumValue(ritenuta);
        }
    }
    
    /**
     * Sets (as xml) the "Ritenuta" element
     */
    public void xsetRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType ritenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType)get_store().find_element_user(RITENUTA$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType)get_store().add_element_user(RITENUTA$10);
            }
            target.set(ritenuta);
        }
    }
    
    /**
     * Unsets the "Ritenuta" element
     */
    public void unsetRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RITENUTA$10, 0);
        }
    }
    
    /**
     * Gets the "Natura" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum getNatura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATURA$12, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Natura" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType xgetNatura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().find_element_user(NATURA$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "Natura" element
     */
    public boolean isSetNatura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NATURA$12) != 0;
        }
    }
    
    /**
     * Sets the "Natura" element
     */
    public void setNatura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum natura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATURA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATURA$12);
            }
            target.setEnumValue(natura);
        }
    }
    
    /**
     * Sets (as xml) the "Natura" element
     */
    public void xsetNatura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType natura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().find_element_user(NATURA$12, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().add_element_user(NATURA$12);
            }
            target.set(natura);
        }
    }
    
    /**
     * Unsets the "Natura" element
     */
    public void unsetNatura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NATURA$12, 0);
        }
    }
    
    /**
     * Gets the "RiferimentoAmministrazione" element
     */
    public java.lang.String getRiferimentoAmministrazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RiferimentoAmministrazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetRiferimentoAmministrazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "RiferimentoAmministrazione" element
     */
    public boolean isSetRiferimentoAmministrazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIFERIMENTOAMMINISTRAZIONE$14) != 0;
        }
    }
    
    /**
     * Sets the "RiferimentoAmministrazione" element
     */
    public void setRiferimentoAmministrazione(java.lang.String riferimentoAmministrazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTOAMMINISTRAZIONE$14);
            }
            target.setStringValue(riferimentoAmministrazione);
        }
    }
    
    /**
     * Sets (as xml) the "RiferimentoAmministrazione" element
     */
    public void xsetRiferimentoAmministrazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type riferimentoAmministrazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$14, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(RIFERIMENTOAMMINISTRAZIONE$14);
            }
            target.set(riferimentoAmministrazione);
        }
    }
    
    /**
     * Unsets the "RiferimentoAmministrazione" element
     */
    public void unsetRiferimentoAmministrazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIFERIMENTOAMMINISTRAZIONE$14, 0);
        }
    }
}
