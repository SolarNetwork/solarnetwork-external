
package ocpp.v15.cp;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ChargePointService", targetNamespace = "urn://Ocpp/Cp/2012/06/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ChargePointService {


    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.UnlockConnectorResponse
     */
    @WebMethod(operationName = "UnlockConnector", action = "/UnlockConnector")
    @WebResult(name = "unlockConnectorResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public UnlockConnectorResponse unlockConnector(
        @WebParam(name = "unlockConnectorRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        UnlockConnectorRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.ResetResponse
     */
    @WebMethod(operationName = "Reset", action = "/Reset")
    @WebResult(name = "resetResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public ResetResponse reset(
        @WebParam(name = "resetRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        ResetRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.ChangeAvailabilityResponse
     */
    @WebMethod(operationName = "ChangeAvailability", action = "/ChangeAvailability")
    @WebResult(name = "changeAvailabilityResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public ChangeAvailabilityResponse changeAvailability(
        @WebParam(name = "changeAvailabilityRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        ChangeAvailabilityRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.GetDiagnosticsResponse
     */
    @WebMethod(operationName = "GetDiagnostics", action = "/GetDiagnostics")
    @WebResult(name = "getDiagnosticsResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public GetDiagnosticsResponse getDiagnostics(
        @WebParam(name = "getDiagnosticsRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        GetDiagnosticsRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.ClearCacheResponse
     */
    @WebMethod(operationName = "ClearCache", action = "/ClearCache")
    @WebResult(name = "clearCacheResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public ClearCacheResponse clearCache(
        @WebParam(name = "clearCacheRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        ClearCacheRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.UpdateFirmwareResponse
     */
    @WebMethod(operationName = "UpdateFirmware", action = "/UpdateFirmware")
    @WebResult(name = "updateFirmwareResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public UpdateFirmwareResponse updateFirmware(
        @WebParam(name = "updateFirmwareRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        UpdateFirmwareRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.ChangeConfigurationResponse
     */
    @WebMethod(operationName = "ChangeConfiguration", action = "/ChangeConfiguration")
    @WebResult(name = "changeConfigurationResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public ChangeConfigurationResponse changeConfiguration(
        @WebParam(name = "changeConfigurationRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        ChangeConfigurationRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.RemoteStartTransactionResponse
     */
    @WebMethod(operationName = "RemoteStartTransaction", action = "/RemoteStartTransaction")
    @WebResult(name = "remoteStartTransactionResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public RemoteStartTransactionResponse remoteStartTransaction(
        @WebParam(name = "remoteStartTransactionRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        RemoteStartTransactionRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.RemoteStopTransactionResponse
     */
    @WebMethod(operationName = "RemoteStopTransaction", action = "/RemoteStopTransaction")
    @WebResult(name = "remoteStopTransactionResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public RemoteStopTransactionResponse remoteStopTransaction(
        @WebParam(name = "remoteStopTransactionRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        RemoteStopTransactionRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.CancelReservationResponse
     */
    @WebMethod(operationName = "CancelReservation", action = "/CancelReservation")
    @WebResult(name = "cancelReservationResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public CancelReservationResponse cancelReservation(
        @WebParam(name = "cancelReservationRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        CancelReservationRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.DataTransferResponse
     */
    @WebMethod(operationName = "DataTransfer", action = "/DataTransfer")
    @WebResult(name = "dataTransferResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public DataTransferResponse dataTransfer(
        @WebParam(name = "dataTransferRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        DataTransferRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.GetConfigurationResponse
     */
    @WebMethod(operationName = "GetConfiguration", action = "/GetConfiguration")
    @WebResult(name = "getConfigurationResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public GetConfigurationResponse getConfiguration(
        @WebParam(name = "getConfigurationRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        GetConfigurationRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.GetLocalListVersionResponse
     */
    @WebMethod(operationName = "GetLocalListVersion", action = "/GetLocalListVersion")
    @WebResult(name = "getLocalListVersionResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public GetLocalListVersionResponse getLocalListVersion(
        @WebParam(name = "getLocalListVersionRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        GetLocalListVersionRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.ReserveNowResponse
     */
    @WebMethod(operationName = "ReserveNow", action = "/ReserveNow")
    @WebResult(name = "reserveNowResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public ReserveNowResponse reserveNow(
        @WebParam(name = "reserveNowRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        ReserveNowRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

    /**
     * 
     * @param chargeBoxIdentity
     * @param parameters
     * @return
     *     returns ocpp.v15.cp.SendLocalListResponse
     */
    @WebMethod(operationName = "SendLocalList", action = "/SendLocalList")
    @WebResult(name = "sendLocalListResponse", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
    public SendLocalListResponse sendLocalList(
        @WebParam(name = "sendLocalListRequest", targetNamespace = "urn://Ocpp/Cp/2012/06/", partName = "parameters")
        SendLocalListRequest parameters,
        @WebParam(name = "chargeBoxIdentity", targetNamespace = "urn://Ocpp/Cp/2012/06/", header = true, partName = "ChargeBoxIdentity")
        String chargeBoxIdentity);

}
