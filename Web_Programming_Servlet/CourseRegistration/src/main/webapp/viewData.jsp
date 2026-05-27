<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="com.app.model.Student, com.app.model.Courses, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Data</title>
<link rel="stylesheet" href="resources/css/styleView.css">
</head>
<body>
	<%
	Student student = (Student) request.getAttribute("student");
	List<Courses> courses = (List<Courses>) request.getAttribute("courses");
	%>
	<div class="container">

		<div>
			<h2>Student Data</h2>

			<p>
				ID :
				<%=student.getId()%></p>
			<p>
				FirstName :
				<%=student.getFirstName()%></p>
			<p>
				LastName :
				<%=student.getLastName()%></p>
			<p>
				Age :
				<%=student.getAge()%></p>
			<p>
				Email :
				<%=student.getEmail()%>
			</p>
		</div>
		<div class="box">
			<h2>Courses</h2>

			<ul>
				<%
				for (Courses c : courses) {
				%>

				<li><%=c.getName()%></li>

				<%
				}
				%>
			</ul>
		</div>

	</div>
</body>
</html>