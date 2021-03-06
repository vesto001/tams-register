package com.yash.tams.service;

import java.util.List;

import com.yash.tams.model.User;
/**
 * This is the Interface of the User Service Layer.
 *  Add methods here then implement them to the Impl
 * @author Brian Sutton
 *
 */
public interface UserService {

	/**
	 * Returns all Users From the database
	 * @return
	 */
	public List<User> getUsers();
	
	/**
	 * Sends User user to userDao and returns true if user was inserted, else
	 * returns false because user login name is already in database
	 * @param user
	 * @return
	 */
	public boolean registerUser(User user);
	
}
