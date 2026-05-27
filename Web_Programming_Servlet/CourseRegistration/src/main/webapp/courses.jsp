<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Courses</title>
<link rel="stylesheet" href="resources/css/styleCourse.css">
</head>
<body>
	<table>
		<tr>
			<th>Course</th>
			<th>Description</th>
			<th>Action</th>
		</tr>
		<c:forEach var="course" items="${courses}">
			<tr>
				<td>${course.name}</td>
				<td>${course.description}</td>
				<td><a href="EnrollServlet?courseId=${course.id}">Enroll</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="1"><a href="logout.jsp" id="logout">Logout</a></td>
			<td colspan="2"><a href="viewServ" id="view">View Data</a></td>
		</tr>
	</table>
</body>
</html>