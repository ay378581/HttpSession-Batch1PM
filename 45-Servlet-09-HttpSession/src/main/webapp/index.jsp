<html>
<body>

	<%
	String msg = (String) request.getAttribute("msg");
	if (msg != null)
		out.print(msg);
	%>
	<center>
		<h1>Home Page</h1>
		<hr>
		<a href="Login.jsp">Login</a><br> <a href="Register.jsp">Register</a>
	</center>
</body>
</html>
