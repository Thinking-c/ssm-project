package com.thinking.tx.demo2;
/**
 *@Author:caoj
 *@Date:2018/08/23
 *@version:v1.0
 *@Description:
 */

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:tx2.xml")
public class SpringDemo2 {
	
	@Resource(name = "accountService")
	private AccountService accountService;
	
	@Test
	public void demo1() {
		accountService.transfer("yiyi", "tutu", 1000);
	}

}
