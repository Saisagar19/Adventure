<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Customers</title>

<style type="text/css">
body {
	font-family: Arial, sans-serif;
	/* background-color: #f4f6f9; */
	
	margin: 20px;
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

.customer-table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
	background-color: white;
	box-shadow: 0px 2px 8px rgba(0, 0, 0, 0.1);
}

.customer-table th {
	background-color: #34495e;
	color: white;
	padding: 12px;
}

.customer-table td {
	padding: 12px;
	text-align: center;
	border-bottom: 1px solid #ddd;
}

.customer-table tr:nth-child(even) {
	background-color: #f8f9fa;
}

.customer-table tr:hover {
	background-color: #e9ecef;
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
	<h2>CRM - Customer Relational Manager</h2>
	<hr />
	<input type="button" value="Add Customer"
		onclick="window.location.href = 'showForm'; return false;"
		class="add-btn" />
	<br>
	<br>
	<table border="1" class="customer-table">
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach var="tempCustomer" items="${listCust}">
			<c:url var="updateLink" value="/customer/showFormForUpdate">
				<c:param name="customerId" value="${tempCustomer.id}" />
			</c:url>
			<c:url var="deleteLink" value="/customer/delete">
				<c:param name="customerId" value="${tempCustomer.id}" />
			</c:url>
			<tr>
				<td>${tempCustomer.firstName}</td>
				<td>${tempCustomer.lastName}</td>
				<td>${tempCustomer.email}</td>
				<td><a href="${updateLink}" class="update-btn">Update</a></td>
				<td><a href="${deleteLink}" class="delete-btn">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>