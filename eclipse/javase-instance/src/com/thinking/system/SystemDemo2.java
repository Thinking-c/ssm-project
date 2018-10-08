package com.thinking.system;

import java.util.Properties;

/**
 * @Author:caoj
 * @Date:2018/06/22
 * @version:v1.0
 * @Description:
 */
public class SystemDemo2 {
	public static void main(String args[]) {
		System.getProperties().list(System.out); // 列出系统的全部属性
		Properties properties = System.getProperties();
		String property = properties.getProperty("user.dir");
		System.out.println(property);
		System.out.println(System.getProperty("sun.java.command"));
		System.out.println(System.getProperty("java.class.path"));
	}

}
