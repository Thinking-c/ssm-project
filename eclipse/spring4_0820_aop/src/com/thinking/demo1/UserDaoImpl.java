package com.thinking.demo1;
/**
 *@Author:caoj
 *@Date:2018/08/20
 *@version:v1.0
 *@Description:
 */
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println("保存用户...");
	}

	@Override
	public void update() {
		System.out.println("更新用户...");
	}

	@Override
	public void find() {
		System.out.println("查找用户...");
	}

	@Override
	public void delete() {
		System.out.println("删除用户...");
	}

}
