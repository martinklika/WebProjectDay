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
		return "list_basic";
	}//employees()
	
	
}//class
