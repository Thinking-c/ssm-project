package com.thinking.single;
/**
 *@Author:caoj
 *@Date:2018/06/12
 *@version:v1.0
 *@Description:饿汉式会占用较多的空间，因为其在类加载时就会完成实例化，而懒汉式又存在执行速率慢的情况。双重加锁机制呢,又有执行效率差的毛病。
 *             使用类级内部类结合多线程默认同步锁，同时实现延迟加载和线程安全。
 */
public class SingleTest {
	
	public static void main(String[] args) {
		//执行速率慢
		SingleLanHan instance = SingleLanHan.getInstance();
		SingleLanHan instance2 = SingleLanHan.getInstance();
		System.out.println(instance == instance2);
		
		//占用空间多
		SingleEHan instance3 = SingleEHan.getInstance();
		SingleEHan instance4 = SingleEHan.getInstance();
		System.out.println(instance3 == instance4);
		
		//执行效率差
		SingleDoubleLockLanHan instance5 = SingleDoubleLockLanHan.getInstance();
		SingleDoubleLockLanHan instance6 = SingleDoubleLockLanHan.getInstance();
		System.out.println(instance5 == instance6);
		
		//类级内部类结合多线程默认同步锁，同时实现延迟加载和线程安全
		SingleClassInnerClass instance7 = SingleClassInnerClass.getInstance();
		SingleClassInnerClass instance8 = SingleClassInnerClass.getInstance();
		System.out.println(instance7 == instance8);
	}

}
