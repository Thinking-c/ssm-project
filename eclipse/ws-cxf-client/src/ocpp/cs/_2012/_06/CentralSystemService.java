package ocpp.cs._2012._06;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-09-03T13:27:07.500+08:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "urn://Ocpp/Cs/2012/06/", name = "CentralSystemService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CentralSystemService {

    @WebMethod(operationName = "Heartbeat", action = "/Heartbeat")
    @Action(input = "/Heartbeat", output = "/HeartbeatResponse")
    @WebResult(name = "heartbeatResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public HeartbeatResponse heartbeat(
        @WebParam(partName = "parameters", name = "heartbeatRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        HeartbeatRequest parameters
    );

    @WebMethod(operationName = "MeterValues", action = "/MeterValues")
    @Action(input = "/MeterValues", output = "/MeterValuesResponse")
    @WebResult(name = "meterValuesResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public MeterValuesResponse meterValues(
        @WebParam(partName = "parameters", name = "meterValuesRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        MeterValuesRequest parameters
    );

    @WebMethod(operationName = "DiagnosticsStatusNotification", action = "/DiagnosticsStatusNotification")
    @Action(input = "/DiagnosticsStatusNotification", output = "/DiagnosticsStatusNotificationResponse")
    @WebResult(name = "diagnosticsStatusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public DiagnosticsStatusNotificationResponse diagnosticsStatusNotification(
        @WebParam(partName = "parameters", name = "diagnosticsStatusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        DiagnosticsStatusNotificationRequest parameters
    );

    @WebMethod(operationName = "DataTransfer", action = "/DataTransfer")
    @Action(input = "/DataTransfer", output = "/DataTransferResponse")
    @WebResult(name = "dataTransferResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public DataTransferResponse dataTransfer(
        @WebParam(partName = "parameters", name = "dataTransferRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        DataTransferRequest parameters
    );

    @WebMethod(operationName = "FirmwareStatusNotification", action = "/FirmwareStatusNotification")
    @Action(input = "/FirmwareStatusNotification", output = "/FirmwareStatusNotificationResponse")
    @WebResult(name = "firmwareStatusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public FirmwareStatusNotificationResponse firmwareStatusNotification(
        @WebParam(partName = "parameters", name = "firmwareStatusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        FirmwareStatusNotificationRequest parameters
    );

    @WebMethod(operationName = "BootNotification", action = "/BootNotification")
    @Action(input = "/BootNotification", output = "/BootNotificationResponse")
    @WebResult(name = "bootNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public BootNotificationResponse bootNotification(
        @WebParam(partName = "parameters", name = "bootNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        BootNotificationRequest parameters
    );

    @WebMethod(operationName = "Authorize", action = "/Authorize")
    @Action(input = "/Authorize", output = "/AuthorizeResponse")
    @WebResult(name = "authorizeResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public AuthorizeResponse authorize(
        @WebParam(partName = "parameters", name = "authorizeRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        AuthorizeRequest parameters
    );

    @WebMethod(operationName = "StartTransaction", action = "/StartTransaction")
    @Action(input = "/StartTransaction", output = "/StartTransactionResponse")
    @WebResult(name = "startTransactionResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StartTransactionResponse startTransaction(
        @WebParam(partName = "parameters", name = "startTransactionRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        StartTransactionRequest parameters
    );

    @WebMethod(operationName = "StopTransaction", action = "/StopTransaction")
    @Action(input = "/StopTransaction", output = "/StopTransactionResponse")
    @WebResult(name = "stopTransactionResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StopTransactionResponse stopTransaction(
        @WebParam(partName = "parameters", name = "stopTransactionRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        StopTransactionRequest parameters
    );

    @WebMethod(operationName = "StatusNotification", action = "/StatusNotification")
    @Action(input = "/StatusNotification", output = "/StatusNotificationResponse")
    @WebResult(name = "statusNotificationResponse", targetNamespace = "urn://Ocpp/Cs/2012/06/", partName = "parameters")
    public StatusNotificationResponse statusNotification(
        @WebParam(partName = "parameters", name = "statusNotificationRequest", targetNamespace = "urn://Ocpp/Cs/2012/06/")
        StatusNotificationRequest parameters
    );
}