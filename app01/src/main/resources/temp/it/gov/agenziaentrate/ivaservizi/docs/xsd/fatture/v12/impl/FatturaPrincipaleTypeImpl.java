/*
 * XML Type:  FatturaPrincipaleType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML FatturaPrincipaleType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class FatturaPrincipaleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType
{
    private static final long serialVersionUID = 1L;
    
    public FatturaPrincipaleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMEROFATTURAPRINCIPALE$0 = 
        new javax.xml.namespace.QName("", "NumeroFatturaPrincipale");
    private static final javax.xml.namespace.QName DATAFATTURAPRINCIPALE$2 = 
        new javax.xml.namespace.QName("", "DataFatturaPrincipale");
    
    
    /**
     * Gets the "NumeroFatturaPrincipale" element
     */
    public java.lang.String getNumeroFatturaPrincipale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROFATTURAPRINCIPALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroFatturaPrincipale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetNumeroFatturaPrincipale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMEROFATTURAPRINCIPALE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumeroFatturaPrincipale" element
     */
    public void setNumeroFatturaPrincipale(java.lang.String numeroFatturaPrincipale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROFATTURAPRINCIPALE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROFATTURAPRINCIPALE$0);
            }
            target.setStringValue(numeroFatturaPrincipale);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroFatturaPrincipale" element
     */
    public void xsetNumeroFatturaPrincipale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type numeroFatturaPrincipale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMEROFATTURAPRINCIPALE$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(NUMEROFATTURAPRINCIPALE$0);
            }
            target.set(numeroFatturaPrincipale);
        }
    }
    
    /**
     * Gets the "DataFatturaPrincipale" element
     */
    public java.util.Calendar getDataFatturaPrincipale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFATTURAPRINCIPALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataFatturaPrincipale" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataFatturaPrincipale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAFATTURAPRINCIPALE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataFatturaPrincipale" element
     */
    public void setDataFatturaPrincipale(java.util.Calendar dataFatturaPrincipale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFATTURAPRINCIPALE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFATTURAPRINCIPALE$2);
            }
            target.setCalendarValue(dataFatturaPrincipale);
        }
    }
    
    /**
     * Sets (as xml) the "DataFatturaPrincipale" element
     */
    public void xsetDataFatturaPrincipale(org.apache.xmlbeans.XmlDate dataFatturaPrincipale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAFATTURAPRINCIPALE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAFATTURAPRINCIPALE$2);
            }
            target.set(dataFatturaPrincipale);
        }
    }
}
