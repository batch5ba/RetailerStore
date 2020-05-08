package com.store.ManagerService.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "employee_table")

public class EmployeeEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int empId;
	
	@Column(name = "emp_name")
	private String empName;
	
	@Column(name = "emp_level")
	private String empLevel;
	
	@Column(name = "emp_sal")
	private int empSal;
	
	@Column(name = "emp_hiredate")
	private Date empHiredate;
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private DepartmentEntity dept;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(int empId, String empName, String empLevel, int empSal, Date empHiredate,
			DepartmentEntity dept, UserEntity user) {
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
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empLevel=" + empLevel + ", empSal="
				+ empSal + ", empHiredate=" + empHiredate + ", dept=" + dept + ", user=" + user + "]";
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

	public DepartmentEntity getDept() {
		return dept;
	}

	public void setDept(DepartmentEntity dept) {
		this.dept = dept;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	
	
	
}