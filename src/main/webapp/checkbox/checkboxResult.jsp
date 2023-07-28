<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <% --%>
<!-- // 	String [] places = request.getParameterValues("place"); -->
<%-- %> --%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>관광지 선택 결과</title>
	</head>
	<body>
		<h1>관광지 선택 결과</h1>
<!-- 		선택한 장소는 -->
<%-- 		<% --%>
<!-- // 			for(int i = 0; i < places.length; i++) { -->
<%-- 		%> --%>
<%-- 			<%= places[i] %>, --%>
<%-- 		<% --%>
<!-- // 			} -->
<%-- 		%> --%>

			선택한 장소는 ${ requestScope.places[0] }

	</body>
</html>