package com.thinking.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String requestURI = request.getRequestURI();
		System.out.println("requestURI=" + requestURI);
		StringBuffer requestURL = request.getRequestURL();
		System.out.println("requestURL=" + requestURL);
		String contextPath = request.getContextPath();
		System.out.println("contextPath=" + contextPath);
		String queryString = request.getQueryString();
		System.out.println("queryString=" + queryString);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
