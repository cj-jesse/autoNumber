/**
 * ZPM_OA2SAP_CREATE_INFORMATION_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com;

public class ZPM_OA2SAP_CREATE_INFORMATION_ServiceLocator extends org.apache.axis.client.Service implements functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_Service {

    public ZPM_OA2SAP_CREATE_INFORMATION_ServiceLocator() {
    }


    public ZPM_OA2SAP_CREATE_INFORMATION_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ZPM_OA2SAP_CREATE_INFORMATION_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ZPM_OA2SAP_CREATE_INFORMATION
    private java.lang.String ZPM_OA2SAP_CREATE_INFORMATION_address = "http://ERPQAS01.babifood.com:8000/sap/bc/srt/rfc/sap/zpm_oa2sap_create_information/600/zpm_oa2sap_create_information/zpm_oa2sap_create_information";

    public java.lang.String getZPM_OA2SAP_CREATE_INFORMATIONAddress() {
        return ZPM_OA2SAP_CREATE_INFORMATION_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ZPM_OA2SAP_CREATE_INFORMATIONWSDDServiceName = "ZPM_OA2SAP_CREATE_INFORMATION";

    public java.lang.String getZPM_OA2SAP_CREATE_INFORMATIONWSDDServiceName() {
        return ZPM_OA2SAP_CREATE_INFORMATIONWSDDServiceName;
    }

    public void setZPM_OA2SAP_CREATE_INFORMATIONWSDDServiceName(java.lang.String name) {
        ZPM_OA2SAP_CREATE_INFORMATIONWSDDServiceName = name;
    }

    public functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_PortType getZPM_OA2SAP_CREATE_INFORMATION() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ZPM_OA2SAP_CREATE_INFORMATION_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZPM_OA2SAP_CREATE_INFORMATION(endpoint);
    }

    public functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_PortType getZPM_OA2SAP_CREATE_INFORMATION(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_BindingStub _stub = new functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_BindingStub(portAddress, this);
            _stub.setPortName(getZPM_OA2SAP_CREATE_INFORMATIONWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZPM_OA2SAP_CREATE_INFORMATIONEndpointAddress(java.lang.String address) {
        ZPM_OA2SAP_CREATE_INFORMATION_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_BindingStub _stub = new functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_BindingStub(new java.net.URL(ZPM_OA2SAP_CREATE_INFORMATION_address), this);
                _stub.setPortName(getZPM_OA2SAP_CREATE_INFORMATIONWSDDServiceName());
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
        if ("ZPM_OA2SAP_CREATE_INFORMATION".equals(inputPortName)) {
            return getZPM_OA2SAP_CREATE_INFORMATION();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZPM_OA2SAP_CREATE_INFORMATION");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:rfc:functions", "ZPM_OA2SAP_CREATE_INFORMATION"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ZPM_OA2SAP_CREATE_INFORMATION".equals(portName)) {
            setZPM_OA2SAP_CREATE_INFORMATIONEndpointAddress(address);
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
