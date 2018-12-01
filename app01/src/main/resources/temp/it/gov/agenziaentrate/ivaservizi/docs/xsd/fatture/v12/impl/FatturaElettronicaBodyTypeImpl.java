/*
 * XML Type:  FatturaElettronicaBodyType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML FatturaElettronicaBodyType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class FatturaElettronicaBodyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaBodyType
{
    private static final long serialVersionUID = 1L;
    
    public FatturaElettronicaBodyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATIGENERALI$0 = 
        new javax.xml.namespace.QName("", "DatiGenerali");
    private static final javax.xml.namespace.QName DATIBENISERVIZI$2 = 
        new javax.xml.namespace.QName("", "DatiBeniServizi");
    private static final javax.xml.namespace.QName DATIVEICOLI$4 = 
        new javax.xml.namespace.QName("", "DatiVeicoli");
    private static final javax.xml.namespace.QName DATIPAGAMENTO$6 = 
        new javax.xml.namespace.QName("", "DatiPagamento");
    private static final javax.xml.namespace.QName ALLEGATI$8 = 
        new javax.xml.namespace.QName("", "Allegati");
    
    
    /**
     * Gets the "DatiGenerali" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType getDatiGenerali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType)get_store().find_element_user(DATIGENERALI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DatiGenerali" element
     */
    public void setDatiGenerali(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType datiGenerali)
    {
        generatedSetterHelperImpl(datiGenerali, DATIGENERALI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiGenerali" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType addNewDatiGenerali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliType)get_store().add_element_user(DATIGENERALI$0);
            return target;
        }
    }
    
    /**
     * Gets the "DatiBeniServizi" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType getDatiBeniServizi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType)get_store().find_element_user(DATIBENISERVIZI$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DatiBeniServizi" element
     */
    public void setDatiBeniServizi(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType datiBeniServizi)
    {
        generatedSetterHelperImpl(datiBeniServizi, DATIBENISERVIZI$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiBeniServizi" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType addNewDatiBeniServizi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBeniServiziType)get_store().add_element_user(DATIBENISERVIZI$2);
            return target;
        }
    }
    
    /**
     * Gets the "DatiVeicoli" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType getDatiVeicoli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType)get_store().find_element_user(DATIVEICOLI$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DatiVeicoli" element
     */
    public boolean isSetDatiVeicoli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIVEICOLI$4) != 0;
        }
    }
    
    /**
     * Sets the "DatiVeicoli" element
     */
    public void setDatiVeicoli(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType datiVeicoli)
    {
        generatedSetterHelperImpl(datiVeicoli, DATIVEICOLI$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiVeicoli" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType addNewDatiVeicoli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiVeicoliType)get_store().add_element_user(DATIVEICOLI$4);
            return target;
        }
    }
    
    /**
     * Unsets the "DatiVeicoli" element
     */
    public void unsetDatiVeicoli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIVEICOLI$4, 0);
        }
    }
    
    /**
     * Gets array of all "DatiPagamento" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType[] getDatiPagamentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATIPAGAMENTO$6, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType getDatiPagamentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType)get_store().find_element_user(DATIPAGAMENTO$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiPagamento" element
     */
    public int sizeOfDatiPagamentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIPAGAMENTO$6);
        }
    }
    
    /**
     * Sets array of all "DatiPagamento" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiPagamentoArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType[] datiPagamentoArray)
    {
        check_orphaned();
        arraySetterHelper(datiPagamentoArray, DATIPAGAMENTO$6);
    }
    
    /**
     * Sets ith "DatiPagamento" element
     */
    public void setDatiPagamentoArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType datiPagamento)
    {
        generatedSetterHelperImpl(datiPagamento, DATIPAGAMENTO$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType insertNewDatiPagamento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType)get_store().insert_element_user(DATIPAGAMENTO$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType addNewDatiPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType)get_store().add_element_user(DATIPAGAMENTO$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiPagamento" element
     */
    public void removeDatiPagamento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIPAGAMENTO$6, i);
        }
    }
    
    /**
     * Gets array of all "Allegati" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType[] getAllegatiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALLEGATI$8, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Allegati" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType getAllegatiArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType)get_store().find_element_user(ALLEGATI$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Allegati" element
     */
    public int sizeOfAllegatiArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLEGATI$8);
        }
    }
    
    /**
     * Sets array of all "Allegati" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAllegatiArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType[] allegatiArray)
    {
        check_orphaned();
        arraySetterHelper(allegatiArray, ALLEGATI$8);
    }
    
    /**
     * Sets ith "Allegati" element
     */
    public void setAllegatiArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType allegati)
    {
        generatedSetterHelperImpl(allegati, ALLEGATI$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Allegati" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType insertNewAllegati(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType)get_store().insert_element_user(ALLEGATI$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Allegati" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType addNewAllegati()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType)get_store().add_element_user(ALLEGATI$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "Allegati" element
     */
    public void removeAllegati(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLEGATI$8, i);
        }
    }
}
