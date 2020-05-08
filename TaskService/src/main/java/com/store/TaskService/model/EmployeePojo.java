package com.store.TaskService.model;

import java.util.Date;

public class EmployeePojo {
	
	private int emp_id;
	private String emp_name;
	private String emp_level;
	private int emp_sal;
	private Date emp_hiredate;
	private int dept_id;
	private int user_id;
	
	public EmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeePojo(int emp_id, String emp_name, String emp_level, int emp_sal, Date emp_hiredate, int dept_id,
			int user_id) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_level = emp_level;
		this.emp_sal = emp_sal;
		this.emp_hiredate = emp_hiredate;
		this.dept_id = dept_id;
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "EmployeePojo [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_level=" + emp_level + ", emp_sal="
				+ emp_sal + ", emp_hiredate=" + emp_hiredate + ", dept_id=" + dept_id + ", user_id=" + user_id + "]";
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

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	

}
