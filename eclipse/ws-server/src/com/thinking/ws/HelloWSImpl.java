package com.thinking.ws;

import javax.jws.WebService;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description:SEI实现类
 */
@WebService
public class HelloWSImpl implements HelloWS {

	@Override
	public String sayHello(String name) {
		
		System.out.println("server sayHello() " + name);
		return "hello" + name;
	}

}
