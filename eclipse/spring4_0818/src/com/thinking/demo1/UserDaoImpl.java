package com.thinking.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 *@Author:caoj
 *@Date:2018/08/18
 *@version:v1.0
 *@Description:
 */
//@Component(value="userDao")//相当于<bean id="userDao" class="com.thinking.demo1.UserDaoImpl">
@Repository(value="userDao")
public class UserDaoImpl implements UserDao {
	
	/**
	 * 注解方式设置属性的值，是可以没有set方法的
	 *     属性如果有set方法，需要将属性注入的注解添加到set方法
	 *     属性如果没有set方法，需要将属性注入的注解添加到属性上
	 */
	@Value("张三")
	private String name;
	
	/*public void setName(String name) {
		this.name = name;
	}*/

	@Override
	public void save() {
		System.out.println("DAO中保存用户的方法执行了..." + name);
	}

}
