/*
 * XML Type:  IscrizioneREAType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML IscrizioneREAType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class IscrizioneREATypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType
{
    private static final long serialVersionUID = 1L;
    
    public IscrizioneREATypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UFFICIO$0 = 
        new javax.xml.namespace.QName("", "Ufficio");
    private static final javax.xml.namespace.QName NUMEROREA$2 = 
        new javax.xml.namespace.QName("", "NumeroREA");
    private static final javax.xml.namespace.QName CAPITALESOCIALE$4 = 
        new javax.xml.namespace.QName("", "CapitaleSociale");
    private static final javax.xml.namespace.QName SOCIOUNICO$6 = 
        new javax.xml.namespace.QName("", "SocioUnico");
    private static final javax.xml.namespace.QName STATOLIQUIDAZIONE$8 = 
        new javax.xml.namespace.QName("", "StatoLiquidazione");
    
    
    /**
     * Gets the "Ufficio" element
     */
    public java.lang.String getUfficio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UFFICIO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ufficio" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType xgetUfficio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().find_element_user(UFFICIO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Ufficio" element
     */
    public void setUfficio(java.lang.String ufficio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UFFICIO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UFFICIO$0);
            }
            target.setStringValue(ufficio);
        }
    }
    
    /**
     * Sets (as xml) the "Ufficio" element
     */
    public void xsetUfficio(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType ufficio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().find_element_user(UFFICIO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().add_element_user(UFFICIO$0);
            }
            target.set(ufficio);
        }
    }
    
    /**
     * Gets the "NumeroREA" element
     */
    public java.lang.String getNumeroREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROREA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroREA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetNumeroREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMEROREA$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumeroREA" element
     */
    public void setNumeroREA(java.lang.String numeroREA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROREA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROREA$2);
            }
            target.setStringValue(numeroREA);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroREA" element
     */
    public void xsetNumeroREA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type numeroREA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMEROREA$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(NUMEROREA$2);
            }
            target.set(numeroREA);
        }
    }
    
    /**
     * Gets the "CapitaleSociale" element
     */
    public java.math.BigDecimal getCapitaleSociale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITALESOCIALE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "CapitaleSociale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetCapitaleSociale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(CAPITALESOCIALE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CapitaleSociale" element
     */
    public boolean isSetCapitaleSociale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPITALESOCIALE$4) != 0;
        }
    }
    
    /**
     * Sets the "CapitaleSociale" element
     */
    public void setCapitaleSociale(java.math.BigDecimal capitaleSociale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAPITALESOCIALE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAPITALESOCIALE$4);
            }
            target.setBigDecimalValue(capitaleSociale);
        }
    }
    
    /**
     * Sets (as xml) the "CapitaleSociale" element
     */
    public void xsetCapitaleSociale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType capitaleSociale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(CAPITALESOCIALE$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(CAPITALESOCIALE$4);
            }
            target.set(capitaleSociale);
        }
    }
    
    /**
     * Unsets the "CapitaleSociale" element
     */
    public void unsetCapitaleSociale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPITALESOCIALE$4, 0);
        }
    }
    
    /**
     * Gets the "SocioUnico" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType.Enum getSocioUnico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOCIOUNICO$6, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SocioUnico" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType xgetSocioUnico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType)get_store().find_element_user(SOCIOUNICO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "SocioUnico" element
     */
    public boolean isSetSocioUnico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOCIOUNICO$6) != 0;
        }
    }
    
    /**
     * Sets the "SocioUnico" element
     */
    public void setSocioUnico(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType.Enum socioUnico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOCIOUNICO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOCIOUNICO$6);
            }
            target.setEnumValue(socioUnico);
        }
    }
    
    /**
     * Sets (as xml) the "SocioUnico" element
     */
    public void xsetSocioUnico(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType socioUnico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType)get_store().find_element_user(SOCIOUNICO$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SocioUnicoType)get_store().add_element_user(SOCIOUNICO$6);
            }
            target.set(socioUnico);
        }
    }
    
    /**
     * Unsets the "SocioUnico" element
     */
    public void unsetSocioUnico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOCIOUNICO$6, 0);
        }
    }
    
    /**
     * Gets the "StatoLiquidazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType.Enum getStatoLiquidazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATOLIQUIDAZIONE$8, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "StatoLiquidazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType xgetStatoLiquidazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType)get_store().find_element_user(STATOLIQUIDAZIONE$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "StatoLiquidazione" element
     */
    public void setStatoLiquidazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType.Enum statoLiquidazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATOLIQUIDAZIONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATOLIQUIDAZIONE$8);
            }
            target.setEnumValue(statoLiquidazione);
        }
    }
    
    /**
     * Sets (as xml) the "StatoLiquidazione" element
     */
    public void xsetStatoLiquidazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType statoLiquidazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType)get_store().find_element_user(STATOLIQUIDAZIONE$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.StatoLiquidazioneType)get_store().add_element_user(STATOLIQUIDAZIONE$8);
            }
            target.set(statoLiquidazione);
        }
    }
}
