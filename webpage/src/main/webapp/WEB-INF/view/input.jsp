<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Detail Page</title>
<style>
.err{
	color:red;
	font-size: 20px;
}
</style>
</head>
<body>
	<h1>This is the Input form</h1>
	<form:form commandName="newaccount" action="check" >
	<table>
		<tr>
			<td><form:label path="name">Name:</form:label></td>
			<td><form:input path="name" name="name"/></td>
			<form:errors cssClass="err" path="name"/>
		</tr>
		<tr>
			<td><form:label path="email">Email:</form:label></td>
			<td><form:input path="email" name="email"/></td>
			<form:errors cssClass="err" path="email"/>
		</tr>
		<tr>
			<td><form:label path="age">Age:</form:label></td>
			<td><form:input path="age" name="age"/></td>
			<form:errors cssClass="err" path="age"/>
		</tr>
		<tr>
			<td><form:label path="address">Address:</form:label></td>
			<td><form:textarea path="address" rows="5" cols="10" name="address"/></td>
     		<form:errors path="address" cssClass="err"/>
		</tr>
		<tr>
				<td><input type="submit" value="enter"/></td>
		</tr>
	</table>
	</form:form>
</body>
</html>