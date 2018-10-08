package com.thinking.header;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hearderServlet")
public class HearderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String header = request.getHeader("User-Agent");
		System.out.println(header); 
		
		Enumeration<String> headerNames = request.getHeaderNames(); 
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			String headerValue = request.getHeader(headerName);
			System.out.println(headerName + ":" + headerValue);
		}
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
