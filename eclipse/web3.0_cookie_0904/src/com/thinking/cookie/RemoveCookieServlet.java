package com.thinking.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/removeCookieServlet")
public class RemoveCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 删除客户端保存 name=zhangsan的cookie信息
		Cookie cookie = new Cookie("name", "");
		// 将path设置成与要删除cookie的path一致
		cookie.setPath("/web3.0_cookie_0904");
		// 设置时间是0
		cookie.setMaxAge(0);

		response.addCookie(cookie);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
