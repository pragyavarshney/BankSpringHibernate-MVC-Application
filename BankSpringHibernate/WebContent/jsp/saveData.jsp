<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.html"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Final page </title>
<style type="text/css">
	td{
	  border:2px solid black;
	}
</style>
</head>
<body>
<div align="center">
<form:form method="post" modelAttribute="user" action="/BankSpringHibernate/jsp/success.jsp">
<h3 align="center">Please review your information and submit.</h3>
<table cellpadding="2%" cellspacing="" width="40%" align="center" style="border: 2px solid black">
<tr>
<td>First Name :</td><td>${person.firstName}</td>
</tr>
<tr>
<td>Last Name :</td><td>${person.lastName}</td>
</tr>
<tr>
<td>Middle Name :</td><td>${person.middleName}</td>
</tr>
<tr>
<td>Gender :</td><td>${person.gender}</td>
</tr>
<tr>
<td>Address :</td><td>${contact.address}</td>
</tr>
<tr>
<td>Phone :</td><td>${contact.phone}</td>
</tr>
<tr>
<td>Phone :</td><td>${contact.email}</td>
</tr>
<tr>
<td>Bank Name :</td><td>${bankDetails.bankName}</td>
</tr>
<tr>
<td>Account No :</td><td>${bankDetails.accountNo}</td>
</tr>
<tr>
<td>SSN No :</td><td>${bankDetails.ssnNo}</td>
</tr>
</table>
<div align="center" style="margin-top:10px;"><input type="submit" value="Submit"/></div>
</form:form>

</div>
</body>
</html>
<%@include file="footer.html"%>