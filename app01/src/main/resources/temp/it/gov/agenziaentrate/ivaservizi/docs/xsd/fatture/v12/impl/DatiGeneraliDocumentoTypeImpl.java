/*
 * XML Type:  DatiGeneraliDocumentoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiGeneraliDocumentoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiGeneraliDocumentoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiGeneraliDocumentoType
{
    private static final long serialVersionUID = 1L;
    
    public DatiGeneraliDocumentoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPODOCUMENTO$0 = 
        new javax.xml.namespace.QName("", "TipoDocumento");
    private static final javax.xml.namespace.QName DIVISA$2 = 
        new javax.xml.namespace.QName("", "Divisa");
    private static final javax.xml.namespace.QName DATA$4 = 
        new javax.xml.namespace.QName("", "Data");
    private static final javax.xml.namespace.QName NUMERO$6 = 
        new javax.xml.namespace.QName("", "Numero");
    private static final javax.xml.namespace.QName DATIRITENUTA$8 = 
        new javax.xml.namespace.QName("", "DatiRitenuta");
    private static final javax.xml.namespace.QName DATIBOLLO$10 = 
        new javax.xml.namespace.QName("", "DatiBollo");
    private static final javax.xml.namespace.QName DATICASSAPREVIDENZIALE$12 = 
        new javax.xml.namespace.QName("", "DatiCassaPrevidenziale");
    private static final javax.xml.namespace.QName SCONTOMAGGIORAZIONE$14 = 
        new javax.xml.namespace.QName("", "ScontoMaggiorazione");
    private static final javax.xml.namespace.QName IMPORTOTOTALEDOCUMENTO$16 = 
        new javax.xml.namespace.QName("", "ImportoTotaleDocumento");
    private static final javax.xml.namespace.QName ARROTONDAMENTO$18 = 
        new javax.xml.namespace.QName("", "Arrotondamento");
    private static final javax.xml.namespace.QName CAUSALE$20 = 
        new javax.xml.namespace.QName("", "Causale");
    private static final javax.xml.namespace.QName ART73$22 = 
        new javax.xml.namespace.QName("", "Art73");
    
    
    /**
     * Gets the "TipoDocumento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType.Enum getTipoDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoDocumento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType xgetTipoDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType)get_store().find_element_user(TIPODOCUMENTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "TipoDocumento" element
     */
    public void setTipoDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType.Enum tipoDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPODOCUMENTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPODOCUMENTO$0);
            }
            target.setEnumValue(tipoDocumento);
        }
    }
    
    /**
     * Sets (as xml) the "TipoDocumento" element
     */
    public void xsetTipoDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType tipoDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType)get_store().find_element_user(TIPODOCUMENTO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoDocumentoType)get_store().add_element_user(TIPODOCUMENTO$0);
            }
            target.set(tipoDocumento);
        }
    }
    
    /**
     * Gets the "Divisa" element
     */
    public java.lang.String getDivisa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIVISA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Divisa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType xgetDivisa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType)get_store().find_element_user(DIVISA$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Divisa" element
     */
    public void setDivisa(java.lang.String divisa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIVISA$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIVISA$2);
            }
            target.setStringValue(divisa);
        }
    }
    
    /**
     * Sets (as xml) the "Divisa" element
     */
    public void xsetDivisa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType divisa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType)get_store().find_element_user(DIVISA$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DivisaType)get_store().add_element_user(DIVISA$2);
            }
            target.set(divisa);
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
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType xgetData()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType)get_store().find_element_user(DATA$4, 0);
            return target;
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
    public void xsetData(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType data)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType)get_store().find_element_user(DATA$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DataFatturaType)get_store().add_element_user(DATA$4);
            }
            target.set(data);
        }
    }
    
    /**
     * Gets the "Numero" element
     */
    public java.lang.String getNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Numero" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetNumero()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMERO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Numero" element
     */
    public void setNumero(java.lang.String numero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMERO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMERO$6);
            }
            target.setStringValue(numero);
        }
    }
    
    /**
     * Sets (as xml) the "Numero" element
     */
    public void xsetNumero(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type numero)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(NUMERO$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(NUMERO$6);
            }
            target.set(numero);
        }
    }
    
    /**
     * Gets the "DatiRitenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType getDatiRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType)get_store().find_element_user(DATIRITENUTA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DatiRitenuta" element
     */
    public boolean isSetDatiRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIRITENUTA$8) != 0;
        }
    }
    
    /**
     * Sets the "DatiRitenuta" element
     */
    public void setDatiRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType datiRitenuta)
    {
        generatedSetterHelperImpl(datiRitenuta, DATIRITENUTA$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiRitenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType addNewDatiRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiRitenutaType)get_store().add_element_user(DATIRITENUTA$8);
            return target;
        }
    }
    
    /**
     * Unsets the "DatiRitenuta" element
     */
    public void unsetDatiRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIRITENUTA$8, 0);
        }
    }
    
    /**
     * Gets the "DatiBollo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType getDatiBollo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType)get_store().find_element_user(DATIBOLLO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DatiBollo" element
     */
    public boolean isSetDatiBollo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIBOLLO$10) != 0;
        }
    }
    
    /**
     * Sets the "DatiBollo" element
     */
    public void setDatiBollo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType datiBollo)
    {
        generatedSetterHelperImpl(datiBollo, DATIBOLLO$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiBollo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType addNewDatiBollo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType)get_store().add_element_user(DATIBOLLO$10);
            return target;
        }
    }
    
    /**
     * Unsets the "DatiBollo" element
     */
    public void unsetDatiBollo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIBOLLO$10, 0);
        }
    }
    
    /**
     * Gets array of all "DatiCassaPrevidenziale" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType[] getDatiCassaPrevidenzialeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DATICASSAPREVIDENZIALE$12, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "DatiCassaPrevidenziale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType getDatiCassaPrevidenzialeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType)get_store().find_element_user(DATICASSAPREVIDENZIALE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "DatiCassaPrevidenziale" element
     */
    public int sizeOfDatiCassaPrevidenzialeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATICASSAPREVIDENZIALE$12);
        }
    }
    
    /**
     * Sets array of all "DatiCassaPrevidenziale" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDatiCassaPrevidenzialeArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType[] datiCassaPrevidenzialeArray)
    {
        check_orphaned();
        arraySetterHelper(datiCassaPrevidenzialeArray, DATICASSAPREVIDENZIALE$12);
    }
    
    /**
     * Sets ith "DatiCassaPrevidenziale" element
     */
    public void setDatiCassaPrevidenzialeArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType datiCassaPrevidenziale)
    {
        generatedSetterHelperImpl(datiCassaPrevidenziale, DATICASSAPREVIDENZIALE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "DatiCassaPrevidenziale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType insertNewDatiCassaPrevidenziale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType)get_store().insert_element_user(DATICASSAPREVIDENZIALE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "DatiCassaPrevidenziale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType addNewDatiCassaPrevidenziale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiCassaPrevidenzialeType)get_store().add_element_user(DATICASSAPREVIDENZIALE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "DatiCassaPrevidenziale" element
     */
    public void removeDatiCassaPrevidenziale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATICASSAPREVIDENZIALE$12, i);
        }
    }
    
    /**
     * Gets array of all "ScontoMaggiorazione" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType[] getScontoMaggiorazioneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SCONTOMAGGIORAZIONE$14, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ScontoMaggiorazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType getScontoMaggiorazioneArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType)get_store().find_element_user(SCONTOMAGGIORAZIONE$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ScontoMaggiorazione" element
     */
    public int sizeOfScontoMaggiorazioneArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCONTOMAGGIORAZIONE$14);
        }
    }
    
    /**
     * Sets array of all "ScontoMaggiorazione" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setScontoMaggiorazioneArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType[] scontoMaggiorazioneArray)
    {
        check_orphaned();
        arraySetterHelper(scontoMaggiorazioneArray, SCONTOMAGGIORAZIONE$14);
    }
    
    /**
     * Sets ith "ScontoMaggiorazione" element
     */
    public void setScontoMaggiorazioneArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType scontoMaggiorazione)
    {
        generatedSetterHelperImpl(scontoMaggiorazione, SCONTOMAGGIORAZIONE$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ScontoMaggiorazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType insertNewScontoMaggiorazione(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType)get_store().insert_element_user(SCONTOMAGGIORAZIONE$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ScontoMaggiorazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType addNewScontoMaggiorazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType)get_store().add_element_user(SCONTOMAGGIORAZIONE$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "ScontoMaggiorazione" element
     */
    public void removeScontoMaggiorazione(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCONTOMAGGIORAZIONE$14, i);
        }
    }
    
    /**
     * Gets the "ImportoTotaleDocumento" element
     */
    public java.math.BigDecimal getImportoTotaleDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTOTOTALEDOCUMENTO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportoTotaleDocumento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoTotaleDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTOTOTALEDOCUMENTO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ImportoTotaleDocumento" element
     */
    public boolean isSetImportoTotaleDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTOTOTALEDOCUMENTO$16) != 0;
        }
    }
    
    /**
     * Sets the "ImportoTotaleDocumento" element
     */
    public void setImportoTotaleDocumento(java.math.BigDecimal importoTotaleDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTOTOTALEDOCUMENTO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTOTOTALEDOCUMENTO$16);
            }
            target.setBigDecimalValue(importoTotaleDocumento);
        }
    }
    
    /**
     * Sets (as xml) the "ImportoTotaleDocumento" element
     */
    public void xsetImportoTotaleDocumento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoTotaleDocumento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTOTOTALEDOCUMENTO$16, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPORTOTOTALEDOCUMENTO$16);
            }
            target.set(importoTotaleDocumento);
        }
    }
    
    /**
     * Unsets the "ImportoTotaleDocumento" element
     */
    public void unsetImportoTotaleDocumento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTOTOTALEDOCUMENTO$16, 0);
        }
    }
    
    /**
     * Gets the "Arrotondamento" element
     */
    public java.math.BigDecimal getArrotondamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARROTONDAMENTO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Arrotondamento" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetArrotondamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(ARROTONDAMENTO$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "Arrotondamento" element
     */
    public boolean isSetArrotondamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ARROTONDAMENTO$18) != 0;
        }
    }
    
    /**
     * Sets the "Arrotondamento" element
     */
    public void setArrotondamento(java.math.BigDecimal arrotondamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ARROTONDAMENTO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ARROTONDAMENTO$18);
            }
            target.setBigDecimalValue(arrotondamento);
        }
    }
    
    /**
     * Sets (as xml) the "Arrotondamento" element
     */
    public void xsetArrotondamento(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType arrotondamento)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(ARROTONDAMENTO$18, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(ARROTONDAMENTO$18);
            }
            target.set(arrotondamento);
        }
    }
    
    /**
     * Unsets the "Arrotondamento" element
     */
    public void unsetArrotondamento()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ARROTONDAMENTO$18, 0);
        }
    }
    
    /**
     * Gets array of all "Causale" elements
     */
    public java.lang.String[] getCausaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAUSALE$20, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Causale" element
     */
    public java.lang.String getCausaleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAUSALE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Causale" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType[] xgetCausaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAUSALE$20, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Causale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType xgetCausaleArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType)get_store().find_element_user(CAUSALE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Causale" element
     */
    public int sizeOfCausaleArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAUSALE$20);
        }
    }
    
    /**
     * Sets array of all "Causale" element
     */
    public void setCausaleArray(java.lang.String[] causaleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(causaleArray, CAUSALE$20);
        }
    }
    
    /**
     * Sets ith "Causale" element
     */
    public void setCausaleArray(int i, java.lang.String causale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAUSALE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(causale);
        }
    }
    
    /**
     * Sets (as xml) array of all "Causale" element
     */
    public void xsetCausaleArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType[]causaleArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(causaleArray, CAUSALE$20);
        }
    }
    
    /**
     * Sets (as xml) ith "Causale" element
     */
    public void xsetCausaleArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType causale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType)get_store().find_element_user(CAUSALE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(causale);
        }
    }
    
    /**
     * Inserts the value as the ith "Causale" element
     */
    public void insertCausale(int i, java.lang.String causale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CAUSALE$20, i);
            target.setStringValue(causale);
        }
    }
    
    /**
     * Appends the value as the last "Causale" element
     */
    public void addCausale(java.lang.String causale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAUSALE$20);
            target.setStringValue(causale);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Causale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType insertNewCausale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType)get_store().insert_element_user(CAUSALE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Causale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType addNewCausale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String200LatinType)get_store().add_element_user(CAUSALE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "Causale" element
     */
    public void removeCausale(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAUSALE$20, i);
        }
    }
    
    /**
     * Gets the "Art73" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type.Enum getArt73()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ART73$22, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Art73" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type xgetArt73()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type)get_store().find_element_user(ART73$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "Art73" element
     */
    public boolean isSetArt73()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ART73$22) != 0;
        }
    }
    
    /**
     * Sets the "Art73" element
     */
    public void setArt73(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type.Enum art73)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ART73$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ART73$22);
            }
            target.setEnumValue(art73);
        }
    }
    
    /**
     * Sets (as xml) the "Art73" element
     */
    public void xsetArt73(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type art73)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type)get_store().find_element_user(ART73$22, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Art73Type)get_store().add_element_user(ART73$22);
            }
            target.set(art73);
        }
    }
    
    /**
     * Unsets the "Art73" element
     */
    public void unsetArt73()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ART73$22, 0);
        }
    }
}
