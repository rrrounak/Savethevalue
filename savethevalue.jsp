<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save The Value</title>

</head>
<body>
<div align=center>
<h1>User Values</h1>

<form  modelAttribute="Savethevalue" action="submitForm">
<table>
<tr><td>Enter Name:</td><td><input name="name" type="text"></input></td></tr>
<tr><td>Enter EmailId:</td><td><input name="emailId" type="text"></input></td></tr>
<tr><td><input type=submit value=Submit id="Savethevalue"></td></tr>
</table>
</form>

</div>
</body>
</html>