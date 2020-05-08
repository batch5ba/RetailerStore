package com.store.TaskService.service;

import com.store.TaskService.model.TaskPojo;

public interface TaskService {
	
	TaskPojo addTask(TaskPojo taskPojo);
	
	TaskPojo getTask(int task_id);
	
	
	

}



