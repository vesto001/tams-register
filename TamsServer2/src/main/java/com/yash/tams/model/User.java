package com.yash.tams.model;

/**
 * This is the User model/pojo class for the application.
 * Used to pass data through the application
 * 
 * @author Brian Sutton
 *
 */
public class User {

	/**
	 * This is the primary key of this object, auto-incremented
	 */
	private int id;
	/**
	 * Represents the firstName of the User
	 */
	private String firstName;
	/**
	 * Represents the lastName of the User
	 */
	private String lastName;
	/**
	 * The username of the User
	 */
	private String userName;
	/**
	 * Phone Number of the User
	 */
	private String contact;
	/**
	 * Password of the user
	 */
	private String password;
	/**
	 * The email address of the user
	 */
	private String email;
	/**
	 * The batch foreign key of the user
	 */
	private int batchId;
	/**
	 * The status foreign key of the user
	 */
	private int statusId;
	/**
	 * The roleid foreign key of the user
	 */
	private int roleId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	



}
