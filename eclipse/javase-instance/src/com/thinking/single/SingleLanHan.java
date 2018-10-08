package com.thinking.single;
/**
 *@Author：caoj
 *@Description：
 *@Date：Created in Jun 12, 2018
 */
public class SingleLanHan {
	
	//定义一个私有类变量来存放单例，私有的目的是指外部无法直接获取这个变量，而要使用提供的公共方法来获取
	private static SingleLanHan singleLanHan = null;

	//定义私有构造器，表示只在类内部使用，亦指单例的实例只能在单例类内部创建
	private SingleLanHan() {
		
	}
	
	//定义一个公共的公开的方法来返回该类的实例，由于是懒汉式，需要在第一次使用时生成实例，所以为了线程安全，使用synchronized关键字来确保只会生成单例
	public static synchronized SingleLanHan getInstance() {
		if(singleLanHan == null) {
			singleLanHan = new SingleLanHan();
		}
		return singleLanHan;
	}
	
	
	
}
