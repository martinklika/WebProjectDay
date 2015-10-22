package com.teapot.webprojectday;

import java.sql.Blob;
import java.util.Date;

/**
 * Employee Class
 */
public class Employee {

	// Instance variables
	private int employeeId;
	private Date dateOfBirth;
	private String fName;
	private String sName;
	private String title;
	private Blob picture;
	private double salary;
	private String department;

	// Default Constructor
	public Employee() {
	}

	// Constructor (all parameters)
	public Employee(int employeeId, Date dateOfBirth, String fName,
			String sName, String title, Blob picture, double salary,
			String department) {
		this.employeeId = employeeId;
		this.dateOfBirth = dateOfBirth;
		this.fName = fName;
		this.sName = sName;
		this.title = title;
		this.picture = picture;
		this.salary = salary;
		this.department = department;
	}

	// Get and Set methods
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Blob getPicture() {
		return picture;
	}

	public void setPicture(Blob picture) {
		this.picture = picture;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
}//class
