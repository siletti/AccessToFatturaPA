/*
 * XML Type:  DatiDocumentiCorrelatiType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiDocumentiCorrelatiType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiDocumentiCorrelatiTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiDocumentiCorrelatiType
{
    private static final long serialVersionUID = 1L;
    
    public DatiDocumentiCorrelatiTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIFERIMENTONUMEROLINEA$0 = 
        new javax.xml.namespace.QName("", "RiferimentoNumeroLinea");
    private static final javax.xml.namespace.QName IDDOCUMENTO$2 = 
        new javax.xml.namespace.QName("", "IdDocumento");
    private static final javax.xml.namespace.QName DATA$4 = 
        new javax.xml.namespace.QName("", "Data");
    private static final javax.xml.namespace.QName NUMITEM$6 = 
        new javax.xml.namespace.QName("", "NumItem");
    private static final javax.xml.namespace.QName CODICECOMMESSACONVENZIONE$8 = 
        new javax.xml.namespace.QName("", "CodiceCommessaConvenzione");
    private static final javax.xml.namespace.QName CODICECUP$10 = 
        new javax.xml.namespace.QName("", "CodiceCUP");
    private static final javax.xml.namespace.QName CODICECIG$12 = 
        new javax.xml.namespace.QName("", "CodiceCIG");
    
    
    /**
     * Gets array of all "RiferimentoNumeroLinea" elements
     */
    public int[] getRiferimentoNumeroLineaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RIFERIMENTONUMEROLINEA$0, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTONUMEROLINEA$0, i);
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
            get_store().find_all_element_users(RIFERIMENTONUMEROLINEA$0, targetList);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType)get_store().find_element_user(RIFERIMENTONUMEROLINEA$0, i);
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
            return get_store().count_elements(RIFERIMENTONUMEROLINEA$0);
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
            arraySetterHelper(riferimentoNumeroLineaArray, RIFERIMENTONUMEROLINEA$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTONUMEROLINEA$0, i);
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
            arraySetterHelper(riferimentoNumeroLineaArray, RIFERIMENTONUMEROLINEA$0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType)get_store().find_element_user(RIFERIMENTONUMEROLINEA$0, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(RIFERIMENTONUMEROLINEA$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTONUMEROLINEA$0);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType)get_store().insert_element_user(RIFERIMENTONUMEROLINEA$0, i);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoNumeroLineaType)get_store().add_element_user(RIFERIMENTONUMEROLINEA$0);
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
            get_store().remove_element(RIFERIMENTONUMEROLINEA$0, i);
        }
    }
    
    /**
     * Gets the "IdDocumento" element
     */
    public java.lang.String getIdDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDOCUMENTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdDocumento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetIdDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(IDDOCUMENTO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IdDocumento" element
     */
    public void setIdDocumento(java.lang.String idDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDDOCUMENTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDDOCUMENTO$2);
            }
            target.setStringValue(idDocumento);
        }
    }
    
    /**
     * Sets (as xml) the "IdDocumento" element
     */
    public void xsetIdDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type idDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(IDDOCUMENTO$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(IDDOCUMENTO$2);
            }
            target.set(idDocumento);
        }
    }
    
    /**
     * Gets the "Data" element
     */
    public java.util.Calendar getData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "Data" element
     */
    public org.apache.xmlbeans.XmlDate xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATA$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Data" element
     */
    public boolean isSetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATA$4) != 0;
        }
    }
    
    /**
     * Sets the "Data" element
     */
    public void setData(java.util.Calendar data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATA$4);
            }
            target.setCalendarValue(data);
        }
    }
    
    /**
     * Sets (as xml) the "Data" element
     */
    public void xsetData(org.apache.xmlbeans.XmlDate data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATA$4);
            }
            target.set(data);
        }
    }
    
    /**
     * Unsets the "Data" element
     */
    public void unsetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATA$4, 0);
        }
    }
    
    /**
     * Gets the "NumItem" element
     */
    public java.lang.String getNumItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMITEM$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumItem" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetNumItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMITEM$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumItem" element
     */
    public boolean isSetNumItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMITEM$6) != 0;
        }
    }
    
    /**
     * Sets the "NumItem" element
     */
    public void setNumItem(java.lang.String numItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMITEM$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMITEM$6);
            }
            target.setStringValue(numItem);
        }
    }
    
    /**
     * Sets (as xml) the "NumItem" element
     */
    public void xsetNumItem(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type numItem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMITEM$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(NUMITEM$6);
            }
            target.set(numItem);
        }
    }
    
    /**
     * Unsets the "NumItem" element
     */
    public void unsetNumItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMITEM$6, 0);
        }
    }
    
    /**
     * Gets the "CodiceCommessaConvenzione" element
     */
    public java.lang.String getCodiceCommessaConvenzione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICECOMMESSACONVENZIONE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodiceCommessaConvenzione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetCodiceCommessaConvenzione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(CODICECOMMESSACONVENZIONE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodiceCommessaConvenzione" element
     */
    public boolean isSetCodiceCommessaConvenzione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODICECOMMESSACONVENZIONE$8) != 0;
        }
    }
    
    /**
     * Sets the "CodiceCommessaConvenzione" element
     */
    public void setCodiceCommessaConvenzione(java.lang.String codiceCommessaConvenzione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICECOMMESSACONVENZIONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICECOMMESSACONVENZIONE$8);
            }
            target.setStringValue(codiceCommessaConvenzione);
        }
    }
    
    /**
     * Sets (as xml) the "CodiceCommessaConvenzione" element
     */
    public void xsetCodiceCommessaConvenzione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType codiceCommessaConvenzione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(CODICECOMMESSACONVENZIONE$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().add_element_user(CODICECOMMESSACONVENZIONE$8);
            }
            target.set(codiceCommessaConvenzione);
        }
    }
    
    /**
     * Unsets the "CodiceCommessaConvenzione" element
     */
    public void unsetCodiceCommessaConvenzione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODICECOMMESSACONVENZIONE$8, 0);
        }
    }
    
    /**
     * Gets the "CodiceCUP" element
     */
    public java.lang.String getCodiceCUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICECUP$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodiceCUP" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type xgetCodiceCUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type)get_store().find_element_user(CODICECUP$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodiceCUP" element
     */
    public boolean isSetCodiceCUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODICECUP$10) != 0;
        }
    }
    
    /**
     * Sets the "CodiceCUP" element
     */
    public void setCodiceCUP(java.lang.String codiceCUP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICECUP$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICECUP$10);
            }
            target.setStringValue(codiceCUP);
        }
    }
    
    /**
     * Sets (as xml) the "CodiceCUP" element
     */
    public void xsetCodiceCUP(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type codiceCUP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type)get_store().find_element_user(CODICECUP$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type)get_store().add_element_user(CODICECUP$10);
            }
            target.set(codiceCUP);
        }
    }
    
    /**
     * Unsets the "CodiceCUP" element
     */
    public void unsetCodiceCUP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODICECUP$10, 0);
        }
    }
    
    /**
     * Gets the "CodiceCIG" element
     */
    public java.lang.String getCodiceCIG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICECIG$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodiceCIG" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type xgetCodiceCIG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type)get_store().find_element_user(CODICECIG$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "CodiceCIG" element
     */
    public boolean isSetCodiceCIG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODICECIG$12) != 0;
        }
    }
    
    /**
     * Sets the "CodiceCIG" element
     */
    public void setCodiceCIG(java.lang.String codiceCIG)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICECIG$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICECIG$12);
            }
            target.setStringValue(codiceCIG);
        }
    }
    
    /**
     * Sets (as xml) the "CodiceCIG" element
     */
    public void xsetCodiceCIG(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type codiceCIG)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type)get_store().find_element_user(CODICECIG$12, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String15Type)get_store().add_element_user(CODICECIG$12);
            }
            target.set(codiceCIG);
        }
    }
    
    /**
     * Unsets the "CodiceCIG" element
     */
    public void unsetCodiceCIG()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODICECIG$12, 0);
        }
    }
}
