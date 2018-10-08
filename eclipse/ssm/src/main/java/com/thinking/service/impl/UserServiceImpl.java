package com.thinking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinking.dao.mapper.UserMapper;
import com.thinking.dao.model.User;
import com.thinking.service.UserService;

/**
 *@Author:caoj
 *@Date:2018/06/13
 *@version:v1.0
 *@Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	public UserMapper userMapper;

	@Override
	public User getUserById(int id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	
}
