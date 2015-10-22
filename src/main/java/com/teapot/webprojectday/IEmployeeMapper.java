package com.teapot.webprojectday;

import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface IEmployeeMapper {

	@Select("SELECT Title FROM employee")
	List<Employee> getEmployees();
	
}
