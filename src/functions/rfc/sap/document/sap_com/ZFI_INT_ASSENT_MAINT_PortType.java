/**
 * ZFI_INT_ASSENT_MAINT_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package functions.rfc.sap.document.sap_com;

public interface ZFI_INT_ASSENT_MAINT_PortType extends java.rmi.Remote {
    public functions.rfc.sap.document.sap_com.ZFI_EX_MESSAGE[] ZFI_INT_ASSENT_MAINT(functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZFI_CHANGE_ASSENTHolder i_DATA_CHANGE, functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZFI_ASSENT_MAINTHolder i_DATA_CREATE, functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZFI_EXCHANGE_ASSENTHolder i_DATA_EXCHANGE, functions.rfc.sap.document.sap_com.holders.TABLE_OF_ZFI_INSERT_ASSENT_COSTCENTERHolder i_DATA_INSERT, java.lang.String i_FLG) throws java.rmi.RemoteException;
}
