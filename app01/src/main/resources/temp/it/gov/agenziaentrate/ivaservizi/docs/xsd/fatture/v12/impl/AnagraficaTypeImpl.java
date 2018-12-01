/*
 * XML Type:  AnagraficaType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML AnagraficaType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class AnagraficaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AnagraficaType
{
    private static final long serialVersionUID = 1L;
    
    public AnagraficaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DENOMINAZIONE$0 = 
        new javax.xml.namespace.QName("", "Denominazione");
    private static final javax.xml.namespace.QName NOME$2 = 
        new javax.xml.namespace.QName("", "Nome");
    private static final javax.xml.namespace.QName COGNOME$4 = 
        new javax.xml.namespace.QName("", "Cognome");
    private static final javax.xml.namespace.QName TITOLO$6 = 
        new javax.xml.namespace.QName("", "Titolo");
    private static final javax.xml.namespace.QName CODEORI$8 = 
        new javax.xml.namespace.QName("", "CodEORI");
    
    
    /**
     * Gets the "Denominazione" element
     */
    public java.lang.String getDenominazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINAZIONE$0, 0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().find_element_user(DENOMINAZIONE$0, 0);
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
            return get_store().count_elements(DENOMINAZIONE$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DENOMINAZIONE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DENOMINAZIONE$0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().find_element_user(DENOMINAZIONE$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().add_element_user(DENOMINAZIONE$0);
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
            get_store().remove_element(DENOMINAZIONE$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$2, 0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(NOME$2, 0);
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
            return get_store().count_elements(NOME$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOME$2);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(NOME$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(NOME$2);
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
            get_store().remove_element(NOME$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COGNOME$4, 0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(COGNOME$4, 0);
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
            return get_store().count_elements(COGNOME$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COGNOME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COGNOME$4);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(COGNOME$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(COGNOME$4);
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
            get_store().remove_element(COGNOME$4, 0);
        }
    }
    
    /**
     * Gets the "Titolo" element
     */
    public java.lang.String getTitolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITOLO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Titolo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType xgetTitolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType)get_store().find_element_user(TITOLO$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Titolo" element
     */
    public boolean isSetTitolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITOLO$6) != 0;
        }
    }
    
    /**
     * Sets the "Titolo" element
     */
    public void setTitolo(java.lang.String titolo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITOLO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITOLO$6);
            }
            target.setStringValue(titolo);
        }
    }
    
    /**
     * Sets (as xml) the "Titolo" element
     */
    public void xsetTitolo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType titolo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType)get_store().find_element_user(TITOLO$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TitoloType)get_store().add_element_user(TITOLO$6);
            }
            target.set(titolo);
        }
    }
    
    /**
     * Unsets the "Titolo" element
     */
    public void unsetTitolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITOLO$6, 0);
        }
    }
    
    /**
     * Gets the "CodEORI" element
     */
    public java.lang.String getCodEORI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEORI$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodEORI" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType xgetCodEORI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType)get_store().find_element_user(CODEORI$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodEORI" element
     */
    public boolean isSetCodEORI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODEORI$8) != 0;
        }
    }
    
    /**
     * Sets the "CodEORI" element
     */
    public void setCodEORI(java.lang.String codEORI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODEORI$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODEORI$8);
            }
            target.setStringValue(codEORI);
        }
    }
    
    /**
     * Sets (as xml) the "CodEORI" element
     */
    public void xsetCodEORI(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType codEORI)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType)get_store().find_element_user(CODEORI$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodEORIType)get_store().add_element_user(CODEORI$8);
            }
            target.set(codEORI);
        }
    }
    
    /**
     * Unsets the "CodEORI" element
     */
    public void unsetCodEORI()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODEORI$8, 0);
        }
    }
}
