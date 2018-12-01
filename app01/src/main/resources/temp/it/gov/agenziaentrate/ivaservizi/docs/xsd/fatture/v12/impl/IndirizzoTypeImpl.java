/*
 * XML Type:  IndirizzoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML IndirizzoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class IndirizzoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType
{
    private static final long serialVersionUID = 1L;
    
    public IndirizzoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INDIRIZZO$0 = 
        new javax.xml.namespace.QName("", "Indirizzo");
    private static final javax.xml.namespace.QName NUMEROCIVICO$2 = 
        new javax.xml.namespace.QName("", "NumeroCivico");
    private static final javax.xml.namespace.QName CAP$4 = 
        new javax.xml.namespace.QName("", "CAP");
    private static final javax.xml.namespace.QName COMUNE$6 = 
        new javax.xml.namespace.QName("", "Comune");
    private static final javax.xml.namespace.QName PROVINCIA$8 = 
        new javax.xml.namespace.QName("", "Provincia");
    private static final javax.xml.namespace.QName NAZIONE$10 = 
        new javax.xml.namespace.QName("", "Nazione");
    
    
    /**
     * Gets the "Indirizzo" element
     */
    public java.lang.String getIndirizzo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIRIZZO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Indirizzo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetIndirizzo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(INDIRIZZO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Indirizzo" element
     */
    public void setIndirizzo(java.lang.String indirizzo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INDIRIZZO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INDIRIZZO$0);
            }
            target.setStringValue(indirizzo);
        }
    }
    
    /**
     * Sets (as xml) the "Indirizzo" element
     */
    public void xsetIndirizzo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType indirizzo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(INDIRIZZO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(INDIRIZZO$0);
            }
            target.set(indirizzo);
        }
    }
    
    /**
     * Gets the "NumeroCivico" element
     */
    public java.lang.String getNumeroCivico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROCIVICO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroCivico" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroCivicoType xgetNumeroCivico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroCivicoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroCivicoType)get_store().find_element_user(NUMEROCIVICO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumeroCivico" element
     */
    public boolean isSetNumeroCivico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMEROCIVICO$2) != 0;
        }
    }
    
    /**
     * Sets the "NumeroCivico" element
     */
    public void setNumeroCivico(java.lang.String numeroCivico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROCIVICO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROCIVICO$2);
            }
            target.setStringValue(numeroCivico);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroCivico" element
     */
    public void xsetNumeroCivico(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroCivicoType numeroCivico)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroCivicoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroCivicoType)get_store().find_element_user(NUMEROCIVICO$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroCivicoType)get_store().add_element_user(NUMEROCIVICO$2);
            }
            target.set(numeroCivico);
        }
    }
    
    /**
     * Unsets the "NumeroCivico" element
     */
    public void unsetNumeroCivico()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMEROCIVICO$2, 0);
        }
    }
    
    /**
     * Gets the "CAP" element
     */
    public java.lang.String getCAP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAP$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CAP" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CAPType xgetCAP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CAPType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CAPType)get_store().find_element_user(CAP$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CAP" element
     */
    public void setCAP(java.lang.String cap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAP$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAP$4);
            }
            target.setStringValue(cap);
        }
    }
    
    /**
     * Sets (as xml) the "CAP" element
     */
    public void xsetCAP(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CAPType cap)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CAPType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CAPType)get_store().find_element_user(CAP$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CAPType)get_store().add_element_user(CAP$4);
            }
            target.set(cap);
        }
    }
    
    /**
     * Gets the "Comune" element
     */
    public java.lang.String getComune()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMUNE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Comune" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetComune()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(COMUNE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Comune" element
     */
    public void setComune(java.lang.String comune)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMUNE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMUNE$6);
            }
            target.setStringValue(comune);
        }
    }
    
    /**
     * Sets (as xml) the "Comune" element
     */
    public void xsetComune(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType comune)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(COMUNE$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(COMUNE$6);
            }
            target.set(comune);
        }
    }
    
    /**
     * Gets the "Provincia" element
     */
    public java.lang.String getProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCIA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Provincia" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType xgetProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().find_element_user(PROVINCIA$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Provincia" element
     */
    public boolean isSetProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROVINCIA$8) != 0;
        }
    }
    
    /**
     * Sets the "Provincia" element
     */
    public void setProvincia(java.lang.String provincia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROVINCIA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROVINCIA$8);
            }
            target.setStringValue(provincia);
        }
    }
    
    /**
     * Sets (as xml) the "Provincia" element
     */
    public void xsetProvincia(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType provincia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().find_element_user(PROVINCIA$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ProvinciaType)get_store().add_element_user(PROVINCIA$8);
            }
            target.set(provincia);
        }
    }
    
    /**
     * Unsets the "Provincia" element
     */
    public void unsetProvincia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROVINCIA$8, 0);
        }
    }
    
    /**
     * Gets the "Nazione" element
     */
    public java.lang.String getNazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAZIONE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Nazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType xgetNazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType)get_store().find_element_user(NAZIONE$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Nazione" element
     */
    public void setNazione(java.lang.String nazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAZIONE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAZIONE$10);
            }
            target.setStringValue(nazione);
        }
    }
    
    /**
     * Sets (as xml) the "Nazione" element
     */
    public void xsetNazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType nazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType)get_store().find_element_user(NAZIONE$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType)get_store().add_element_user(NAZIONE$10);
            }
            target.set(nazione);
        }
    }
}
