<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="header.html"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>BankInfo</title>
</head>
<body>
	<div align="center">
		<h1>Bank Details</h1>
		<form:form method="post" modelAttribute="bankDetails"
			action="/BankSpringHibernate/processUserBank.do">
			<table>
				<tr>
					<td>Bank Name:</td>
					<td><form:input path="bankName"  /></td>
				</tr>
				<tr>
					<td>Account No:</td>
					<td><form:input path="account"  /></td>
				</tr>
				<tr>
					<td>SSN No:</td>
					<td><form:input path="ssn"  /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Save Changes" /></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>

<%@include file="footer.html"%>