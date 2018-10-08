package com.thinking.dao;

/**
 * @Author:caoj
 * @Date:2018/08/18
 * @version:v1.0
 * @Description:
 */
public class Car {

	private String name;
	private Double price;

	public Car(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

}
