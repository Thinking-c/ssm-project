package com.thinking.ws.server;

import java.util.List;

import javax.xml.ws.Endpoint;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;

import com.thinking.ws.hello_world.HelloWSImpl;
import com.thinking.ws.interceptor.CheckUserInterceptor;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description: 发布webService
 */
public class ServerTest {
	
	public static void main(String[] args) {
		
		String address = "http://192.168.1.196:8888/ws-demo/hellows";
		
		Endpoint endpoint = Endpoint.publish(address, new HelloWSImpl());
		System.out.println(endpoint);
		EndpointImpl endpointImpl = (EndpointImpl)endpoint;
		
		//服务端日志入拦截器
		List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();
		inInterceptors.add(new LoggingInInterceptor());
		
		//服务端日志出拦截器
//		List<Interceptor<? extends Message>> outInterceptors = endpointImpl.getOutInterceptors();
//		outInterceptors.add(new LoggingOutInterceptor());
		
		//服务端的入拦截器
//		List<Interceptor<? extends Message>> inInterceptors = endpointImpl.getInInterceptors();
		inInterceptors.add(new CheckUserInterceptor());
		
		System.out.println("发布webService成功");
		
	}

}
