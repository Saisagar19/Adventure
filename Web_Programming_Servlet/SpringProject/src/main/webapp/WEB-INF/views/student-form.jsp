<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processForm" method="POST"
		modelAttribute="theStudent">
		<table>
			<tr>
				<td>Enter FirstName:</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter LastName:</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Select Country:</td>
				<td><form:select path="country">
						<form:options items="${theStudent.countryOptions}" />
					</form:select></td>
			</tr>
			<tr>
				<td>Select Favorite Language:</td>
				<td>Java<form:radiobutton path="favouriteLanguage" value="Java" />
					Spring<form:radiobutton path="favouriteLanguage" value="Spring" />
					SpringBoot<form:radiobutton path="favouriteLanguage"
						value="SpringBoot" />
				</td>
			</tr>
			<tr>
				<td>Select OperatingSystems:</td>
				<td>Windows<form:checkbox path="operatingSystems"
						value="windows" /> MAC_OS<form:checkbox path="operatingSystems"
						value="mac" /> Linux<form:checkbox path="operatingSystems"
						value="linux" />
				</td>
			</tr>
			<tr>
				<td><form:button value="SUBMIT">Submit</form:button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>