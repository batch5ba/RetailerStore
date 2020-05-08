package com.store.ManagerService.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class EmployeePojo {
	
	private int empId;
	private String empName;
	private String empLevel;
	private int empSal;
	private Date empHiredate;
	DepartmentPojo dept;
	UserPojo user;
	
	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePojo(int empId, String empName, String empLevel, int empSal, Date empHiredate, DepartmentPojo dept,
			UserPojo user) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLevel = empLevel;
		this.empSal = empSal;
		this.empHiredate = empHiredate;
		this.dept = dept;
		this.user = user;
	}

	@Override
	public String toString() {
		return "EmployeePojo [empId=" + empId + ", empName=" + empName + ", empLevel=" + empLevel + ", empSal=" + empSal
				+ ", empHiredate=" + empHiredate + ", dept=" + dept + ", user=" + user + "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpLevel() {
		return empLevel;
	}

	public void setEmpLevel(String empLevel) {
		this.empLevel = empLevel;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public Date getEmpHiredate() {
		return empHiredate;
	}

	public void setEmpHiredate(Date empHiredate) {
		this.empHiredate = empHiredate;
	}

	public DepartmentPojo getDept() {
		return dept;
	}

	public void setDept(DepartmentPojo dept) {
		this.dept = dept;
	}

	public UserPojo getUser() {
		return user;
	}

	public void setUser(UserPojo user) {
		this.user = user;
	}
	

	
	
	
}
