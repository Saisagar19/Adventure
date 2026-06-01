<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Data</title>

<style type="text/css">
.form-container {
	width: 500px;
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
</style>
</head>
<body>
	<div class="form-container">
		<h2>Spring MVC 5 CRUD Operation</h2>
		<h3>Customer Form</h3>
		<form:form action="saveCustomer" method="post"
			modelAttribute="customer">
			<table border="1" class="form-table">
				<tr>
					<form:hidden path="id" />
				</tr>
				<tr>
					<td>Enter FirstName:</td>
					<td><form:input path="firstName" cssClass="input-field" /></td>
				</tr>
				<tr>
					<td>Enter LastName:</td>
					<td><form:input path="lastName" cssClass="input-field" /></td>
				</tr>

				<tr>
					<td>Enter Email-id:</td>
					<td><form:input path="email" cssClass="input-field" /></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button class="submit-btn">Submit</form:button></td>
				</tr>

			</table>
		</form:form>
	</div>
</body>
</html>