<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Time on server :<%=new Date()%></h2>
	
	<%! int count = 0; %>
	<% count++; %>
	<%="View Count : "+count%>
	
	<h2>67 Greater than 42 <%= (67>42) %></h2>

</body>
</html>