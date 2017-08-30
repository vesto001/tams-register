package com.yash.tams.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.yash.tams.model.User;
import com.yash.tams.service.UserService;
/**
 * This is the User Rest Api controller for the application
 * all mappings will be proceeded by /user when accessed externally 
 * @author Brian Sutton
 *
 */
import com.yash.tams.urls.TamsServerUrls;
@RestController
public class UserController {
	/**
	 * This is the User Service Implementation for the user controller
	 */
	@Autowired
	UserService userService;
	

	/**
	 * This controller method will return all users from the database
	 * Headers are added to let the browser know it is OK to receive the response.
	 * @param responce
	 * @return
	 */
	@RequestMapping(TamsServerUrls.USERS)
	public List<User> getUsers() {
		/*
		responce.setStatus(200);
		responce.addHeader("ok", "true");
		responce.addHeader("Access-Control-Allow-Origin", "*");
		responce.addHeader("content-type", "application/json");
		responce.setContentType("application/json");*/
		return userService.getUsers();
	}
	
	/**
	 * This controller method will register(insert) an user into the database.
	 * A success message will be sent to login page if user login name is unique,
	 * else a failure message will be sent to registration page.
	 * @param user
	 */
	@RequestMapping(value=TamsServerUrls.USER_REGISTRATION, method=RequestMethod.POST)
	public void registerUser(@RequestBody User user) {
		//Register user into the database
		userService.registerUser(user);
	}
//	changes are done in victors code

}
