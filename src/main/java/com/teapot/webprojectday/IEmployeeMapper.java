package com.teapot.webprojectday;

import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface IEmployeeMapper {

	@Select("SELECT Title, F_name, L_name FROM employee")
	List<Employee> getEmployees();
	
}
