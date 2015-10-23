package com.teapot.webprojectday;

import java.util.Date;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping(value = "/project_form_add.mvc", method=RequestMethod.GET) // do not have to put GET, it is used by default
	public String project_add_form(Model m) {
		m.addAttribute("page_title", "Add Project (Get)");
		return "project_form";
	}//project_add_form()
	
	@RequestMapping(value = "/project_form_add.mvc", method=RequestMethod.POST)
	public String project_add(Model m, 
			@RequestParam("name") String name, 
			@RequestParam("start_date") String start_date,
			@RequestParam("end_date") String end_date) {
		// I do not need to map it (there is nothing to be displayed)
		// but still need to call the method
		employeeMapper.addProject(name, start_date, end_date);
		m.addAttribute("page_title", "All Projects - New Project has been added");
		return "redirect:/list_projects.mvc";
	}//project_add()
	
	@RequestMapping(value = "/delete_project/{project_id}/list_projects_delete.mvc", method = RequestMethod.GET)
	public String projectDelete(Model m, @PathVariable("project_id") int project_id) {
	    employeeMapper.deleteProject(project_id);
		m.addAttribute("page_title", "All Projects - Project has been deleted");
		return "redirect:/list_projects.mvc";
	}//projectDelete()
	
	
}//class
