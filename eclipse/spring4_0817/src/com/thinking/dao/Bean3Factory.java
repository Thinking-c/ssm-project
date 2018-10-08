package com.thinking.dao;
/**
 *@Author:caoj
 *@Date:2018/08/18
 *@version:v1.0
 *@Description: Bean3的实例工厂
 */
public class Bean3Factory {

	public Bean3 createBean3() {
		System.out.println("Bean3的实例工厂执行了...");
		return new Bean3();
	}
}
