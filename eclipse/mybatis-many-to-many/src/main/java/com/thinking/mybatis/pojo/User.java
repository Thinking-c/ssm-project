package com.thinking.mybatis.pojo;
/**
 *@Author:caoj
 *@Date:2018/09/20
 *@version:v1.0
 *@Description:
 */

import java.util.Date;
import java.util.List;

public class User {

	private int id;
	private String username;
	private Date birthday;
	private String gender;
	private String address;

	private List<Orders> ordersList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + ", gender=" + gender
				+ ", address=" + address + ", ordersList=" + ordersList + "]";
	}

}