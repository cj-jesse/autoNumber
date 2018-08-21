/**
 * ZFI_INT_ASSENT_MAINT_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com;

public class ZFI_INT_ASSENT_MAINT_ServiceLocator extends org.apache.axis.client.Service implements functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_Service {

    public ZFI_INT_ASSENT_MAINT_ServiceLocator() {
    }


    public ZFI_INT_ASSENT_MAINT_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ZFI_INT_ASSENT_MAINT_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ZFI_INT_ASSENT_MAINT
    private java.lang.String ZFI_INT_ASSENT_MAINT_address = "http://ERPQAS01.babifood.com:8000/sap/bc/srt/rfc/sap/zfi_int_assent_maint/600/zfi_int_assent_maint/zfi_int_assent_maint";

    public java.lang.String getZFI_INT_ASSENT_MAINTAddress() {
        return ZFI_INT_ASSENT_MAINT_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ZFI_INT_ASSENT_MAINTWSDDServiceName = "ZFI_INT_ASSENT_MAINT";

    public java.lang.String getZFI_INT_ASSENT_MAINTWSDDServiceName() {
        return ZFI_INT_ASSENT_MAINTWSDDServiceName;
    }

    public void setZFI_INT_ASSENT_MAINTWSDDServiceName(java.lang.String name) {
        ZFI_INT_ASSENT_MAINTWSDDServiceName = name;
    }

    public functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_PortType getZFI_INT_ASSENT_MAINT() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ZFI_INT_ASSENT_MAINT_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZFI_INT_ASSENT_MAINT(endpoint);
    }

    public functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_PortType getZFI_INT_ASSENT_MAINT(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_BindingStub _stub = new functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_BindingStub(portAddress, this);
            _stub.setPortName(getZFI_INT_ASSENT_MAINTWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZFI_INT_ASSENT_MAINTEndpointAddress(java.lang.String address) {
        ZFI_INT_ASSENT_MAINT_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_BindingStub _stub = new functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_BindingStub(new java.net.URL(ZFI_INT_ASSENT_MAINT_address), this);
                _stub.setPortName(getZFI_INT_ASSENT_MAINTWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ZFI_INT_ASSENT_MAINT".equals(inputPortName)) {
            return getZFI_INT_ASSENT_MAINT();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZFI_INT_ASSENT_MAINT");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZFI_INT_ASSENT_MAINT"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ZFI_INT_ASSENT_MAINT".equals(portName)) {
            setZFI_INT_ASSENT_MAINTEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
