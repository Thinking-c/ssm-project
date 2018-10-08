package com.thinking.system;

import java.awt.print.Printable;

/**
 * @Author:caoj
 * @Date:2018/06/22
 * @version:v1.0
 * @Description:
 */
public class SystemDemo4 {

	public static void main(String args[]) {
		Person per = new Person("张三", 30);
//		Thread thread = new Thread(per);
//		thread.start();
		per = null; // 断开引用
		System.gc(); // 强制性释放空间
		System.out.println("----------");	
	}

}

class Person implements Runnable{
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() { // 覆写toString()方法
		return "姓名：" + this.name + "，年龄：" + this.age;
	}

	public void finalize() throws Throwable { // 对象释放空间时默认调用此方法
		System.out.println("对象被释放 --> " + this);
	}

	@Override
	public void run() {
		System.out.println("----------");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("============");
		
	}
}
