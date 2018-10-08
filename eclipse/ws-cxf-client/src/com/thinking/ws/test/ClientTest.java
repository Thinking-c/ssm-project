package com.thinking.ws.test;

import java.util.List;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import com.thinking.ws.hello_world.HelloWS;
import com.thinking.ws.hello_world.HelloWSImplService;
import com.thinking.ws.interceptor.AddUserInterceotor;


/**
 * @Author:caoj
 * @Date:2018/08/13
 * @version:v1.0
 * @Description:
 */
public class ClientTest {

	public static void main(String[] args) {
//		HelloWSImplService fartory = new HelloWSImplService();
//		HelloWS helloWS = fartory.getHelloWSImplPort();

		// 发送请求的客户端对象
//		Client client = ClientProxy.getClient(helloWS);
		// 客户端的日志出拦截器
//		List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
//		outInterceptors.add(new LoggingOutInterceptor());

		// 客户端的日志入拦截器
//		List<Interceptor<? extends Message>> inInterceptors = client.getInInterceptors();
//		inInterceptors.add(new LoggingInInterceptor());
		
		//客户端的自定义出拦截器
//		List<Interceptor<? extends Message>> outFaultInterceptors = client.getOutInterceptors();
//		outFaultInterceptors.add(new AddUserInterceotor("username", "password"));
//
//		String result = helloWS.sayHello("webService");
//		System.out.println(result);
		
//		CentralSystemService_Service fartory = new CentralSystemService_Service();
//		CentralSystemService centralSystemService = fartory.getCentralSystemServiceImplPort();
//		
//		Client client = ClientProxy.getClient(centralSystemService);
//		// 客户端的日志出拦截器
//		List<Interceptor<? extends Message>> outInterceptors = client.getOutInterceptors();
//		outInterceptors.add(new LoggingOutInterceptor());
//		
//		// 客户端的日志入拦截器
//		List<Interceptor<? extends Message>> inInterceptors = client.getInInterceptors();
//		inInterceptors.add(new LoggingInInterceptor());
		
//		Student student = new Student();
//		student.setId(1);
//		student.setName("webservice客户端");
//		student.setPrice(12);
//		Student studentResult = centralSystemService.addStudent(student);
//		System.out.println(studentResult);
		
		
//		AuthorizeRequest authorizeRequest = new AuthorizeRequest();
//		authorizeRequest.setIdTag("123456");
//		
//		AuthorizeResponse response = centralSystemService.authorize(authorizeRequest);
//		System.out.println(response.toString());
		
		
		
		
	}

}
