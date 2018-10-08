package com.thinking.ws.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *@Author:caoj
 *@Date:2018/08/14
 *@version:v1.0
 *@Description:
 */
public class AddUserInterceotor extends AbstractPhaseInterceptor<SoapMessage> {

	private String username;
	private String password;
	
	public AddUserInterceotor(String username, String password) {
		super(Phase.PRE_PROTOCOL);//准备协议时拦截
		this.username = username;
		this.password = password;
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		List<Header> headers = msg.getHeaders();
		
		Document document = DOMUtils.createDocument();
		Element authEle = document.createElement("authrity");
		Element usernameEle = document.createElement("username");
		Element passwordEle = document.createElement("password");
		
		usernameEle.setTextContent(username);
		passwordEle.setTextContent(password);
		
		authEle.appendChild(usernameEle);
		authEle.appendChild(passwordEle);
		
		headers.add(new Header(new QName("authrity"), authEle));
		System.out.println("client handleMessage()....");
	}

}
