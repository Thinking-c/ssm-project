package com.thinking.demo1;

import org.junit.Test;

/**
 *@Author:caoj
 *@Date:2018/08/20
 *@version:v1.0
 *@Description:
 */
public class SpringDemo1 {
	
	/**
	 * JDK动态代理
	 */
	@Test
	public void demo1() {
		UserDaoImpl daoImpl = new UserDaoImpl();
		//创建代理
		UserDao proxy = new JdkProxy(daoImpl).createProxy();
		daoImpl.save();
		daoImpl.update();
		daoImpl.find();
		daoImpl.delete();
	}

}
