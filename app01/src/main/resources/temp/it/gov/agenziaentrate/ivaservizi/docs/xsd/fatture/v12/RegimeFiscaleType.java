/*
 * XML Type:  RegimeFiscaleType
 * Namespace: http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2
 * Java type: it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType
 *
 * Automatically generated - do not modify.
 */
package it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12;


/**
 * An XML RegimeFiscaleType(@http://ivaservizi.agenziaentrate.gov.it/docs/xsd/fatture/v1.2).
 *
 * This is an atomic type that is a restriction of it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType.
 */
public interface RegimeFiscaleType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RegimeFiscaleType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s425119B3E0D4DCA09C42AACFFE35E234").resolveHandle("regimefiscaletype2b7atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum RF_01 = Enum.forString("RF01");
    static final Enum RF_02 = Enum.forString("RF02");
    static final Enum RF_04 = Enum.forString("RF04");
    static final Enum RF_05 = Enum.forString("RF05");
    static final Enum RF_06 = Enum.forString("RF06");
    static final Enum RF_07 = Enum.forString("RF07");
    static final Enum RF_08 = Enum.forString("RF08");
    static final Enum RF_09 = Enum.forString("RF09");
    static final Enum RF_10 = Enum.forString("RF10");
    static final Enum RF_11 = Enum.forString("RF11");
    static final Enum RF_12 = Enum.forString("RF12");
    static final Enum RF_13 = Enum.forString("RF13");
    static final Enum RF_14 = Enum.forString("RF14");
    static final Enum RF_15 = Enum.forString("RF15");
    static final Enum RF_16 = Enum.forString("RF16");
    static final Enum RF_17 = Enum.forString("RF17");
    static final Enum RF_19 = Enum.forString("RF19");
    static final Enum RF_18 = Enum.forString("RF18");
    
    static final int INT_RF_01 = Enum.INT_RF_01;
    static final int INT_RF_02 = Enum.INT_RF_02;
    static final int INT_RF_04 = Enum.INT_RF_04;
    static final int INT_RF_05 = Enum.INT_RF_05;
    static final int INT_RF_06 = Enum.INT_RF_06;
    static final int INT_RF_07 = Enum.INT_RF_07;
    static final int INT_RF_08 = Enum.INT_RF_08;
    static final int INT_RF_09 = Enum.INT_RF_09;
    static final int INT_RF_10 = Enum.INT_RF_10;
    static final int INT_RF_11 = Enum.INT_RF_11;
    static final int INT_RF_12 = Enum.INT_RF_12;
    static final int INT_RF_13 = Enum.INT_RF_13;
    static final int INT_RF_14 = Enum.INT_RF_14;
    static final int INT_RF_15 = Enum.INT_RF_15;
    static final int INT_RF_16 = Enum.INT_RF_16;
    static final int INT_RF_17 = Enum.INT_RF_17;
    static final int INT_RF_19 = Enum.INT_RF_19;
    static final int INT_RF_18 = Enum.INT_RF_18;
    
    /**
     * Enumeration value class for it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_RF_01
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_RF_01 = 1;
        static final int INT_RF_02 = 2;
        static final int INT_RF_04 = 3;
        static final int INT_RF_05 = 4;
        static final int INT_RF_06 = 5;
        static final int INT_RF_07 = 6;
        static final int INT_RF_08 = 7;
        static final int INT_RF_09 = 8;
        static final int INT_RF_10 = 9;
        static final int INT_RF_11 = 10;
        static final int INT_RF_12 = 11;
        static final int INT_RF_13 = 12;
        static final int INT_RF_14 = 13;
        static final int INT_RF_15 = 14;
        static final int INT_RF_16 = 15;
        static final int INT_RF_17 = 16;
        static final int INT_RF_19 = 17;
        static final int INT_RF_18 = 18;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("RF01", INT_RF_01),
                new Enum("RF02", INT_RF_02),
                new Enum("RF04", INT_RF_04),
                new Enum("RF05", INT_RF_05),
                new Enum("RF06", INT_RF_06),
                new Enum("RF07", INT_RF_07),
                new Enum("RF08", INT_RF_08),
                new Enum("RF09", INT_RF_09),
                new Enum("RF10", INT_RF_10),
                new Enum("RF11", INT_RF_11),
                new Enum("RF12", INT_RF_12),
                new Enum("RF13", INT_RF_13),
                new Enum("RF14", INT_RF_14),
                new Enum("RF15", INT_RF_15),
                new Enum("RF16", INT_RF_16),
                new Enum("RF17", INT_RF_17),
                new Enum("RF19", INT_RF_19),
                new Enum("RF18", INT_RF_18),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType newValue(java.lang.Object obj) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) type.newValue( obj ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType newInstance() {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (it.gov.agenziaentrate.ivaservizi.docs.xsd.fatture.v12.RegimeFiscaleType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
