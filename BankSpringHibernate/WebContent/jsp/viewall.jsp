<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@include file="header.html"%>
<%@page import="java.awt.List"%>
<html>
<head>
<title>View All Contacts</title>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 50%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>	
</head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">
<div align="center">
<h3>All contact details</h3>
<form method="post" action="/BankSpringHibernate/processViewAll.do">
<div align="center">
	<table cellpadding="3%" cellspacing="" width="80%" style="border:2px solid black;  margin-bottom:5%;">
		<h4>Personal Detail</h4>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Middle Name</th>
			<th>Gender</th>
		</tr>
		
		<c:forEach items='${pinfo}' var="item">
		<tr>
			<th>${item.personid}</th>
			<th>${item.firstName}</th>
			<th>${item.lastName}</th>
			<th>${item.middleName}</th>
			<th>${item.gender}</th>
		</tr>
		</c:forEach>
	</table>
	<table cellpadding="3%" cellspacing="" width="80%" style="border:2px solid black;">
		<h4>Contact Detail</h4>
		<tr>
			<th>Id</th>
			<th>Address</th>
			<th>Phone</th>
			<th>Email Id</th>
			
		</tr>
		<c:forEach items='${cinfo}' var="item">
			<tr>
			<th>${item.id}</th>
			<th>${item.address}</th>
			<th>${item.phone}</th>
			<th>${item.email}</th>
		</tr>
		</c:forEach>
	</table>
	<table cellpadding="3%" cellspacing="" width="80%" style="border:2px solid black;">
		<h4>Bank Detail</h4>
		<tr>
			<th>Id</th>
			<th>Bank Name</th>
			<th>Account No</th>
			<th>SSN No</th>
		</tr>
		<c:forEach items='${binfo}' var="item">
		<tr>
			<th>${item.bid}</th>
			<th>${item.bankName}</th>
			<th>${item.account}</th>
			<th>${item.ssn}</th>
		</tr>
		</c:forEach>
	</table>
</div>
</form>
</body>
</html>
<%@include file="footer.html"%>
