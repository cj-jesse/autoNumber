package functions.rfc.sap.document.sap_com;

public class ZFI_INT_ASSENT_MAINTProxy implements functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_PortType {
  private String _endpoint = null;
  private functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_PortType zFI_INT_ASSENT_MAINT_PortType = null;
  
  public ZFI_INT_ASSENT_MAINTProxy() {
    _initZFI_INT_ASSENT_MAINTProxy();
  }
  
  public ZFI_INT_ASSENT_MAINTProxy(String endpoint) {
    _endpoint = endpoint;
    _initZFI_INT_ASSENT_MAINTProxy();
  }
  
  private void _initZFI_INT_ASSENT_MAINTProxy() {
    try {
      zFI_INT_ASSENT_MAINT_PortType = (new functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_ServiceLocator()).getZFI_INT_ASSENT_MAINT();
      if (zFI_INT_ASSENT_MAINT_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)zFI_INT_ASSENT_MAINT_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)zFI_INT_ASSENT_MAINT_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (zFI_INT_ASSENT_MAINT_PortType != null)
      ((javax.xml.rpc.Stub)zFI_INT_ASSENT_MAINT_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public functions.rfc.sap.document.sap_com.ZFI_INT_ASSENT_MAINT_PortType getZFI_INT_ASSENT_MAINT_PortType() {
    if (zFI_INT_ASSENT_MAINT_PortType == null)
      _initZFI_INT_ASSENT_MAINTProxy();
    return zFI_INT_ASSENT_MAINT_PortType;
  }
  
  public functions.rfc.sap.document.sap_com.ZFI_EX_MESSAGE[] ZFI_INT_ASSENT_MAINT(functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZFI_CHANGE_ASSENTHolder i_DATA_CHANGE, functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZFI_ASSENT_MAINTHolder i_DATA_CREATE, functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZFI_EXCHANGE_ASSENTHolder i_DATA_EXCHANGE, functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZFI_INSERT_ASSENT_COSTCENTERHolder i_DATA_INSERT, java.lang.String i_FLG) throws java.rmi.RemoteException{
    if (zFI_INT_ASSENT_MAINT_PortType == null)
      _initZFI_INT_ASSENT_MAINTProxy();
    return zFI_INT_ASSENT_MAINT_PortType.ZFI_INT_ASSENT_MAINT(i_DATA_CHANGE, i_DATA_CREATE, i_DATA_EXCHANGE, i_DATA_INSERT, i_FLG);
  }
  
  
}