<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 9811978882 -->
	<%
	String msg = (String) request.getAttribute("msg");
	if (msg != null)
		out.print(msg);
	%>	
	
	<form action="uLogin" method="post">
		Username : <input type="text" name="uname"><br>
		Password : <input type="password" name="pword"><br>
	    <input type="submit"><br>
	</form>
</body>
</html>