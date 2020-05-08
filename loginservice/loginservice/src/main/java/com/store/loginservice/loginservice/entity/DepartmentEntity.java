package com.store.loginservice.loginservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dept_table")


public class DepartmentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_id")
	private int dept_id;
	
	@Column(name = "dept_name")
	private String dept_name;
	
	@Column(name = "dept_location")
	private String dept_location;

	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentEntity(int dept_id, String dept_name, String dept_location) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.dept_location = dept_location;
	}

	@Override
	public String toString() {
		return "DepartmentEntity [dept_id=" + dept_id + ", dept_name=" + dept_name + ", dept_location=" + dept_location
				+ "]";
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	public String getDept_location() {
		return dept_location;
	}

	public void setDept_location(String dept_location) {
		this.dept_location = dept_location;
	}
	
	

}
