package com.kh.taste;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TasteServlet
 */
@WebServlet("/tasteResult.do") // inputTaste.html과 맞춰주기
public class TasteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TasteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("요청왔어요!");
		
		// 쿼리스트링 추출
		// ?userName=이름입니다&color=red&animal=dog&food=food1&food=food2
		
		// 추출
		String userName = request.getParameter("userName");
		String color = request.getParameter("color"); // -> red
		String animal = request.getParameter("animal"); // -> cat
		String [] foods = request.getParameterValues("food"); // 받아올 값이 여러개는 쓰는 방식이 다름 // -> food1, food2
		
		// 2. RequestScope 사용
		request.setAttribute("name", userName);
		request.setAttribute("color", color);
		request.setAttribute("animal", animal);
		request.setAttribute("foods", foods);

		// 1. RequestDispatcher 사용
		RequestDispatcher view = request.getRequestDispatcher("/taste/tasteResult.jsp"); // jsp 지정
		view.forward(request, response);
		
		
		
//		// 출력
//		response.setContentType("text/html; charset=utf-8");
//		response.getWriter().append(userName + " 님이 ")
//							.append("선택한 색깔 : " + color)
//							.append(", 선택한 동물은 : " + animal)
//							.append(", 선택한 음식은 : " + foods[0] + ", " + foods[1]);
	}

}
