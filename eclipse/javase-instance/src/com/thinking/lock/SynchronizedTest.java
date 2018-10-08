package com.thinking.lock;
/**
 *@Author:caoj
 *@Date:2018/08/31
 *@version:v1.0
 *@Description:
 */
public class SynchronizedTest {

	public synchronized void test1() {
		
	}
	
	public void test2() {
		synchronized (this) {
			
		}
	}
}
