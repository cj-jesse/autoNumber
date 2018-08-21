/**
 * ZFI_EX_MESSAGE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com;

public class ZFI_EX_MESSAGE  implements java.io.Serializable {
    private java.lang.String FLG;

    private java.lang.String BUKRS;

    private java.lang.String ANLN1;

    private java.lang.String ANLN2;

    private java.lang.String STATUS;

    private java.lang.String MESSAGE;

    public ZFI_EX_MESSAGE() {
    }

    public ZFI_EX_MESSAGE(
           java.lang.String FLG,
           java.lang.String BUKRS,
           java.lang.String ANLN1,
           java.lang.String ANLN2,
           java.lang.String STATUS,
           java.lang.String MESSAGE) {
           this.FLG = FLG;
           this.BUKRS = BUKRS;
           this.ANLN1 = ANLN1;
           this.ANLN2 = ANLN2;
           this.STATUS = STATUS;
           this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the FLG value for this ZFI_EX_MESSAGE.
     * 
     * @return FLG
     */
    public java.lang.String getFLG() {
        return FLG;
    }


    /**
     * Sets the FLG value for this ZFI_EX_MESSAGE.
     * 
     * @param FLG
     */
    public void setFLG(java.lang.String FLG) {
        this.FLG = FLG;
    }


    /**
     * Gets the BUKRS value for this ZFI_EX_MESSAGE.
     * 
     * @return BUKRS
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this ZFI_EX_MESSAGE.
     * 
     * @param BUKRS
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the ANLN1 value for this ZFI_EX_MESSAGE.
     * 
     * @return ANLN1
     */
    public java.lang.String getANLN1() {
        return ANLN1;
    }


    /**
     * Sets the ANLN1 value for this ZFI_EX_MESSAGE.
     * 
     * @param ANLN1
     */
    public void setANLN1(java.lang.String ANLN1) {
        this.ANLN1 = ANLN1;
    }


    /**
     * Gets the ANLN2 value for this ZFI_EX_MESSAGE.
     * 
     * @return ANLN2
     */
    public java.lang.String getANLN2() {
        return ANLN2;
    }


    /**
     * Sets the ANLN2 value for this ZFI_EX_MESSAGE.
     * 
     * @param ANLN2
     */
    public void setANLN2(java.lang.String ANLN2) {
        this.ANLN2 = ANLN2;
    }


    /**
     * Gets the STATUS value for this ZFI_EX_MESSAGE.
     * 
     * @return STATUS
     */
    public java.lang.String getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this ZFI_EX_MESSAGE.
     * 
     * @param STATUS
     */
    public void setSTATUS(java.lang.String STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the MESSAGE value for this ZFI_EX_MESSAGE.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this ZFI_EX_MESSAGE.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZFI_EX_MESSAGE)) return false;
        ZFI_EX_MESSAGE other = (ZFI_EX_MESSAGE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.FLG==null && other.getFLG()==null) || 
             (this.FLG!=null &&
              this.FLG.equals(other.getFLG()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.ANLN1==null && other.getANLN1()==null) || 
             (this.ANLN1!=null &&
              this.ANLN1.equals(other.getANLN1()))) &&
            ((this.ANLN2==null && other.getANLN2()==null) || 
             (this.ANLN2!=null &&
              this.ANLN2.equals(other.getANLN2()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getFLG() != null) {
            _hashCode += getFLG().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getANLN1() != null) {
            _hashCode += getANLN1().hashCode();
        }
        if (getANLN2() != null) {
            _hashCode += getANLN2().hashCode();
        }
        if (getSTATUS() != null) {
            _hashCode += getSTATUS().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZFI_EX_MESSAGE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZFI_EX_MESSAGE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FLG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FLG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BUKRS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BUKRS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANLN1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ANLN1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ANLN2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ANLN2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
