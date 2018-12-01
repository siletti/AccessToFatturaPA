/*
 * XML Type:  DatiTrasmissioneType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML DatiTrasmissioneType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class DatiTrasmissioneTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.DatiTrasmissioneType
{
    private static final long serialVersionUID = 1L;
    
    public DatiTrasmissioneTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IDTRASMITTENTE$0 = 
        new javax.xml.namespace.QName("", "IdTrasmittente");
    private static final javax.xml.namespace.QName PROGRESSIVOINVIO$2 = 
        new javax.xml.namespace.QName("", "ProgressivoInvio");
    private static final javax.xml.namespace.QName FORMATOTRASMISSIONE$4 = 
        new javax.xml.namespace.QName("", "FormatoTrasmissione");
    private static final javax.xml.namespace.QName CODICEDESTINATARIO$6 = 
        new javax.xml.namespace.QName("", "CodiceDestinatario");
    private static final javax.xml.namespace.QName CONTATTITRASMITTENTE$8 = 
        new javax.xml.namespace.QName("", "ContattiTrasmittente");
    private static final javax.xml.namespace.QName PECDESTINATARIO$10 = 
        new javax.xml.namespace.QName("", "PECDestinatario");
    
    
    /**
     * Gets the "IdTrasmittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType getIdTrasmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType)get_store().find_element_user(IDTRASMITTENTE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "IdTrasmittente" element
     */
    public void setIdTrasmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType idTrasmittente)
    {
        generatedSetterHelperImpl(idTrasmittente, IDTRASMITTENTE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "IdTrasmittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType addNewIdTrasmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.IdFiscaleType)get_store().add_element_user(IDTRASMITTENTE$0);
            return target;
        }
    }
    
    /**
     * Gets the "ProgressivoInvio" element
     */
    public java.lang.String getProgressivoInvio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRESSIVOINVIO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ProgressivoInvio" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetProgressivoInvio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(PROGRESSIVOINVIO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ProgressivoInvio" element
     */
    public void setProgressivoInvio(java.lang.String progressivoInvio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROGRESSIVOINVIO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROGRESSIVOINVIO$2);
            }
            target.setStringValue(progressivoInvio);
        }
    }
    
    /**
     * Sets (as xml) the "ProgressivoInvio" element
     */
    public void xsetProgressivoInvio(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type progressivoInvio)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(PROGRESSIVOINVIO$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().add_element_user(PROGRESSIVOINVIO$2);
            }
            target.set(progressivoInvio);
        }
    }
    
    /**
     * Gets the "FormatoTrasmissione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType.Enum getFormatoTrasmissione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATOTRASMISSIONE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FormatoTrasmissione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType xgetFormatoTrasmissione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType)get_store().find_element_user(FORMATOTRASMISSIONE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "FormatoTrasmissione" element
     */
    public void setFormatoTrasmissione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType.Enum formatoTrasmissione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATOTRASMISSIONE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMATOTRASMISSIONE$4);
            }
            target.setEnumValue(formatoTrasmissione);
        }
    }
    
    /**
     * Sets (as xml) the "FormatoTrasmissione" element
     */
    public void xsetFormatoTrasmissione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType formatoTrasmissione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType)get_store().find_element_user(FORMATOTRASMISSIONE$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.FormatoTrasmissioneType)get_store().add_element_user(FORMATOTRASMISSIONE$4);
            }
            target.set(formatoTrasmissione);
        }
    }
    
    /**
     * Gets the "CodiceDestinatario" element
     */
    public java.lang.String getCodiceDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEDESTINATARIO$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CodiceDestinatario" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType xgetCodiceDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType)get_store().find_element_user(CODICEDESTINATARIO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "CodiceDestinatario" element
     */
    public void setCodiceDestinatario(java.lang.String codiceDestinatario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODICEDESTINATARIO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODICEDESTINATARIO$6);
            }
            target.setStringValue(codiceDestinatario);
        }
    }
    
    /**
     * Sets (as xml) the "CodiceDestinatario" element
     */
    public void xsetCodiceDestinatario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType codiceDestinatario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType)get_store().find_element_user(CODICEDESTINATARIO$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.CodiceDestinatarioType)get_store().add_element_user(CODICEDESTINATARIO$6);
            }
            target.set(codiceDestinatario);
        }
    }
    
    /**
     * Gets the "ContattiTrasmittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType getContattiTrasmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType)get_store().find_element_user(CONTATTITRASMITTENTE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ContattiTrasmittente" element
     */
    public boolean isSetContattiTrasmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTATTITRASMITTENTE$8) != 0;
        }
    }
    
    /**
     * Sets the "ContattiTrasmittente" element
     */
    public void setContattiTrasmittente(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType contattiTrasmittente)
    {
        generatedSetterHelperImpl(contattiTrasmittente, CONTATTITRASMITTENTE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ContattiTrasmittente" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType addNewContattiTrasmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.ContattiTrasmittenteType)get_store().add_element_user(CONTATTITRASMITTENTE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "ContattiTrasmittente" element
     */
    public void unsetContattiTrasmittente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTATTITRASMITTENTE$8, 0);
        }
    }
    
    /**
     * Gets the "PECDestinatario" element
     */
    public java.lang.String getPECDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PECDESTINATARIO$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PECDestinatario" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType xgetPECDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().find_element_user(PECDESTINATARIO$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "PECDestinatario" element
     */
    public boolean isSetPECDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PECDESTINATARIO$10) != 0;
        }
    }
    
    /**
     * Sets the "PECDestinatario" element
     */
    public void setPECDestinatario(java.lang.String pecDestinatario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PECDESTINATARIO$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PECDESTINATARIO$10);
            }
            target.setStringValue(pecDestinatario);
        }
    }
    
    /**
     * Sets (as xml) the "PECDestinatario" element
     */
    public void xsetPECDestinatario(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType pecDestinatario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().find_element_user(PECDESTINATARIO$10, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.EmailType)get_store().add_element_user(PECDESTINATARIO$10);
            }
            target.set(pecDestinatario);
        }
    }
    
    /**
     * Unsets the "PECDestinatario" element
     */
    public void unsetPECDestinatario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PECDESTINATARIO$10, 0);
        }
    }
}
