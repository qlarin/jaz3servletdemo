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
<% String nickname = (String) session.getAttribute("nickname"); %>

<center><h3>Lista adresów użytkownika <%=nickname%></h3><br>
<%   
		for(UserAddress ua : newadd.getAllAddresses()){
			if(ua.getUsername().equals(nickname)){
				out.println("<p><b>Typ adresu: </b>" + ua.getAddressType() +
					"<br><b> numer: </b>" + ua.getNr() +
					"<br><b> Województwo: </b>" + ua.getProvince() +
					"<br><b> Miasto: </b>" + ua.getCity() +
					"<br><b> Kod pocztowy: </b>" + ua.getPostcode() +
					"<br><b> Ulica: </b>" + ua.getStreet() +
					"<br><b> Numer domu/mieszkania: </b>" + ua.getHousenr() +
					"<br><a href=\"editAddress.jsp?nr=" + ua.getNr() +"\">Edytuj</a> | " +
					"<a href=\"deleteAddress.jsp?nr=" + ua.getNr() +"\">Usuń</a>" + "</a><br><br></p>");
			}
		}
%>
<p><a href="makeAddress.jsp">Dodaj nowy adres</a> | <a href="service.jsp">Przejdź do menu</a></p>	
</center>
	
</body>
</html>