<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
	<h1>
		name:
		<%=application.getAttribute("Name")%></h1>
	<h1>
		password:
		<%=session.getAttribute("Password")%></h1>
</body>
</html>