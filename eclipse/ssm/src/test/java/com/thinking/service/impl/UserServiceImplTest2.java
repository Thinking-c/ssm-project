package com.thinking.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thinking.dao.model.User;
import com.thinking.service.UserService;

/**
 *@Author:caoj
 *@Date:2018/06/14
 *@version:v1.0
 *@Description:
 */
public class UserServiceImplTest2 {

	 public static void main(String[] args) {
	        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
	        UserService uService = (UserService) application.getBean("userService");
	        User user = uService.getUserById(1);
	        System.out.println(user.getUserName());
	    }

}
