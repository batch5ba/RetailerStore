package com.store.TaskService.controller;


import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.store.TaskService.model.TaskPojo;
import com.store.TaskService.service.TaskService;

@CrossOrigin
@RestController
@RequestMapping("store")

public class TaskController {
	
	
	@Autowired
	TaskService taskService;
	
	@PostMapping("task")
	TaskPojo addTask(@RequestBody TaskPojo taskPojo)
	{
				return taskService.addTask(taskPojo);
	}
	
	@GetMapping("task/{task_id}")
	TaskPojo getTask(@PathVariable("task_id") int task_id) {
		return taskService.getTask(task_id);
	}
}
