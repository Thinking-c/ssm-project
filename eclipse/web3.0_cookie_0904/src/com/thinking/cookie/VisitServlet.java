package com.thinking.cookie;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.scene.chart.PieChart.Data;

@WebServlet("/visitServlet")
public class VisitServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// 获得客户端的说有cookie
		Cookie[] cookies = request.getCookies();
		Cookie cookie = null;
		if (cookies != null) {
			// 从cookies的数组中查找指定名称的cookie
			for (Cookie cookie1 : cookies) {
				String cookieName = cookie1.getName();
				if (cookieName.equals("visitTime")) {
					String cookieValue = cookie1.getValue();
//					System.out.println(cookieValue);
					cookie = cookie1;
				}
			}
		}

		response.setContentType("text/html;charset=UTF-8");
		if (cookie == null) {
			// 第一次访问
			response.getWriter().println("<h1>欢迎来到本网站</h1>");
		} else {
			//不是第一次访问
			long time = Long.parseLong(cookie.getValue());
			Date date = new Date(time);
			response.getWriter().println("<h1>欢迎来到本网站！您上次访问时间是：" + sdf.format(date) + "</h1>");
		}
		Cookie c = new Cookie("visitTime", "" + System.currentTimeMillis());
		c.setMaxAge(10 * 60);
		c.setPath("/web3.0_cookie_0904/visitServlet");//只有访问visitServlet资源时才会携带这个cookie
		response.addCookie(c);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
