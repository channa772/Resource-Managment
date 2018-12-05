package com.channa.res.bean;

import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
	
	private int employeeId;
	private String employeeName;
	private String email;
	private int level;
	private String primarySkill;
	private String secondrySkill;
	private String location;
	
	public EmployeeBean() {
		super();
		
	}

	public EmployeeBean(int employeeId, String employeeName, String email, int level, String primarySkill,
			String secondrySkill, String location) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.email = email;
		this.level = level;
		this.primarySkill = primarySkill;
		this.secondrySkill = secondrySkill;
		this.location = location;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getPrimarySkill() {
		return primarySkill;
	}

	public void setPrimarySkill(String primarySkill) {
		this.primarySkill = primarySkill;
	}

	public String getSecondrySkill() {
		return secondrySkill;
	}

	public void setSecondrySkill(String secondrySkill) {
		this.secondrySkill = secondrySkill;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "EmployeeBean [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", level=" + level + ", primarySkill=" + primarySkill + ", secondrySkill=" + secondrySkill
				+ ", location=" + location + "]";
	}
	
}
