package com.thinking.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-08-15T13:38:09.749+08:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "OrderWSImplService",
                  wsdlLocation = "http://localhost:8080/ws-cxf-spring-server/orderws?wsdl",
                  targetNamespace = "http://ws.thinking.com/")
public class OrderWSImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://ws.thinking.com/", "OrderWSImplService");
    public final static QName OrderWSImplPort = new QName("http://ws.thinking.com/", "OrderWSImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/ws-cxf-spring-server/orderws?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(OrderWSImplService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/ws-cxf-spring-server/orderws?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OrderWSImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OrderWSImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OrderWSImplService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OrderWSImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OrderWSImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OrderWSImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns OrderWS
     */
    @WebEndpoint(name = "OrderWSImplPort")
    public OrderWS getOrderWSImplPort() {
        return super.getPort(OrderWSImplPort, OrderWS.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OrderWS
     */
    @WebEndpoint(name = "OrderWSImplPort")
    public OrderWS getOrderWSImplPort(WebServiceFeature... features) {
        return super.getPort(OrderWSImplPort, OrderWS.class, features);
    }

}