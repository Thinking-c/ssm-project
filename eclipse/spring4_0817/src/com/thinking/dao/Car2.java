package com.thinking.dao;

/**
 * @Author:caoj
 * @Date:2018/08/18
 * @version:v1.0
 * @Description:
 */
public class Car2 {

	private String name;
	private Double price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

}
