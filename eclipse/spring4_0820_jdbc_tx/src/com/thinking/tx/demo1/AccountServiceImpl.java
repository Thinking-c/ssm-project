package com.thinking.tx.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 *@Author:caoj
 *@Date:2018/08/23
 *@version:v1.0
 *@Description:
 */
/**
 * @author Thinking
 *
 */
public class AccountServiceImpl implements AccountService {

	// 注入dao
	private AccountDao accountDao;

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	// 注入事物管理的模板
	private TransactionTemplate transactionTemplate;

	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	public void transfer(String from, String to, double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.outMoney(from, money);
				int i = 1 / 0;
				accountDao.inMoney(to, money);
			}
		});
		
	}

}
