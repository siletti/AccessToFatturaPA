/*
 * XML Type:  ScontoMaggiorazioneType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML ScontoMaggiorazioneType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class ScontoMaggiorazioneTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ScontoMaggiorazioneType
{
    private static final long serialVersionUID = 1L;
    
    public ScontoMaggiorazioneTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TIPO$0 = 
        new javax.xml.namespace.QName("", "Tipo");
    private static final javax.xml.namespace.QName PERCENTUALE$2 = 
        new javax.xml.namespace.QName("", "Percentuale");
    private static final javax.xml.namespace.QName IMPORTO$4 = 
        new javax.xml.namespace.QName("", "Importo");
    
    
    /**
     * Gets the "Tipo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType.Enum getTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$0, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Tipo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType xgetTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType)get_store().find_element_user(TIPO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Tipo" element
     */
    public void setTipo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType.Enum tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIPO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIPO$0);
            }
            target.setEnumValue(tipo);
        }
    }
    
    /**
     * Sets (as xml) the "Tipo" element
     */
    public void xsetTipo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType tipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType)get_store().find_element_user(TIPO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.TipoScontoMaggiorazioneType)get_store().add_element_user(TIPO$0);
            }
            target.set(tipo);
        }
    }
    
    /**
     * Gets the "Percentuale" element
     */
    public java.math.BigDecimal getPercentuale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTUALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Percentuale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType xgetPercentuale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(PERCENTUALE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Percentuale" element
     */
    public boolean isSetPercentuale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERCENTUALE$2) != 0;
        }
    }
    
    /**
     * Sets the "Percentuale" element
     */
    public void setPercentuale(java.math.BigDecimal percentuale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PERCENTUALE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PERCENTUALE$2);
            }
            target.setBigDecimalValue(percentuale);
        }
    }
    
    /**
     * Sets (as xml) the "Percentuale" element
     */
    public void xsetPercentuale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType percentuale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().find_element_user(PERCENTUALE$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RateType)get_store().add_element_user(PERCENTUALE$2);
            }
            target.set(percentuale);
        }
    }
    
    /**
     * Unsets the "Percentuale" element
     */
    public void unsetPercentuale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERCENTUALE$2, 0);
        }
    }
    
    /**
     * Gets the "Importo" element
     */
    public java.math.BigDecimal getImporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "Importo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Importo" element
     */
    public boolean isSetImporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTO$4) != 0;
        }
    }
    
    /**
     * Sets the "Importo" element
     */
    public void setImporto(java.math.BigDecimal importo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTO$4);
            }
            target.setBigDecimalValue(importo);
        }
    }
    
    /**
     * Sets (as xml) the "Importo" element
     */
    public void xsetImporto(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTO$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPORTO$4);
            }
            target.set(importo);
        }
    }
    
    /**
     * Unsets the "Importo" element
     */
    public void unsetImporto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTO$4, 0);
        }
    }
}
