package com.thinking.single;
/**
 *@Author：caoj
 *@Description：
 *@Date：Created in Jun 12, 2018
 */
public class SingleEHan {
	
	//此处定义类变量实例并直接实例化，在类加载的时候就完成了实例化并保存在类中
	private static SingleEHan singleLanHan = new SingleEHan();

	//定义无参构造器，用于单例实例
	private SingleEHan() {
	}
	
	//定义公开方法，返回已创建的单例
	public static SingleEHan getInstance() {
		if(singleLanHan == null) {
			singleLanHan = new SingleEHan();
		}
		return singleLanHan;
	}
	
}
