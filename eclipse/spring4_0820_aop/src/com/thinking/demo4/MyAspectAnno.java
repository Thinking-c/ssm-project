package com.thinking.demo4;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @Author:caoj
 * @Date:2018/08/20
 * @version:v1.0
 * @Description:
 */
@Aspect(value = "")
public class MyAspectAnno {

	/**
	 * 前置通知
	 */
//	@Before(value = "execution(* com.thinking.demo4.OrderDao.save(..))")
	@Before(value = "MyAspectAnno.poincut3()")
	public void before() {
		System.out.println("======前置通知======");
	}

	/**
	 * 后置通知
	 */
//	@AfterReturning(value = "execution(* com.thinking.demo4.OrderDao.delete(..))", returning = "result")
	@AfterReturning(value="MyAspectAnno.poincut4()", returning="result")
	public void afterReturning(Object result) {
		System.out.println("=====后置通知=====" + result);
	}
	
	/**
	 * 环绕通知
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
//	@Around(value = "execution(* com.thinking.demo4.OrderDao.update(..))")
	@Around(value="MyAspectAnno.poincut2()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("======环绕前通知======");
		Object obj = joinPoint.proceed();
		System.out.println("======环绕后通知======" + obj);
		return obj;
	}
	
	/**
	 * 异常抛出通知
	 */
//	@AfterThrowing(value="execution(* com.thinking.demo4.OrderDao.find(..))", throwing="ex")
	@AfterThrowing(value="MyAspectAnno.poincut3()", throwing="ex")
	public void afterThrowing(Throwable ex) {
		System.out.println("======异常抛出通知======" + ex.getMessage());
	}
	
	/**
	 * 最终通知
	 */
//	@After(value="execution(* com.thinking.demo4.OrderDao.find(..))")
	@After(value="MyAspectAnno.poincut1()")
	public void after() {
		System.out.println("======最终通知======");
	}
	
	/**
	 * 切入点注解(解决多个通知作用在同一个方法上，修改便捷)
	 */
	@Pointcut(value = "execution(* com.thinking.demo4.OrderDao.find(..))")
	private void poincut1() {}
	@Pointcut(value = "execution(* com.thinking.demo4.OrderDao.update(..))")
	private void poincut2() {}
	@Pointcut(value = "execution(* com.thinking.demo4.OrderDao.save(..))")
	private void poincut3() {}
	@Pointcut(value = "execution(* com.thinking.demo4.OrderDao.delete(..))")
	private void poincut4() {}

}
