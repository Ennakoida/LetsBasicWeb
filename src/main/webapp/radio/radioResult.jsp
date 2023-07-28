<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <% --%>
<!-- // 	// RadioServlet.java 정의 부분 그대로 따옴 -->
<!-- // 	String gender = request.getParameter("gender"); -->
<!-- // 	String checkMail = request.getParameter("check-mail"); -->
<%-- %> --%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>라디오 체크 결과</title>
	</head>
	<body>
<%-- 		성별 : <%= gender %> <br> --%>
<%-- 		정보 수신 여부 : <%= checkMail %> --%>

		성별 : ${ requestScope.gender } <br>
		정보 수신 여부 : ${ requestScope.checkMail }
	</body>
</html>