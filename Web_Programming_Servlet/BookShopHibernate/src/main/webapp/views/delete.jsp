<%@page import="com.app.dao.BookDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>
<jsp:useBean id="b" class="com.app.entity.Book"></jsp:useBean>
	<jsp:setProperty property="b" name="b" />
	<%
	int i = BookDAO.deleteBook(id);
	if (i > 0)
		response.sendRedirect("../viewBookServlet");
	%>
</body>
</html>