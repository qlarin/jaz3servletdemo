<%@ page import="jaz3servletdemo.source.User" %>
<%@ page import="jaz3servletdemo.repo.impl.Register" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Profile</title>
</head>
<body>

<center><h3>Profil użytkownika</h3><br>
<%  
	String nickname = (String) session.getAttribute("nickname");
	out.println("<p><b>Typ konta: </b>" + Register.getRegistered(nickname).getTask() +
			 "<br><b>Username: </b>" + Register.getRegistered(nickname).getUsername() +
			 "<br><b>Email: </b>" + Register.getRegistered(nickname).getEmail() +
			 "<br>"
			);
%>
<p><a href="service.jsp">Przejdź do menu</a></p>
</center>

</body>
</html>