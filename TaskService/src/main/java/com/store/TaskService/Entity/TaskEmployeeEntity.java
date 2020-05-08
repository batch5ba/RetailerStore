package com.store.TaskService.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task_emptable")

public class TaskEmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_emp_id")
	private int taskempId;
	
	@Column(name = "task_status")
	private String taskStatus;
	
	
	@ManyToOne	
	@JoinColumn(name = "task_id")
	TaskEntity task;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	EmployeeEntity emp;

	public TaskEmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TaskEmployeeEntity(int taskempId, String taskStatus, TaskEntity task, EmployeeEntity emp) {
		super();
		this.taskempId = taskempId;
		this.taskStatus = taskStatus;
		this.task = task;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "TaskEmployeeEntity [taskempId=" + taskempId + ", taskStatus=" + taskStatus + ", task=" + task + ", emp="
				+ emp + "]";
	}

	public int getTaskempId() {
		return taskempId;
	}

	public void setTaskempId(int taskempId) {
		this.taskempId = taskempId;
	}

	public String getTaskStatus() {
		return taskStatus;
	}

	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	public TaskEntity getTask() {
		return task;
	}

	public void setTask(TaskEntity task) {
		this.task = task;
	}

	public EmployeeEntity getEmp() {
		return emp;
	}

	public void setEmp(EmployeeEntity emp) {
		this.emp = emp;
	}
	
	
	
	

	

}
