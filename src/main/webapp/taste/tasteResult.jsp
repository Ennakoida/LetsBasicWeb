<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <% --%>
<!--  	String userName = request.getParameter("userName"); -->
<!--  	String color = request.getParameter("color"); -->
<!--  	String animal = request.getParameter("animal"); -->
<!--  	String [] foods = request.getParameterValues("food"); -->
<%-- %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>취향 선택 결과</title>
</head>
<body>
<%-- 	<%= userName %> 님이 --%>
<%-- 	선택한 색깔 : <%= color %> --%>
<%-- 	, 선택한 동물은 : <%= animal %> --%>
<!-- 	, 선택한 음식은 :  -->
<%-- 	<% --%>
<!-- // 		for(String food : foods) { -->
<%-- 	%> --%>
<%-- 		<span style="color:red; background-color:yellow;"><%= food %>,</span> --%>
<%-- 	<% --%>
<!-- // 		} -->
<%-- 	%> --%>

<!-- 	requestScope. -> 생략 가능 -->
	${ requestScope.name } 님이
	선택한 색깔 : ${ requestScope.color }
	, 선택한 동물은 : ${ requestScope.animal }
	, 선택한 음식은 : <span style="color:red; background-color:yellow;">${ requestScope.foods },</span>
</body>
</html>