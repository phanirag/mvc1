<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>The enterd values are ok</h1>
	<table>
		<tr>
			<td>Name</td>
			<td>${newaccount.name}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${newaccount.email}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${newaccount.age}</td>
		</tr>
		<tr>
			<td>Address</td>
			<td>${newaccount.address}</td>
		</tr>
	</table>
</body>
</html>