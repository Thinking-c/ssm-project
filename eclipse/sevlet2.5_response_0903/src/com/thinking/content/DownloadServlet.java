package com.thinking.content;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取要下载文件的名称
		String fileName = request.getParameter("filename");

		// 要下载的文件的类型----客户端通过文件的MIME类型去区分类型
		response.setContentType(this.getServletContext().getMimeType(fileName));

		// 告诉客户端该文件不是直接解析，而是以附件的形式打开（下载）
		response.setHeader("Content-Disposition", "attachment;filename=" + fileName);

		// 获取文件的绝对路径
		String realPath = this.getServletContext().getRealPath("download/" + fileName);
		// 获取文件的输入流
		InputStream inputStream = new FileInputStream(realPath);
		// 获取输出流--通过response获得的输出流 用于向客户端写内容
		ServletOutputStream outputStream = response.getOutputStream();

		int len = 0;
		byte[] buffer = new byte[1024];
		while ((len = inputStream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, len);
		}

		inputStream.close();
//		outputStream.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
