package com.thinking.tx.demo3;

/**
 * @Author:caoj
 * @Date:2018/08/23
 * @version:v1.0
 * @Description:
 */
public interface AccountDao {

	public void outMoney(String from, Double money);

	public void inMoney(String to, Double money);
}
