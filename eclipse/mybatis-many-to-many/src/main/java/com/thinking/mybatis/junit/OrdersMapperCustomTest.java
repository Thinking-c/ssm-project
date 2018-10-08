package com.thinking.mybatis.junit;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import com.thinking.mybatis.mapper.OrdersMapperCustom;
import com.thinking.mybatis.pojo.Orders;
import com.thinking.mybatis.pojo.User;
import com.thinking.mybatis.utils.JacksonUtil;

/**
 * @Author:caoj
 * @Date:2018/09/20
 * @version:v1.0
 * @Description:
 */
public class OrdersMapperCustomTest {

	/*public static void main(String[] args) throws Exception {
		String resource = "sqlMapConfig.xml";
		InputStream in = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
		List<User> users = ordersMapperCustom.findUserAndItemsResultMap();
		for (User user : users) {
			System.out.println(JacksonUtil.bean2Json(user));
		}
	}*/

	private SqlSessionFactory sqlsessionFactory;

	@Before
	public void setUp() throws IOException {
		String resource = "sqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

	}

	@Test
	public void findUserAndItemsResultMapTest() throws Exception {
		SqlSession sqlSession = sqlsessionFactory.openSession();
		OrdersMapperCustom mapper = sqlSession.getMapper(OrdersMapperCustom.class);
		List<User> users = mapper.findUserAndItemsResultMap();
		for (User user : users) {
			System.out.println(JacksonUtil.bean2Json(user));
		}

	}

}
