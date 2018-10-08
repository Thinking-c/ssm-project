package com.thinking.demo2;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

/**
 * @Author:caoj
 * @Date:2018/08/20
 * @version:v1.0
 * @Description: Cglib动态代理
 */
public class CglibProxy implements MethodInterceptor {

	public CustomerDao customerDao;

	public CglibProxy(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	/**
	 * 使用cglib产生代理的方法
	 * @return
	 */
	public CustomerDao createProxy() {
		//1.创建Cglib的核心类对象
		Enhancer enhancer = new Enhancer();
		//2.设置父类
		enhancer.setSuperclass(customerDao.getClass());
		//3.设置回调（类似于InvocationHandler对象）
		enhancer.setCallback(this);
		//4.创建代理对象
		CustomerDao proxy = (CustomerDao) enhancer.create();
		return proxy;
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		//判断方法是否为save
		if("save".equals(method.getName())) {
			//增强
			System.out.println("======权限校验======");
			return methodProxy.invokeSuper(proxy, args);
		}
		return methodProxy.invokeSuper(proxy, args);
	}

}
