package com.store.ManagerService.controller;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.store.ManagerService.model.EmployeePojo;
import com.store.ManagerService.model.TaskPojo;
import com.store.ManagerService.service.ManagerService;





@CrossOrigin
@RestController
@RequestMapping("/store")

public class ManagerController {
	
	@Autowired
	ManagerService managerService;
	
	
			
			  @PostMapping("/employee") 
			  EmployeePojo addEmployee(@RequestBody EmployeePojo empPojo)
			  {
				  return managerService.addEmployee(empPojo);
			  }
			  
			  @DeleteMapping("/employee/{empId}") public Object
			  deleteEmployee(@PathVariable("empId") int empId) { return
			  managerService.deleteEmployee(empId); }
			  
			  @PutMapping("/employee") EmployeePojo updateEmployee(@RequestBody
			  EmployeePojo empPojo) {
			  
			  return managerService.updateEmployee(empPojo); }
			  
			  @GetMapping("/employee/all") List<EmployeePojo> getAllEmployees(){
			  System.out.println("employee all"); return managerService.getAllEmployees();
			  } 
			  
			  @Test
			  @GetMapping("/employee/{empId}") EmployeePojo
			  getEmployee(@PathVariable("empId") int empId) { return
			  managerService.getEmployee(empId); }
			  
			 
			 
			  @GetMapping("/task/{task_id}") TaskPojo getTask(@PathVariable("task_id") int task_id) {
				  RestTemplate restTemplate = new RestTemplate(); 
			  System.out.println("Task Controller Entry");
			  TaskPojo taskpojo = restTemplate.getForObject( "http://localhost:8083/store/task/"+task_id, TaskPojo.class);
			  System.out.println(taskpojo);
			  return taskpojo; 
			  }
			 
		
}
