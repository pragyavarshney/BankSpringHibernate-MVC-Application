<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@include file="header.html"%>
<html>
<head>
<title>View Contact</title>
</head>

<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

<center>
<h3>Please enter a id.</h3>
</center>
<!--Body: view contact information-->
<div align="center">
<form:form method="post" action="/HThreePages/processViewById.do">
	<p style="color:red;">${message}</p>
	<table  cellpadding="0" cellspacing="0" width="55%" style="margin-bottom:20%;">
		<tr>
			<td style="padding-left: 40px;">Id</td>
			<td><input type="number" name="personId" maxlength="50" /></td>
			<td><input type="submit" name="save" value="View"/></td>
			<td width="201"><input type="reset" name="clear" value="Clear" />&nbsp;</td>
		</tr>
	</table>
</form:form>
</div>
</body>
</html>
<%@include file="footer.html"%>