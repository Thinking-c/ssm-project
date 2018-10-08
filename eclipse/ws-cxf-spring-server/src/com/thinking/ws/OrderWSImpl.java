package com.thinking.ws;

import com.thinking.bean.Order;

/**
 *@Author:caoj
 *@Date:2018/08/15
 *@version:v1.0
 *@Description:
 */
public class OrderWSImpl implements OrderWS {
	
	public OrderWSImpl() {
		System.out.println("OrderWSImpl()");
	}

	@Override
	public Order getOrderById(int id) {
		System.out.println("server getOrderById() " + id);
		return new Order(id, "手机", 100000);
	}

}
