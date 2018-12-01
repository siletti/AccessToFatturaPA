/*
 * XML Type:  FatturaElettronicaHeaderType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML FatturaElettronicaHeaderType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class FatturaElettronicaHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public FatturaElettronicaHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATITRASMISSIONE$0 = 
        new javax.xml.namespace.QName("", "DatiTrasmissione");
    private static final javax.xml.namespace.QName CEDENTEPRESTATORE$2 = 
        new javax.xml.namespace.QName("", "CedentePrestatore");
    private static final javax.xml.namespace.QName RAPPRESENTANTEFISCALE$4 = 
        new javax.xml.namespace.QName("", "RappresentanteFiscale");
    private static final javax.xml.namespace.QName CESSIONARIOCOMMITTENTE$6 = 
        new javax.xml.namespace.QName("", "CessionarioCommittente");
    private static final javax.xml.namespace.QName TERZOINTERMEDIARIOOSOGGETTOEMITTENTE$8 = 
        new javax.xml.namespace.QName("", "TerzoIntermediarioOSoggettoEmittente");
    private static final javax.xml.namespace.QName SOGGETTOEMITTENTE$10 = 
        new javax.xml.namespace.QName("", "SoggettoEmittente");
    
    
    /**
     * Gets the "DatiTrasmissione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType getDatiTrasmissione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType)get_store().find_element_user(DATITRASMISSIONE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DatiTrasmissione" element
     */
    public void setDatiTrasmissione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType datiTrasmissione)
    {
        generatedSetterHelperImpl(datiTrasmissione, DATITRASMISSIONE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiTrasmissione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType addNewDatiTrasmissione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType)get_store().add_element_user(DATITRASMISSIONE$0);
            return target;
        }
    }
    
    /**
     * Gets the "CedentePrestatore" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType getCedentePrestatore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType)get_store().find_element_user(CEDENTEPRESTATORE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CedentePrestatore" element
     */
    public void setCedentePrestatore(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType cedentePrestatore)
    {
        generatedSetterHelperImpl(cedentePrestatore, CEDENTEPRESTATORE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CedentePrestatore" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType addNewCedentePrestatore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType)get_store().add_element_user(CEDENTEPRESTATORE$2);
            return target;
        }
    }
    
    /**
     * Gets the "RappresentanteFiscale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType getRappresentanteFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType)get_store().find_element_user(RAPPRESENTANTEFISCALE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RappresentanteFiscale" element
     */
    public boolean isSetRappresentanteFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RAPPRESENTANTEFISCALE$4) != 0;
        }
    }
    
    /**
     * Sets the "RappresentanteFiscale" element
     */
    public void setRappresentanteFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType rappresentanteFiscale)
    {
        generatedSetterHelperImpl(rappresentanteFiscale, RAPPRESENTANTEFISCALE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RappresentanteFiscale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType addNewRappresentanteFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType)get_store().add_element_user(RAPPRESENTANTEFISCALE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RappresentanteFiscale" element
     */
    public void unsetRappresentanteFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RAPPRESENTANTEFISCALE$4, 0);
        }
    }
    
    /**
     * Gets the "CessionarioCommittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType getCessionarioCommittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType)get_store().find_element_user(CESSIONARIOCOMMITTENTE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CessionarioCommittente" element
     */
    public void setCessionarioCommittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType cessionarioCommittente)
    {
        generatedSetterHelperImpl(cessionarioCommittente, CESSIONARIOCOMMITTENTE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CessionarioCommittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType addNewCessionarioCommittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType)get_store().add_element_user(CESSIONARIOCOMMITTENTE$6);
            return target;
        }
    }
    
    /**
     * Gets the "TerzoIntermediarioOSoggettoEmittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType getTerzoIntermediarioOSoggettoEmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType)get_store().find_element_user(TERZOINTERMEDIARIOOSOGGETTOEMITTENTE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TerzoIntermediarioOSoggettoEmittente" element
     */
    public boolean isSetTerzoIntermediarioOSoggettoEmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TERZOINTERMEDIARIOOSOGGETTOEMITTENTE$8) != 0;
        }
    }
    
    /**
     * Sets the "TerzoIntermediarioOSoggettoEmittente" element
     */
    public void setTerzoIntermediarioOSoggettoEmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType terzoIntermediarioOSoggettoEmittente)
    {
        generatedSetterHelperImpl(terzoIntermediarioOSoggettoEmittente, TERZOINTERMEDIARIOOSOGGETTOEMITTENTE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TerzoIntermediarioOSoggettoEmittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType addNewTerzoIntermediarioOSoggettoEmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TerzoIntermediarioSoggettoEmittenteType)get_store().add_element_user(TERZOINTERMEDIARIOOSOGGETTOEMITTENTE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "TerzoIntermediarioOSoggettoEmittente" element
     */
    public void unsetTerzoIntermediarioOSoggettoEmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TERZOINTERMEDIARIOOSOGGETTOEMITTENTE$8, 0);
        }
    }
    
    /**
     * Gets the "SoggettoEmittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType.Enum getSoggettoEmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOGGETTOEMITTENTE$10, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SoggettoEmittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType xgetSoggettoEmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType)get_store().find_element_user(SOGGETTOEMITTENTE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SoggettoEmittente" element
     */
    public boolean isSetSoggettoEmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOGGETTOEMITTENTE$10) != 0;
        }
    }
    
    /**
     * Sets the "SoggettoEmittente" element
     */
    public void setSoggettoEmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType.Enum soggettoEmittente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOGGETTOEMITTENTE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOGGETTOEMITTENTE$10);
            }
            target.setEnumValue(soggettoEmittente);
        }
    }
    
    /**
     * Sets (as xml) the "SoggettoEmittente" element
     */
    public void xsetSoggettoEmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType soggettoEmittente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType)get_store().find_element_user(SOGGETTOEMITTENTE$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.SoggettoEmittenteType)get_store().add_element_user(SOGGETTOEMITTENTE$10);
            }
            target.set(soggettoEmittente);
        }
    }
    
    /**
     * Unsets the "SoggettoEmittente" element
     */
    public void unsetSoggettoEmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOGGETTOEMITTENTE$10, 0);
        }
    }
}
