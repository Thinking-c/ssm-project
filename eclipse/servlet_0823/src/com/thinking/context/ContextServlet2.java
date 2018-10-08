package com.thinking.context;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author:caoj
 * @Date:2018/08/24
 * @version:v1.0
 * @Description:
 */
public class ContextServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//域对象---从ServletContext域中取数据
		 String attribute = (String) this.getServletContext().getAttribute("name");
		 System.out.println(attribute);
		 
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

}
