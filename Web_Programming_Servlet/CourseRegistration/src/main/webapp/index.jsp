<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="resources/css/style.css">
</head>
<body>
	<form action="serv1">
		<table >
			<tr>
				<td>Student ID:</td>
				<td><input type="text" name="txtStudentID"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="txtPassword"></td>
			</tr>
			<tr>
				<td><a href="registration.jsp">Register</a></td>
				<td><input type="button" value="Login"></td>
			</tr>
		</table>
	</form>

</body>
</html>