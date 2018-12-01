/*
 * XML Type:  DatiBeniServiziType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiBeniServiziType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiBeniServiziTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType
{
    private static final long serialVersionUID = 1L;
    
    public DatiBeniServiziTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DETTAGLIOLINEE$0 = 
        new javax.xml.namespace.QName("", "DettaglioLinee");
    private static final javax.xml.namespace.QName DATIRIEPILOGO$2 = 
        new javax.xml.namespace.QName("", "DatiRiepilogo");
    
    
    /**
     * Gets array of all "DettaglioLinee" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType[] getDettaglioLineeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETTAGLIOLINEE$0, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DettaglioLinee" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType getDettaglioLineeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType)get_store().find_element_user(DETTAGLIOLINEE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DettaglioLinee" element
     */
    public int sizeOfDettaglioLineeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETTAGLIOLINEE$0);
        }
    }
    
    /**
     * Sets array of all "DettaglioLinee" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDettaglioLineeArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType[] dettaglioLineeArray)
    {
        check_orphaned();
        arraySetterHelper(dettaglioLineeArray, DETTAGLIOLINEE$0);
    }
    
    /**
     * Sets ith "DettaglioLinee" element
     */
    public void setDettaglioLineeArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType dettaglioLinee)
    {
        generatedSetterHelperImpl(dettaglioLinee, DETTAGLIOLINEE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DettaglioLinee" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType insertNewDettaglioLinee(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType)get_store().insert_element_user(DETTAGLIOLINEE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DettaglioLinee" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType addNewDettaglioLinee()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType)get_store().add_element_user(DETTAGLIOLINEE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "DettaglioLinee" element
     */
    public void removeDettaglioLinee(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETTAGLIOLINEE$0, i);
        }
    }
    
    /**
     * Gets array of all "DatiRiepilogo" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType[] getDatiRiepilogoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATIRIEPILOGO$2, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiRiepilogo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType getDatiRiepilogoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType)get_store().find_element_user(DATIRIEPILOGO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiRiepilogo" element
     */
    public int sizeOfDatiRiepilogoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIRIEPILOGO$2);
        }
    }
    
    /**
     * Sets array of all "DatiRiepilogo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiRiepilogoArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType[] datiRiepilogoArray)
    {
        check_orphaned();
        arraySetterHelper(datiRiepilogoArray, DATIRIEPILOGO$2);
    }
    
    /**
     * Sets ith "DatiRiepilogo" element
     */
    public void setDatiRiepilogoArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType datiRiepilogo)
    {
        generatedSetterHelperImpl(datiRiepilogo, DATIRIEPILOGO$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiRiepilogo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType insertNewDatiRiepilogo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType)get_store().insert_element_user(DATIRIEPILOGO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiRiepilogo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType addNewDatiRiepilogo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRiepilogoType)get_store().add_element_user(DATIRIEPILOGO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiRiepilogo" element
     */
    public void removeDatiRiepilogo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIRIEPILOGO$2, i);
        }
    }
}
