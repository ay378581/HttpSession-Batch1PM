<%@page import="com.ay.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="Error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	HttpSession hs = request.getSession(false);
	UserBean ub = (UserBean) hs.getAttribute("ubean");
	if (ub == null) {
		request.setAttribute("msg", "Session Expired");
		request.getRequestDispatcher("Login.jsp").include(request, response);
	} else {
	%>
	<h1>
		Welcome :
		<%=ub.getFname()%>/h1>


		<%
	}
	%>
	
</body>
</html>