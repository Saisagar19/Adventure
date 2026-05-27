<%@page import="java.io.PrintWriter"%>
<%@page import="com.app.dao.StudentDao,com.app.model.Student"%>

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
	<%
	String uname = request.getParameter("txtEmail");
	String pass = request.getParameter("txtPassword");

	if (uname != null && pass != null) {
		
		if (uname.equals("admin") && pass.equals("admin123")) {
            HttpSession adminSession = request.getSession();
            adminSession.setAttribute("adminLogin", "admin");
            response.sendRedirect("admin.jsp");
            return;
        }
		
		StudentDao stDao = new StudentDao();
		Student st = stDao.login(uname, pass);
		if (st != null) {
			HttpSession s = request.getSession();
			s.setAttribute("loginStudent", st);
			s.setAttribute("studentId", st.getId());
			response.sendRedirect("CourseServ");
			return;
		} else {
			response.sendRedirect("index.jsp?error=1");
			return;
		}
	}
	String error = request.getParameter("error");
	String errMsg = "";

	if ("1".equals(error)) {
		errMsg = "Invalid email or password.....";
	}
	%>

	<form action="index.jsp" method="post">
		<%
		if (!errMsg.isEmpty()) {
		%>
		<p style="color: red; text-align: center;"><%=errMsg%></p>
		<%
		}
		%>
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="txtEmail"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="txtPassword"></td>
			</tr>
			<tr>
				<td><a href="registration.jsp">Register</a></td>
				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>