package com.thinking.test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import ocpp.cs._2012._06.AuthorizeRequest;
import ocpp.cs._2012._06.AuthorizeResponse;
import ocpp.cs._2012._06.CentralSystemService;
import ocpp.cs._2012._06.CentralSystemService_Service;


/**
 *@Author:caoj
 *@Date:2018/09/19
 *@version:v1.0
 *@Description:
 */
public class OcppTest {
	
	public static void main(String[] args) throws MalformedURLException {
		CentralSystemService_Service fartory = new CentralSystemService_Service(new URL("http://localhost:8543/services/CentralSystemService?wsdl"));
		CentralSystemService centralSystemService = fartory.getCentralSystemServiceImplPort();
		
		Client client = ClientProxy.getClient(centralSystemService);
		// 客户端的日志出拦截器
		List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
		outInterceptors.add(new LoggingOutInterceptor());
		
		// 客户端的日志入拦截器
		List<Interceptor<? extends Message>> inInterceptors = client.getInInterceptors();
		inInterceptors.add(new LoggingInInterceptor());
		
		AuthorizeRequest parameters = new AuthorizeRequest();
		parameters.setIdTag("TAG1234");
		String chargeBoxIdentity = "ASE000100003";
		AuthorizeResponse response = centralSystemService.authorize(parameters, chargeBoxIdentity);
		System.out.println(response.toString());
		
		
	}

}
