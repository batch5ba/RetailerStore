package com.store.loginservice.loginservice.service;

import com.store.loginservice.loginservice.model.UserPojo;

public interface UserService {
	
	UserPojo validateUser(UserPojo userPojo);
	
	UserPojo addUser(UserPojo userPojo);
	

}
