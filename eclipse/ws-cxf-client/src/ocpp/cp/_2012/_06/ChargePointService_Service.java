package ocpp.cp._2012._06;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * The ChargePoint Service for the Open Charge Point Protocol
 *
 * This class was generated by Apache CXF 3.2.5
 * 2018-09-04T18:37:46.412+08:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "ChargePointService",
                  wsdlLocation = "file:/D:/IDE/eclipse-workspace/ws-cxf-client/ocpp_chargepointservice_1.5_final.wsdl",
                  targetNamespace = "urn://Ocpp/Cp/2012/06/")
public class ChargePointService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn://Ocpp/Cp/2012/06/", "ChargePointService");
    public final static QName ChargePointServiceSoap12 = new QName("urn://Ocpp/Cp/2012/06/", "ChargePointServiceSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/IDE/eclipse-workspace/ws-cxf-client/ocpp_chargepointservice_1.5_final.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ChargePointService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/D:/IDE/eclipse-workspace/ws-cxf-client/ocpp_chargepointservice_1.5_final.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ChargePointService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ChargePointService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ChargePointService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ChargePointService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ChargePointService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ChargePointService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ChargePointService
     */
    @WebEndpoint(name = "ChargePointServiceSoap12")
    public ChargePointService getChargePointServiceSoap12() {
        return super.getPort(ChargePointServiceSoap12, ChargePointService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ChargePointService
     */
    @WebEndpoint(name = "ChargePointServiceSoap12")
    public ChargePointService getChargePointServiceSoap12(WebServiceFeature... features) {
        return super.getPort(ChargePointServiceSoap12, ChargePointService.class, features);
    }

}