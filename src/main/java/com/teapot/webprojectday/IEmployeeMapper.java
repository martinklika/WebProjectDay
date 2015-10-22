package com.teapot.webprojectday;

import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface IEmployeeMapper {

	@Select("SELECT employee_id, Title, F_name, L_name, DateOfBirth, Salary FROM employee")
	List<Employee> getEmployees();
	
	@Select("SELECT employee.employee_id, employee.DateOfBirth, "
			+ "employee.F_name, employee.L_name, employee.Title, employee.Picture, employee.Salary "
			+ "FROM employee LEFT JOIN project_staff "
			+ "ON employee.employee_id = project_staff.employee_id "
			+ " WHERE project_staff.project_id IS NULL; ")
	List<Employee> getEmployeesWithoutProjects();
	
	@Select("SELECT project_id, name, start_date, end_date FROM project;")
	List<Project> getProjects();
	
	@Select("SELECT project.project_id, project.name, project.start_date, project.end_date "
			+ "FROM project LEFT JOIN project_staff "
			+ "ON project.project_id = project_staff.project_id "
			+ "WHERE project_staff.project_id IS NULL; ")
	List<Project> getProjectsWithoutEmployees();
	
}//interface
