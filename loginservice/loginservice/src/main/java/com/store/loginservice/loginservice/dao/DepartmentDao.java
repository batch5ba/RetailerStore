package com.store.loginservice.loginservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.loginservice.loginservice.entity.DepartmentEntity;


@Repository

public interface DepartmentDao extends JpaRepository<DepartmentEntity,Integer> {

}
