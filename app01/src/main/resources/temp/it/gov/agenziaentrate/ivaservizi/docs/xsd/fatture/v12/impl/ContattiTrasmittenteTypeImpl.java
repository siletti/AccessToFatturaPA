/*
 * XML Type:  ContattiTrasmittenteType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML ContattiTrasmittenteType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class ContattiTrasmittenteTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType
{
    private static final long serialVersionUID = 1L;
    
    public ContattiTrasmittenteTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TELEFONO$0 = 
        new javax.xml.namespace.QName("", "Telefono");
    private static final javax.xml.namespace.QName EMAIL$2 = 
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
     * Gets the "Email" element
     */
    public java.lang.String getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, 0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().find_element_user(EMAIL$2, 0);
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
            return get_store().count_elements(EMAIL$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAIL$2);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().add_element_user(EMAIL$2);
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
            get_store().remove_element(EMAIL$2, 0);
        }
    }
}
