package com.store.TaskService.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.store.TaskService.Entity.EmployeeEntity;
import com.store.TaskService.Entity.TaskEmployeeEntity;
import com.store.TaskService.Entity.TaskEntity;
import com.store.TaskService.Entity.UserEntity;
import com.store.TaskService.dao.TaskDao;
import com.store.TaskService.dao.TaskEmployeeDao;
import com.store.TaskService.model.EmployeePojo;
import com.store.TaskService.model.TaskEmployeePojo;
import com.store.TaskService.model.TaskPojo;
import com.store.TaskService.model.UserPojo;



@Service

public class TaskServiceImpl implements TaskService {
	
	@Autowired
	TaskDao taskDao;
	
	@Autowired
	TaskEmployeeDao taskEmployeeDao; 
	

	@Override
	//@Transactional
	public TaskPojo addTask(TaskPojo taskPojo) {
		
		
		EmployeePojo empPojo = taskPojo.getEmployee();

		EmployeeEntity empEntity = new EmployeeEntity();
		empEntity.setEmp_id(empPojo.getEmp_id());
		
		TaskEntity taskEntity = new TaskEntity(taskPojo.getTask_id(),taskPojo.getTask_action(),taskPojo.getTask_status(),empEntity);
		
		taskEntity=taskDao.save(taskEntity);
		taskPojo.setTask_id(taskEntity.getTask_id());
		
		
			
		
			
		return taskPojo;
	}


	@Override
	public TaskPojo getTask(int task_id) {
		// TODO Auto-generated method stub
		
		TaskPojo taskPojo=null;
		Optional result = taskDao.findById(task_id);
		if(result.isPresent())
		{
			TaskEntity taskEntity=(TaskEntity) result.get();
			
			EmployeeEntity empEntity=taskEntity.getEmployee();
			EmployeePojo empPojo=new EmployeePojo(empEntity.getEmp_id(),empEntity.getEmp_name(),empEntity.getEmp_level(),
					empEntity.getEmp_sal(),empEntity.getEmp_hiredate(),empEntity.getDept_id(),empEntity.getUser_id());
		
			 taskPojo=new TaskPojo(taskEntity.getTask_id(),taskEntity.getTask_status(),taskEntity.getTask_action(),empPojo);
			
		}
		return taskPojo;
	}

}
