<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="resources/styles.css">
<title>${page_title}</title>
</head>
<body>
  <div class="body">
    <div class="title">
      <a href="">Add a new Employee</a>
      <a href="${button_employees_view_link}">${button_employees_view_title}</a>
      <a href="list_projects.mvc">View Projects</a>
      <h1>${page_title}</h1>
    </div>  
    <table>
      <tr>
        <th>Employee ID</th>
        <th>Title</th>
        <th>First name</th>
        <th>Last name</th>
        <th>Date of Birth</th>
        <th>Salary</th>
        <th>Update</th>
        <th>Delete</th>
      </tr>
      <c:forEach items="${employees}" var="employee">
      <tr>
        <td>${employee.employee_id}</td>
        <td>${employee.title}</td>
        <td>${employee.f_name}</td>
        <td>${employee.l_name}</td>
        <td>${employee.dateOfBirth}</td>
        <td>${employee.salary}</td>
        <td><input type="Submit" value="Update" class="update"/></td>
        <td><input type="Submit" value="Delete" class="delete"/></td>
      </tr>
    </c:forEach>
   
</table>
</div>

</body>
</html>