<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List basic</title>
</head>
<body>
	<h1>Employees</h1>
	<a href=''>Add Employee Button</a>
	<table border="1">
		<tr>
			<th>Title</th>
			<th>First name</th>
			<th>Last name</th>
		</tr>
		<c:forEach items="${employees}" var="employee">
		<tr>
			<td>${employee.title}</td>
			<td>${employee.f_name}</td>
			<td>${employee.l_name}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>