<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="resources/styles2.css">
<title>${page_title}</title>
</head>
<body>
	<form action="/webprojectday/project_form_add.mvc" method="POST" >
    <h2>Create new Project</h2>
    <p>Insert the fields below to create a new project</p>
    <div class="inputField">
      <input type="text" name="name" placeholder="Name">
      <br />
    </div>
    <div class="inputField">
      <input type="text" name="start_date" placeholder="Start Date">
      <br />
    </div>
    <div class="inputField">
      <input type="text" name="end_date" placeholder="End Date">
      <br />
    </div>
    <div class="inputField">
      <input type="Submit" value="Submit"/>
    </div>
  </form>
	
	
</body>
</html>