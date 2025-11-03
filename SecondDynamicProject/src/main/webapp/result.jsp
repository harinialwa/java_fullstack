<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("Name");
	String password = (String) request.getAttribute("Password");
	%>

<h1>  Hi  <%= name %>You have signedup.....</h1>
<h2>Don't expose your password : <%= password %> </h2>
</body>
</html>