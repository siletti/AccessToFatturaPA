/*
 * XML Type:  CedentePrestatoreType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML CedentePrestatoreType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class CedentePrestatoreTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CedentePrestatoreType
{
    private static final long serialVersionUID = 1L;
    
    public CedentePrestatoreTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATIANAGRAFICI$0 = 
        new javax.xml.namespace.QName("", "DatiAnagrafici");
    private static final javax.xml.namespace.QName SEDE$2 = 
        new javax.xml.namespace.QName("", "Sede");
    private static final javax.xml.namespace.QName STABILEORGANIZZAZIONE$4 = 
        new javax.xml.namespace.QName("", "StabileOrganizzazione");
    private static final javax.xml.namespace.QName ISCRIZIONEREA$6 = 
        new javax.xml.namespace.QName("", "IscrizioneREA");
    private static final javax.xml.namespace.QName CONTATTI$8 = 
        new javax.xml.namespace.QName("", "Contatti");
    private static final javax.xml.namespace.QName RIFERIMENTOAMMINISTRAZIONE$10 = 
        new javax.xml.namespace.QName("", "RiferimentoAmministrazione");
    
    
    /**
     * Gets the "DatiAnagrafici" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType getDatiAnagrafici()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType)get_store().find_element_user(DATIANAGRAFICI$0, 0);
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
    public void setDatiAnagrafici(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType datiAnagrafici)
    {
        generatedSetterHelperImpl(datiAnagrafici, DATIANAGRAFICI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiAnagrafici" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType addNewDatiAnagrafici()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType)get_store().add_element_user(DATIANAGRAFICI$0);
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
     * Gets the "IscrizioneREA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType getIscrizioneREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType)get_store().find_element_user(ISCRIZIONEREA$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IscrizioneREA" element
     */
    public boolean isSetIscrizioneREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISCRIZIONEREA$6) != 0;
        }
    }
    
    /**
     * Sets the "IscrizioneREA" element
     */
    public void setIscrizioneREA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType iscrizioneREA)
    {
        generatedSetterHelperImpl(iscrizioneREA, ISCRIZIONEREA$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IscrizioneREA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType addNewIscrizioneREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IscrizioneREAType)get_store().add_element_user(ISCRIZIONEREA$6);
            return target;
        }
    }
    
    /**
     * Unsets the "IscrizioneREA" element
     */
    public void unsetIscrizioneREA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISCRIZIONEREA$6, 0);
        }
    }
    
    /**
     * Gets the "Contatti" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType getContatti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType)get_store().find_element_user(CONTATTI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Contatti" element
     */
    public boolean isSetContatti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTATTI$8) != 0;
        }
    }
    
    /**
     * Sets the "Contatti" element
     */
    public void setContatti(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType contatti)
    {
        generatedSetterHelperImpl(contatti, CONTATTI$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Contatti" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType addNewContatti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType)get_store().add_element_user(CONTATTI$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Contatti" element
     */
    public void unsetContatti()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTATTI$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$10, 0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$10, 0);
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
            return get_store().count_elements(RIFERIMENTOAMMINISTRAZIONE$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTOAMMINISTRAZIONE$10);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(RIFERIMENTOAMMINISTRAZIONE$10);
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
            get_store().remove_element(RIFERIMENTOAMMINISTRAZIONE$10, 0);
        }
    }
}
