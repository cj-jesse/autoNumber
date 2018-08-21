/**
 * ZPM_INFORMATION.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com;

public class ZPM_INFORMATION  implements java.io.Serializable {
    private java.lang.String OA_ID;

    private java.lang.String BUKRS;

    private java.lang.String ANLN1;

    private java.lang.String MENGE;

    private java.lang.String MEINS;

    private java.lang.String DMBTR;

    private java.lang.String MSG;

    private java.lang.String MESSAGE;

    private java.lang.String UDP1;

    private java.lang.String UDP2;

    private java.lang.String UDP3;

    public ZPM_INFORMATION() {
    }

    public ZPM_INFORMATION(
           java.lang.String OA_ID,
           java.lang.String BUKRS,
           java.lang.String ANLN1,
           java.lang.String MENGE,
           java.lang.String MEINS,
           java.lang.String DMBTR,
           java.lang.String MSG,
           java.lang.String MESSAGE,
           java.lang.String UDP1,
           java.lang.String UDP2,
           java.lang.String UDP3) {
           this.OA_ID = OA_ID;
           this.BUKRS = BUKRS;
           this.ANLN1 = ANLN1;
           this.MENGE = MENGE;
           this.MEINS = MEINS;
           this.DMBTR = DMBTR;
           this.MSG = MSG;
           this.MESSAGE = MESSAGE;
           this.UDP1 = UDP1;
           this.UDP2 = UDP2;
           this.UDP3 = UDP3;
    }


    /**
     * Gets the OA_ID value for this ZPM_INFORMATION.
     * 
     * @return OA_ID
     */
    public java.lang.String getOA_ID() {
        return OA_ID;
    }


    /**
     * Sets the OA_ID value for this ZPM_INFORMATION.
     * 
     * @param OA_ID
     */
    public void setOA_ID(java.lang.String OA_ID) {
        this.OA_ID = OA_ID;
    }


    /**
     * Gets the BUKRS value for this ZPM_INFORMATION.
     * 
     * @return BUKRS
     */
    public java.lang.String getBUKRS() {
        return BUKRS;
    }


    /**
     * Sets the BUKRS value for this ZPM_INFORMATION.
     * 
     * @param BUKRS
     */
    public void setBUKRS(java.lang.String BUKRS) {
        this.BUKRS = BUKRS;
    }


    /**
     * Gets the ANLN1 value for this ZPM_INFORMATION.
     * 
     * @return ANLN1
     */
    public java.lang.String getANLN1() {
        return ANLN1;
    }


    /**
     * Sets the ANLN1 value for this ZPM_INFORMATION.
     * 
     * @param ANLN1
     */
    public void setANLN1(java.lang.String ANLN1) {
        this.ANLN1 = ANLN1;
    }


    /**
     * Gets the MENGE value for this ZPM_INFORMATION.
     * 
     * @return MENGE
     */
    public java.lang.String getMENGE() {
        return MENGE;
    }


    /**
     * Sets the MENGE value for this ZPM_INFORMATION.
     * 
     * @param MENGE
     */
    public void setMENGE(java.lang.String MENGE) {
        this.MENGE = MENGE;
    }


    /**
     * Gets the MEINS value for this ZPM_INFORMATION.
     * 
     * @return MEINS
     */
    public java.lang.String getMEINS() {
        return MEINS;
    }


    /**
     * Sets the MEINS value for this ZPM_INFORMATION.
     * 
     * @param MEINS
     */
    public void setMEINS(java.lang.String MEINS) {
        this.MEINS = MEINS;
    }


    /**
     * Gets the DMBTR value for this ZPM_INFORMATION.
     * 
     * @return DMBTR
     */
    public java.lang.String getDMBTR() {
        return DMBTR;
    }


    /**
     * Sets the DMBTR value for this ZPM_INFORMATION.
     * 
     * @param DMBTR
     */
    public void setDMBTR(java.lang.String DMBTR) {
        this.DMBTR = DMBTR;
    }


    /**
     * Gets the MSG value for this ZPM_INFORMATION.
     * 
     * @return MSG
     */
    public java.lang.String getMSG() {
        return MSG;
    }


    /**
     * Sets the MSG value for this ZPM_INFORMATION.
     * 
     * @param MSG
     */
    public void setMSG(java.lang.String MSG) {
        this.MSG = MSG;
    }


    /**
     * Gets the MESSAGE value for this ZPM_INFORMATION.
     * 
     * @return MESSAGE
     */
    public java.lang.String getMESSAGE() {
        return MESSAGE;
    }


    /**
     * Sets the MESSAGE value for this ZPM_INFORMATION.
     * 
     * @param MESSAGE
     */
    public void setMESSAGE(java.lang.String MESSAGE) {
        this.MESSAGE = MESSAGE;
    }


    /**
     * Gets the UDP1 value for this ZPM_INFORMATION.
     * 
     * @return UDP1
     */
    public java.lang.String getUDP1() {
        return UDP1;
    }


    /**
     * Sets the UDP1 value for this ZPM_INFORMATION.
     * 
     * @param UDP1
     */
    public void setUDP1(java.lang.String UDP1) {
        this.UDP1 = UDP1;
    }


    /**
     * Gets the UDP2 value for this ZPM_INFORMATION.
     * 
     * @return UDP2
     */
    public java.lang.String getUDP2() {
        return UDP2;
    }


    /**
     * Sets the UDP2 value for this ZPM_INFORMATION.
     * 
     * @param UDP2
     */
    public void setUDP2(java.lang.String UDP2) {
        this.UDP2 = UDP2;
    }


    /**
     * Gets the UDP3 value for this ZPM_INFORMATION.
     * 
     * @return UDP3
     */
    public java.lang.String getUDP3() {
        return UDP3;
    }


    /**
     * Sets the UDP3 value for this ZPM_INFORMATION.
     * 
     * @param UDP3
     */
    public void setUDP3(java.lang.String UDP3) {
        this.UDP3 = UDP3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZPM_INFORMATION)) return false;
        ZPM_INFORMATION other = (ZPM_INFORMATION) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.OA_ID==null && other.getOA_ID()==null) || 
             (this.OA_ID!=null &&
              this.OA_ID.equals(other.getOA_ID()))) &&
            ((this.BUKRS==null && other.getBUKRS()==null) || 
             (this.BUKRS!=null &&
              this.BUKRS.equals(other.getBUKRS()))) &&
            ((this.ANLN1==null && other.getANLN1()==null) || 
             (this.ANLN1!=null &&
              this.ANLN1.equals(other.getANLN1()))) &&
            ((this.MENGE==null && other.getMENGE()==null) || 
             (this.MENGE!=null &&
              this.MENGE.equals(other.getMENGE()))) &&
            ((this.MEINS==null && other.getMEINS()==null) || 
             (this.MEINS!=null &&
              this.MEINS.equals(other.getMEINS()))) &&
            ((this.DMBTR==null && other.getDMBTR()==null) || 
             (this.DMBTR!=null &&
              this.DMBTR.equals(other.getDMBTR()))) &&
            ((this.MSG==null && other.getMSG()==null) || 
             (this.MSG!=null &&
              this.MSG.equals(other.getMSG()))) &&
            ((this.MESSAGE==null && other.getMESSAGE()==null) || 
             (this.MESSAGE!=null &&
              this.MESSAGE.equals(other.getMESSAGE()))) &&
            ((this.UDP1==null && other.getUDP1()==null) || 
             (this.UDP1!=null &&
              this.UDP1.equals(other.getUDP1()))) &&
            ((this.UDP2==null && other.getUDP2()==null) || 
             (this.UDP2!=null &&
              this.UDP2.equals(other.getUDP2()))) &&
            ((this.UDP3==null && other.getUDP3()==null) || 
             (this.UDP3!=null &&
              this.UDP3.equals(other.getUDP3())));
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
        if (getOA_ID() != null) {
            _hashCode += getOA_ID().hashCode();
        }
        if (getBUKRS() != null) {
            _hashCode += getBUKRS().hashCode();
        }
        if (getANLN1() != null) {
            _hashCode += getANLN1().hashCode();
        }
        if (getMENGE() != null) {
            _hashCode += getMENGE().hashCode();
        }
        if (getMEINS() != null) {
            _hashCode += getMEINS().hashCode();
        }
        if (getDMBTR() != null) {
            _hashCode += getDMBTR().hashCode();
        }
        if (getMSG() != null) {
            _hashCode += getMSG().hashCode();
        }
        if (getMESSAGE() != null) {
            _hashCode += getMESSAGE().hashCode();
        }
        if (getUDP1() != null) {
            _hashCode += getUDP1().hashCode();
        }
        if (getUDP2() != null) {
            _hashCode += getUDP2().hashCode();
        }
        if (getUDP3() != null) {
            _hashCode += getUDP3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZPM_INFORMATION.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZPM_INFORMATION"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OA_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OA_ID"));
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
        elemField.setFieldName("MENGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MENGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEINS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MEINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DMBTR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DMBTR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MSG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MESSAGE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MESSAGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UDP1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UDP1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UDP2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UDP2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UDP3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UDP3"));
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
