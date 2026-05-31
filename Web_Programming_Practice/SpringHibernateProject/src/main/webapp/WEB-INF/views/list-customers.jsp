<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Customers</title>
</head>
<body>

	<h2>CRM - Customer Relational Manager</h2>
	<hr />
	<input type="button" value="Add Customer"
		onclick="window.location.href = 'showForm'; return false;" />
	<br>
	<br>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<tr>
			<c:forEach var="theCustomer" items="${lustCust}">
				<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${theCustomer.id}" />
				</c:url>
				<c:url var="deleteLink" value="/customer/delete">
					<c:param name="customerId" value="${theCustomer.id}" />
				</c:url>
				<tr>
					<td>${theCustomer.firstName}</td>
					<td>${theCustomer.lastName}</td>
					<td>${theCustomer.email}</td>
					<td><a href="${updateLink}">Update</a></td>
					<td><a href="${deleteLink}">Delete</a></td>
				</tr>
			</c:forEach>
		</tr>
	</table>
</body>
</html>