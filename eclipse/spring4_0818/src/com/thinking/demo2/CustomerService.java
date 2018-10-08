package com.thinking.demo2;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 *@Author:caoj
 *@Date:2018/08/20
 *@version:v1.0
 *@Description:
 */
@Service("customerService")
@Scope("prototype")
public class CustomerService {
	/**
	 * <bean id=="" class="" init-method="init" destroy-method="destroy"/>
	 */
	@PostConstruct //相当于init-method
	private void init() {
		System.out.println("CustomerService被初始化了...");
	}
	
	public void save() {
		System.out.println("CustomerService的save方法执行了...");
	}
	
	@PreDestroy //相当于destroy-method
	private void destroy() {
		System.out.println("CustomerService被销毁了...");
	}

}
