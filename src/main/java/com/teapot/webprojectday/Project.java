package com.teapot.webprojectday;

import java.sql.Date;

public class Project {
	
	// Instance variables
	private int project_id;
	private String name;
	private Date start_date;
	private Date end_date;
	
	// Default constructor
	public Project() {
	}
	
	// Constructor (all attributes)
	public Project(int project_id, String name, Date start_date, Date end_date) {
		this.project_id = project_id;
		this.name = name;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	// Get and Set methods
	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	// toString method
	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", name=" + name
				+ ", start_date=" + start_date + ", end_date=" + end_date + "]";
	}
	
}//class
