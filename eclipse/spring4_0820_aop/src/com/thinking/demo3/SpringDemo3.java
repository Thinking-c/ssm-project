package com.thinking.demo3;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author:caoj
 * @Date:2018/08/20
 * @version:v1.0
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringDemo3 {

	@Resource(name = "productDao")
	private ProductDao productDao;

	@Test
	public void demo1() {
		productDao.save();
		productDao.update();
		productDao.find();
		productDao.delete();
	}

}
