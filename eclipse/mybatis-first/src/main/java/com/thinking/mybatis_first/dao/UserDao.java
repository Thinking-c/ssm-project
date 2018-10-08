package com.thinking.mybatis_first.dao;

import com.thinking.mybatis_first.pojo.User;

public interface UserDao {

	//通过用户ID查询一个用户
	public User selectUserById(Integer id);
}
