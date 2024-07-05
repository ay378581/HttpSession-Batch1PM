<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Registration Form</h1>
		<hr>
		<form action="uReg" method="post">
			<table>
				<tr>
					<td>Enter First Name :</td>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<td>Enter Last Name :</td>
					<td><input type="text" name="lname"></td>
				</tr>
				<tr>
					<td>Enter User Name :</td>
					<td><input type="text" name="uname"></td>
				</tr>
				<tr>
					<td>Enter Password :</td>
					<td><input type="password" name="pword"></td>
				</tr>
				<tr>
					<td>Enter Product Id :</td>
					<td><input type="text" name="pid"></td>
				</tr>
				<tr>
					<td>Enter Product Name :</td>
					<td><input type="text" name="pname"></td>
				</tr>
				<tr>
					<td>Product Price :</td>
					<td><input type="text" name="price"></td>
				</tr>
				<tr>
					<td>Quantity :</td>
					<td><input type="text" name="qty"></td>
				</tr>
				<tr>
					<td><input type="submit"></td>
					<td><input type="reset"></td>
				</tr>

			</table>
		</form>
	</center>
</body>
</html>