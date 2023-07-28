package com.kh.checkbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Checkbox
 */
@WebServlet("/checkboxResult.do")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckboxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String [] places = request.getParameterValues("place"); // getParameter() 안의 값 : 쿼리스트링의 '=' 왼쪽의 값. / name 값		
				
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		
//		out.append("<h1>관광지 선택 결과</h1> 선택한 장소는 : ");
//		
//		for(int i = 0; i < places.length; i++)
//			out.append(places[i] + ", ");
		
		// 1. request 객체 사용
		request.setAttribute("places", places); // 보낼 준비
		
		// 2. RequestDispatcher 사용 -> jsp 경로 정의
		// .forward(request, response); 빼먹지 않게 주의
		request.getRequestDispatcher("/checkbox/checkboxResult.jsp").forward(request, response); // 전송 완료 (목적지 설정)		
							
	}

}
