/*
 * XML Type:  RappresentanteFiscaleType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML RappresentanteFiscaleType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class RappresentanteFiscaleTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RappresentanteFiscaleType
{
    private static final long serialVersionUID = 1L;
    
    public RappresentanteFiscaleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATIANAGRAFICI$0 = 
        new javax.xml.namespace.QName("", "DatiAnagrafici");
    
    
    /**
     * Gets the "DatiAnagrafici" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiRappresentanteType getDatiAnagrafici()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiRappresentanteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiRappresentanteType)get_store().find_element_user(DATIANAGRAFICI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DatiAnagrafici" element
     */
    public void setDatiAnagrafici(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiRappresentanteType datiAnagrafici)
    {
        generatedSetterHelperImpl(datiAnagrafici, DATIANAGRAFICI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DatiAnagrafici" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiRappresentanteType addNewDatiAnagrafici()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiRappresentanteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiAnagraficiRappresentanteType)get_store().add_element_user(DATIANAGRAFICI$0);
            return target;
        }
    }
}
