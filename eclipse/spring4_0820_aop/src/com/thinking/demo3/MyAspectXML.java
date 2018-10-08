package com.thinking.demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Author:caoj
 * @Date:2018/08/20
 * @version:v1.0
 * @Description: 切面类
 */
public class MyAspectXML {

	/**
	 * 前置通知
	 * 
	 * @param joinpoint
	 */
	public void checkPri(JoinPoint joinpoint) {
		System.out.println("=======权限校验======" + joinpoint);
	}

	/**
	 * 后置通知(参数名称（result）需要和xml配置的returning="result"参数名称相同)
	 */
	public void writeLog(Object result) {
		System.out.println("======日志记录======" + result);
	}

	/**
	 * 环绕通知
	 * 
	 * @return
	 * @throws Throwable
	 */
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("环绕前通知" + joinPoint);
		Object obj = joinPoint.proceed();
		System.out.println("环绕后通知" + joinPoint + obj);
		return obj;
	}
	
	/**
	 * 异常抛出通知(参数名称（ex）需要和xml配置的throwing="ex"参数名称相同)
	 */
	public void afterThrowing(Throwable ex) {
		ex.printStackTrace();
		System.out.println("======异常抛出通知======" + ex.toString());
	}
	
	/**
	 * 最终通知
	 */
	public void after() {
		System.out.println("======最终通知======");
	}

}
