/*
 * XML Type:  DettaglioLineeType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DettaglioLineeType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DettaglioLineeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DettaglioLineeType
{
    private static final long serialVersionUID = 1L;
    
    public DettaglioLineeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMEROLINEA$0 = 
        new javax.xml.namespace.QName("", "NumeroLinea");
    private static final javax.xml.namespace.QName TIPOCESSIONEPRESTAZIONE$2 = 
        new javax.xml.namespace.QName("", "TipoCessionePrestazione");
    private static final javax.xml.namespace.QName CODICEARTICOLO$4 = 
        new javax.xml.namespace.QName("", "CodiceArticolo");
    private static final javax.xml.namespace.QName DESCRIZIONE$6 = 
        new javax.xml.namespace.QName("", "Descrizione");
    private static final javax.xml.namespace.QName QUANTITA$8 = 
        new javax.xml.namespace.QName("", "Quantita");
    private static final javax.xml.namespace.QName UNITAMISURA$10 = 
        new javax.xml.namespace.QName("", "UnitaMisura");
    private static final javax.xml.namespace.QName DATAINIZIOPERIODO$12 = 
        new javax.xml.namespace.QName("", "DataInizioPeriodo");
    private static final javax.xml.namespace.QName DATAFINEPERIODO$14 = 
        new javax.xml.namespace.QName("", "DataFinePeriodo");
    private static final javax.xml.namespace.QName PREZZOUNITARIO$16 = 
        new javax.xml.namespace.QName("", "PrezzoUnitario");
    private static final javax.xml.namespace.QName SCONTOMAGGIORAZIONE$18 = 
        new javax.xml.namespace.QName("", "ScontoMaggiorazione");
    private static final javax.xml.namespace.QName PREZZOTOTALE$20 = 
        new javax.xml.namespace.QName("", "PrezzoTotale");
    private static final javax.xml.namespace.QName ALIQUOTAIVA$22 = 
        new javax.xml.namespace.QName("", "AliquotaIVA");
    private static final javax.xml.namespace.QName RITENUTA$24 = 
        new javax.xml.namespace.QName("", "Ritenuta");
    private static final javax.xml.namespace.QName NATURA$26 = 
        new javax.xml.namespace.QName("", "Natura");
    private static final javax.xml.namespace.QName RIFERIMENTOAMMINISTRAZIONE$28 = 
        new javax.xml.namespace.QName("", "RiferimentoAmministrazione");
    private static final javax.xml.namespace.QName ALTRIDATIGESTIONALI$30 = 
        new javax.xml.namespace.QName("", "AltriDatiGestionali");
    
    
    /**
     * Gets the "NumeroLinea" element
     */
    public int getNumeroLinea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROLINEA$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroLinea" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType xgetNumeroLinea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType)get_store().find_element_user(NUMEROLINEA$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NumeroLinea" element
     */
    public void setNumeroLinea(int numeroLinea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROLINEA$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROLINEA$0);
            }
            target.setIntValue(numeroLinea);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroLinea" element
     */
    public void xsetNumeroLinea(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType numeroLinea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType)get_store().find_element_user(NUMEROLINEA$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroLineaType)get_store().add_element_user(NUMEROLINEA$0);
            }
            target.set(numeroLinea);
        }
    }
    
    /**
     * Gets the "TipoCessionePrestazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType.Enum getTipoCessionePrestazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOCESSIONEPRESTAZIONE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoCessionePrestazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType xgetTipoCessionePrestazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType)get_store().find_element_user(TIPOCESSIONEPRESTAZIONE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "TipoCessionePrestazione" element
     */
    public boolean isSetTipoCessionePrestazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPOCESSIONEPRESTAZIONE$2) != 0;
        }
    }
    
    /**
     * Sets the "TipoCessionePrestazione" element
     */
    public void setTipoCessionePrestazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType.Enum tipoCessionePrestazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPOCESSIONEPRESTAZIONE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPOCESSIONEPRESTAZIONE$2);
            }
            target.setEnumValue(tipoCessionePrestazione);
        }
    }
    
    /**
     * Sets (as xml) the "TipoCessionePrestazione" element
     */
    public void xsetTipoCessionePrestazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType tipoCessionePrestazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType)get_store().find_element_user(TIPOCESSIONEPRESTAZIONE$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoCessionePrestazioneType)get_store().add_element_user(TIPOCESSIONEPRESTAZIONE$2);
            }
            target.set(tipoCessionePrestazione);
        }
    }
    
    /**
     * Unsets the "TipoCessionePrestazione" element
     */
    public void unsetTipoCessionePrestazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPOCESSIONEPRESTAZIONE$2, 0);
        }
    }
    
    /**
     * Gets array of all "CodiceArticolo" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType[] getCodiceArticoloArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CODICEARTICOLO$4, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CodiceArticolo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType getCodiceArticoloArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType)get_store().find_element_user(CODICEARTICOLO$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CodiceArticolo" element
     */
    public int sizeOfCodiceArticoloArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODICEARTICOLO$4);
        }
    }
    
    /**
     * Sets array of all "CodiceArticolo" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setCodiceArticoloArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType[] codiceArticoloArray)
    {
        check_orphaned();
        arraySetterHelper(codiceArticoloArray, CODICEARTICOLO$4);
    }
    
    /**
     * Sets ith "CodiceArticolo" element
     */
    public void setCodiceArticoloArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType codiceArticolo)
    {
        generatedSetterHelperImpl(codiceArticolo, CODICEARTICOLO$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CodiceArticolo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType insertNewCodiceArticolo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType)get_store().insert_element_user(CODICEARTICOLO$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CodiceArticolo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType addNewCodiceArticolo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType)get_store().add_element_user(CODICEARTICOLO$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "CodiceArticolo" element
     */
    public void removeCodiceArticolo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODICEARTICOLO$4, i);
        }
    }
    
    /**
     * Gets the "Descrizione" element
     */
    public java.lang.String getDescrizione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIZIONE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Descrizione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType xgetDescrizione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType)get_store().find_element_user(DESCRIZIONE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Descrizione" element
     */
    public void setDescrizione(java.lang.String descrizione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIZIONE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIZIONE$6);
            }
            target.setStringValue(descrizione);
        }
    }
    
    /**
     * Sets (as xml) the "Descrizione" element
     */
    public void xsetDescrizione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType descrizione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType)get_store().find_element_user(DESCRIZIONE$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String1000LatinType)get_store().add_element_user(DESCRIZIONE$6);
            }
            target.set(descrizione);
        }
    }
    
    /**
     * Gets the "Quantita" element
     */
    public java.math.BigDecimal getQuantita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Quantita" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType xgetQuantita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType)get_store().find_element_user(QUANTITA$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Quantita" element
     */
    public boolean isSetQuantita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITA$8) != 0;
        }
    }
    
    /**
     * Sets the "Quantita" element
     */
    public void setQuantita(java.math.BigDecimal quantita)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUANTITA$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUANTITA$8);
            }
            target.setBigDecimalValue(quantita);
        }
    }
    
    /**
     * Sets (as xml) the "Quantita" element
     */
    public void xsetQuantita(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType quantita)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType)get_store().find_element_user(QUANTITA$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.QuantitaType)get_store().add_element_user(QUANTITA$8);
            }
            target.set(quantita);
        }
    }
    
    /**
     * Unsets the "Quantita" element
     */
    public void unsetQuantita()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITA$8, 0);
        }
    }
    
    /**
     * Gets the "UnitaMisura" element
     */
    public java.lang.String getUnitaMisura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITAMISURA$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnitaMisura" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetUnitaMisura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(UNITAMISURA$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "UnitaMisura" element
     */
    public boolean isSetUnitaMisura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITAMISURA$10) != 0;
        }
    }
    
    /**
     * Sets the "UnitaMisura" element
     */
    public void setUnitaMisura(java.lang.String unitaMisura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITAMISURA$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITAMISURA$10);
            }
            target.setStringValue(unitaMisura);
        }
    }
    
    /**
     * Sets (as xml) the "UnitaMisura" element
     */
    public void xsetUnitaMisura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type unitaMisura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(UNITAMISURA$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().add_element_user(UNITAMISURA$10);
            }
            target.set(unitaMisura);
        }
    }
    
    /**
     * Unsets the "UnitaMisura" element
     */
    public void unsetUnitaMisura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITAMISURA$10, 0);
        }
    }
    
    /**
     * Gets the "DataInizioPeriodo" element
     */
    public java.util.Calendar getDataInizioPeriodo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINIZIOPERIODO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataInizioPeriodo" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataInizioPeriodo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAINIZIOPERIODO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataInizioPeriodo" element
     */
    public boolean isSetDataInizioPeriodo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINIZIOPERIODO$12) != 0;
        }
    }
    
    /**
     * Sets the "DataInizioPeriodo" element
     */
    public void setDataInizioPeriodo(java.util.Calendar dataInizioPeriodo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINIZIOPERIODO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINIZIOPERIODO$12);
            }
            target.setCalendarValue(dataInizioPeriodo);
        }
    }
    
    /**
     * Sets (as xml) the "DataInizioPeriodo" element
     */
    public void xsetDataInizioPeriodo(org.apache.xmlbeans.XmlDate dataInizioPeriodo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAINIZIOPERIODO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAINIZIOPERIODO$12);
            }
            target.set(dataInizioPeriodo);
        }
    }
    
    /**
     * Unsets the "DataInizioPeriodo" element
     */
    public void unsetDataInizioPeriodo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINIZIOPERIODO$12, 0);
        }
    }
    
    /**
     * Gets the "DataFinePeriodo" element
     */
    public java.util.Calendar getDataFinePeriodo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFINEPERIODO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataFinePeriodo" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataFinePeriodo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAFINEPERIODO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataFinePeriodo" element
     */
    public boolean isSetDataFinePeriodo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAFINEPERIODO$14) != 0;
        }
    }
    
    /**
     * Sets the "DataFinePeriodo" element
     */
    public void setDataFinePeriodo(java.util.Calendar dataFinePeriodo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAFINEPERIODO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAFINEPERIODO$14);
            }
            target.setCalendarValue(dataFinePeriodo);
        }
    }
    
    /**
     * Sets (as xml) the "DataFinePeriodo" element
     */
    public void xsetDataFinePeriodo(org.apache.xmlbeans.XmlDate dataFinePeriodo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAFINEPERIODO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAFINEPERIODO$14);
            }
            target.set(dataFinePeriodo);
        }
    }
    
    /**
     * Unsets the "DataFinePeriodo" element
     */
    public void unsetDataFinePeriodo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAFINEPERIODO$14, 0);
        }
    }
    
    /**
     * Gets the "PrezzoUnitario" element
     */
    public java.math.BigDecimal getPrezzoUnitario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREZZOUNITARIO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrezzoUnitario" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType xgetPrezzoUnitario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().find_element_user(PREZZOUNITARIO$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PrezzoUnitario" element
     */
    public void setPrezzoUnitario(java.math.BigDecimal prezzoUnitario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREZZOUNITARIO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREZZOUNITARIO$16);
            }
            target.setBigDecimalValue(prezzoUnitario);
        }
    }
    
    /**
     * Sets (as xml) the "PrezzoUnitario" element
     */
    public void xsetPrezzoUnitario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType prezzoUnitario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().find_element_user(PREZZOUNITARIO$16, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().add_element_user(PREZZOUNITARIO$16);
            }
            target.set(prezzoUnitario);
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
            get_store().find_all_element_users(SCONTOMAGGIORAZIONE$18, targetList);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType)get_store().find_element_user(SCONTOMAGGIORAZIONE$18, i);
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
            return get_store().count_elements(SCONTOMAGGIORAZIONE$18);
        }
    }
    
    /**
     * Sets array of all "ScontoMaggiorazione" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setScontoMaggiorazioneArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType[] scontoMaggiorazioneArray)
    {
        check_orphaned();
        arraySetterHelper(scontoMaggiorazioneArray, SCONTOMAGGIORAZIONE$18);
    }
    
    /**
     * Sets ith "ScontoMaggiorazione" element
     */
    public void setScontoMaggiorazioneArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType scontoMaggiorazione)
    {
        generatedSetterHelperImpl(scontoMaggiorazione, SCONTOMAGGIORAZIONE$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType)get_store().insert_element_user(SCONTOMAGGIORAZIONE$18, i);
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
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType)get_store().add_element_user(SCONTOMAGGIORAZIONE$18);
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
            get_store().remove_element(SCONTOMAGGIORAZIONE$18, i);
        }
    }
    
    /**
     * Gets the "PrezzoTotale" element
     */
    public java.math.BigDecimal getPrezzoTotale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREZZOTOTALE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrezzoTotale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType xgetPrezzoTotale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().find_element_user(PREZZOTOTALE$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "PrezzoTotale" element
     */
    public void setPrezzoTotale(java.math.BigDecimal prezzoTotale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREZZOTOTALE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREZZOTOTALE$20);
            }
            target.setBigDecimalValue(prezzoTotale);
        }
    }
    
    /**
     * Sets (as xml) the "PrezzoTotale" element
     */
    public void xsetPrezzoTotale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType prezzoTotale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().find_element_user(PREZZOTOTALE$20, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount8DecimalType)get_store().add_element_user(PREZZOTOTALE$20);
            }
            target.set(prezzoTotale);
        }
    }
    
    /**
     * Gets the "AliquotaIVA" element
     */
    public java.math.BigDecimal getAliquotaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIQUOTAIVA$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "AliquotaIVA" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetAliquotaIVA()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALIQUOTAIVA$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "AliquotaIVA" element
     */
    public void setAliquotaIVA(java.math.BigDecimal aliquotaIVA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIQUOTAIVA$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIQUOTAIVA$22);
            }
            target.setBigDecimalValue(aliquotaIVA);
        }
    }
    
    /**
     * Sets (as xml) the "AliquotaIVA" element
     */
    public void xsetAliquotaIVA(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType aliquotaIVA)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(ALIQUOTAIVA$22, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().add_element_user(ALIQUOTAIVA$22);
            }
            target.set(aliquotaIVA);
        }
    }
    
    /**
     * Gets the "Ritenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum getRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RITENUTA$24, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Ritenuta" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType xgetRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType)get_store().find_element_user(RITENUTA$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "Ritenuta" element
     */
    public boolean isSetRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RITENUTA$24) != 0;
        }
    }
    
    /**
     * Sets the "Ritenuta" element
     */
    public void setRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType.Enum ritenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RITENUTA$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RITENUTA$24);
            }
            target.setEnumValue(ritenuta);
        }
    }
    
    /**
     * Sets (as xml) the "Ritenuta" element
     */
    public void xsetRitenuta(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType ritenuta)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType)get_store().find_element_user(RITENUTA$24, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RitenutaType)get_store().add_element_user(RITENUTA$24);
            }
            target.set(ritenuta);
        }
    }
    
    /**
     * Unsets the "Ritenuta" element
     */
    public void unsetRitenuta()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RITENUTA$24, 0);
        }
    }
    
    /**
     * Gets the "Natura" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum getNatura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATURA$26, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Natura" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType xgetNatura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().find_element_user(NATURA$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "Natura" element
     */
    public boolean isSetNatura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NATURA$26) != 0;
        }
    }
    
    /**
     * Sets the "Natura" element
     */
    public void setNatura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType.Enum natura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATURA$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATURA$26);
            }
            target.setEnumValue(natura);
        }
    }
    
    /**
     * Sets (as xml) the "Natura" element
     */
    public void xsetNatura(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType natura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().find_element_user(NATURA$26, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NaturaType)get_store().add_element_user(NATURA$26);
            }
            target.set(natura);
        }
    }
    
    /**
     * Unsets the "Natura" element
     */
    public void unsetNatura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NATURA$26, 0);
        }
    }
    
    /**
     * Gets the "RiferimentoAmministrazione" element
     */
    public java.lang.String getRiferimentoAmministrazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "RiferimentoAmministrazione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type xgetRiferimentoAmministrazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "RiferimentoAmministrazione" element
     */
    public boolean isSetRiferimentoAmministrazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIFERIMENTOAMMINISTRAZIONE$28) != 0;
        }
    }
    
    /**
     * Sets the "RiferimentoAmministrazione" element
     */
    public void setRiferimentoAmministrazione(java.lang.String riferimentoAmministrazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTOAMMINISTRAZIONE$28);
            }
            target.setStringValue(riferimentoAmministrazione);
        }
    }
    
    /**
     * Sets (as xml) the "RiferimentoAmministrazione" element
     */
    public void xsetRiferimentoAmministrazione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type riferimentoAmministrazione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().find_element_user(RIFERIMENTOAMMINISTRAZIONE$28, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String20Type)get_store().add_element_user(RIFERIMENTOAMMINISTRAZIONE$28);
            }
            target.set(riferimentoAmministrazione);
        }
    }
    
    /**
     * Unsets the "RiferimentoAmministrazione" element
     */
    public void unsetRiferimentoAmministrazione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIFERIMENTOAMMINISTRAZIONE$28, 0);
        }
    }
    
    /**
     * Gets array of all "AltriDatiGestionali" elements
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType[] getAltriDatiGestionaliArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ALTRIDATIGESTIONALI$30, targetList);
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType[] result = new it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "AltriDatiGestionali" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType getAltriDatiGestionaliArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType)get_store().find_element_user(ALTRIDATIGESTIONALI$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "AltriDatiGestionali" element
     */
    public int sizeOfAltriDatiGestionaliArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALTRIDATIGESTIONALI$30);
        }
    }
    
    /**
     * Sets array of all "AltriDatiGestionali" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAltriDatiGestionaliArray(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType[] altriDatiGestionaliArray)
    {
        check_orphaned();
        arraySetterHelper(altriDatiGestionaliArray, ALTRIDATIGESTIONALI$30);
    }
    
    /**
     * Sets ith "AltriDatiGestionali" element
     */
    public void setAltriDatiGestionaliArray(int i, it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType altriDatiGestionali)
    {
        generatedSetterHelperImpl(altriDatiGestionali, ALTRIDATIGESTIONALI$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "AltriDatiGestionali" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType insertNewAltriDatiGestionali(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType)get_store().insert_element_user(ALTRIDATIGESTIONALI$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "AltriDatiGestionali" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType addNewAltriDatiGestionali()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AltriDatiGestionaliType)get_store().add_element_user(ALTRIDATIGESTIONALI$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "AltriDatiGestionali" element
     */
    public void removeAltriDatiGestionali(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALTRIDATIGESTIONALI$30, i);
        }
    }
}
