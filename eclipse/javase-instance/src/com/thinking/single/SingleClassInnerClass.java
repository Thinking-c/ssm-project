package com.thinking.single;
/**
 *@Author:caoj
 *@Date:2018/06/12
 *@version:v1.0
 *@Description:
 */
public class SingleClassInnerClass {
	
	public static class SingleHolder{
		private static SingleClassInnerClass singleClassInnerClass = new SingleClassInnerClass();
	}

	public SingleClassInnerClass() {
	}
	
	public static SingleClassInnerClass getInstance() {
		return SingleHolder.singleClassInnerClass;
	}
	
}
