
package com.thinking.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.thinking.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthorizeResponse_QNAME = new QName("http://service.thinking.com/", "AuthorizeResponse");
    private final static QName _AuthorizeRequest_QNAME = new QName("http://service.thinking.com/", "authorizeRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.thinking.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthorizeResponse }
     * 
     */
    public AuthorizeResponse createAuthorizeResponse() {
        return new AuthorizeResponse();
    }

    /**
     * Create an instance of {@link AuthorizeRequest }
     * 
     */
    public AuthorizeRequest createAuthorizeRequest() {
        return new AuthorizeRequest();
    }

    /**
     * Create an instance of {@link IdTagInfo }
     * 
     */
    public IdTagInfo createIdTagInfo() {
        return new IdTagInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.thinking.com/", name = "AuthorizeResponse")
    public JAXBElement<AuthorizeResponse> createAuthorizeResponse(AuthorizeResponse value) {
        return new JAXBElement<AuthorizeResponse>(_AuthorizeResponse_QNAME, AuthorizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.thinking.com/", name = "authorizeRequest")
    public JAXBElement<AuthorizeRequest> createAuthorizeRequest(AuthorizeRequest value) {
        return new JAXBElement<AuthorizeRequest>(_AuthorizeRequest_QNAME, AuthorizeRequest.class, null, value);
    }

}
