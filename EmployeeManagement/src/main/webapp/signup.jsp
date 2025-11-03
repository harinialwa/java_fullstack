<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignUp</title>
</head>
<body>
	<h1>SignUp</h1>
	<form action="signup" method="post">
		<label for="email">Email : </label> 
		<input type="email" name="email" placeholder="Enter email"><br> <br>
		 <label for="password">Password : </label> 
		 <input type="text" name="password" placeholder="Enter password"><br> <br>
		 <label for="confirmpassword">Confirm Password : </label> 
		 <input type="password" name="confirmpassword" placeholder="Enter password again"><br> <br>
		<input type="submit" value="SignUp"><br> <br>
	</form>
	
	<p>Are You an Existing User? <a href="index.html">Login</a></p>
	
</body>
</html>