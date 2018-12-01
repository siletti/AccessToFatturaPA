/*
 * XML Type:  DatiDDTType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiDDTType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiDDTTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType
{
    private static final long serialVersionUID = 1L;
    
    public DatiDDTTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMERODDT$0 = 
        new javax.xml.namespace.QName("", "NumeroDDT");
    private static final javax.xml.namespace.QName DATADDT$2 = 
        new javax.xml.namespace.QName("", "DataDDT");
    private static final javax.xml.namespace.QName RIFERIMENTONUMEROLINEA$4 = 
        new javax.xml.namespace.QName("", "RiferimentoNumeroLinea");
    
    
    /**
     * Gets the "NumeroDDT" element
     */
    public java.lang.String getNumeroDDT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERODDT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroDDT" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetNumeroDDT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMERODDT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumeroDDT" element
     */
    public void setNumeroDDT(java.lang.String numeroDDT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERODDT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERODDT$0);
            }
            target.setStringValue(numeroDDT);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroDDT" element
     */
    public void xsetNumeroDDT(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type numeroDDT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMERODDT$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(NUMERODDT$0);
            }
            target.set(numeroDDT);
        }
    }
    
    /**
     * Gets the "DataDDT" element
     */
    public java.util.Calendar getDataDDT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATADDT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataDDT" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataDDT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATADDT$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DataDDT" element
     */
    public void setDataDDT(java.util.Calendar dataDDT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATADDT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATADDT$2);
            }
            target.setCalendarValue(dataDDT);
        }
    }
    
    /**
     * Sets (as xml) the "DataDDT" element
     */
    public void xsetDataDDT(org.apache.xmlbeans.XmlDate dataDDT)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATADDT$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATADDT$2);
            }
            target.set(dataDDT);
        }
    }
    
    /**
     * Gets array of all "RiferimentoNumeroLinea" elements
     */
    public int[] getRiferimentoNumeroLineaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RIFERIMENTONUMEROLINEA$4, targetList);
            int[] result = new int[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getIntValue();
            return result;
        }
    }
    
    /**
     * Gets ith "RiferimentoNumeroLinea" element
     */
    public int getRiferimentoNumeroLineaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTONUMEROLINEA$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "RiferimentoNumeroLinea" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType[] xgetRiferimentoNumeroLineaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RIFERIMENTONUMEROLINEA$4, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "RiferimentoNumeroLinea" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType xgetRiferimentoNumeroLineaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType)get_store().find_element_user(RIFERIMENTONUMEROLINEA$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RiferimentoNumeroLinea" element
     */
    public int sizeOfRiferimentoNumeroLineaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIFERIMENTONUMEROLINEA$4);
        }
    }
    
    /**
     * Sets array of all "RiferimentoNumeroLinea" element
     */
    public void setRiferimentoNumeroLineaArray(int[] riferimentoNumeroLineaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(riferimentoNumeroLineaArray, RIFERIMENTONUMEROLINEA$4);
        }
    }
    
    /**
     * Sets ith "RiferimentoNumeroLinea" element
     */
    public void setRiferimentoNumeroLineaArray(int i, int riferimentoNumeroLinea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTONUMEROLINEA$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setIntValue(riferimentoNumeroLinea);
        }
    }
    
    /**
     * Sets (as xml) array of all "RiferimentoNumeroLinea" element
     */
    public void xsetRiferimentoNumeroLineaArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType[]riferimentoNumeroLineaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(riferimentoNumeroLineaArray, RIFERIMENTONUMEROLINEA$4);
        }
    }
    
    /**
     * Sets (as xml) ith "RiferimentoNumeroLinea" element
     */
    public void xsetRiferimentoNumeroLineaArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType riferimentoNumeroLinea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType)get_store().find_element_user(RIFERIMENTONUMEROLINEA$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(riferimentoNumeroLinea);
        }
    }
    
    /**
     * Inserts the value as the ith "RiferimentoNumeroLinea" element
     */
    public void insertRiferimentoNumeroLinea(int i, int riferimentoNumeroLinea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RIFERIMENTONUMEROLINEA$4, i);
            target.setIntValue(riferimentoNumeroLinea);
        }
    }
    
    /**
     * Appends the value as the last "RiferimentoNumeroLinea" element
     */
    public void addRiferimentoNumeroLinea(int riferimentoNumeroLinea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTONUMEROLINEA$4);
            target.setIntValue(riferimentoNumeroLinea);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RiferimentoNumeroLinea" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType insertNewRiferimentoNumeroLinea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType)get_store().insert_element_user(RIFERIMENTONUMEROLINEA$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RiferimentoNumeroLinea" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType addNewRiferimentoNumeroLinea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType)get_store().add_element_user(RIFERIMENTONUMEROLINEA$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "RiferimentoNumeroLinea" element
     */
    public void removeRiferimentoNumeroLinea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIFERIMENTONUMEROLINEA$4, i);
        }
    }
}
