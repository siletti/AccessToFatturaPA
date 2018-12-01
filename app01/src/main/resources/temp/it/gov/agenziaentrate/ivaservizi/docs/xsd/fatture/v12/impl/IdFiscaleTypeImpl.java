/*
 * XML Type:  IdFiscaleType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML IdFiscaleType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class IdFiscaleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType
{
    private static final long serialVersionUID = 1L;
    
    public IdFiscaleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDPAESE$0 = 
        new javax.xml.namespace.QName("", "IdPaese");
    private static final javax.xml.namespace.QName IDCODICE$2 = 
        new javax.xml.namespace.QName("", "IdCodice");
    
    
    /**
     * Gets the "IdPaese" element
     */
    public java.lang.String getIdPaese()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPAESE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdPaese" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType xgetIdPaese()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType)get_store().find_element_user(IDPAESE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IdPaese" element
     */
    public void setIdPaese(java.lang.String idPaese)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDPAESE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDPAESE$0);
            }
            target.setStringValue(idPaese);
        }
    }
    
    /**
     * Sets (as xml) the "IdPaese" element
     */
    public void xsetIdPaese(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType idPaese)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType)get_store().find_element_user(IDPAESE$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.NazioneType)get_store().add_element_user(IDPAESE$0);
            }
            target.set(idPaese);
        }
    }
    
    /**
     * Gets the "IdCodice" element
     */
    public java.lang.String getIdCodice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCODICE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "IdCodice" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceType xgetIdCodice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceType)get_store().find_element_user(IDCODICE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "IdCodice" element
     */
    public void setIdCodice(java.lang.String idCodice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDCODICE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDCODICE$2);
            }
            target.setStringValue(idCodice);
        }
    }
    
    /**
     * Sets (as xml) the "IdCodice" element
     */
    public void xsetIdCodice(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceType idCodice)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceType)get_store().find_element_user(IDCODICE$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceType)get_store().add_element_user(IDCODICE$2);
            }
            target.set(idCodice);
        }
    }
}
