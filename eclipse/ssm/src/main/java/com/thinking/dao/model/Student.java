package com.thinking.dao.model;

public class Student {

	private int id;
	private String stuno;
	private String name;
	private String gender;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int id,String stuno, String name, String gender, int age) {
		this.id = id;
		this.stuno = stuno;
		this.name = name;
		this.gender = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", stuno=" + stuno + ", name="
				+ name + ", gender=" + gender + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStuno() {
		return stuno;
	}
	public void setStuno(String stuno) {
		this.stuno = stuno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
