/*
 * XML Type:  DatiRiepilogoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiRiepilogoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiRiepilogoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType
{
    private static final long serialVersionUID = 1L;
    
    public DatiRiepilogoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ALIQUOTAIVA$0 = 
        new javax.xml.namespace.QName("", "AliquotaIVA");
    private static final javax.xml.namespace.QName NATURA$2 = 
        new javax.xml.namespace.QName("", "Natura");
    private static final javax.xml.namespace.QName SPESEACCESSORIE$4 = 
        new javax.xml.namespace.QName("", "SpeseAccessorie");
    private static final javax.xml.namespace.QName ARROTONDAMENTO$6 = 
        new javax.xml.namespace.QName("", "Arrotondamento");
    private static final javax.xml.namespace.QName IMPONIBILEIMPORTO$8 = 
        new javax.xml.namespace.QName("", "ImponibileImporto");
    private static final javax.xml.namespace.QName IMPOSTA$10 = 
        new javax.xml.namespace.QName("", "Imposta");
    private static final javax.xml.namespace.QName ESIGIBILITAIVA$12 = 
        new javax.xml.namespace.QName("", "EsigibilitaIVA");
    private static final javax.xml.namespace.QName RIFERIMENTONORMATIVO$14 = 
        new javax.xml.namespace.QName("", "RiferimentoNormativo");
    
    
    /**
     * Gets the "AliquotaIVA" element
     */
    public java.math.BigDecimal getAliquotaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIQUOTAIVA$0, 0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALIQUOTAIVA$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIQUOTAIVA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIQUOTAIVA$0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALIQUOTAIVA$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().add_element_user(ALIQUOTAIVA$0);
            }
            target.set(aliquotaIVA);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATURA$2, 0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().find_element_user(NATURA$2, 0);
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
            return get_store().count_elements(NATURA$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATURA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATURA$2);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().find_element_user(NATURA$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().add_element_user(NATURA$2);
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
            get_store().remove_element(NATURA$2, 0);
        }
    }
    
    /**
     * Gets the "SpeseAccessorie" element
     */
    public java.math.BigDecimal getSpeseAccessorie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPESEACCESSORIE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "SpeseAccessorie" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetSpeseAccessorie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(SPESEACCESSORIE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "SpeseAccessorie" element
     */
    public boolean isSetSpeseAccessorie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPESEACCESSORIE$4) != 0;
        }
    }
    
    /**
     * Sets the "SpeseAccessorie" element
     */
    public void setSpeseAccessorie(java.math.BigDecimal speseAccessorie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SPESEACCESSORIE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SPESEACCESSORIE$4);
            }
            target.setBigDecimalValue(speseAccessorie);
        }
    }
    
    /**
     * Sets (as xml) the "SpeseAccessorie" element
     */
    public void xsetSpeseAccessorie(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType speseAccessorie)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(SPESEACCESSORIE$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(SPESEACCESSORIE$4);
            }
            target.set(speseAccessorie);
        }
    }
    
    /**
     * Unsets the "SpeseAccessorie" element
     */
    public void unsetSpeseAccessorie()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPESEACCESSORIE$4, 0);
        }
    }
    
    /**
     * Gets the "Arrotondamento" element
     */
    public java.math.BigDecimal getArrotondamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARROTONDAMENTO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Arrotondamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType xgetArrotondamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().find_element_user(ARROTONDAMENTO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Arrotondamento" element
     */
    public boolean isSetArrotondamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARROTONDAMENTO$6) != 0;
        }
    }
    
    /**
     * Sets the "Arrotondamento" element
     */
    public void setArrotondamento(java.math.BigDecimal arrotondamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARROTONDAMENTO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARROTONDAMENTO$6);
            }
            target.setBigDecimalValue(arrotondamento);
        }
    }
    
    /**
     * Sets (as xml) the "Arrotondamento" element
     */
    public void xsetArrotondamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType arrotondamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().find_element_user(ARROTONDAMENTO$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().add_element_user(ARROTONDAMENTO$6);
            }
            target.set(arrotondamento);
        }
    }
    
    /**
     * Unsets the "Arrotondamento" element
     */
    public void unsetArrotondamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARROTONDAMENTO$6, 0);
        }
    }
    
    /**
     * Gets the "ImponibileImporto" element
     */
    public java.math.BigDecimal getImponibileImporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPONIBILEIMPORTO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImponibileImporto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImponibileImporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPONIBILEIMPORTO$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImponibileImporto" element
     */
    public void setImponibileImporto(java.math.BigDecimal imponibileImporto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPONIBILEIMPORTO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPONIBILEIMPORTO$8);
            }
            target.setBigDecimalValue(imponibileImporto);
        }
    }
    
    /**
     * Sets (as xml) the "ImponibileImporto" element
     */
    public void xsetImponibileImporto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType imponibileImporto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPONIBILEIMPORTO$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPONIBILEIMPORTO$8);
            }
            target.set(imponibileImporto);
        }
    }
    
    /**
     * Gets the "Imposta" element
     */
    public java.math.BigDecimal getImposta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPOSTA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Imposta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImposta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPOSTA$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Imposta" element
     */
    public void setImposta(java.math.BigDecimal imposta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPOSTA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPOSTA$10);
            }
            target.setBigDecimalValue(imposta);
        }
    }
    
    /**
     * Sets (as xml) the "Imposta" element
     */
    public void xsetImposta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType imposta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPOSTA$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPOSTA$10);
            }
            target.set(imposta);
        }
    }
    
    /**
     * Gets the "EsigibilitaIVA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType.Enum getEsigibilitaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESIGIBILITAIVA$12, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EsigibilitaIVA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType xgetEsigibilitaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType)get_store().find_element_user(ESIGIBILITAIVA$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "EsigibilitaIVA" element
     */
    public boolean isSetEsigibilitaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ESIGIBILITAIVA$12) != 0;
        }
    }
    
    /**
     * Sets the "EsigibilitaIVA" element
     */
    public void setEsigibilitaIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType.Enum esigibilitaIVA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ESIGIBILITAIVA$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ESIGIBILITAIVA$12);
            }
            target.setEnumValue(esigibilitaIVA);
        }
    }
    
    /**
     * Sets (as xml) the "EsigibilitaIVA" element
     */
    public void xsetEsigibilitaIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType esigibilitaIVA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType)get_store().find_element_user(ESIGIBILITAIVA$12, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EsigibilitaIVAType)get_store().add_element_user(ESIGIBILITAIVA$12);
            }
            target.set(esigibilitaIVA);
        }
    }
    
    /**
     * Unsets the "EsigibilitaIVA" element
     */
    public void unsetEsigibilitaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ESIGIBILITAIVA$12, 0);
        }
    }
    
    /**
     * Gets the "RiferimentoNormativo" element
     */
    public java.lang.String getRiferimentoNormativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTONORMATIVO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RiferimentoNormativo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetRiferimentoNormativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(RIFERIMENTONORMATIVO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "RiferimentoNormativo" element
     */
    public boolean isSetRiferimentoNormativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIFERIMENTONORMATIVO$14) != 0;
        }
    }
    
    /**
     * Sets the "RiferimentoNormativo" element
     */
    public void setRiferimentoNormativo(java.lang.String riferimentoNormativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTONORMATIVO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTONORMATIVO$14);
            }
            target.setStringValue(riferimentoNormativo);
        }
    }
    
    /**
     * Sets (as xml) the "RiferimentoNormativo" element
     */
    public void xsetRiferimentoNormativo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType riferimentoNormativo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(RIFERIMENTONORMATIVO$14, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().add_element_user(RIFERIMENTONORMATIVO$14);
            }
            target.set(riferimentoNormativo);
        }
    }
    
    /**
     * Unsets the "RiferimentoNormativo" element
     */
    public void unsetRiferimentoNormativo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIFERIMENTONORMATIVO$14, 0);
        }
    }
}
