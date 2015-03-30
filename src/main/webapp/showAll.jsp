<%@ page import="jaz2servletdemo.source.User" %>
<%@ page import="jaz2servletdemo.repo.impl.Register" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<p><a href="index.jsp">Powrót do strony głównej</a><p>

<center><h3>Lista zarejestrowanych użytkowników</h3><br>
<%	

  for (User user : Register.getAllRegistered()){
	  out.println("<p><b>Typ konta: </b>" + user.getTask() +
			  "<br><b>Username: </b>" + user.getUsername() +
			  "<br><b> Email: </b>" + user.getEmail() + "</br></br>");		 
	  for(int i=0; i<50;i++){
		  out.print("~~");
	  }
  	}
%>
</center>
</body>
</html>