package com.thinking.test;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/9/10
 */
public class AuthOutInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    private String chargeBoxIdentity;

    public AuthOutInterceptor(String chargeBoxIdentity) {
        super(Phase.PREPARE_SEND);
        this.chargeBoxIdentity = chargeBoxIdentity;
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        List<Header> headers = message.getHeaders();

        Document document = DOMUtils.createDocument();
        Element identityEle = document.createElement("chargeBoxIdentity");
        identityEle.setTextContent(chargeBoxIdentity);

        SoapHeader header = new SoapHeader(new QName("urn://Ocpp/Cp/2012/06/","ChargePointService"), identityEle);
        headers.add(header);

    }
}
