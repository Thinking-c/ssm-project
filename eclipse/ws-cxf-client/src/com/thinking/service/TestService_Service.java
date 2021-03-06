package com.thinking.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-09-07T10:02:05.435+08:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "TestService",
                  wsdlLocation = "http://localhost:8080/services/TestService?wsdl",
                  targetNamespace = "urn://Ocpp/Cs/2012/06/")
public class TestService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.thinking.com/", "TestService");
    public final static QName TestServiceImplPort = new QName("http://service.thinking.com/", "TestServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/services/TestService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TestService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/services/TestService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TestService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TestService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TestService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TestService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TestService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TestService
     */
    @WebEndpoint(name = "TestServiceImplPort")
    public TestService getTestServiceImplPort() {
        return super.getPort(TestServiceImplPort, TestService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TestService
     */
    @WebEndpoint(name = "TestServiceImplPort")
    public TestService getTestServiceImplPort(WebServiceFeature... features) {
        return super.getPort(TestServiceImplPort, TestService.class, features);
    }

}
