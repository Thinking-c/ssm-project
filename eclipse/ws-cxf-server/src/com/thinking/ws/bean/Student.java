package com.thinking.ws.bean;

/**
 * @Author:caoj
 * @Date:2018/08/13
 * @version:v1.0
 * @Description:
 */
public class Student {

	private int id;
	private String name;
	private float price;
	
	

	public Student() {
	}

	public Student(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
