/*
 * XML Type:  ContattiType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML ContattiType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class ContattiTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiType
{
    private static final long serialVersionUID = 1L;
    
    public ContattiTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEFONO$0 = 
        new javax.xml.namespace.QName("", "Telefono");
    private static final javax.xml.namespace.QName FAX$2 = 
        new javax.xml.namespace.QName("", "Fax");
    private static final javax.xml.namespace.QName EMAIL$4 = 
        new javax.xml.namespace.QName("", "Email");
    
    
    /**
     * Gets the "Telefono" element
     */
    public java.lang.String getTelefono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFONO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Telefono" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType xgetTelefono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType)get_store().find_element_user(TELEFONO$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Telefono" element
     */
    public boolean isSetTelefono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELEFONO$0) != 0;
        }
    }
    
    /**
     * Sets the "Telefono" element
     */
    public void setTelefono(java.lang.String telefono)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TELEFONO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TELEFONO$0);
            }
            target.setStringValue(telefono);
        }
    }
    
    /**
     * Sets (as xml) the "Telefono" element
     */
    public void xsetTelefono(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType telefono)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType)get_store().find_element_user(TELEFONO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType)get_store().add_element_user(TELEFONO$0);
            }
            target.set(telefono);
        }
    }
    
    /**
     * Unsets the "Telefono" element
     */
    public void unsetTelefono()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELEFONO$0, 0);
        }
    }
    
    /**
     * Gets the "Fax" element
     */
    public java.lang.String getFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Fax" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType xgetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType)get_store().find_element_user(FAX$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Fax" element
     */
    public boolean isSetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAX$2) != 0;
        }
    }
    
    /**
     * Sets the "Fax" element
     */
    public void setFax(java.lang.String fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAX$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAX$2);
            }
            target.setStringValue(fax);
        }
    }
    
    /**
     * Sets (as xml) the "Fax" element
     */
    public void xsetFax(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType fax)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType)get_store().find_element_user(FAX$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TelFaxType)get_store().add_element_user(FAX$2);
            }
            target.set(fax);
        }
    }
    
    /**
     * Unsets the "Fax" element
     */
    public void unsetFax()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAX$2, 0);
        }
    }
    
    /**
     * Gets the "Email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Email" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType xgetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().find_element_user(EMAIL$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Email" element
     */
    public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$4) != 0;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    public void setEmail(java.lang.String email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$4);
            }
            target.setStringValue(email);
        }
    }
    
    /**
     * Sets (as xml) the "Email" element
     */
    public void xsetEmail(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().add_element_user(EMAIL$4);
            }
            target.set(email);
        }
    }
    
    /**
     * Unsets the "Email" element
     */
    public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$4, 0);
        }
    }
}
