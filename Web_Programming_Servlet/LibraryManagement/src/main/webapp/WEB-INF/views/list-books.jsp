<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library - Book List</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	margin: 20px;
	background-color: #f4f6f9;
}

h2 {
	text-align: center;
	color: #2c3e50;
}

hr {
	border: 1px solid #ddd;
}

.add-btn {
	background-color: #28a745;
	color: white;
	padding: 10px 18px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	font-size: 14px;
}

.add-btn:hover {
	background-color: #218838;
}

.book-table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
	background-color: white;
	box-shadow: 0px 2px 8px rgba(0, 0, 0, 0.1);
}

.book-table th {
	background-color: #34495e;
	color: white;
	padding: 12px;
}

.book-table td {
	padding: 12px;
	text-align: center;
	border-bottom: 1px solid #ddd;
}

.book-table tr:nth-child(even) {
	background-color: #f8f9fa;
}

.book-table tr:hover {
	background-color: #e9ecef;
}

.available-yes {
	color: green;
	font-weight: bold;
}

.available-no {
	color: red;
	font-weight: bold;
}

.update-btn {
	text-decoration: none;
	background-color: #ffc107;
	color: black;
	padding: 6px 12px;
	border-radius: 4px;
	font-weight: bold;
}

.update-btn:hover {
	background-color: #e0a800;
}

.delete-btn {
	text-decoration: none;
	background-color: #dc3545;
	color: white;
	padding: 6px 12px;
	border-radius: 4px;
	font-weight: bold;
}

.delete-btn:hover {
	background-color: #c82333;
}
</style>
</head>
<body>
	<h2>Library Management System</h2>
	<hr />
	<input type="button" value="Add New Book"
		onclick="window.location.href = 'showForm'; return false;"
		class="add-btn" />
	<br>
	<br>

	<table border="1" class="book-table">
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Genre</th>
			<th>ISBN</th>
			<th>Available</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="tempBook" items="${listBooks}">
			<c:url var="updateLink" value="/book/showFormForUpdate">
				<c:param name="bookId" value="${tempBook.id}" />
			</c:url>
			<c:url var="deleteLink" value="/book/delete">
				<c:param name="bookId" value="${tempBook.id}" />
			</c:url>
			<tr>
				<td>${tempBook.title}</td>
				<td>${tempBook.author}</td>
				<td>${tempBook.genre}</td>
				<td>${tempBook.isbn}</td>
				<td><c:choose>
						<c:when test="${tempBook.available}">
							<span class="available-yes">Yes</span>
						</c:when>
						<c:otherwise>
							<span class="available-no">No</span>
						</c:otherwise>
					</c:choose></td>
				<td><a href="${updateLink}" class="update-btn">Update</a></td>
				<td><a href="${deleteLink}" class="delete-btn">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>