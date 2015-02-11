<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Management</title>
</head>
<body>
<h1>User Data</h1>
<form:form action="user.do" method="POST" commandName="user">
	<table>
		<tr>
			<td>User ID</td>
			<td><form:input path="id" /></td>
		</tr>
		<tr>
			<td>First name</td>
			<td><form:input path="firstname" /></td>
		</tr>
		<tr>
			<td>Last name</td>
			<td><form:input path="lastname" /></td>
		</tr>
		<tr>
			<td>mail</td>
			<td><form:input path="mail" /></td>
		</tr>
		<tr>
			<td>address</td>
			<td><form:input path="address" /></td>
		</tr>
		<tr>
			<td>user name</td>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td>password</td>
			<td><form:input path="password" /></td>
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
	<th>First name</th>
	<th>Last name</th>
	<th>mail</th>
	<th>address</th>
	<th>user name</th>
	<th>password</th>
	<c:forEach items="${userList}" var="student">
		<tr>
			<td>${user.studentId}</td>
			<td>${user.firstname}</td>
			<td>${user.lastname}</td>
			<td>${user.mail}</td>
			<td>${user.address}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>