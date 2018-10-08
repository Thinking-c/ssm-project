package com.thinking.dao;

import com.sun.org.apache.regexp.internal.recompile;

/**
 *@Author:caoj
 *@Date:2018/08/18
 *@version:v1.0
 *@Description:
 */
public class CarInfo {
	
	private String name;
	
	public String  getName() {
		return "摩托车";
	}
	
	public Double CalculatorPrice() {
		return Math.random() * 3000;
	}

}
