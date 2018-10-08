package com.thinking.service.impl;

import com.thinking.dao.model.User;
import com.thinking.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/6/20
 */
public class UserServiceImplTest {

    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService uService = (UserService) application.getBean("userService");
        User user = uService.getUserById(1);
        System.out.println(user.getUserName());
    }

}