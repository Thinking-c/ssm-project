package com.thinking.swap;
/**
 *@Author:caoj
 *@Date:2018/08/23
 *@version:v1.0
 *@Description:
 */
public class SwapTest {
	
	public static void main(String[] args) {
		
		int a = 9;
		int b = 12;
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a=" + a + ",b=" + b);
		
		int i = 35;
		System.out.println(i & 0x0f);

	}
	
	

}
