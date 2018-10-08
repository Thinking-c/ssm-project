package com.thinking.ws;

import javax.xml.ws.Endpoint;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description: 发布webService
 */
public class ServerTest {
	
	public static void main(String[] args) {
		
		String address = "http://192.168.1.196:8989/ws-demo/hellows";
		
		Endpoint.publish(address, new HelloWSImpl());
		System.out.println("发布webService成功");
		
	}

}
