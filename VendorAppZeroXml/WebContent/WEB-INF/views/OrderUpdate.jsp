<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Item Edit Page</title>
</head>
<body>
<%@include file="UserMenu.jsp" %>
<h2>Update Page...</h2>
<form action="updateOrder" method="post">
<table>
	<tr>
	<td>Order id:</td><td><input type="text" name="orderId" value="${Orderobj.orderId}" readonly="readonly"/></td>
</tr>
<tr>
	<td>Order Code:</td><td><input type="text" name="orderCode" value="${Orderobj.orderCode}"/></td>
</tr>
<tr>
	<td>Order Cost:</td><td><input type="text" name="orderCost" value="${Orderobj.orderCost}"/></td>
</tr>
<tr>
	<td>Item Name:</td><td><input type="text" name="IName" value="${Orderobj.IName}"/></td>
</tr>
<tr>
	<td>CustID:</td><td><input type="text"name="custId" value="${Orderobj.custId}" readonly="readonly"></td>
</tr>
<tr>
		<td align="center"><input type="submit" value="Update"></td>
</tr>
</table>
</form>
</body>
</html>