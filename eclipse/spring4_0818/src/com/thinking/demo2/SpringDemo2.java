package com.thinking.demo2;
/**
 *@Author:caoj
 *@Date:2018/08/20
 *@version:v1.0
 *@Description:
 */

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
	
	@Test
	public void demo1() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerService");
		System.out.println(customerService);
		
		CustomerService customerService1 = (CustomerService) applicationContext.getBean("customerService");
		System.out.println(customerService1);
		
		System.out.println(customerService == customerService1);
		
		applicationContext.close();
	}


}
