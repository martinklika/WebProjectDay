package com.teapot.webprojectday;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

	@Autowired
	public IEmployeeMapper employeeMapper;
	
	@RequestMapping("/list_basic.mvc")
	public String employees(Model m) {
		m.addAttribute("employees", employeeMapper.getEmployees());
		m.addAttribute("page_title", "All Employees");
		m.addAttribute("button_employees_view_title", "View Employees without Projects");
		m.addAttribute("button_employees_view_link", "list_employees_without_projects.mvc");
		return "list_basic";
	}//employees()
	
	@RequestMapping("/list_employees_without_projects.mvc")
	public String employeesWithoutProjects(Model m) {
		m.addAttribute("employees", employeeMapper.getEmployeesWithoutProjects());
		m.addAttribute("page_title", "Employees without Projects");
		m.addAttribute("button_employees_view_title", "View All Employees");
		m.addAttribute("button_employees_view_link", "list_basic.mvc");
		return "list_basic";
	}//employeesWithoutProjects()
	
	@RequestMapping("/list_projects.mvc")
	public String projects(Model m) {
		m.addAttribute("projects", employeeMapper.getProjects());
		m.addAttribute("page_title", "All Projects");
		m.addAttribute("button_projects_view_title", "View Projects without Employees");
		m.addAttribute("button_projects_view_link", "list_projects_without_employees.mvc");
		return "list_projects";
	}//projects()
	
	@RequestMapping("/list_projects_without_employees.mvc")
	public String projects_without_employees(Model m) {
		m.addAttribute("projects", employeeMapper.getProjectsWithoutEmployees());
		m.addAttribute("page_title", "Projects without Employees");
		m.addAttribute("button_projects_view_title", "View All Projects");
		m.addAttribute("button_projects_view_link", "list_projects.mvc");
		return "list_projects";
	}//projects_without_employees()
	
	
}//class
