<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="header.html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContactInfo</title>
</head>
<body>
	<div align="center">
		<h1>Contact Details</h1>
		<form:form method="post" modelAttribute="contact"
			action="/BankSpringHibernate/processUserContact.do">
			<table>
				<tr>
					<td>Address:</td>
					<td><form:input path="address" /></td>
				</tr>
				<tr>
					<td>Phone:</td>
					<td><form:input path="phone" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><form:input path="email" /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Next" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
<%@include file="footer.html"%>