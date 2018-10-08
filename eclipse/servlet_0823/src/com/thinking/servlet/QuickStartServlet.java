package com.thinking.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:caoj
 * @Date:2018/08/24
 * @version:v1.0
 * @Description:
 */
public class QuickStartServlet extends HttpServlet {
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("servlet init running......");
		
		//1、获得servlet的那么
		String name = config.getServletName();
		System.out.println("servletName=" + name);
		//2、获得该servlet的初始化的参数
		String initParameter = config.getInitParameter("mysql");
		System.out.println(initParameter);
		//3、获得servletContext(上下文)对象
		ServletContext servletContext = config.getServletContext();
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("servlet service running......");
		int serverPort = req.getServerPort();
		System.out.println(serverPort);
		res.getWriter().write("servlet service running......");
	}

	@Override
	public void destroy() {
		System.out.println("servlet destroy running......");
	}

}
