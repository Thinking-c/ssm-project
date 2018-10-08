package com.thinking.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thinking.ws.Order;
import com.thinking.ws.OrderWS;

/**
 *@Author:caoj
 *@Date:2018/08/15
 *@version:v1.0
 *@Description:
 */
public class ClientTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"client-beans.xml"});
		OrderWS orderWS = (OrderWS) context.getBean("orderClient");
		Order order = orderWS.getOrderById(50);
		System.out.println(order);
		
	}
}
