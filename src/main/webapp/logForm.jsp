<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>

<h3>Formularz logowania</h3>
	
	<form action="LoginServlet" method="get">
		Username: <input type="text" name="username"><br>
		Password: <input type="password" name="password"><br><br>
		<input type="submit" value="Zaloguj"><br>
	</form>
	
</body>
</html>