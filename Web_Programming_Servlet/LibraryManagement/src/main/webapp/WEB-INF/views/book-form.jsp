<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Form</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background-color: #f4f6f9;
}

.form-container {
	width: 520px;
	margin: 50px auto;
	background: white;
	padding: 25px;
	border-radius: 10px;
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.15);
}

.form-container h2, .form-container h3 {
	text-align: center;
	color: #2c3e50;
}

.form-table {
	width: 100%;
}

.form-table td {
	padding: 10px;
}

.input-field {
	width: 95%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 14px;
}

.input-field:focus {
	outline: none;
	border-color: #3498db;
}

.select-field {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 5px;
	font-size: 14px;
	background-color: white;
}

.submit-btn {
	background-color: #28a745;
	color: white;
	border: none;
	padding: 10px 18px;
	border-radius: 5px;
	cursor: pointer;
	font-size: 14px;
}

.submit-btn:hover {
	background-color: #218838;
}

.back-link {
	display: block;
	text-align: center;
	margin-top: 12px;
	color: #3498db;
	text-decoration: none;
}

.back-link:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="form-container">
		<h2>Library Management System</h2>
		<h3>Book Form</h3>

		<form:form action="saveBook" method="post" modelAttribute="book">
			<table class="form-table">
				<tr>
					<form:hidden path="id" />
				</tr>
				<tr>
					<td>Book Title:</td>
					<td><form:input path="title" cssClass="input-field"
							placeholder="Enter book title" /></td>
				</tr>
				<tr>
					<td>Author:</td>
					<td><form:input path="author" cssClass="input-field"
							placeholder="Enter author name" /></td>
				</tr>
				<tr>
					<td>Genre:</td>
					<td><form:select path="genre" cssClass="select-field">
							<form:option value="" label="-- Select Genre --" />
							<form:option value="Fiction" label="Fiction" />
							<form:option value="Non-Fiction" label="Non-Fiction" />
							<form:option value="Science" label="Science" />
							<form:option value="History" label="History" />
							<form:option value="Mystery" label="Mystery" />
							
						</form:select></td>
				</tr>
				<tr>
					<td>ISBN:</td>
					<td><form:input path="isbn" cssClass="input-field"
							placeholder="e.g. 978-458-8-74" /></td>
				</tr>
				<tr>
					<td>Available:</td>
					<td><form:select path="available" cssClass="select-field">
							<form:option value="true" label="Yes" />
							<form:option value="false" label="No" />
						</form:select></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button class="submit-btn">Save Book</form:button></td>
				</tr>
			</table>
		</form:form>

		<a href="${pageContext.request.contextPath}/book/list"
			class="back-link"> Back to Book List</a>
	</div>
</body>
</html>