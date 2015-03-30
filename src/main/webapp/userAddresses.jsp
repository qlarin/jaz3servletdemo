<%@page import="jaz3servletdemo.source.UserAddress"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista adresów</title>
</head>
<body>

<jsp:useBean id="newadd" class="jaz3servletdemo.repo.impl.addAddress" scope="application" />

<center><h3>Lista adresów użytkownika <%=(String) session.getAttribute("nickname")%></h3><br>
<%  
	String nickname = (String) session.getAttribute("nickname");
		for(UserAddress ua : newadd.getAllAddresses()){
			if(ua.getUsername().equals(nickname)){
			out.println("<p><b>Typ adresu: </b>" + ua.getAddressType() +
					"<br><b> Województwo: </b>" + ua.getProvince() +
					"<br><b> Miasto: </b>" + ua.getCity() +
					"<br><b> Kod pocztowy: </b>" + ua.getPostcode() +
					"<br><b> Ulica: </b>" + ua.getStreet() +
					"<br><b> Numer domu/mieszkania: </b>" + ua.getHousenr() +
					"<br><br>");
			}
		}

%>
<p><a href="service.jsp">Przejdź do menu</a></p>	
	
</center>
	
</body>
</html>