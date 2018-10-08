package com.thinking.ws.test;

import com.thinking.ws.HelloWSImpl;
import com.thinking.ws.HelloWSImplService;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description: 调用webService
 */
public class ClientTest {
	
	public static void main(String[] args) {
		
		HelloWSImplService factory = new HelloWSImplService();
		HelloWSImpl helloWS = factory.getHelloWSImplPort();
		System.out.println(helloWS.getClass());
		
		String result = helloWS.sayHello("Tom1");
		System.out.println(result);
		
		
	}
}
