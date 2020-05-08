package com.store.TaskService.model;

import java.util.Set;

public class TaskPojo {	
	
	private int task_id;	
	private String task_action;	
	private String task_status;
	private EmployeePojo employee;
	//UserPojo user;
	
	public TaskPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TaskPojo [task_id=" + task_id + ", task_action=" + task_action + ", task_status=" + task_status
				+ ", employee=" + employee + "]";
	}
	public TaskPojo(int task_id, String task_action, String task_status, EmployeePojo employee) {
		super();
		this.task_id = task_id;
		this.task_action = task_action;
		this.task_status = task_status;
		this.employee = employee;
	}
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public String getTask_action() {
		return task_action;
	}
	public void setTask_action(String task_action) {
		this.task_action = task_action;
	}
	public String getTask_status() {
		return task_status;
	}
	public void setTask_status(String task_status) {
		this.task_status = task_status;
	}
	public EmployeePojo getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeePojo employee) {
		this.employee = employee;
	}
	
	
	//Set<TaskEmployeePojo> allTasks;
	
	
	
	

}
