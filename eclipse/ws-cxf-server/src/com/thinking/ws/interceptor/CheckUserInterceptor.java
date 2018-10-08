package com.thinking.ws.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * @Author:caoj
 * @Date:2018/08/14
 * @version:v1.0
 * @Description:
 */
public class CheckUserInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	private String USER_NAME = "username";
	private String USER_PASSWORD = "password";

	public CheckUserInterceptor() {
		super(Phase.PRE_PROTOCOL);
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		Header header = msg.getHeader(new QName("authrity"));
		if (header != null) {
			Element authEle = (Element) header.getObject();
			String username = authEle.getElementsByTagName("username").item(0).getTextContent();
			System.out.println(username);
			String password = authEle.getElementsByTagName("password").item(0).getTextContent();
			if (USER_NAME.equals(username) && USER_PASSWORD.equals(password)) {
				System.out.println("Server 通过拦截器....");
				return;
			}
		}
		// 不能通过
		System.out.println("Server 没有通过拦截器....");
		throw new Fault(new RuntimeException("请求需要一个正确的用户名和密码!"));
	}
}
