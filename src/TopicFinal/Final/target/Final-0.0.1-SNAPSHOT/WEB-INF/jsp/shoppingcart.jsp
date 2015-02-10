<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Management</title>
</head>
<body>
<h1>ShoppingCart Data</h1>
<form:form action="shoppingcart.do" method="POST" commandName="shoppingcart">
	<table>
		<tr>
			<td>User ID</td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td>order</td>
			<td><form:input path="order" /></td>
		</tr>
		<tr>
			<td>productLine</td>
			<td><form:input path="productline" /></td>
		</tr>
		<tr>
			<td>user</td>
			<td><form:input path="user" /></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>order</th>
	<th>productLine</th>
	<th>user</th>
	
	<c:forEach items="${shoppingcartList}" var="shoppingcart">
		<tr>
			<td>${shoppingcart.Id}</td>
			<td>${shoppingcart.order}</td>
			<td>${shoppingcart.price}</td>
			<td>${shoppingcart.productLine}</td>
			
		</tr>
	</c:forEach>
</table>