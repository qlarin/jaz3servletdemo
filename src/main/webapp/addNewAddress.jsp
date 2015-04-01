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
	String action = (String) session.getAttribute("update");
	if(action.equals("yes")){
		int id = (Integer) session.getAttribute("id");
		try{
			newadd.editAddress(address, id);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			response.sendRedirect("addressEdited.jsp");
		}
	}else{
		newadd.add(address);
		response.sendRedirect("addressAdded.jsp");
	}
%>

</body>
</html>