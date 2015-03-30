<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>

<h3>Formularz rejestracyjny</h3>
	
	<form action="RegisterServlet" method="get">
		Username: <input type="text" name="username"><br>
		Password: <input type="password" name="password"><br>
		Confirm password: <input type="password" name="cpassword"><br>
		Email: <input type="text" name="email"><br><br>
		<input type="submit" value="Zarejestruj"><br>
	</form>	
	
</body>
</html>