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
      <a href="project_form_add.mvc">Add a new Project</a>
      <a href="${button_projects_view_link}">${button_projects_view_title}</a>
      <a href="list_basic.mvc">View Employees</a>
      <h1>${page_title}</h1>
    </div>
    <table>
      <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Start date</th>
        <th>End date</th>
        <th>Update</th>
        <th>Delete</th>
      </tr> 
      <c:forEach items="${projects}" var="project">
      <tr>
        <td>${project.project_id}</td>
        <td>${project.name}</td>
        <td>${project.start_date}</td>
        <td>${project.end_date}</td>
        <td><input type="Submit" value="Update" class="update"/></td>
        <td><a href="delete_project/${project.project_id}/list_projects_delete.mvc">Delete</a></td>
        
      </tr>
	  </c:forEach>
	</table>
</div>
</body>
</html>