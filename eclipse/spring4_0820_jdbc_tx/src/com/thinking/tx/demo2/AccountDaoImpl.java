package com.thinking.tx.demo2;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 *@Author:caoj
 *@Date:2018/08/23
 *@version:v1.0
 *@Description: 
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void outMoney(String from, Double money) {
		this.getJdbcTemplate().update("update account set money = money - ? where name = ?", money, from);
	}

	@Override
	public void inMoney(String to, Double money) {
		this.getJdbcTemplate().update("update account set money = money + ? where name = ?", money, to);
	}

}
