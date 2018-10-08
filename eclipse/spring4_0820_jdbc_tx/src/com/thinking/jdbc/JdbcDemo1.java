package com.thinking.jdbc;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *@Author:caoj
 *@Date:2018/08/21
 *@version:v1.0
 *@Description: JDBC模板的使用
 */
public class JdbcDemo1 {

	@Test
	public void demo1() {
		//创建连接池
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///test");
		dataSource.setUsername("root");
		dataSource.setPassword("chargedot");
		//创建jdbc模板
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update("insert into account values (null, ?, ?)", "tutu", 10000d);
	}
}
