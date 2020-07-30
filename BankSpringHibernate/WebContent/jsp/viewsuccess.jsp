<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="header.html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Final page </title>
<style type="text/css">
	.in{
	  border:1px solid blue;
	}
</style>
</head>
<body>
<div align="center">
<form:form method="post" action="/HThreePages/processViewById.do">
	<h3 align="center">Following is the information requested.</h3>
	<table  cellpadding="0" cellspacing="0" width="55%" align="center" style="margin-bottom: 2%;">
		<tr>
			<td style="padding-left: 30px;">Id</td>
			<td><input type="number" name="personId" maxlength="50" /></td>
			<td><input type="submit" name="save" value="View"/></td>
			<td width="201"><input type="reset" name="clear" value="Clear" />&nbsp;</td>
		</tr>
	</table>
	<table cellpadding="" cellspacing="" width="40%" align="center" style="border: 1px solid blue; margin-bottom:5%;">
		<tr>
			<td class="in">Id:</td>
			<td class="in">${pinfo.id}</td>
		</tr>	
		<tr>
			<td class="in">First Name:</td>
			<td class="in">${pinfo.firstName}</td>
		</tr>
		<tr>
			<td class="in">Last Name:</td>
			<td class="in">${pinfo.lastName}</td>
		</tr>
		<tr>
			<td class="in">Middle Name:</td>
			<td class="in">${pinfo.middleName}</td>
		</tr>
		<tr>
			<td class="in">Gender: </td>
			<td class="in">${pinfo.gender}</td>
		</tr>
		<tr>
			<td class="in">Address:</td>
			<td class="in">${cinfo.address}</td>
		</tr>
		<tr>
			<td class="in">City:</td>
			<td class="in">${cinfo.city}</td>
		</tr>
		<tr>
			<td class="in">State:</td>
			<td class="in">${cinfo.state}</td>
		</tr>
		<tr>
			<td class="in">Country: </td>
			<td class="in">${cinfo.country}</td>
		</tr>
		<tr>
			<td class="in">Phone: </td>
			<td class="in">${cinfo.phone}</td>
		</tr>
		<tr>
			<td class="in">Bank Name: </td>
			<td class="in">${binfo.bankName}</td>
		</tr>
		<tr>
			<td class="in">Account No: </td>
			<td class="in">${binfo.accountNo}</td>
		</tr>
		<tr>
			<td class="in">SSN No: </td>
			<td class="in">${binfo.ssnNo}</td>
		</tr>
	</table>
</form:form>
</div>
</body>
</html>
<%@include file="footer.html"%>