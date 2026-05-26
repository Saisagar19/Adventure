
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.app.dao.StudentDao,com.app.model.Student"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" href="resources/css/styleReg.css">
</head>
<body>
	<%
	String firstname = request.getParameter("txtfirstname");
	String lastname = request.getParameter("txtlastname");
	String email = request.getParameter("txtEmail");
	String age = request.getParameter("txtAge");
	String password = request.getParameter("txtPassword");
	
	String msg = "";
	String errMsg = "";
	
	if(firstname != null && lastname != null && email != null && age != null && password != null)
	{
		if(firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || age.isEmpty() || password.isEmpty())
		{
			errMsg = "All fields are required.";
		}
		else
		{
			int intAge = Integer.parseInt(age);
			
			Student st = new Student();
			st.setFirstName(firstname);
			st.setLastName(lastname);
			st.setAge(intAge);
			st.setEmail(email);
			st.setPassword(password);
			
			StudentDao stDao = new StudentDao();
			boolean isRegistered = stDao.registerStudent(st);
			
			if(isRegistered)
			{
				response.sendRedirect("registration.jsp?success=1");
			}
			else
			{
				errMsg = "Registration Failed";
			}
		}
	}
	String message = request.getParameter("success");
	if("1".equals(message))
	{
		msg = "Registration Successfully";
	}
	
	%>

	<!-- <h2>Hello Sagar....</h2> -->
	<form action="registration.jsp" method="post">
	<% if(!msg.isEmpty()) { %>
	<p style="color: green; text-align: center"><%= msg %></p>
	<%} %>

	<% if(!errMsg.isEmpty()) { %>
	<p style="color: red; text-align: center"><%= errMsg %></p>
	<%} %>
		<table>
			<tr>
				<td>Enter FirstName:</td>
				<td><input type="text" name="txtfirstname"></td>
			</tr>
			<tr>
				<td>Enter LastName:</td>
				<td><input type="text" name="txtlastname"></td>
			</tr>
			<tr>
				<td>Student Age:</td>
				<td><input type="text" name="txtAge"></td>
			</tr>
			<tr>
				<td>Enter Email:</td>
				<td><input type="email" name="txtEmail"></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><input type="password" name="txtPassword"></td>
			</tr>
			<tr>
				<td><input type="button" value="Back" 
				onclick="window.location='index.jsp'" 
				style="background-color: gray; border-radius: 5px; color: white; padding: 10px; width: 100%; border: none; cursor: pointer;"></td>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>