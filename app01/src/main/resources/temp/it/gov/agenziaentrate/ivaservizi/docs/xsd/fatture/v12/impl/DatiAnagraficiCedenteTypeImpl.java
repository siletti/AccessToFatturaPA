/*
 * XML Type:  DatiAnagraficiCedenteType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiAnagraficiCedenteType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiAnagraficiCedenteTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiCedenteType
{
    private static final long serialVersionUID = 1L;
    
    public DatiAnagraficiCedenteTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDFISCALEIVA$0 = 
        new javax.xml.namespace.QName("", "IdFiscaleIVA");
    private static final javax.xml.namespace.QName CODICEFISCALE$2 = 
        new javax.xml.namespace.QName("", "CodiceFiscale");
    private static final javax.xml.namespace.QName ANAGRAFICA$4 = 
        new javax.xml.namespace.QName("", "Anagrafica");
    private static final javax.xml.namespace.QName ALBOPROFESSIONALE$6 = 
        new javax.xml.namespace.QName("", "AlboProfessionale");
    private static final javax.xml.namespace.QName PROVINCIAALBO$8 = 
        new javax.xml.namespace.QName("", "ProvinciaAlbo");
    private static final javax.xml.namespace.QName NUMEROISCRIZIONEALBO$10 = 
        new javax.xml.namespace.QName("", "NumeroIscrizioneAlbo");
    private static final javax.xml.namespace.QName DATAISCRIZIONEALBO$12 = 
        new javax.xml.namespace.QName("", "DataIscrizioneAlbo");
    private static final javax.xml.namespace.QName REGIMEFISCALE$14 = 
        new javax.xml.namespace.QName("", "RegimeFiscale");
    
    
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
    
    /**
     * Gets the "AlboProfessionale" element
     */
    public java.lang.String getAlboProfessionale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALBOPROFESSIONALE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AlboProfessionale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetAlboProfessionale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(ALBOPROFESSIONALE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "AlboProfessionale" element
     */
    public boolean isSetAlboProfessionale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALBOPROFESSIONALE$6) != 0;
        }
    }
    
    /**
     * Sets the "AlboProfessionale" element
     */
    public void setAlboProfessionale(java.lang.String alboProfessionale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALBOPROFESSIONALE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALBOPROFESSIONALE$6);
            }
            target.setStringValue(alboProfessionale);
        }
    }
    
    /**
     * Sets (as xml) the "AlboProfessionale" element
     */
    public void xsetAlboProfessionale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType alboProfessionale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(ALBOPROFESSIONALE$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(ALBOPROFESSIONALE$6);
            }
            target.set(alboProfessionale);
        }
    }
    
    /**
     * Unsets the "AlboProfessionale" element
     */
    public void unsetAlboProfessionale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALBOPROFESSIONALE$6, 0);
        }
    }
    
    /**
     * Gets the "ProvinciaAlbo" element
     */
    public java.lang.String getProvinciaAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCIAALBO$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProvinciaAlbo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType xgetProvinciaAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().find_element_user(PROVINCIAALBO$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ProvinciaAlbo" element
     */
    public boolean isSetProvinciaAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVINCIAALBO$8) != 0;
        }
    }
    
    /**
     * Sets the "ProvinciaAlbo" element
     */
    public void setProvinciaAlbo(java.lang.String provinciaAlbo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCIAALBO$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVINCIAALBO$8);
            }
            target.setStringValue(provinciaAlbo);
        }
    }
    
    /**
     * Sets (as xml) the "ProvinciaAlbo" element
     */
    public void xsetProvinciaAlbo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType provinciaAlbo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().find_element_user(PROVINCIAALBO$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().add_element_user(PROVINCIAALBO$8);
            }
            target.set(provinciaAlbo);
        }
    }
    
    /**
     * Unsets the "ProvinciaAlbo" element
     */
    public void unsetProvinciaAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVINCIAALBO$8, 0);
        }
    }
    
    /**
     * Gets the "NumeroIscrizioneAlbo" element
     */
    public java.lang.String getNumeroIscrizioneAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROISCRIZIONEALBO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroIscrizioneAlbo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type xgetNumeroIscrizioneAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type)get_store().find_element_user(NUMEROISCRIZIONEALBO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumeroIscrizioneAlbo" element
     */
    public boolean isSetNumeroIscrizioneAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMEROISCRIZIONEALBO$10) != 0;
        }
    }
    
    /**
     * Sets the "NumeroIscrizioneAlbo" element
     */
    public void setNumeroIscrizioneAlbo(java.lang.String numeroIscrizioneAlbo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROISCRIZIONEALBO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROISCRIZIONEALBO$10);
            }
            target.setStringValue(numeroIscrizioneAlbo);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroIscrizioneAlbo" element
     */
    public void xsetNumeroIscrizioneAlbo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type numeroIscrizioneAlbo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type)get_store().find_element_user(NUMEROISCRIZIONEALBO$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60Type)get_store().add_element_user(NUMEROISCRIZIONEALBO$10);
            }
            target.set(numeroIscrizioneAlbo);
        }
    }
    
    /**
     * Unsets the "NumeroIscrizioneAlbo" element
     */
    public void unsetNumeroIscrizioneAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMEROISCRIZIONEALBO$10, 0);
        }
    }
    
    /**
     * Gets the "DataIscrizioneAlbo" element
     */
    public java.util.Calendar getDataIscrizioneAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAISCRIZIONEALBO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataIscrizioneAlbo" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataIscrizioneAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAISCRIZIONEALBO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataIscrizioneAlbo" element
     */
    public boolean isSetDataIscrizioneAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAISCRIZIONEALBO$12) != 0;
        }
    }
    
    /**
     * Sets the "DataIscrizioneAlbo" element
     */
    public void setDataIscrizioneAlbo(java.util.Calendar dataIscrizioneAlbo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAISCRIZIONEALBO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAISCRIZIONEALBO$12);
            }
            target.setCalendarValue(dataIscrizioneAlbo);
        }
    }
    
    /**
     * Sets (as xml) the "DataIscrizioneAlbo" element
     */
    public void xsetDataIscrizioneAlbo(org.apache.xmlbeans.XmlDate dataIscrizioneAlbo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAISCRIZIONEALBO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAISCRIZIONEALBO$12);
            }
            target.set(dataIscrizioneAlbo);
        }
    }
    
    /**
     * Unsets the "DataIscrizioneAlbo" element
     */
    public void unsetDataIscrizioneAlbo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAISCRIZIONEALBO$12, 0);
        }
    }
    
    /**
     * Gets the "RegimeFiscale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType.Enum getRegimeFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGIMEFISCALE$14, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "RegimeFiscale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType xgetRegimeFiscale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType)get_store().find_element_user(REGIMEFISCALE$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RegimeFiscale" element
     */
    public void setRegimeFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType.Enum regimeFiscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REGIMEFISCALE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REGIMEFISCALE$14);
            }
            target.setEnumValue(regimeFiscale);
        }
    }
    
    /**
     * Sets (as xml) the "RegimeFiscale" element
     */
    public void xsetRegimeFiscale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType regimeFiscale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType)get_store().find_element_user(REGIMEFISCALE$14, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType)get_store().add_element_user(REGIMEFISCALE$14);
            }
            target.set(regimeFiscale);
        }
    }
}
