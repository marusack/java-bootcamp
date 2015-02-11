<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product Management</title>
</head>
<body>
<h1>Product Data</h1>
<form:form action="product.do" method="POST" commandName="product">
	<table>
		<tr>
			<td>User ID</td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td>name</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td>price</td>
			<td><form:input path="price" /></td>
		</tr>
		<tr>
			<td>quantity</td>
			<td><form:input path="quantity" /></td>
		</tr>
		<tr>
			<td>description</td>
			<td><form:input path="description" /></td>
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
	<th>name</th>
	<th>price</th>
	<th>quantity</th>
	<th>description</th>
	<c:forEach items="${productList}" var="product">
		<tr>
			<td>${product.Id}</td>
			<td>${product.name}</td>
			<td>${product.price}</td>
			<td>${product.quantity}</td>
			<td>${product.description}</td>
			
		</tr>
	</c:forEach>
</table>