package com.store.loginservice.loginservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.loginservice.loginservice.entity.UserEntity;



@Repository
public interface UserDao extends JpaRepository<UserEntity,Integer>{
	
	UserEntity findByUsernameAndPassword(String username,String password);

}
