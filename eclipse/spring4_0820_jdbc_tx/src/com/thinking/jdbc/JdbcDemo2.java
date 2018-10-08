package com.thinking.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.thinking.domain.Account;

/**
 * @Author:caoj
 * @Date:2018/08/21
 * @version:v1.0
 * @Description: JDBC模板的使用
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo2 {

	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	/**
	 * 保存
	 */
	@Test
	public void demo2() {
		String sql = "insert into account values (null, ?, ?)";
		int row = jdbcTemplate.update(sql, "李四", 10000d);
		System.out.println(row);
	}

	/**
	 * 修改
	 */
	@Test
	public void demo3() {
		String sql = "update account set name = ?, money = ? where id = ?";
		int row = jdbcTemplate.update(sql, "yiyi", 20000d, 1);
		System.out.println(row);
	}

	/**
	 * 删除
	 */
	@Test
	public void demo4() {
		String sql = "delete from account where id = ?";
		int row = jdbcTemplate.update(sql, 6);
	}

	/**
	 * 查询操作
	 */
	@Test
	public void demo5() {
		String sql = "select name from account where id = ?";
		String name = jdbcTemplate.queryForObject(sql, String.class, 5);
		System.out.println(name);
	}

	/**
	 * 查询操作
	 */
	@Test
	public void demo6() {
		String sql = "select * from account";
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql);
		System.out.println(queryForList.size());
		for (Map<String, Object> map : queryForList) {
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
			}
//			System.out.println(map);
		}
//		System.out.println(queryForList);
	}

	/**
	 * 冲击查询
	 */
	@Test
	public void demo7() {
		String sql = "select count(*) from account";
		Long count = jdbcTemplate.queryForObject(sql, Long.class);
		System.out.println(count);
	}

	/**
	 * 封装到一个对象中
	 */
	@Test
	public void demo8() {
		String sql = "select * from account where id = ?";
		Account account = jdbcTemplate.queryForObject(sql, new AccountRowMapper(), 1);
		System.out.println(account);
	}

	/**
	 * 查询多条记录
	 */
	@Test
	public void demo9() {
		String sql = "Select * from account";
		List<Account> list = jdbcTemplate.query(sql, new AccountRowMapper());
		System.out.println(list);
	}

	/**
	 * 数据封装
	 * @author Thinking
	 */
	class AccountRowMapper implements RowMapper<Account> {
		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account = new Account();
			account.setId(rs.getInt("id"));
			account.setName(rs.getString("name"));
			account.setMoney(rs.getDouble("money"));

			return account;
		}

	}
}
