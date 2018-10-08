package com.thinking.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *@Author:caoj
 *@Date:2018/08/13
 *@version:v1.0
 *@Description:SEI
 */
@WebService
public interface HelloWS {
	
	@WebMethod
	public String sayHello(String name);
	
}
