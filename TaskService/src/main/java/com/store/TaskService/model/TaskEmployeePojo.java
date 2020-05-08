package com.store.TaskService.model;


public class TaskEmployeePojo {
	
	private int task_emp_id;
	private String task_status;
	
	TaskPojo task;
	EmployeePojo emp;
	
	public TaskEmployeePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskEmployeePojo(int task_emp_id, String task_status, TaskPojo task, EmployeePojo emp) {
		super();
		this.task_emp_id = task_emp_id;
		this.task_status = task_status;
		this.task = task;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "TaskEmployeePojo [task_emp_id=" + task_emp_id + ", task_status=" + task_status + ", task=" + task
				+ ", emp=" + emp + "]";
	}

	public int getTask_emp_id() {
		return task_emp_id;
	}

	public void setTask_emp_id(int task_emp_id) {
		this.task_emp_id = task_emp_id;
	}

	public String getTask_status() {
		return task_status;
	}

	public void setTask_status(String task_status) {
		this.task_status = task_status;
	}

	public TaskPojo getTask() {
		return task;
	}

	public void setTask(TaskPojo task) {
		this.task = task;
	}

	public EmployeePojo getEmp() {
		return emp;
	}

	public void setEmp(EmployeePojo emp) {
		this.emp = emp;
	}

	
	

}
