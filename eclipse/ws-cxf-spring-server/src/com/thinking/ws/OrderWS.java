package com.thinking.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.thinking.bean.Order;

/**
 * @Author:caoj
 * @Date:2018/08/15
 * @version:v1.0
 * @Description:
 */
@WebService
public interface OrderWS {

	@WebMethod
	public Order getOrderById(int id);
}
