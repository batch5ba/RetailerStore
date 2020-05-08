package com.store.loginservice.loginservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.loginservice.loginservice.dao.UserDao;
import com.store.loginservice.loginservice.entity.UserEntity;
import com.store.loginservice.loginservice.model.UserPojo;


@Service

public class UserServiceImpl implements UserService {
	
	static Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class.getClass());
	
	@Autowired
	UserDao userDao;

	@Override
	public UserPojo validateUser(UserPojo userPojo) {
		
		LOG.info("Enter validateUser()");
		
		System.out.println("username:" + userPojo.getUser_username());
		System.out.println("password:" + userPojo.getPassword());
	
		UserEntity userEntity=userDao.findByUsernameAndPassword(userPojo.getUser_username(),userPojo.getPassword());
		
		
		userPojo=new UserPojo(userEntity.getUser_id(),userEntity.getUsername(),userEntity.getUser_username(),
						userEntity.getPassword(),userEntity.getUser_role());
			
		LOG.info("Exit validateUser()");
		return userPojo;
			
	}

	@Override
	public UserPojo addUser(UserPojo userPojo) {
		
		UserEntity userEntity=new UserEntity(userPojo.getUser_id(),userPojo.getUsername(),userPojo.getUser_username(),
				userPojo.getPassword(),userPojo.getUser_role());
				// TODO Auto-generated method stub
		userDao.save(userEntity);
		return userPojo;
	}

}
