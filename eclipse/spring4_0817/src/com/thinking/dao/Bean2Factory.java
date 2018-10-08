package com.thinking.dao;
/**
 *@Author:caoj
 *@Date:2018/08/18
 *@version:v1.0
 *@Description:Bean2的静态工厂
 */
public class Bean2Factory {

	public static Bean2 createBean2() {
		System.out.println("Bean2Factory中方法执行了");
		return new Bean2();
	}
}
