package com.thinking.dao;

/**
 * @Author:caoj
 * @Date:2018/08/18
 * @version:v1.0
 * @Description:
 */
public class Employee {

	private String name;
	private Car2 car2;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car2 getCar2() {
		return car2;
	}

	public void setCar2(Car2 car2) {
		this.car2 = car2;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", car2=" + car2 + "]";
	}

}
