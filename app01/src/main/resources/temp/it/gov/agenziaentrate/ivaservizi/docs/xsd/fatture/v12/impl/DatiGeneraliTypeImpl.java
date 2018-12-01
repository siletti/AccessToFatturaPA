/*
 * XML Type:  DatiGeneraliType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiGeneraliType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiGeneraliTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType
{
    private static final long serialVersionUID = 1L;
    
    public DatiGeneraliTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATIGENERALIDOCUMENTO$0 = 
        new javax.xml.namespace.QName("", "DatiGeneraliDocumento");
    private static final javax.xml.namespace.QName DATIORDINEACQUISTO$2 = 
        new javax.xml.namespace.QName("", "DatiOrdineAcquisto");
    private static final javax.xml.namespace.QName DATICONTRATTO$4 = 
        new javax.xml.namespace.QName("", "DatiContratto");
    private static final javax.xml.namespace.QName DATICONVENZIONE$6 = 
        new javax.xml.namespace.QName("", "DatiConvenzione");
    private static final javax.xml.namespace.QName DATIRICEZIONE$8 = 
        new javax.xml.namespace.QName("", "DatiRicezione");
    private static final javax.xml.namespace.QName DATIFATTURECOLLEGATE$10 = 
        new javax.xml.namespace.QName("", "DatiFattureCollegate");
    private static final javax.xml.namespace.QName DATISAL$12 = 
        new javax.xml.namespace.QName("", "DatiSAL");
    private static final javax.xml.namespace.QName DATIDDT$14 = 
        new javax.xml.namespace.QName("", "DatiDDT");
    private static final javax.xml.namespace.QName DATITRASPORTO$16 = 
        new javax.xml.namespace.QName("", "DatiTrasporto");
    private static final javax.xml.namespace.QName FATTURAPRINCIPALE$18 = 
        new javax.xml.namespace.QName("", "FatturaPrincipale");
    
    
    /**
     * Gets the "DatiGeneraliDocumento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType getDatiGeneraliDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType)get_store().find_element_user(DATIGENERALIDOCUMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DatiGeneraliDocumento" element
     */
    public void setDatiGeneraliDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType datiGeneraliDocumento)
    {
        generatedSetterHelperImpl(datiGeneraliDocumento, DATIGENERALIDOCUMENTO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiGeneraliDocumento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType addNewDatiGeneraliDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType)get_store().add_element_user(DATIGENERALIDOCUMENTO$0);
            return target;
        }
    }
    
    /**
     * Gets array of all "DatiOrdineAcquisto" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] getDatiOrdineAcquistoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATIORDINEACQUISTO$2, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiOrdineAcquisto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType getDatiOrdineAcquistoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().find_element_user(DATIORDINEACQUISTO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiOrdineAcquisto" element
     */
    public int sizeOfDatiOrdineAcquistoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIORDINEACQUISTO$2);
        }
    }
    
    /**
     * Sets array of all "DatiOrdineAcquisto" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiOrdineAcquistoArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] datiOrdineAcquistoArray)
    {
        check_orphaned();
        arraySetterHelper(datiOrdineAcquistoArray, DATIORDINEACQUISTO$2);
    }
    
    /**
     * Sets ith "DatiOrdineAcquisto" element
     */
    public void setDatiOrdineAcquistoArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType datiOrdineAcquisto)
    {
        generatedSetterHelperImpl(datiOrdineAcquisto, DATIORDINEACQUISTO$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiOrdineAcquisto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType insertNewDatiOrdineAcquisto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().insert_element_user(DATIORDINEACQUISTO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiOrdineAcquisto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType addNewDatiOrdineAcquisto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().add_element_user(DATIORDINEACQUISTO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiOrdineAcquisto" element
     */
    public void removeDatiOrdineAcquisto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIORDINEACQUISTO$2, i);
        }
    }
    
    /**
     * Gets array of all "DatiContratto" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] getDatiContrattoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATICONTRATTO$4, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiContratto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType getDatiContrattoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().find_element_user(DATICONTRATTO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiContratto" element
     */
    public int sizeOfDatiContrattoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATICONTRATTO$4);
        }
    }
    
    /**
     * Sets array of all "DatiContratto" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiContrattoArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] datiContrattoArray)
    {
        check_orphaned();
        arraySetterHelper(datiContrattoArray, DATICONTRATTO$4);
    }
    
    /**
     * Sets ith "DatiContratto" element
     */
    public void setDatiContrattoArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType datiContratto)
    {
        generatedSetterHelperImpl(datiContratto, DATICONTRATTO$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiContratto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType insertNewDatiContratto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().insert_element_user(DATICONTRATTO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiContratto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType addNewDatiContratto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().add_element_user(DATICONTRATTO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiContratto" element
     */
    public void removeDatiContratto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATICONTRATTO$4, i);
        }
    }
    
    /**
     * Gets array of all "DatiConvenzione" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] getDatiConvenzioneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATICONVENZIONE$6, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiConvenzione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType getDatiConvenzioneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().find_element_user(DATICONVENZIONE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiConvenzione" element
     */
    public int sizeOfDatiConvenzioneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATICONVENZIONE$6);
        }
    }
    
    /**
     * Sets array of all "DatiConvenzione" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiConvenzioneArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] datiConvenzioneArray)
    {
        check_orphaned();
        arraySetterHelper(datiConvenzioneArray, DATICONVENZIONE$6);
    }
    
    /**
     * Sets ith "DatiConvenzione" element
     */
    public void setDatiConvenzioneArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType datiConvenzione)
    {
        generatedSetterHelperImpl(datiConvenzione, DATICONVENZIONE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiConvenzione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType insertNewDatiConvenzione(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().insert_element_user(DATICONVENZIONE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiConvenzione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType addNewDatiConvenzione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().add_element_user(DATICONVENZIONE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiConvenzione" element
     */
    public void removeDatiConvenzione(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATICONVENZIONE$6, i);
        }
    }
    
    /**
     * Gets array of all "DatiRicezione" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] getDatiRicezioneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATIRICEZIONE$8, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiRicezione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType getDatiRicezioneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().find_element_user(DATIRICEZIONE$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiRicezione" element
     */
    public int sizeOfDatiRicezioneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIRICEZIONE$8);
        }
    }
    
    /**
     * Sets array of all "DatiRicezione" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiRicezioneArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] datiRicezioneArray)
    {
        check_orphaned();
        arraySetterHelper(datiRicezioneArray, DATIRICEZIONE$8);
    }
    
    /**
     * Sets ith "DatiRicezione" element
     */
    public void setDatiRicezioneArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType datiRicezione)
    {
        generatedSetterHelperImpl(datiRicezione, DATIRICEZIONE$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiRicezione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType insertNewDatiRicezione(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().insert_element_user(DATIRICEZIONE$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiRicezione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType addNewDatiRicezione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().add_element_user(DATIRICEZIONE$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiRicezione" element
     */
    public void removeDatiRicezione(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIRICEZIONE$8, i);
        }
    }
    
    /**
     * Gets array of all "DatiFattureCollegate" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] getDatiFattureCollegateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATIFATTURECOLLEGATE$10, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiFattureCollegate" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType getDatiFattureCollegateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().find_element_user(DATIFATTURECOLLEGATE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiFattureCollegate" element
     */
    public int sizeOfDatiFattureCollegateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIFATTURECOLLEGATE$10);
        }
    }
    
    /**
     * Sets array of all "DatiFattureCollegate" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiFattureCollegateArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType[] datiFattureCollegateArray)
    {
        check_orphaned();
        arraySetterHelper(datiFattureCollegateArray, DATIFATTURECOLLEGATE$10);
    }
    
    /**
     * Sets ith "DatiFattureCollegate" element
     */
    public void setDatiFattureCollegateArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType datiFattureCollegate)
    {
        generatedSetterHelperImpl(datiFattureCollegate, DATIFATTURECOLLEGATE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiFattureCollegate" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType insertNewDatiFattureCollegate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().insert_element_user(DATIFATTURECOLLEGATE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiFattureCollegate" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType addNewDatiFattureCollegate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType)get_store().add_element_user(DATIFATTURECOLLEGATE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiFattureCollegate" element
     */
    public void removeDatiFattureCollegate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIFATTURECOLLEGATE$10, i);
        }
    }
    
    /**
     * Gets array of all "DatiSAL" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType[] getDatiSALArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATISAL$12, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiSAL" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType getDatiSALArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType)get_store().find_element_user(DATISAL$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiSAL" element
     */
    public int sizeOfDatiSALArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATISAL$12);
        }
    }
    
    /**
     * Sets array of all "DatiSAL" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiSALArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType[] datiSALArray)
    {
        check_orphaned();
        arraySetterHelper(datiSALArray, DATISAL$12);
    }
    
    /**
     * Sets ith "DatiSAL" element
     */
    public void setDatiSALArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType datiSAL)
    {
        generatedSetterHelperImpl(datiSAL, DATISAL$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiSAL" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType insertNewDatiSAL(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType)get_store().insert_element_user(DATISAL$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiSAL" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType addNewDatiSAL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType)get_store().add_element_user(DATISAL$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiSAL" element
     */
    public void removeDatiSAL(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATISAL$12, i);
        }
    }
    
    /**
     * Gets array of all "DatiDDT" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType[] getDatiDDTArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATIDDT$14, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiDDT" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType getDatiDDTArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType)get_store().find_element_user(DATIDDT$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiDDT" element
     */
    public int sizeOfDatiDDTArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIDDT$14);
        }
    }
    
    /**
     * Sets array of all "DatiDDT" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiDDTArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType[] datiDDTArray)
    {
        check_orphaned();
        arraySetterHelper(datiDDTArray, DATIDDT$14);
    }
    
    /**
     * Sets ith "DatiDDT" element
     */
    public void setDatiDDTArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType datiDDT)
    {
        generatedSetterHelperImpl(datiDDT, DATIDDT$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiDDT" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType insertNewDatiDDT(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType)get_store().insert_element_user(DATIDDT$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiDDT" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType addNewDatiDDT()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDDTType)get_store().add_element_user(DATIDDT$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiDDT" element
     */
    public void removeDatiDDT(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIDDT$14, i);
        }
    }
    
    /**
     * Gets the "DatiTrasporto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType getDatiTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType)get_store().find_element_user(DATITRASPORTO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DatiTrasporto" element
     */
    public boolean isSetDatiTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATITRASPORTO$16) != 0;
        }
    }
    
    /**
     * Sets the "DatiTrasporto" element
     */
    public void setDatiTrasporto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType datiTrasporto)
    {
        generatedSetterHelperImpl(datiTrasporto, DATITRASPORTO$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiTrasporto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType addNewDatiTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType)get_store().add_element_user(DATITRASPORTO$16);
            return target;
        }
    }
    
    /**
     * Unsets the "DatiTrasporto" element
     */
    public void unsetDatiTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATITRASPORTO$16, 0);
        }
    }
    
    /**
     * Gets the "FatturaPrincipale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType getFatturaPrincipale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType)get_store().find_element_user(FATTURAPRINCIPALE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FatturaPrincipale" element
     */
    public boolean isSetFatturaPrincipale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FATTURAPRINCIPALE$18) != 0;
        }
    }
    
    /**
     * Sets the "FatturaPrincipale" element
     */
    public void setFatturaPrincipale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType fatturaPrincipale)
    {
        generatedSetterHelperImpl(fatturaPrincipale, FATTURAPRINCIPALE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FatturaPrincipale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType addNewFatturaPrincipale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaPrincipaleType)get_store().add_element_user(FATTURAPRINCIPALE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "FatturaPrincipale" element
     */
    public void unsetFatturaPrincipale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FATTURAPRINCIPALE$18, 0);
        }
    }
}
