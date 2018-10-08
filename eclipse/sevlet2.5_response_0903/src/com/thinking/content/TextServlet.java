package com.thinking.content;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//设置response的编码方式
//		response.setCharacterEncoding("UTF-8");
		
		//通过一个头content-Type 告知客户端使用何种码表
//		response.setHeader("Content-Type", "text/html;charset=UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter writer = response.getWriter();
//		writer.write("hello response!!");
		writer.write("你好，世界！！");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
