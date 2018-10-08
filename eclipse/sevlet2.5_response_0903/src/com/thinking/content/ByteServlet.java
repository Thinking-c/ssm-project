package com.thinking.content;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ByteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//使用response获得字节输出流
		ServletOutputStream outputStream = response.getOutputStream();
		
		//获得服务器上面的图片
		String realPath = this.getServletContext().getRealPath("a.jpg");
		InputStream inputStream = new FileInputStream(realPath);
		
		int len = 0;
		byte[] buffer = new byte[1024];
		while ((len = inputStream.read(buffer)) > 0) {
			
			outputStream.write(buffer, 0, len);
		}
		
		inputStream.close();
		outputStream.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
