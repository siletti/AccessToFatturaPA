/*
 * XML Type:  DatiSALType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiSALType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiSALTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiSALType
{
    private static final long serialVersionUID = 1L;
    
    public DatiSALTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RIFERIMENTOFASE$0 = 
        new javax.xml.namespace.QName("", "RiferimentoFase");
    
    
    /**
     * Gets the "RiferimentoFase" element
     */
    public int getRiferimentoFase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOFASE$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "RiferimentoFase" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoFaseType xgetRiferimentoFase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoFaseType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoFaseType)get_store().find_element_user(RIFERIMENTOFASE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "RiferimentoFase" element
     */
    public void setRiferimentoFase(int riferimentoFase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIFERIMENTOFASE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIFERIMENTOFASE$0);
            }
            target.setIntValue(riferimentoFase);
        }
    }
    
    /**
     * Sets (as xml) the "RiferimentoFase" element
     */
    public void xsetRiferimentoFase(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoFaseType riferimentoFase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoFaseType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoFaseType)get_store().find_element_user(RIFERIMENTOFASE$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RiferimentoFaseType)get_store().add_element_user(RIFERIMENTOFASE$0);
            }
            target.set(riferimentoFase);
        }
    }
}
