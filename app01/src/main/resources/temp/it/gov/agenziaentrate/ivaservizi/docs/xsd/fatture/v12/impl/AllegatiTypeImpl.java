/*
 * XML Type:  AllegatiType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.impl;
/**
 * An XML AllegatiType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is a complex type.
 */
public class AllegatiTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.AllegatiType
{
    private static final long serialVersionUID = 1L;
    
    public AllegatiTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOMEATTACHMENT$0 = 
        new javax.xml.namespace.QName("", "NomeAttachment");
    private static final javax.xml.namespace.QName ALGORITMOCOMPRESSIONE$2 = 
        new javax.xml.namespace.QName("", "AlgoritmoCompressione");
    private static final javax.xml.namespace.QName FORMATOATTACHMENT$4 = 
        new javax.xml.namespace.QName("", "FormatoAttachment");
    private static final javax.xml.namespace.QName DESCRIZIONEATTACHMENT$6 = 
        new javax.xml.namespace.QName("", "DescrizioneAttachment");
    private static final javax.xml.namespace.QName ATTACHMENT$8 = 
        new javax.xml.namespace.QName("", "Attachment");
    
    
    /**
     * Gets the "NomeAttachment" element
     */
    public java.lang.String getNomeAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMEATTACHMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "NomeAttachment" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType xgetNomeAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(NOMEATTACHMENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "NomeAttachment" element
     */
    public void setNomeAttachment(java.lang.String nomeAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMEATTACHMENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMEATTACHMENT$0);
            }
            target.setStringValue(nomeAttachment);
        }
    }
    
    /**
     * Sets (as xml) the "NomeAttachment" element
     */
    public void xsetNomeAttachment(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType nomeAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().find_element_user(NOMEATTACHMENT$0, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String60LatinType)get_store().add_element_user(NOMEATTACHMENT$0);
            }
            target.set(nomeAttachment);
        }
    }
    
    /**
     * Gets the "AlgoritmoCompressione" element
     */
    public java.lang.String getAlgoritmoCompressione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALGORITMOCOMPRESSIONE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AlgoritmoCompressione" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetAlgoritmoCompressione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(ALGORITMOCOMPRESSIONE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "AlgoritmoCompressione" element
     */
    public boolean isSetAlgoritmoCompressione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALGORITMOCOMPRESSIONE$2) != 0;
        }
    }
    
    /**
     * Sets the "AlgoritmoCompressione" element
     */
    public void setAlgoritmoCompressione(java.lang.String algoritmoCompressione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALGORITMOCOMPRESSIONE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALGORITMOCOMPRESSIONE$2);
            }
            target.setStringValue(algoritmoCompressione);
        }
    }
    
    /**
     * Sets (as xml) the "AlgoritmoCompressione" element
     */
    public void xsetAlgoritmoCompressione(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type algoritmoCompressione)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(ALGORITMOCOMPRESSIONE$2, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().add_element_user(ALGORITMOCOMPRESSIONE$2);
            }
            target.set(algoritmoCompressione);
        }
    }
    
    /**
     * Unsets the "AlgoritmoCompressione" element
     */
    public void unsetAlgoritmoCompressione()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALGORITMOCOMPRESSIONE$2, 0);
        }
    }
    
    /**
     * Gets the "FormatoAttachment" element
     */
    public java.lang.String getFormatoAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATOATTACHMENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FormatoAttachment" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type xgetFormatoAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(FORMATOATTACHMENT$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "FormatoAttachment" element
     */
    public boolean isSetFormatoAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORMATOATTACHMENT$4) != 0;
        }
    }
    
    /**
     * Sets the "FormatoAttachment" element
     */
    public void setFormatoAttachment(java.lang.String formatoAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORMATOATTACHMENT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORMATOATTACHMENT$4);
            }
            target.setStringValue(formatoAttachment);
        }
    }
    
    /**
     * Sets (as xml) the "FormatoAttachment" element
     */
    public void xsetFormatoAttachment(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type formatoAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().find_element_user(FORMATOATTACHMENT$4, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String10Type)get_store().add_element_user(FORMATOATTACHMENT$4);
            }
            target.set(formatoAttachment);
        }
    }
    
    /**
     * Unsets the "FormatoAttachment" element
     */
    public void unsetFormatoAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORMATOATTACHMENT$4, 0);
        }
    }
    
    /**
     * Gets the "DescrizioneAttachment" element
     */
    public java.lang.String getDescrizioneAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIZIONEATTACHMENT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DescrizioneAttachment" element
     */
    public it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType xgetDescrizioneAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(DESCRIZIONEATTACHMENT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DescrizioneAttachment" element
     */
    public boolean isSetDescrizioneAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIZIONEATTACHMENT$6) != 0;
        }
    }
    
    /**
     * Sets the "DescrizioneAttachment" element
     */
    public void setDescrizioneAttachment(java.lang.String descrizioneAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIZIONEATTACHMENT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIZIONEATTACHMENT$6);
            }
            target.setStringValue(descrizioneAttachment);
        }
    }
    
    /**
     * Sets (as xml) the "DescrizioneAttachment" element
     */
    public void xsetDescrizioneAttachment(it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType descrizioneAttachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType target = null;
            target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().find_element_user(DESCRIZIONEATTACHMENT$6, 0);
            if (target == null)
            {
                target = (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.String100LatinType)get_store().add_element_user(DESCRIZIONEATTACHMENT$6);
            }
            target.set(descrizioneAttachment);
        }
    }
    
    /**
     * Unsets the "DescrizioneAttachment" element
     */
    public void unsetDescrizioneAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIZIONEATTACHMENT$6, 0);
        }
    }
    
    /**
     * Gets the "Attachment" element
     */
    public byte[] getAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "Attachment" element
     */
    public org.apache.xmlbeans.XmlBase64Binary xgetAttachment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ATTACHMENT$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "Attachment" element
     */
    public void setAttachment(byte[] attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTACHMENT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTACHMENT$8);
            }
            target.setByteArrayValue(attachment);
        }
    }
    
    /**
     * Sets (as xml) the "Attachment" element
     */
    public void xsetAttachment(org.apache.xmlbeans.XmlBase64Binary attachment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBase64Binary target = null;
            target = (org.apache.xmlbeans.XmlBase64Binary)get_store().find_element_user(ATTACHMENT$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBase64Binary)get_store().add_element_user(ATTACHMENT$8);
            }
            target.set(attachment);
        }
    }
}
