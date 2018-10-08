package com.thinking.system;

/**
 * @Author:caoj
 * @Date:2018/06/22
 * @version:v1.0
 * @Description:
 */
public class SystemDemo3 {

	public static void main(String args[]) {
		System.out.println("system version：" + System.getProperty("os.name") + " " + System.getProperty("os.version")
				+ " " + System.getProperty("os.arch"));
		System.out.println("system user：" + System.getProperty("user.name"));
		System.out.println("current user directory：" + System.getProperty("user.home"));
		System.out.println("current user work directory：" + System.getProperty("user.dir"));
	}

}
