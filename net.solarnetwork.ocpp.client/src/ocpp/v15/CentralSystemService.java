
package ocpp.v15;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.0
 * 
 */
@WebService(name = "CentralSystemService", targetNamespace = "urn://Ocpp/Cs/2012/06/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CentralSystemService {


    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.AuthorizeResponse
     */
    @WebMethod(operationName = "Authorize", action = "/Authorize")
    @WebResult(name = "authorizeResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public AuthorizeResponse authorize(
        @WebParam(name = "authorizeRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        AuthorizeRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.StartTransactionResponse
     */
    @WebMethod(operationName = "StartTransaction", action = "/StartTransaction")
    @WebResult(name = "startTransactionResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StartTransactionResponse startTransaction(
        @WebParam(name = "startTransactionRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        StartTransactionRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.StopTransactionResponse
     */
    @WebMethod(operationName = "StopTransaction", action = "/StopTransaction")
    @WebResult(name = "stopTransactionResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StopTransactionResponse stopTransaction(
        @WebParam(name = "stopTransactionRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        StopTransactionRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.HeartbeatResponse
     */
    @WebMethod(operationName = "Heartbeat", action = "/Heartbeat")
    @WebResult(name = "heartbeatResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public HeartbeatResponse heartbeat(
        @WebParam(name = "heartbeatRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        HeartbeatRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.MeterValuesResponse
     */
    @WebMethod(operationName = "MeterValues", action = "/MeterValues")
    @WebResult(name = "meterValuesResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public MeterValuesResponse meterValues(
        @WebParam(name = "meterValuesRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        MeterValuesRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.BootNotificationResponse
     */
    @WebMethod(operationName = "BootNotification", action = "/BootNotification")
    @WebResult(name = "bootNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public BootNotificationResponse bootNotification(
        @WebParam(name = "bootNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        BootNotificationRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.StatusNotificationResponse
     */
    @WebMethod(operationName = "StatusNotification", action = "/StatusNotification")
    @WebResult(name = "statusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StatusNotificationResponse statusNotification(
        @WebParam(name = "statusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        StatusNotificationRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.FirmwareStatusNotificationResponse
     */
    @WebMethod(operationName = "FirmwareStatusNotification", action = "/FirmwareStatusNotification")
    @WebResult(name = "firmwareStatusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public FirmwareStatusNotificationResponse firmwareStatusNotification(
        @WebParam(name = "firmwareStatusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        FirmwareStatusNotificationRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.DiagnosticsStatusNotificationResponse
     */
    @WebMethod(operationName = "DiagnosticsStatusNotification", action = "/DiagnosticsStatusNotification")
    @WebResult(name = "diagnosticsStatusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public DiagnosticsStatusNotificationResponse diagnosticsStatusNotification(
        @WebParam(name = "diagnosticsStatusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        DiagnosticsStatusNotificationRequest parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns ocpp.v15.DataTransferResponse
     */
    @WebMethod(operationName = "DataTransfer", action = "/DataTransfer")
    @WebResult(name = "dataTransferResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public DataTransferResponse dataTransfer(
        @WebParam(name = "dataTransferRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
        DataTransferRequest parameters);

}
