package com.thinking.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *@Author:caoj
 *@Date:2018/08/18
 *@version:v1.0
 *@Description: spring的IOC的注解开发的测试类
 */
public class SpringDemo1 {
	
	/**
	 * 传统方式
	 */
	@Test
	public void demo1() {
		UserDaoImpl daoImpl = new UserDaoImpl();
		daoImpl.save();
	}
	
	/**
	 * spring的IOC的注解的方式
	 */
	@Test
	public void demo2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		userDao.save();
	}
	
	/**
	 * spring的IOC的注解的方式
	 */
	@Test
	public void demo3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.save();
	}
	
	
	

}
