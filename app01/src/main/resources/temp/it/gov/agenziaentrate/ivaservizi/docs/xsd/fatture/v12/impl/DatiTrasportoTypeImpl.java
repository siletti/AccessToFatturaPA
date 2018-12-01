/*
 * XML Type:  DatiTrasportoType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiTrasportoType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiTrasportoTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasportoType
{
    private static final long serialVersionUID = 1L;
    
    public DatiTrasportoTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATIANAGRAFICIVETTORE$0 = 
        new javax.xml.namespace.QName("", "DatiAnagraficiVettore");
    private static final javax.xml.namespace.QName MEZZOTRASPORTO$2 = 
        new javax.xml.namespace.QName("", "MezzoTrasporto");
    private static final javax.xml.namespace.QName CAUSALETRASPORTO$4 = 
        new javax.xml.namespace.QName("", "CausaleTrasporto");
    private static final javax.xml.namespace.QName NUMEROCOLLI$6 = 
        new javax.xml.namespace.QName("", "NumeroColli");
    private static final javax.xml.namespace.QName DESCRIZIONE$8 = 
        new javax.xml.namespace.QName("", "Descrizione");
    private static final javax.xml.namespace.QName UNITAMISURAPESO$10 = 
        new javax.xml.namespace.QName("", "UnitaMisuraPeso");
    private static final javax.xml.namespace.QName PESOLORDO$12 = 
        new javax.xml.namespace.QName("", "PesoLordo");
    private static final javax.xml.namespace.QName PESONETTO$14 = 
        new javax.xml.namespace.QName("", "PesoNetto");
    private static final javax.xml.namespace.QName DATAORARITIRO$16 = 
        new javax.xml.namespace.QName("", "DataOraRitiro");
    private static final javax.xml.namespace.QName DATAINIZIOTRASPORTO$18 = 
        new javax.xml.namespace.QName("", "DataInizioTrasporto");
    private static final javax.xml.namespace.QName TIPORESA$20 = 
        new javax.xml.namespace.QName("", "TipoResa");
    private static final javax.xml.namespace.QName INDIRIZZORESA$22 = 
        new javax.xml.namespace.QName("", "IndirizzoResa");
    private static final javax.xml.namespace.QName DATAORACONSEGNA$24 = 
        new javax.xml.namespace.QName("", "DataOraConsegna");
    
    
    /**
     * Gets the "DatiAnagraficiVettore" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType getDatiAnagraficiVettore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType)get_store().find_element_user(DATIANAGRAFICIVETTORE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DatiAnagraficiVettore" element
     */
    public boolean isSetDatiAnagraficiVettore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATIANAGRAFICIVETTORE$0) != 0;
        }
    }
    
    /**
     * Sets the "DatiAnagraficiVettore" element
     */
    public void setDatiAnagraficiVettore(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType datiAnagraficiVettore)
    {
        generatedSetterHelperImpl(datiAnagraficiVettore, DATIANAGRAFICIVETTORE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiAnagraficiVettore" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType addNewDatiAnagraficiVettore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiVettoreType)get_store().add_element_user(DATIANAGRAFICIVETTORE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "DatiAnagraficiVettore" element
     */
    public void unsetDatiAnagraficiVettore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATIANAGRAFICIVETTORE$0, 0);
        }
    }
    
    /**
     * Gets the "MezzoTrasporto" element
     */
    public java.lang.String getMezzoTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEZZOTRASPORTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MezzoTrasporto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType xgetMezzoTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().find_element_user(MEZZOTRASPORTO$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MezzoTrasporto" element
     */
    public boolean isSetMezzoTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEZZOTRASPORTO$2) != 0;
        }
    }
    
    /**
     * Sets the "MezzoTrasporto" element
     */
    public void setMezzoTrasporto(java.lang.String mezzoTrasporto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MEZZOTRASPORTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MEZZOTRASPORTO$2);
            }
            target.setStringValue(mezzoTrasporto);
        }
    }
    
    /**
     * Sets (as xml) the "MezzoTrasporto" element
     */
    public void xsetMezzoTrasporto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType mezzoTrasporto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().find_element_user(MEZZOTRASPORTO$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String80LatinType)get_store().add_element_user(MEZZOTRASPORTO$2);
            }
            target.set(mezzoTrasporto);
        }
    }
    
    /**
     * Unsets the "MezzoTrasporto" element
     */
    public void unsetMezzoTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEZZOTRASPORTO$2, 0);
        }
    }
    
    /**
     * Gets the "CausaleTrasporto" element
     */
    public java.lang.String getCausaleTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAUSALETRASPORTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CausaleTrasporto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetCausaleTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(CAUSALETRASPORTO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CausaleTrasporto" element
     */
    public boolean isSetCausaleTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAUSALETRASPORTO$4) != 0;
        }
    }
    
    /**
     * Sets the "CausaleTrasporto" element
     */
    public void setCausaleTrasporto(java.lang.String causaleTrasporto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAUSALETRASPORTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAUSALETRASPORTO$4);
            }
            target.setStringValue(causaleTrasporto);
        }
    }
    
    /**
     * Sets (as xml) the "CausaleTrasporto" element
     */
    public void xsetCausaleTrasporto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType causaleTrasporto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(CAUSALETRASPORTO$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().add_element_user(CAUSALETRASPORTO$4);
            }
            target.set(causaleTrasporto);
        }
    }
    
    /**
     * Unsets the "CausaleTrasporto" element
     */
    public void unsetCausaleTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAUSALETRASPORTO$4, 0);
        }
    }
    
    /**
     * Gets the "NumeroColli" element
     */
    public int getNumeroColli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROCOLLI$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumeroColli" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType xgetNumeroColli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType)get_store().find_element_user(NUMEROCOLLI$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumeroColli" element
     */
    public boolean isSetNumeroColli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMEROCOLLI$6) != 0;
        }
    }
    
    /**
     * Sets the "NumeroColli" element
     */
    public void setNumeroColli(int numeroColli)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROCOLLI$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROCOLLI$6);
            }
            target.setIntValue(numeroColli);
        }
    }
    
    /**
     * Sets (as xml) the "NumeroColli" element
     */
    public void xsetNumeroColli(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType numeroColli)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType)get_store().find_element_user(NUMEROCOLLI$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NumeroColliType)get_store().add_element_user(NUMEROCOLLI$6);
            }
            target.set(numeroColli);
        }
    }
    
    /**
     * Unsets the "NumeroColli" element
     */
    public void unsetNumeroColli()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMEROCOLLI$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIZIONE$8, 0);
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
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetDescrizione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(DESCRIZIONE$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "Descrizione" element
     */
    public boolean isSetDescrizione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIZIONE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIZIONE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIZIONE$8);
            }
            target.setStringValue(descrizione);
        }
    }
    
    /**
     * Sets (as xml) the "Descrizione" element
     */
    public void xsetDescrizione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType descrizione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(DESCRIZIONE$8, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().add_element_user(DESCRIZIONE$8);
            }
            target.set(descrizione);
        }
    }
    
    /**
     * Unsets the "Descrizione" element
     */
    public void unsetDescrizione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIZIONE$8, 0);
        }
    }
    
    /**
     * Gets the "UnitaMisuraPeso" element
     */
    public java.lang.String getUnitaMisuraPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITAMISURAPESO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "UnitaMisuraPeso" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetUnitaMisuraPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(UNITAMISURAPESO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "UnitaMisuraPeso" element
     */
    public boolean isSetUnitaMisuraPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITAMISURAPESO$10) != 0;
        }
    }
    
    /**
     * Sets the "UnitaMisuraPeso" element
     */
    public void setUnitaMisuraPeso(java.lang.String unitaMisuraPeso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNITAMISURAPESO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNITAMISURAPESO$10);
            }
            target.setStringValue(unitaMisuraPeso);
        }
    }
    
    /**
     * Sets (as xml) the "UnitaMisuraPeso" element
     */
    public void xsetUnitaMisuraPeso(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type unitaMisuraPeso)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(UNITAMISURAPESO$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().add_element_user(UNITAMISURAPESO$10);
            }
            target.set(unitaMisuraPeso);
        }
    }
    
    /**
     * Unsets the "UnitaMisuraPeso" element
     */
    public void unsetUnitaMisuraPeso()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITAMISURAPESO$10, 0);
        }
    }
    
    /**
     * Gets the "PesoLordo" element
     */
    public java.math.BigDecimal getPesoLordo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PESOLORDO$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PesoLordo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType xgetPesoLordo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType)get_store().find_element_user(PESOLORDO$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "PesoLordo" element
     */
    public boolean isSetPesoLordo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PESOLORDO$12) != 0;
        }
    }
    
    /**
     * Sets the "PesoLordo" element
     */
    public void setPesoLordo(java.math.BigDecimal pesoLordo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PESOLORDO$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PESOLORDO$12);
            }
            target.setBigDecimalValue(pesoLordo);
        }
    }
    
    /**
     * Sets (as xml) the "PesoLordo" element
     */
    public void xsetPesoLordo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType pesoLordo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType)get_store().find_element_user(PESOLORDO$12, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType)get_store().add_element_user(PESOLORDO$12);
            }
            target.set(pesoLordo);
        }
    }
    
    /**
     * Unsets the "PesoLordo" element
     */
    public void unsetPesoLordo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PESOLORDO$12, 0);
        }
    }
    
    /**
     * Gets the "PesoNetto" element
     */
    public java.math.BigDecimal getPesoNetto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PESONETTO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "PesoNetto" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType xgetPesoNetto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType)get_store().find_element_user(PESONETTO$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "PesoNetto" element
     */
    public boolean isSetPesoNetto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PESONETTO$14) != 0;
        }
    }
    
    /**
     * Sets the "PesoNetto" element
     */
    public void setPesoNetto(java.math.BigDecimal pesoNetto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PESONETTO$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PESONETTO$14);
            }
            target.setBigDecimalValue(pesoNetto);
        }
    }
    
    /**
     * Sets (as xml) the "PesoNetto" element
     */
    public void xsetPesoNetto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType pesoNetto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType)get_store().find_element_user(PESONETTO$14, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.PesoType)get_store().add_element_user(PESONETTO$14);
            }
            target.set(pesoNetto);
        }
    }
    
    /**
     * Unsets the "PesoNetto" element
     */
    public void unsetPesoNetto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PESONETTO$14, 0);
        }
    }
    
    /**
     * Gets the "DataOraRitiro" element
     */
    public java.util.Calendar getDataOraRitiro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAORARITIRO$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataOraRitiro" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataOraRitiro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAORARITIRO$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataOraRitiro" element
     */
    public boolean isSetDataOraRitiro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAORARITIRO$16) != 0;
        }
    }
    
    /**
     * Sets the "DataOraRitiro" element
     */
    public void setDataOraRitiro(java.util.Calendar dataOraRitiro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAORARITIRO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAORARITIRO$16);
            }
            target.setCalendarValue(dataOraRitiro);
        }
    }
    
    /**
     * Sets (as xml) the "DataOraRitiro" element
     */
    public void xsetDataOraRitiro(org.apache.xmlbeans.XmlDateTime dataOraRitiro)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAORARITIRO$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAORARITIRO$16);
            }
            target.set(dataOraRitiro);
        }
    }
    
    /**
     * Unsets the "DataOraRitiro" element
     */
    public void unsetDataOraRitiro()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAORARITIRO$16, 0);
        }
    }
    
    /**
     * Gets the "DataInizioTrasporto" element
     */
    public java.util.Calendar getDataInizioTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINIZIOTRASPORTO$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataInizioTrasporto" element
     */
    public org.apache.xmlbeans.XmlDate xgetDataInizioTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAINIZIOTRASPORTO$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataInizioTrasporto" element
     */
    public boolean isSetDataInizioTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAINIZIOTRASPORTO$18) != 0;
        }
    }
    
    /**
     * Sets the "DataInizioTrasporto" element
     */
    public void setDataInizioTrasporto(java.util.Calendar dataInizioTrasporto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAINIZIOTRASPORTO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAINIZIOTRASPORTO$18);
            }
            target.setCalendarValue(dataInizioTrasporto);
        }
    }
    
    /**
     * Sets (as xml) the "DataInizioTrasporto" element
     */
    public void xsetDataInizioTrasporto(org.apache.xmlbeans.XmlDate dataInizioTrasporto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(DATAINIZIOTRASPORTO$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(DATAINIZIOTRASPORTO$18);
            }
            target.set(dataInizioTrasporto);
        }
    }
    
    /**
     * Unsets the "DataInizioTrasporto" element
     */
    public void unsetDataInizioTrasporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAINIZIOTRASPORTO$18, 0);
        }
    }
    
    /**
     * Gets the "TipoResa" element
     */
    public java.lang.String getTipoResa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPORESA$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TipoResa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType xgetTipoResa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType)get_store().find_element_user(TIPORESA$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "TipoResa" element
     */
    public boolean isSetTipoResa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIPORESA$20) != 0;
        }
    }
    
    /**
     * Sets the "TipoResa" element
     */
    public void setTipoResa(java.lang.String tipoResa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPORESA$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPORESA$20);
            }
            target.setStringValue(tipoResa);
        }
    }
    
    /**
     * Sets (as xml) the "TipoResa" element
     */
    public void xsetTipoResa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType tipoResa)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType)get_store().find_element_user(TIPORESA$20, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoResaType)get_store().add_element_user(TIPORESA$20);
            }
            target.set(tipoResa);
        }
    }
    
    /**
     * Unsets the "TipoResa" element
     */
    public void unsetTipoResa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIPORESA$20, 0);
        }
    }
    
    /**
     * Gets the "IndirizzoResa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType getIndirizzoResa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType)get_store().find_element_user(INDIRIZZORESA$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "IndirizzoResa" element
     */
    public boolean isSetIndirizzoResa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INDIRIZZORESA$22) != 0;
        }
    }
    
    /**
     * Sets the "IndirizzoResa" element
     */
    public void setIndirizzoResa(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType indirizzoResa)
    {
        generatedSetterHelperImpl(indirizzoResa, INDIRIZZORESA$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IndirizzoResa" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType addNewIndirizzoResa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IndirizzoType)get_store().add_element_user(INDIRIZZORESA$22);
            return target;
        }
    }
    
    /**
     * Unsets the "IndirizzoResa" element
     */
    public void unsetIndirizzoResa()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INDIRIZZORESA$22, 0);
        }
    }
    
    /**
     * Gets the "DataOraConsegna" element
     */
    public java.util.Calendar getDataOraConsegna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAORACONSEGNA$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DataOraConsegna" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetDataOraConsegna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAORACONSEGNA$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "DataOraConsegna" element
     */
    public boolean isSetDataOraConsegna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAORACONSEGNA$24) != 0;
        }
    }
    
    /**
     * Sets the "DataOraConsegna" element
     */
    public void setDataOraConsegna(java.util.Calendar dataOraConsegna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DATAORACONSEGNA$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DATAORACONSEGNA$24);
            }
            target.setCalendarValue(dataOraConsegna);
        }
    }
    
    /**
     * Sets (as xml) the "DataOraConsegna" element
     */
    public void xsetDataOraConsegna(org.apache.xmlbeans.XmlDateTime dataOraConsegna)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(DATAORACONSEGNA$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(DATAORACONSEGNA$24);
            }
            target.set(dataOraConsegna);
        }
    }
    
    /**
     * Unsets the "DataOraConsegna" element
     */
    public void unsetDataOraConsegna()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAORACONSEGNA$24, 0);
        }
    }
}
