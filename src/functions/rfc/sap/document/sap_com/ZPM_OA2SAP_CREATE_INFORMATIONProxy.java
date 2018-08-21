package functions.rfc.sap.document.sap_com;

public class ZPM_OA2SAP_CREATE_INFORMATIONProxy implements functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_PortType {
  private String _endpoint = null;
  private functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_PortType zPM_OA2SAP_CREATE_INFORMATION_PortType = null;
  
  public ZPM_OA2SAP_CREATE_INFORMATIONProxy() {
    _initZPM_OA2SAP_CREATE_INFORMATIONProxy();
  }
  
  public ZPM_OA2SAP_CREATE_INFORMATIONProxy(String endpoint) {
    _endpoint = endpoint;
    _initZPM_OA2SAP_CREATE_INFORMATIONProxy();
  }
  
  private void _initZPM_OA2SAP_CREATE_INFORMATIONProxy() {
    try {
      zPM_OA2SAP_CREATE_INFORMATION_PortType = (new functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_ServiceLocator()).getZPM_OA2SAP_CREATE_INFORMATION();
      if (zPM_OA2SAP_CREATE_INFORMATION_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zPM_OA2SAP_CREATE_INFORMATION_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zPM_OA2SAP_CREATE_INFORMATION_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zPM_OA2SAP_CREATE_INFORMATION_PortType != null)
      ((javax.xml.rpc.Stub)zPM_OA2SAP_CREATE_INFORMATION_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public functions.rfc.sap.document.sap_com.ZPM_OA2SAP_CREATE_INFORMATION_PortType getZPM_OA2SAP_CREATE_INFORMATION_PortType() {
    if (zPM_OA2SAP_CREATE_INFORMATION_PortType == null)
      _initZPM_OA2SAP_CREATE_INFORMATIONProxy();
    return zPM_OA2SAP_CREATE_INFORMATION_PortType;
  }
  
  public void ZPM_OA2SAP_CREATE_INFORMATION(functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZPM_INFORMATIONHolder IT_DATA, javax.xml.rpc.holders.StringHolder MESSAGE, javax.xml.rpc.holders.StringHolder STAUD) throws java.rmi.RemoteException{
    if (zPM_OA2SAP_CREATE_INFORMATION_PortType == null)
      _initZPM_OA2SAP_CREATE_INFORMATIONProxy();
    zPM_OA2SAP_CREATE_INFORMATION_PortType.ZPM_OA2SAP_CREATE_INFORMATION(IT_DATA, MESSAGE, STAUD);
  }
  
  
}