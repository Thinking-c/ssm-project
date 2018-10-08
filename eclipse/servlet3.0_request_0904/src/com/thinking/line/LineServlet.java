package com.thinking.line;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(displayName = "this is request line demo", urlPatterns = { "/lineServlet", "/line" }, name = "demo")
public class LineServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("getServerName:" + request.getServerName() + "<br>");

		String method = request.getMethod();
		System.out.println(method);
		String requestURI = request.getRequestURI();
		System.out.println("requestURI=" + requestURI);
		StringBuffer requestURL = request.getRequestURL();
		System.out.println("requestURL=" + requestURL);
		String contextPath = request.getContextPath();
		System.out.println("contextPath=" + contextPath);
		String queryString = request.getQueryString();
		System.out.println("queryString=" + queryString);
		String remoteAddr = request.getRemoteAddr();
		System.out.println("remoteAddr=" + remoteAddr);
		String contentType = request.getContentType();
		System.out.println("contentType=" + contentType);
		int localPort = request.getLocalPort();
		System.out.println("localPort=" + localPort);
		int remotePort = request.getRemotePort();
		System.out.println("remoteport=" + remotePort);
		int serverPort = request.getServerPort();
		System.out.println("serverPort=" + serverPort);

		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
