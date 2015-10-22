<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${page_title}</title>
</head>
<body>
	<h1>${page_title}</h1>
	<a href=''>Add Project Button</a>
		<br>
	<a href='list_projects_without_employees.mvc'>
		View Projects without Employees (list_projects_without_employees.mvc)</a>
	<br>
	<a href='list_basic.mvc'>View All Employees Button (list_basic.mvc)</a>
	<br>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Start date</th>
			<th>End date</th>
		</tr>
		<c:forEach items="${projects}" var="project">
		<tr>
			<td>${project.project_id}</td>
			<td>${project.name}</td>
			<td>${project.start_date}</td>
			<td>${project.end_date}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>