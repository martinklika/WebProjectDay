package com.teapot.webprojectday;

import java.sql.Blob;
import java.util.Date;

/**
 * Employee Class
 */
public class Employee {

	// Instance variables
	private int employee_id;
	private Date dateOfBirth;
	private String f_name;
	private String l_name;
	private String title;
	private Blob picture;
	private double salary;

	// Default Constructor
	public Employee() {
	}

	public Employee(int employee_id, Date dateOfBirth, String f_name,
			String l_name, String title, Blob picture, double salary) {
		super();
		this.employee_id = employee_id;
		this.dateOfBirth = dateOfBirth;
		this.f_name = f_name;
		this.l_name = l_name;
		this.title = title;
		this.picture = picture;
		this.salary = salary;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
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

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", dateOfBirth="
				+ dateOfBirth + ", f_name=" + f_name + ", l_name=" + l_name
				+ ", title=" + title + ", picture=" + picture + ", salary="
				+ salary + "]";
	}
	
	
	
}//class
