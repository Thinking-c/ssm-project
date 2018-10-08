package com.thinking.recursion;
/**
 *@Author:caoj
 *@Date:2018/08/09
 *@version:v1.0
 *@Description:
 */
public class RecursionTest {
	
	public static void main(String[] args) {
		
		Integer result = add(10);
		
		System.out.println("result:" + result);
	}
	
	public static Integer add(int i) {
		i++;
		if(i < 20) {
			System.out.println(i);
			add(i);
		}
		return i;
	}

}
