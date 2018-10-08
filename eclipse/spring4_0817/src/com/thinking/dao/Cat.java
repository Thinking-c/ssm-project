package com.thinking.dao;

/**
 * @Author:caoj
 * @Date:2018/08/18
 * @version:v1.0
 * @Description:
 */
public class Cat {

	private String name;
	private Integer age;
	private Double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
