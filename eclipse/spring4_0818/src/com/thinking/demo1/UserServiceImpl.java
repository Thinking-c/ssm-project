package com.thinking.demo1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *@Author:caoj
 *@Date:2018/08/20
 *@version:v1.0
 *@Description:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

//	@Autowired
//	@Qualifier
	@Resource(name="userDao")
	private UserDao userDao;
	
	@Override
	public void save() {
		System.out.println("UserService的save方法执行了...");
		userDao.save();
	}

}
