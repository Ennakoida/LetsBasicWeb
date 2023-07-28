package com.kh.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EnrollServlet
 */
@WebServlet("/member/register.do")
public class EnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
//    	super.doPost(req, resp);
    	doGet(req, resp);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String memberId = request.getParameter("member-id");
		String memberPw = request.getParameter("member-pw");
		String memberName = request.getParameter("member-name");
		String memberAge = request.getParameter("member-age");
		String memberGender = request.getParameter("member-gender");
		String memberEmail = request.getParameter("member-email");
		String memberAddr = request.getParameter("member-addr");
		String memberPhone = request.getParameter("member-phone");
		String memberHobby = request.getParameter("member-hobby");
		
		request.setAttribute("memberId", memberId);
		request.setAttribute("memberPw", memberPw);
		request.setAttribute("memberName", memberName);
		request.setAttribute("memberAge", memberAge);
		request.setAttribute("memberGender", memberGender);
		request.setAttribute("memberEmail", memberEmail);
		request.setAttribute("memberAddr", memberAddr);
		request.setAttribute("memberPhone", memberPhone);
		request.setAttribute("memberHobby", memberHobby);
		
		request.getRequestDispatcher("/member/memberResult.jsp").forward(request, response);
	}

}
