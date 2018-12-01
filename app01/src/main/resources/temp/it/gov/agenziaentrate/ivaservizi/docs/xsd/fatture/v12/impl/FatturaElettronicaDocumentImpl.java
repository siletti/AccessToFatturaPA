/*
 * An XML document type.
 * Localname: FatturaElettronica
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaDocument
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * A document containing one FatturaElettronica(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2) element.
 *
 * This is a complex type.
 */
public class FatturaElettronicaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaDocument
{
    private static final long serialVersionUID = 1L;
    
    public FatturaElettronicaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FATTURAELETTRONICA$0 = 
        new javax.xml.namespace.QName("http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2", "FatturaElettronica");
    
    
    /**
     * Gets the "FatturaElettronica" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType getFatturaElettronica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType)get_store().find_element_user(FATTURAELETTRONICA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "FatturaElettronica" element
     */
    public void setFatturaElettronica(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType fatturaElettronica)
    {
        generatedSetterHelperImpl(fatturaElettronica, FATTURAELETTRONICA$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "FatturaElettronica" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType addNewFatturaElettronica()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FatturaElettronicaType)get_store().add_element_user(FATTURAELETTRONICA$0);
            return target;
        }
    }
}
