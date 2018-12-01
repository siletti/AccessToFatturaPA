/*
 * XML Type:  DatiBolloType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiBolloType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiBolloTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiBolloType
{
    private static final long serialVersionUID = 1L;
    
    public DatiBolloTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOLLOVIRTUALE$0 = 
        new javax.xml.namespace.QName("", "BolloVirtuale");
    private static final javax.xml.namespace.QName IMPORTOBOLLO$2 = 
        new javax.xml.namespace.QName("", "ImportoBollo");
    
    
    /**
     * Gets the "BolloVirtuale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType.Enum getBolloVirtuale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLLOVIRTUALE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "BolloVirtuale" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType xgetBolloVirtuale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType)get_store().find_element_user(BOLLOVIRTUALE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "BolloVirtuale" element
     */
    public void setBolloVirtuale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType.Enum bolloVirtuale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOLLOVIRTUALE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOLLOVIRTUALE$0);
            }
            target.setEnumValue(bolloVirtuale);
        }
    }
    
    /**
     * Sets (as xml) the "BolloVirtuale" element
     */
    public void xsetBolloVirtuale(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType bolloVirtuale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType)get_store().find_element_user(BOLLOVIRTUALE$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.BolloVirtualeType)get_store().add_element_user(BOLLOVIRTUALE$0);
            }
            target.set(bolloVirtuale);
        }
    }
    
    /**
     * Gets the "ImportoBollo" element
     */
    public java.math.BigDecimal getImportoBollo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTOBOLLO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportoBollo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType xgetImportoBollo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTOBOLLO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ImportoBollo" element
     */
    public void setImportoBollo(java.math.BigDecimal importoBollo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTOBOLLO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTOBOLLO$2);
            }
            target.setBigDecimalValue(importoBollo);
        }
    }
    
    /**
     * Sets (as xml) the "ImportoBollo" element
     */
    public void xsetImportoBollo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType importoBollo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().find_element_user(IMPORTOBOLLO$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.Amount2DecimalType)get_store().add_element_user(IMPORTOBOLLO$2);
            }
            target.set(importoBollo);
        }
    }
}
