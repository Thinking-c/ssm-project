package com.thinking.ws.server;

import javax.xml.ws.Endpoint;

import com.thinking.ws.data_type.DataTypeWSImpl;
import com.thinking.ws.hello_world.HelloWSImpl;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description:
 */
public class ServerDataTypeTest {

public static void main(String[] args) {
		
		String address = "http://192.168.1.196:8123/ws-demo/datattypews";
		
		Endpoint.publish(address, new DataTypeWSImpl());
		System.out.println("发布webService成功");
		
	}
}
