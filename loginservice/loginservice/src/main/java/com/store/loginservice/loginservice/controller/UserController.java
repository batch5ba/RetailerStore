package com.store.loginservice.loginservice.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.loginservice.loginservice.model.UserPojo;
import com.store.loginservice.loginservice.service.UserService;


@CrossOrigin
@RestController
@RequestMapping("store")
public class UserController {
	
	static Logger LOG = LoggerFactory.getLogger(UserController.class.getClass());
	
	@Autowired
	UserService userService;
	//@RequestMapping(method = RequestMethod.GET, value = "validate")
	@GetMapping("validate")
	
	//calling validateBuyer method 
	
	UserPojo validateUser(@RequestHeader("Authorization") String data) {
		
		LOG.info("Entered end point \'store/validate \' ");
		
		
		
		String token[] = data.split(":");
		UserPojo userPojo = new UserPojo();
		userPojo.setUser_username(token[0]);
		userPojo.setPassword(token[1]);
		LOG.info("Exited end point \'store/validate \' ");
		return userService.validateUser(userPojo);
	}
	
	@PostMapping("/user")
	UserPojo addUser(@RequestBody UserPojo userPojo)
	{
		return userService.addUser(userPojo);
	}


	 @GetMapping("user_table/{user_name}")
	 
	 public String greeting(@PathVariable String user_name) {
		LOG.info("Request {}",user_name);
		/*if(user_name.equalsIgnoreCase("user_name")){
			throw new RuntimeException(" Oops Exception raised... ");
		}*/
		String response = "Hi " + user_name + " Welcome to Retail Store";
		LOG.info("Response {}", response);
		return response;
	 }
}
