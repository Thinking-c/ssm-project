package com.thinking.context;
/**
 *@Author:caoj
 *@Date:2018/08/24
 *@version:v1.0
 *@Description:
 */

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获得ServletContext对象
		ServletContext servletContext = this.getServletContext();
		
		//1、获得初始化参数
		String initParameter = servletContext.getInitParameter("driver");
		System.out.println(initParameter);
		
		//2.获得a b c d.txt的绝对路径
		//2.1获得a.txt
		String realPath_a = servletContext.getRealPath("/a.txt");
		System.out.println(realPath_a);
		//2.2获得b.txt
		String realPath_b = servletContext.getRealPath("/WEB-INFO/b.txt");
		System.out.println(realPath_b);
		//2.3获得c.txt
		String realPath_c = servletContext.getRealPath("/WEB-INFO/classes/c.txt");
		System.out.println(realPath_c);
		//2.4获得d.txt ---获取不到的（发布不了） 
		
		
		//在读取src（classes）下的资源是可以同类加载器----专门加载classess下的文件
		//getResource("") 参数是一个相对`地址 相对classes
		String path = ContextServlet.class.getClassLoader().getResource("c.txt").getPath();
		System.out.println(path);
		
		//3、域对象---向servletContext中存数据
		servletContext.setAttribute("name", "zhangsan");
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
