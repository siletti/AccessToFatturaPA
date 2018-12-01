/*
 * XML Type:  CessionarioCommittenteType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML CessionarioCommittenteType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class CessionarioCommittenteTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CessionarioCommittenteType
{
    private static final long serialVersionUID = 1L;
    
    public CessionarioCommittenteTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATIANAGRAFICI$0 = 
        new javax.xml.namespace.QName("", "DatiAnagrafici");
    private static final javax.xml.namespace.QName SEDE$2 = 
        new javax.xml.namespace.QName("", "Sede");
    private static final javax.xml.namespace.QName STABILEORGANIZZAZIONE$4 = 
        new javax.xml.namespace.QName("", "StabileOrganizzazione");
    private static final javax.xml.namespace.QName RAPPRESENTANTEFISCALE$6 = 
        new javax.xml.namespace.QName("", "RappresentanteFiscale");
    
    
    /**
     * Gets the "DatiAnagrafici" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType getDatiAnagrafici()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType)get_store().find_element_user(DATIANAGRAFICI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DatiAnagrafici" element
     */
    public void setDatiAnagrafici(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType datiAnagrafici)
    {
        generatedSetterHelperImpl(datiAnagrafici, DATIANAGRAFICI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiAnagrafici" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType addNewDatiAnagrafici()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType)get_store().add_element_user(DATIANAGRAFICI$0);
            return target;
        }
    }
    
    /**
     * Gets the "Sede" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType getSede()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType)get_store().find_element_user(SEDE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Sede" element
     */
    public void setSede(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType sede)
    {
        generatedSetterHelperImpl(sede, SEDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Sede" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType addNewSede()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType)get_store().add_element_user(SEDE$2);
            return target;
        }
    }
    
    /**
     * Gets the "StabileOrganizzazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType getStabileOrganizzazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType)get_store().find_element_user(STABILEORGANIZZAZIONE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "StabileOrganizzazione" element
     */
    public boolean isSetStabileOrganizzazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STABILEORGANIZZAZIONE$4) != 0;
        }
    }
    
    /**
     * Sets the "StabileOrganizzazione" element
     */
    public void setStabileOrganizzazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType stabileOrganizzazione)
    {
        generatedSetterHelperImpl(stabileOrganizzazione, STABILEORGANIZZAZIONE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "StabileOrganizzazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType addNewStabileOrganizzazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType)get_store().add_element_user(STABILEORGANIZZAZIONE$4);
            return target;
        }
    }
    
    /**
     * Unsets the "StabileOrganizzazione" element
     */
    public void unsetStabileOrganizzazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STABILEORGANIZZAZIONE$4, 0);
        }
    }
    
    /**
     * Gets the "RappresentanteFiscale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType getRappresentanteFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType)get_store().find_element_user(RAPPRESENTANTEFISCALE$6, 0);
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
            return get_store().count_elements(RAPPRESENTANTEFISCALE$6) != 0;
        }
    }
    
    /**
     * Sets the "RappresentanteFiscale" element
     */
    public void setRappresentanteFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType rappresentanteFiscale)
    {
        generatedSetterHelperImpl(rappresentanteFiscale, RAPPRESENTANTEFISCALE$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "RappresentanteFiscale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType addNewRappresentanteFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType)get_store().add_element_user(RAPPRESENTANTEFISCALE$6);
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
            get_store().remove_element(RAPPRESENTANTEFISCALE$6, 0);
        }
    }
}
