/*
 * XML Type:  DatiAnagraficiCessionarioType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiAnagraficiCessionarioType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiAnagraficiCessionarioTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCessionarioType
{
    private static final long serialVersionUID = 1L;
    
    public DatiAnagraficiCessionarioTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDFISCALEIVA$0 = 
        new javax.xml.namespace.QName("", "IdFiscaleIVA");
    private static final javax.xml.namespace.QName CODICEFISCALE$2 = 
        new javax.xml.namespace.QName("", "CodiceFiscale");
    private static final javax.xml.namespace.QName ANAGRAFICA$4 = 
        new javax.xml.namespace.QName("", "Anagrafica");
    
    
    /**
     * Gets the "IdFiscaleIVA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType getIdFiscaleIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType)get_store().find_element_user(IDFISCALEIVA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IdFiscaleIVA" element
     */
    public boolean isSetIdFiscaleIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDFISCALEIVA$0) != 0;
        }
    }
    
    /**
     * Sets the "IdFiscaleIVA" element
     */
    public void setIdFiscaleIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType idFiscaleIVA)
    {
        generatedSetterHelperImpl(idFiscaleIVA, IDFISCALEIVA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdFiscaleIVA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType addNewIdFiscaleIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType)get_store().add_element_user(IDFISCALEIVA$0);
            return target;
        }
    }
    
    /**
     * Unsets the "IdFiscaleIVA" element
     */
    public void unsetIdFiscaleIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDFISCALEIVA$0, 0);
        }
    }
    
    /**
     * Gets the "CodiceFiscale" element
     */
    public java.lang.String getCodiceFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEFISCALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodiceFiscale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType xgetCodiceFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType)get_store().find_element_user(CODICEFISCALE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodiceFiscale" element
     */
    public boolean isSetCodiceFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODICEFISCALE$2) != 0;
        }
    }
    
    /**
     * Sets the "CodiceFiscale" element
     */
    public void setCodiceFiscale(java.lang.String codiceFiscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEFISCALE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICEFISCALE$2);
            }
            target.setStringValue(codiceFiscale);
        }
    }
    
    /**
     * Sets (as xml) the "CodiceFiscale" element
     */
    public void xsetCodiceFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType codiceFiscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType)get_store().find_element_user(CODICEFISCALE$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceFiscaleType)get_store().add_element_user(CODICEFISCALE$2);
            }
            target.set(codiceFiscale);
        }
    }
    
    /**
     * Unsets the "CodiceFiscale" element
     */
    public void unsetCodiceFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODICEFISCALE$2, 0);
        }
    }
    
    /**
     * Gets the "Anagrafica" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType getAnagrafica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType)get_store().find_element_user(ANAGRAFICA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Anagrafica" element
     */
    public void setAnagrafica(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType anagrafica)
    {
        generatedSetterHelperImpl(anagrafica, ANAGRAFICA$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Anagrafica" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType addNewAnagrafica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType)get_store().add_element_user(ANAGRAFICA$4);
            return target;
        }
    }
}
