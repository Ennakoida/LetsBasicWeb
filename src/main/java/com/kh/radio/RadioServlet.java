package com.kh.radio;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/radioResult.do")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RadioServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿼리스트링 : ?gender=F&check-mail=yes
		String gender = request.getParameter("gender");
		String checkMail = request.getParameter("check-mail");
		
//		response.setContentType("text/html; charset=utf-8"); // 한글 깨짐 -> utf-8로 인코딩 형식 변환
//		response.getWriter().append("성별 : " + gender + "<br>")
//							.append("정보 수신 여부 : " + checkMail);
		
		// 1. request 객체 사용 (requestScope 사용)
		request.setAttribute("gender", gender);
		request.setAttribute("checkMail", checkMail); // 보낼 준비 완료
		
		// 2. RequestDispatcher 사용
		RequestDispatcher view = request.getRequestDispatcher("/radio/radioResult.jsp");
		view.forward(request, response);
	}

}
