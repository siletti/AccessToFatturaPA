/*
 * XML Type:  DatiPagamentoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiPagamentoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiPagamentoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiPagamentoType
{
    private static final long serialVersionUID = 1L;
    
    public DatiPagamentoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONDIZIONIPAGAMENTO$0 = 
        new javax.xml.namespace.QName("", "CondizioniPagamento");
    private static final javax.xml.namespace.QName DETTAGLIOPAGAMENTO$2 = 
        new javax.xml.namespace.QName("", "DettaglioPagamento");
    
    
    /**
     * Gets the "CondizioniPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType.Enum getCondizioniPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDIZIONIPAGAMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "CondizioniPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType xgetCondizioniPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType)get_store().find_element_user(CONDIZIONIPAGAMENTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CondizioniPagamento" element
     */
    public void setCondizioniPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType.Enum condizioniPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDIZIONIPAGAMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDIZIONIPAGAMENTO$0);
            }
            target.setEnumValue(condizioniPagamento);
        }
    }
    
    /**
     * Sets (as xml) the "CondizioniPagamento" element
     */
    public void xsetCondizioniPagamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType condizioniPagamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType)get_store().find_element_user(CONDIZIONIPAGAMENTO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CondizioniPagamentoType)get_store().add_element_user(CONDIZIONIPAGAMENTO$0);
            }
            target.set(condizioniPagamento);
        }
    }
    
    /**
     * Gets array of all "DettaglioPagamento" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType[] getDettaglioPagamentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DETTAGLIOPAGAMENTO$2, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DettaglioPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType getDettaglioPagamentoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType)get_store().find_element_user(DETTAGLIOPAGAMENTO$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DettaglioPagamento" element
     */
    public int sizeOfDettaglioPagamentoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DETTAGLIOPAGAMENTO$2);
        }
    }
    
    /**
     * Sets array of all "DettaglioPagamento" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDettaglioPagamentoArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType[] dettaglioPagamentoArray)
    {
        check_orphaned();
        arraySetterHelper(dettaglioPagamentoArray, DETTAGLIOPAGAMENTO$2);
    }
    
    /**
     * Sets ith "DettaglioPagamento" element
     */
    public void setDettaglioPagamentoArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType dettaglioPagamento)
    {
        generatedSetterHelperImpl(dettaglioPagamento, DETTAGLIOPAGAMENTO$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DettaglioPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType insertNewDettaglioPagamento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType)get_store().insert_element_user(DETTAGLIOPAGAMENTO$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DettaglioPagamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType addNewDettaglioPagamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioPagamentoType)get_store().add_element_user(DETTAGLIOPAGAMENTO$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "DettaglioPagamento" element
     */
    public void removeDettaglioPagamento(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DETTAGLIOPAGAMENTO$2, i);
        }
    }
}
