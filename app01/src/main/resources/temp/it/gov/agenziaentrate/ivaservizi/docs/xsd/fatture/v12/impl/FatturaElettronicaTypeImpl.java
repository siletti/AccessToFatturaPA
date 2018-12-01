/*
 * XML Type:  FatturaElettronicaType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML FatturaElettronicaType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class FatturaElettronicaTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType
{
    private static final long serialVersionUID = 1L;
    
    public FatturaElettronicaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FATTURAELETTRONICAHEADER$0 = 
        new javax.xml.namespace.QName("", "FatturaElettronicaHeader");
    private static final javax.xml.namespace.QName FATTURAELETTRONICABODY$2 = 
        new javax.xml.namespace.QName("", "FatturaElettronicaBody");
    private static final javax.xml.namespace.QName VERSIONE$4 = 
        new javax.xml.namespace.QName("", "versione");
    
    
    /**
     * Gets the "FatturaElettronicaHeader" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType getFatturaElettronicaHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType)get_store().find_element_user(FATTURAELETTRONICAHEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FatturaElettronicaHeader" element
     */
    public void setFatturaElettronicaHeader(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType fatturaElettronicaHeader)
    {
        generatedSetterHelperImpl(fatturaElettronicaHeader, FATTURAELETTRONICAHEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FatturaElettronicaHeader" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType addNewFatturaElettronicaHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaHeaderType)get_store().add_element_user(FATTURAELETTRONICAHEADER$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "FatturaElettronicaBody" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType[] getFatturaElettronicaBodyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FATTURAELETTRONICABODY$2, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "FatturaElettronicaBody" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType getFatturaElettronicaBodyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType)get_store().find_element_user(FATTURAELETTRONICABODY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "FatturaElettronicaBody" element
     */
    public int sizeOfFatturaElettronicaBodyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FATTURAELETTRONICABODY$2);
        }
    }
    
    /**
     * Sets array of all "FatturaElettronicaBody" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFatturaElettronicaBodyArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType[] fatturaElettronicaBodyArray)
    {
        check_orphaned();
        arraySetterHelper(fatturaElettronicaBodyArray, FATTURAELETTRONICABODY$2);
    }
    
    /**
     * Sets ith "FatturaElettronicaBody" element
     */
    public void setFatturaElettronicaBodyArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType fatturaElettronicaBody)
    {
        generatedSetterHelperImpl(fatturaElettronicaBody, FATTURAELETTRONICABODY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "FatturaElettronicaBody" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType insertNewFatturaElettronicaBody(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType)get_store().insert_element_user(FATTURAELETTRONICABODY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "FatturaElettronicaBody" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType addNewFatturaElettronicaBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType)get_store().add_element_user(FATTURAELETTRONICABODY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "FatturaElettronicaBody" element
     */
    public void removeFatturaElettronicaBody(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FATTURAELETTRONICABODY$2, i);
        }
    }
    
    /**
     * Gets the "versione" attribute
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType.Enum getVersione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONE$4);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "versione" attribute
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType xgetVersione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType)get_store().find_attribute_user(VERSIONE$4);
            return target;
        }
    }
    
    /**
     * Sets the "versione" attribute
     */
    public void setVersione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType.Enum versione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VERSIONE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VERSIONE$4);
            }
            target.setEnumValue(versione);
        }
    }
    
    /**
     * Sets (as xml) the "versione" attribute
     */
    public void xsetVersione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType versione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType)get_store().find_attribute_user(VERSIONE$4);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType)get_store().add_attribute_user(VERSIONE$4);
            }
            target.set(versione);
        }
    }
}
