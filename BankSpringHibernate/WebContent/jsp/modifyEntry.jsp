<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@include file="header.html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Final page </title>
<style type="text/css">
	.in{
	  border:2px solid black;
	}
</style>
</head>
<body>
	<form:form method="post" modelAttribute="modifyPerson" action="/BankSpringHibernate/processModifyUser.do">
	<div align="center">
		<table  cellpadding="2%" cellspacing="2%" width="50%" style="margin-bottom:5%;">
		<tr>
		<td style="padding-left: 5px;">Id</td>
		<td><input type="number" name="personId"/></td>
		</tr>
		<tr>
			<td style="padding-left: 5px;">Mobile No</td>
			<td><input type="text" name="phone" maxlength="50"/></td>
		</tr>
		<tr>
			<td style="padding-left: 5px;">SSN No</td>
			<td><input type="text" name="ssn" maxlength="50" /></td>
		</tr>
		<tr>
			<td colspan="2" align="right">
			<br>
			<table  width="50%">
				<tr>
					<td><input type="submit" name="save" value="Modify"/></td>
					<td width="201"><input type="reset" name="clear" value="Clear" />&nbsp;</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
	</div>
	</form:form>
</body>
</html>
<%@include file="footer.html"%>