<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="show" method="get">
		<table border="1">
			<%
			session.getAttribute("empDetails");
			%>
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Salary</th>
			</tr>
			<tr>
				<td>${empDetails.id}</td>
				<td>${empDetails.firstName}</td>
				<td>${empDetails.lastName}</td>
				<td>${empDetails.salary}</td>
			</tr>
		</table>
	</form>
</body>
</html>