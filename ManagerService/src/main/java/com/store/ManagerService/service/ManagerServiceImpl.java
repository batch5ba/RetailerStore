package com.store.ManagerService.service;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.store.ManagerService.dao.EmployeeDao;
import com.store.ManagerService.entity.DepartmentEntity;
import com.store.ManagerService.entity.EmployeeEntity;
import com.store.ManagerService.entity.UserEntity;
import com.store.ManagerService.model.DepartmentPojo;
import com.store.ManagerService.model.EmployeePojo;
import com.store.ManagerService.model.UserPojo;



@Service

public class ManagerServiceImpl  implements ManagerService{
	
	
	//@Autowired
	//ModelMapper modelMapper =new ModelMapper();
	
	@Autowired
	EmployeeDao empDao;

	@Override
	@Transactional
	public EmployeePojo addEmployee(EmployeePojo empPojo) {
		
				
	DepartmentPojo deptPojo=empPojo.getDept();	
		
	DepartmentEntity deptEntity=new DepartmentEntity();
	deptEntity.setDeptId(deptPojo.getDeptId());
       
	UserPojo userPojo=empPojo.getUser();
	UserEntity userEntity=new UserEntity();
	userEntity.setUserId(userPojo.getUserId());
        
				
	EmployeeEntity empEntity = new EmployeeEntity(empPojo.getEmpId(),empPojo.getEmpName(),empPojo.getEmpLevel(),
								empPojo.getEmpSal(),empPojo.getEmpHiredate(),deptEntity,userEntity);
		
		
		System.out.println("7");
		empEntity=empDao.saveAndFlush(empEntity);
		empPojo.setEmpId(empEntity.getEmpId());
		//System.out.println("8");
		
		//EmployeePojo employeePojo=modelMapper.map(empEntity,EmployeePojo.class);
		
       
		return empPojo;
				
	}
	
	@Override
	public Object deleteEmployee(Integer empId) {
		empDao.deleteById(empId);
		return empId;
		
	}
	@Override
	public EmployeePojo updateEmployee(EmployeePojo empPojo) {
		// TODO Auto-generated method stub
		DepartmentPojo deptPojo=empPojo.getDept();	
		
		DepartmentEntity deptEntity=new DepartmentEntity();
		deptEntity.setDeptId(deptPojo.getDeptId());
	       
		UserPojo userPojo=empPojo.getUser();
		UserEntity userEntity=new UserEntity();
		userEntity.setUserId(userPojo.getUserId());
	        
					
		EmployeeEntity empEntity = new EmployeeEntity(empPojo.getEmpId(),empPojo.getEmpName(),empPojo.getEmpLevel(),
									empPojo.getEmpSal(),empPojo.getEmpHiredate(),deptEntity,userEntity);
			
			
			
			empEntity=empDao.saveAndFlush(empEntity);
			empPojo.setEmpId(empEntity.getEmpId());
			return empPojo;
	}
	@Override
	public List<EmployeePojo> getAllEmployees() {
		List<EmployeePojo> allEmpPojo = new ArrayList();
		Iterable<EmployeeEntity> allEmpEntity = empDao.findAll();
		Iterator itr = allEmpEntity.iterator();
		while (itr.hasNext()) 
		{
			EmployeeEntity empEntity = (EmployeeEntity) itr.next();
			
			UserEntity userEntity=empEntity.getUser();
			
			UserPojo userPojo=new UserPojo(userEntity.getUserId(),userEntity.getUserName(),userEntity.getUserUsername(),
					userEntity.getUserPassword(),userEntity.getUserRole());
			
			DepartmentEntity deptEntity=empEntity.getDept();
			
			DepartmentPojo deptPojo=new DepartmentPojo(deptEntity.getDeptId(),deptEntity.getDeptName(),deptEntity.getDeptLocation());
			
			
			
			EmployeePojo empPojo=new EmployeePojo(empEntity.getEmpId(),empEntity.getEmpName(),empEntity.getEmpLevel(),
					empEntity.getEmpSal(),empEntity.getEmpHiredate(),deptPojo,userPojo);
			
			allEmpPojo.add(empPojo);
			
	}
		return allEmpPojo;
}

	@Override
	public EmployeePojo getEmployee(int empId) {
		
		EmployeePojo empPojo=null;
		Optional result = empDao.findById(empId);
		if(result.isPresent())
		{
			EmployeeEntity empEntity=(EmployeeEntity) result.get();
			
			UserEntity userEntity=empEntity.getUser();
			
			UserPojo userPojo=new UserPojo(userEntity.getUserId(),userEntity.getUserName(),userEntity.getUserUsername(),
					userEntity.getUserPassword(),userEntity.getUserRole());
			
			DepartmentEntity deptEntity=empEntity.getDept();
			
			DepartmentPojo deptPojo=new DepartmentPojo(deptEntity.getDeptId(),deptEntity.getDeptName(),deptEntity.getDeptLocation());
			
			
			
			empPojo=new EmployeePojo(empEntity.getEmpId(),empEntity.getEmpName(),empEntity.getEmpLevel(),
					empEntity.getEmpSal(),empEntity.getEmpHiredate(),deptPojo,userPojo);
		
			
			
		}
		
		
		return empPojo;
	}
	
	
	
}
