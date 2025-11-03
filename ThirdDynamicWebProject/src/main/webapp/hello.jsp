<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
	<h1>This is JSP page....</h1>
	<%
	String name = "Harini";
	out.println(name);
	%>

	<h1>
		Hi
		<%=name%>
		You are enrolled
	</h1>
</body>
</html>