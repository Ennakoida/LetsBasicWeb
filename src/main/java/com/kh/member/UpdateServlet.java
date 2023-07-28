package com.kh.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/member/modify.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberPw = request.getParameter("member-pw");
		String memberGender = request.getParameter("member-gender");
		String memberEmail = request.getParameter("member-email");
		String memberAddr = request.getParameter("member-addr");
		String memberPhone = request.getParameter("member-phone");
		String memberHobby = request.getParameter("member-hobby");
	
		// 1. request
		request.setAttribute("memberPw", memberPw);
		request.setAttribute("memberGender", memberGender);
		request.setAttribute("memberEmail", memberEmail);
		request.setAttribute("memberAddr", memberAddr);
		request.setAttribute("memberPhone", memberPhone);
		request.setAttribute("memberHobby", memberHobby);
		
		// 2. requestDispatcher
		// forward 누락 주의
		request.getRequestDispatcher("/member/modifyResult.jsp").forward(request, response);
	}
}
