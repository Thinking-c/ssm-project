package com.thinking.service.impl;


import com.thinking.dao.model.User;
import com.thinking.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author：caoj
 * @Description：
 * @Date：Created in 2018/6/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class UserServiceImplTest2 {
    @Autowired
    public UserService userService;

    @Test
    public void testGetUserById() {

        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
    }
}