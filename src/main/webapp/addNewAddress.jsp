<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="address" class="jaz3servletdemo.source.UserAddress" scope="session" />
<jsp:useBean id="newadd" class="jaz3servletdemo.repo.impl.addAddress" scope="application" />

<%
	newadd.add(address);

%>

</body>
</html>