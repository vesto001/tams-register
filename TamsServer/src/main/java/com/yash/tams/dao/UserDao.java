package com.yash.tams.dao;

import java.util.List;

import com.yash.tams.exception.TamsException;
import com.yash.tams.model.User;

/**
 * This is the Interface for the User Dao
 * @author Brian Sutton
 *
 */
public interface UserDao {

	/**
	 * Returns a List of all users in the database
	 * Or returns null if there is an error fetching from the database
	 * @return
	 */
	public List<User> getUsers() throws TamsException;
	
	/**
	 * Inserts new user into database if user login name is not found and returns true,
	 * else returns false
	 * @param user
	 * @return
	 */
	public boolean insertUser(User user) throws TamsException;
	
	/**
	 * Returns true if user login name is found, else returns false
	 * @param loginName
	 * @return
	 */
	public boolean findUserByUserName(String userName);
	
}
