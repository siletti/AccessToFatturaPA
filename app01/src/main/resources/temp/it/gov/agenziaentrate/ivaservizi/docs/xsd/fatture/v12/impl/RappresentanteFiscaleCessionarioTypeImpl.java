/*
 * XML Type:  RappresentanteFiscaleCessionarioType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML RappresentanteFiscaleCessionarioType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class RappresentanteFiscaleCessionarioTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleCessionarioType
{
    private static final long serialVersionUID = 1L;
    
    public RappresentanteFiscaleCessionarioTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDFISCALEIVA$0 = 
        new javax.xml.namespace.QName("", "IdFiscaleIVA");
    private static final javax.xml.namespace.QName DENOMINAZIONE$2 = 
        new javax.xml.namespace.QName("", "Denominazione");
    private static final javax.xml.namespace.QName NOME$4 = 
        new javax.xml.namespace.QName("", "Nome");
    private static final javax.xml.namespace.QName COGNOME$6 = 
        new javax.xml.namespace.QName("", "Cognome");
    
    
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
     * Gets the "Denominazione" element
     */
    public java.lang.String getDenominazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINAZIONE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Denominazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType xgetDenominazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().find_element_user(DENOMINAZIONE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Denominazione" element
     */
    public boolean isSetDenominazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DENOMINAZIONE$2) != 0;
        }
    }
    
    /**
     * Sets the "Denominazione" element
     */
    public void setDenominazione(java.lang.String denominazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINAZIONE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENOMINAZIONE$2);
            }
            target.setStringValue(denominazione);
        }
    }
    
    /**
     * Sets (as xml) the "Denominazione" element
     */
    public void xsetDenominazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType denominazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().find_element_user(DENOMINAZIONE$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().add_element_user(DENOMINAZIONE$2);
            }
            target.set(denominazione);
        }
    }
    
    /**
     * Unsets the "Denominazione" element
     */
    public void unsetDenominazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DENOMINAZIONE$2, 0);
        }
    }
    
    /**
     * Gets the "Nome" element
     */
    public java.lang.String getNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Nome" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(NOME$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Nome" element
     */
    public boolean isSetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NOME$4) != 0;
        }
    }
    
    /**
     * Sets the "Nome" element
     */
    public void setNome(java.lang.String nome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOME$4);
            }
            target.setStringValue(nome);
        }
    }
    
    /**
     * Sets (as xml) the "Nome" element
     */
    public void xsetNome(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType nome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(NOME$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(NOME$4);
            }
            target.set(nome);
        }
    }
    
    /**
     * Unsets the "Nome" element
     */
    public void unsetNome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NOME$4, 0);
        }
    }
    
    /**
     * Gets the "Cognome" element
     */
    public java.lang.String getCognome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COGNOME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Cognome" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetCognome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(COGNOME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Cognome" element
     */
    public boolean isSetCognome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COGNOME$6) != 0;
        }
    }
    
    /**
     * Sets the "Cognome" element
     */
    public void setCognome(java.lang.String cognome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COGNOME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COGNOME$6);
            }
            target.setStringValue(cognome);
        }
    }
    
    /**
     * Sets (as xml) the "Cognome" element
     */
    public void xsetCognome(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType cognome)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(COGNOME$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(COGNOME$6);
            }
            target.set(cognome);
        }
    }
    
    /**
     * Unsets the "Cognome" element
     */
    public void unsetCognome()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COGNOME$6, 0);
        }
    }
}
