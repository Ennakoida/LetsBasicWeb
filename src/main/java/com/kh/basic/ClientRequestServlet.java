package com.kh.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clientRequest")
public class ClientRequestServlet extends HttpServlet {
	
//	@Override
//	public void init() throws ServletException {
//		// TODO Auto-generated method stub
//		super.init();
//	}
	
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		super.service(req, resp);
//	}
	
	
	// service 대신 doGet 사용
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
//			super.doGet(req, resp);
//		System.out.println("서버 요청 받았습니다!"); // console에 출력
		
		resp.setContentType("text/html; charset=utf-8"); // 한글 출력
		PrintWriter out = resp.getWriter(); // console이 아닌 html view에 출력함
//		out.println("서버 요청 받았습니다!");
		out.println("<html><head><title>요청에 대한 응답</title></head>"); // html도 출력 가능
		out.println("<body><h1>서버 요청 받았습니다!</h1></body>");
		out.println("</html>");
		}
	
//	@Override
//	public void destroy() {
//		// TODO Auto-generated method stub
//		super.destroy();
//	}
}
