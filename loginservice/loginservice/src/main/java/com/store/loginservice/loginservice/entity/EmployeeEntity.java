package com.store.loginservice.loginservice.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "employee_table")

public class EmployeeEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private int emp_id;
	
	@Column(name = "emp_name")
	private String emp_name;
	
	@Column(name = "emp_level")
	private String emp_level;
	
	@Column(name = "emp_sal")
	private int emp_sal;
	
	@Column(name = "emp_hiredate")
	private Date emp_hiredate;
	
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private DepartmentEntity dept;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private UserEntity user;

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(int emp_id, String emp_name, String emp_level, int emp_sal, Date emp_hiredate,
			DepartmentEntity dept, UserEntity user) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_level = emp_level;
		this.emp_sal = emp_sal;
		this.emp_hiredate = emp_hiredate;
		this.dept = dept;
		this.user = user;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_level=" + emp_level + ", emp_sal="
				+ emp_sal + ", emp_hiredate=" + emp_hiredate + ", dept=" + dept + ", user=" + user + "]";
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_level() {
		return emp_level;
	}

	public void setEmp_level(String emp_level) {
		this.emp_level = emp_level;
	}

	public int getEmp_sal() {
		return emp_sal;
	}

	public void setEmp_sal(int emp_sal) {
		this.emp_sal = emp_sal;
	}

	public Date getEmp_hiredate() {
		return emp_hiredate;
	}

	public void setEmp_hiredate(Date emp_hiredate) {
		this.emp_hiredate = emp_hiredate;
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
