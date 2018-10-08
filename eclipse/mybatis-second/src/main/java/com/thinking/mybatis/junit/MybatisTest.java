package com.thinking.mybatis.junit;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.thinking.mybatis.mapper.OrderMapper;
import com.thinking.mybatis.pojo.Orders;
import com.thinking.mybatis.pojo.User;

/**
 *@Author:caoj
 *@Date:2018/09/20
 *@version:v1.0
 *@Description:
 */
public class MybatisTest {
	
	@Test
	public void findAllOrdersTest() throws IOException {
		//加载配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		
		//创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//执行sql语句
		List<Orders> orders = sqlSession.selectList("test.findAllOrders");
		for(Orders order : orders) {
			System.out.println(order);
		}
	}
	
	@Test
	public void findAllOrdersTest2() throws IOException {
		//加载配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		
		//创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//给一个接口sqlSession生成一个实现类（动态代理技术）
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<Orders> orders = orderMapper.findAllOrders();
		for(Orders order : orders) {
			System.out.println(order);
		}
	}
	
	@Test
	public void findOrders() throws IOException {
		//加载配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		
		//创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//给一个接口sqlSession生成一个实现类（动态代理技术）
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<Orders> orders = orderMapper.findOrders();
		for(Orders order : orders) {
			System.out.println(order);
		}
	}
	
	@Test
	public void findUsers() throws IOException {
		//加载配置文件
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		
		//创建SqlSessionFactory
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		
		//创建SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		//给一个接口sqlSession生成一个实现类（动态代理技术）
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		List<User> users = orderMapper.findUsers();
		for(User user : users) {
			System.out.println(user);
		}
	}
	
	

}
