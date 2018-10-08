package com.thinking.dao;
/**
 *@Author:caoj
 *@Date:2018/08/17
 *@version:v1.0
 *@Description:
 */
public class UserDaoImpl implements UserDao {
	
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void save() {
		System.out.println("UserDaoImpl执行了......" + name);
	}

}
