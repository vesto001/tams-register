package com.yash.tams.rowmapper;

import java.sql.ResultSet;  
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.yash.tams.model.User;
/**
 * RowMapper for the User Class, Use this with the jdbc template to get data from the database
 * @author Brian Sutton
 *
 */
public final class UserRowMapper implements RowMapper<User> {
	

	/**
	 * Sets the fields of the User Objects for each row that is returned from the database
	 */
	@Override
	public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		User user=new User();
		user.setId(resultSet.getInt("id"));
		user.setFirstName(resultSet.getString("firstname"));
		user.setLastName(resultSet.getString("lastname"));
		user.setUserName(resultSet.getString("username"));
		user.setContact(resultSet.getString("contact"));
		user.setPassword(resultSet.getString("password"));
		user.setEmail(resultSet.getString("email"));
		user.setBatchId(resultSet.getInt("batchid"));
		user.setStatusId(resultSet.getInt("statusid"));
		user.setRoleId(resultSet.getInt("roleid"));
		return user;
	}
}
