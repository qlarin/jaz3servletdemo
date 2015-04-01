<%@page import="jaz3servletdemo.source.UserAddress"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="newadd" class="jaz3servletdemo.repo.impl.addAddress" scope="application" />
<%  
		int id = Integer.parseInt(request.getParameter("nr"));
		try{
			for(UserAddress ua : newadd.getAllAddresses()){
				if(ua.getNr()==id){
					newadd.removeAddress(ua);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			response.sendRedirect("deleteComplete.jsp");
		}
%>
</body>
</html>