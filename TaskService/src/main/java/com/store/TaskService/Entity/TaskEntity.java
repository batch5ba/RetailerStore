package com.store.TaskService.Entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table(name = "task_table")
public class TaskEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id")
	private int task_id;
	
	@Column(name = "task_action")
	private String task_action;
	
	@Column(name = "task_status")
	private String task_status;
	
	@ManyToOne
	@JoinColumn(name = "emp_id")
	private EmployeeEntity employee;


	public TaskEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	public TaskEntity(int task_id, String task_action, String task_status, EmployeeEntity employee) {
		super();
		this.task_id = task_id;
		this.task_action = task_action;
		this.task_status = task_status;
		this.employee = employee;
	}




	@Override
	public String toString() {
		return "TaskEntity [task_id=" + task_id + ", task_action=" + task_action + ", task_status=" + task_status
				+ ", employee=" + employee + "]";
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




	public EmployeeEntity getEmployee() {
		return employee;
	}




	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}


	
	
	  /*@OneToMany(mappedBy = "task")
	    Set<TaskEmployeeEntity>allTasks;*/
	
	
	

}
