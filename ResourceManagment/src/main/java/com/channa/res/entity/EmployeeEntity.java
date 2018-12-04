package com.channa.res.entity;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employeeid")
	private int employeeId;
	@Column(name="employeename")
	private String employeeName;
	@Column(name="email")
	private String email;
	@Column(name="level")
	private int level;
	@Column(name="primaryskill")
	private String primarySkill;
	@Column(name="secondryskill")
	private String secondrySkill;
	@Column(name="location")
	private String location;
	
	public EmployeeEntity() {
		super();
		
	}

	public EmployeeEntity(int employeeId, String employeeName, String email, int level, String primarySkill,
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
