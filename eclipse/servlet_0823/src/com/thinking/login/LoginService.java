package com.thinking.login;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.thinking.domain.User;
import com.thinking.utils.DataSourceUtils;

/**
 * @Author:caoj
 * @Date:2018/08/24
 * @version:v1.0
 * @Description:
 */
public class LoginService extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// 在ServletCotext域中存一个数据count
		int count = 0;
		this.getServletContext().setAttribute("count", count);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 1.获取用户名和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// 2.从数据库中验证该用户名和密码是否正确
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "select * from user where username = ? and password = ?";
		User user = null;
		try {
			user = runner.query(sql, new BeanHandler<User>(User.class), username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 3.根据返回的结果给用户不同显示信息
		if (user != null) {
			ServletContext servletContext = this.getServletContext();
			Integer count = (Integer) servletContext.getAttribute("count");
			count++;
			// 用户登陆成功
			response.getWriter().write(user.toString() + "---you are success login person:" + count);
			servletContext.setAttribute("count", count);
		} else {
			// 用户登陆失败
			response.getWriter().write("username or password is wrong");
		}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
