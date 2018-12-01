/*
 * XML Type:  AltriDatiGestionaliType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML AltriDatiGestionaliType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class AltriDatiGestionaliTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType
{
    private static final long serialVersionUID = 1L;
    
    public AltriDatiGestionaliTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPODATO$0 = 
        new javax.xml.namespace.QName("", "TipoDato");
    private static final javax.xml.namespace.QName RIFERIMENTOTESTO$2 = 
        new javax.xml.namespace.QName("", "RiferimentoTesto");
    private static final javax.xml.namespace.QName RIFERIMENTONUMERO$4 = 
        new javax.xml.namespace.QName("", "RiferimentoNumero");
    private static final javax.xml.namespace.QName RIFERIMENTODATA$6 = 
        new javax.xml.namespace.QName("", "RiferimentoData");
    
    
    /**
     * Gets the "TipoDato" element
     */
    public java.lang.String getTipoDato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODATO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoDato" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetTipoDato()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(TIPODATO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TipoDato" element
     */
    public void setTipoDato(java.lang.String tipoDato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODATO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODATO$0);
            }
            target.setStringValue(tipoDato);
        }
    }
    
    /**
     * Sets (as xml) the "TipoDato" element
     */
    public void xsetTipoDato(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type tipoDato)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(TIPODATO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().add_element_user(TIPODATO$0);
            }
            target.set(tipoDato);
        }
    }
    
    /**
     * Gets the "RiferimentoTesto" element
     */
    public java.lang.String getRiferimentoTesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOTESTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RiferimentoTesto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetRiferimentoTesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(RIFERIMENTOTESTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "RiferimentoTesto" element
     */
    public boolean isSetRiferimentoTesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIFERIMENTOTESTO$2) != 0;
        }
    }
    
    /**
     * Sets the "RiferimentoTesto" element
     */
    public void setRiferimentoTesto(java.lang.String riferimentoTesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOTESTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTOTESTO$2);
            }
            target.setStringValue(riferimentoTesto);
        }
    }
    
    /**
     * Sets (as xml) the "RiferimentoTesto" element
     */
    public void xsetRiferimentoTesto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType riferimentoTesto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(RIFERIMENTOTESTO$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(RIFERIMENTOTESTO$2);
            }
            target.set(riferimentoTesto);
        }
    }
    
    /**
     * Unsets the "RiferimentoTesto" element
     */
    public void unsetRiferimentoTesto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIFERIMENTOTESTO$2, 0);
        }
    }
    
    /**
     * Gets the "RiferimentoNumero" element
     */
    public java.math.BigDecimal getRiferimentoNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTONUMERO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "RiferimentoNumero" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType xgetRiferimentoNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().find_element_user(RIFERIMENTONUMERO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "RiferimentoNumero" element
     */
    public boolean isSetRiferimentoNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIFERIMENTONUMERO$4) != 0;
        }
    }
    
    /**
     * Sets the "RiferimentoNumero" element
     */
    public void setRiferimentoNumero(java.math.BigDecimal riferimentoNumero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTONUMERO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTONUMERO$4);
            }
            target.setBigDecimalValue(riferimentoNumero);
        }
    }
    
    /**
     * Sets (as xml) the "RiferimentoNumero" element
     */
    public void xsetRiferimentoNumero(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType riferimentoNumero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().find_element_user(RIFERIMENTONUMERO$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().add_element_user(RIFERIMENTONUMERO$4);
            }
            target.set(riferimentoNumero);
        }
    }
    
    /**
     * Unsets the "RiferimentoNumero" element
     */
    public void unsetRiferimentoNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIFERIMENTONUMERO$4, 0);
        }
    }
    
    /**
     * Gets the "RiferimentoData" element
     */
    public java.util.Calendar getRiferimentoData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTODATA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "RiferimentoData" element
     */
    public org.apache.xmlbeans.XmlDate xgetRiferimentoData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RIFERIMENTODATA$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "RiferimentoData" element
     */
    public boolean isSetRiferimentoData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIFERIMENTODATA$6) != 0;
        }
    }
    
    /**
     * Sets the "RiferimentoData" element
     */
    public void setRiferimentoData(java.util.Calendar riferimentoData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTODATA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTODATA$6);
            }
            target.setCalendarValue(riferimentoData);
        }
    }
    
    /**
     * Sets (as xml) the "RiferimentoData" element
     */
    public void xsetRiferimentoData(org.apache.xmlbeans.XmlDate riferimentoData)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(RIFERIMENTODATA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(RIFERIMENTODATA$6);
            }
            target.set(riferimentoData);
        }
    }
    
    /**
     * Unsets the "RiferimentoData" element
     */
    public void unsetRiferimentoData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIFERIMENTODATA$6, 0);
        }
    }
}
