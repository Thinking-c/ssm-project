package com.thinking.header;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//没有响应，告诉客户端重定向去servlet2
//		response.setStatus(302);
//		response.setHeader("Location", "/sevlet2.5_response_0903/servlet2");
		
		//封装成一个重定向的方法sendRedirect(url)
		response.sendRedirect("/sevlet2.5_response_0903/servlet2");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
