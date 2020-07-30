<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="header.html"%>
<html>
<head>
<title>Delete Contact</title>
</head>
<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">
	<div align="center">
		<h3>Insert Id to be delete</h3>
		<form:form method="post"
			action="/BankSpringHibernate/processDeleteUser.do">
			<table cellpadding="0" cellspacing="0" width="55%"
				style="margin-bottom: 10%;">
				<tr>
					<td style="padding-left: 40px;">Id</td>
					<td><input name="personid" /></td>
					<td><input type="submit" name="save" value="Delete" /></td>
					<td width="201"><input type="reset" name="clear" value="Clear" />&nbsp;</td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>
<%@include file="footer.html"%>
