package com.thinking.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thinking.dao.model.User;
import com.thinking.service.UserService;

/**
 *@Author:caoj
 *@Date:2018/06/14
 *@version:v1.0
 *@Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserServiceImplTest {

	@Autowired
	public UserService userService;

	@Test
	public void testGetUserById() {
		
		User user = userService.getUserById(1);
		System.out.println(user.getUserName());
	}

}
