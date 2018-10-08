package com.thinking.tx.demo3;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *@Author:caoj
 *@Date:2018/08/23
 *@version:v1.0
 *@Description:
 */

@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

	// 注入dao
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Override
	public void transfer(String from, String to, double money) {

		accountDao.outMoney(from, money);
		int i = 1 / 0;
		accountDao.inMoney(to, money);

	}

}
