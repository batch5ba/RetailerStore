package com.store.loginservice.loginservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.loginservice.loginservice.entity.EmployeeEntity;




@Repository
public interface EmployeeDao extends JpaRepository<EmployeeEntity,Integer> {

}
