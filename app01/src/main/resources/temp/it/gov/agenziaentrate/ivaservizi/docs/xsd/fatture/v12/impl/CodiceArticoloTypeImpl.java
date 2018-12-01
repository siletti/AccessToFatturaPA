/*
 * XML Type:  CodiceArticoloType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML CodiceArticoloType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class CodiceArticoloTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceArticoloType
{
    private static final long serialVersionUID = 1L;
    
    public CodiceArticoloTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODICETIPO$0 = 
        new javax.xml.namespace.QName("", "CodiceTipo");
    private static final javax.xml.namespace.QName CODICEVALORE$2 = 
        new javax.xml.namespace.QName("", "CodiceValore");
    
    
    /**
     * Gets the "CodiceTipo" element
     */
    public java.lang.String getCodiceTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICETIPO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodiceTipo" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type xgetCodiceTipo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type)get_store().find_element_user(CODICETIPO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CodiceTipo" element
     */
    public void setCodiceTipo(java.lang.String codiceTipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICETIPO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICETIPO$0);
            }
            target.setStringValue(codiceTipo);
        }
    }
    
    /**
     * Sets (as xml) the "CodiceTipo" element
     */
    public void xsetCodiceTipo(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type codiceTipo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type)get_store().find_element_user(CODICETIPO$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type)get_store().add_element_user(CODICETIPO$0);
            }
            target.set(codiceTipo);
        }
    }
    
    /**
     * Gets the "CodiceValore" element
     */
    public java.lang.String getCodiceValore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEVALORE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodiceValore" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type xgetCodiceValore()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type)get_store().find_element_user(CODICEVALORE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CodiceValore" element
     */
    public void setCodiceValore(java.lang.String codiceValore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEVALORE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICEVALORE$2);
            }
            target.setStringValue(codiceValore);
        }
    }
    
    /**
     * Sets (as xml) the "CodiceValore" element
     */
    public void xsetCodiceValore(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type codiceValore)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type)get_store().find_element_user(CODICEVALORE$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String35Type)get_store().add_element_user(CODICEVALORE$2);
            }
            target.set(codiceValore);
        }
    }
}
