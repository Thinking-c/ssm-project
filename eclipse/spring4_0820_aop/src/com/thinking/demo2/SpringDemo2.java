package com.thinking.demo2;
/**
 *@Author:caoj
 *@Date:2018/08/20
 *@version:v1.0
 *@Description:
 */

import org.junit.Test;

public class SpringDemo2 {

	/**
	 * Cglib代理测试
	 */
	@Test
	public void demo1() {
		CustomerDao customerDao = new CustomerDao();

		CustomerDao proxy = new CglibProxy(customerDao).createProxy();
		proxy.save();
		proxy.find();
		proxy.update();
		proxy.delete();

	}

}
