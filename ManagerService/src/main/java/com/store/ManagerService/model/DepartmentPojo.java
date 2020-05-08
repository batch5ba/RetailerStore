package com.store.ManagerService.model;

public class DepartmentPojo {
	
	

	private int deptId;
	private String deptName;
	private String deptLocation;
	
	public DepartmentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartmentPojo(int deptId, String deptName, String deptLocation) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}

	@Override
	public String toString() {
		return "DepartmentPojo [deptId=" + deptId + ", deptName=" + deptName + ", deptLocation=" + deptLocation + "]";
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptLocation() {
		return deptLocation;
	}

	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	
	
}
