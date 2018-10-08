package com.thinking.test;

import java.beans.Beans;

import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thinking.dao.Bean1;
import com.thinking.dao.Bean2;
import com.thinking.dao.Car;
import com.thinking.dao.Car2;
import com.thinking.dao.Cat;
import com.thinking.dao.CollectionBean;
import com.thinking.dao.CustomerDaoImpl;
import com.thinking.dao.Employee;
import com.thinking.dao.UserDaoImpl;

/**
 * @Author:caoj
 * @Date:2018/08/17
 * @version:v1.0
 * @Description:
 */
public class SpringTest {

	/**
	 * 传统的方式调用，耦合性高，扩张性不强
	 */
	@Test
	public void demo1() {
		UserDaoImpl daoImpl = new UserDaoImpl();
		daoImpl.setName("张三");
		daoImpl.save();
	}

	/**
	 * spring的方式调用
	 */
	@Test
	public void demo2() {
		// 创建spring的工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDaoImpl daoImpl = (UserDaoImpl) applicationContext.getBean("userServiceImpl");
		daoImpl.save();
	}

	@Test
	public void demo10() {
		// 创建spring的工厂
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");
//		Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
		
	}

	/**
	 * Bean生命周期的配置
	 */
	@Test
	public void demo3() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerDaoImpl daoImpl = (CustomerDaoImpl) applicationContext.getBean("customerDaoImpl");
		daoImpl.save();
		applicationContext.close();
	}

	/**
	 * Bean的作用范围配置 xml文件中配置： scope: singleton:默认的，spring会采用单例模式创建这个对象
	 * prototype:多例模式创建对象 request:应用再web项目中，spring创建这个类以后，将这个类存入到request范围中
	 * session:应用再web项目中，spring创建这个类以后，将这个类存入到session范围中
	 * globalsession:应用再web项目中，必须在porlet环境下使用，但是如果没有这种环境，相当于session
	 */
	@Test
	public void demo4() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		CustomerDaoImpl daoImpl = (CustomerDaoImpl) applicationContext.getBean("customerDaoImpl");
		System.out.println(daoImpl);
		CustomerDaoImpl daoImpl2 = (CustomerDaoImpl) applicationContext.getBean("customerDaoImpl");
		System.out.println(daoImpl2);
		System.out.println(daoImpl == daoImpl2);
		applicationContext.close();
	}

	/**
	 * spring属性注入的方式：构造方法的方式
	 */
	@Test
	public void demo5() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car car = (Car) applicationContext.getBean("car");
		System.out.println(car);
	}

	/**
	 * spring属性注入的方式： set方法的方式 p命名空间的方式 SpEL的属性注入的方式
	 */
	@Test
	public void demo6() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Car2 car2 = (Car2) applicationContext.getBean("car2");
		System.out.println(car2);
	}

	/**
	 * set方法注入对象类型 p命名空间的方式注入对象类型 SpEL的属性注入
	 */
	@Test
	public void demo7() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Employee employee = (Employee) applicationContext.getBean("employee");
		System.out.println(employee);
	}

	/**
	 * spEL的属性注入
	 */
	@Test
	public void demo8() {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		Cat cat = (Cat) applicationContext.getBean("cat");
		System.out.println(cat);
	}

	// --------------------------------------------------------------------------------------------------------
	/**
	 * 集合类型的属性注入
	 */
	@Test
	public void demo9() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");
		System.out.println(collectionBean);
	}
	
}
