package com.thinking.tx.demo1;
/**
 *@Author:caoj
 *@Date:2018/08/23
 *@version:v1.0
 *@Description: 转账的业务层接口
 */
public interface AccountService {
	
	/**
	 * @param from 转出账号
	 * @param to 转入账号
	 * @param money 转账金额
	 */
	public void transfer(String from, String to, double money);

}
