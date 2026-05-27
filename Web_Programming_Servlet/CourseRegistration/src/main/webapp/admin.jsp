<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@page
	import="com.app.dao.CourseDao, com.app.model.Courses, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet" href="resources/css/styleAdmin.css">
</head>
<body>

	<%
    HttpSession admin = request.getSession(false);
    if (admin == null || admin.getAttribute("adminLogin") == null) {
        response.sendRedirect("index.jsp");
        return;
    }

    CourseDao dao = new CourseDao();
    String action = request.getParameter("action");
    String msg = "";

    if ("add".equals(action)) {
        Courses c = new Courses();
        c.setName(request.getParameter("name"));
        c.setDescription(request.getParameter("description"));
        dao.addCourses(c);
        msg = "Course added successfully!";
    }

    if ("update".equals(action)) {
        Courses c = new Courses();
        c.setId(Integer.parseInt(request.getParameter("id")));
        c.setName(request.getParameter("name"));
        c.setDescription(request.getParameter("description"));
        dao.updateCourse(c);
        msg = "Course updated successfully!";
    }

    if ("delete".equals(action)) {
        dao.deleteCourse(Integer.parseInt(request.getParameter("id")));
        msg = "Course deleted successfully!";
    }
    
    List<Courses> courses = dao.getAllCourses();
%>

	<h2>Admin Dashboard</h2>
	<a href="logout.jsp">Logout</a>

	<%if (!msg.isEmpty()) {%>
	<p style="color: green;"><%=msg%></p>
	<%}%>

	<h3>Add New Course</h3>
	<form action="admin.jsp?action=add" method="post">
		<table>
			<tr>
				<td>Course Name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Description:</td>
				<td><input type="text" name="description"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Course">
				</td>
			</tr>
		</table>
	</form>

	<hr>

	<h3>All Courses</h3>
	<table border="1" cellpadding="8">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Description</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		<%for (Courses c : courses) {%>
		<tr>
			<td><%=c.getId()%></td>
			<td><%=c.getName()%></td>
			<td><%=c.getDescription()%></td>
			<td>
				<form action="admin.jsp?action=update" method="post">
					<input type="hidden" name="id" value="<%=c.getId()%>"> <input
						type="text" name="name" value="<%=c.getName()%>"> <input
						type="text" name="description" value="<%=c.getDescription()%>">
					<input type="submit" value="Update">
				</form>
			</td>

			<td>
				<form action="admin.jsp?action=delete" method="post">
					<input type="hidden" name="id" value="<%=c.getId()%>"> <input
						type="submit" value="Delete">
				</form>
			</td>
		</tr>
		<%}%>
	</table>
</body>
</html>