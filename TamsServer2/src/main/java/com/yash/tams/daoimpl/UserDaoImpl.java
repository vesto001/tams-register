package com.yash.tams.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yash.tams.dao.UserDao;
import com.yash.tams.exception.TamsException;
import com.yash.tams.model.User;
import com.yash.tams.rowmapper.UserRowMapper;
/**
 * The User Dao Implementations will be added here
 * For proper usage see this site 
 * https://github.com/webutech/Java_Track/blob/master/SpringWS/SpringJDBC_JDBCTemplate_Ver5/src/com/yash/jdbcapp/daoimpl/EmployeeDaoImpl.java
 * @author Brian Sutton
 *
 */
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate=new JdbcTemplate(this.dataSource);
	}
	
	@Override
	public List<User> getUsers() throws TamsException {
		try{
		return jdbcTemplate.query("select * from users", new UserRowMapper());
		}catch (Exception e) {
			e.printStackTrace();
			throw new TamsException(e.getMessage());
		}
	}

	@Override
	public boolean insertUser(User user) {
		//Check if user is already registered or not
		//if(this.findUserByUserName(user.getUserName())) return false;
		
		//Else
		//String sql="insert into users "
		//		+ "(firstname, lastname, username, contact, password, email, batchid, statusid, roleid)"
		//		+ "values(?,?,?,?,?,?,?,?,?)";
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getUserName());
		System.out.println(user.getContact());
		System.out.println(user.getPassword());
		System.out.println(user.getEmail());
		System.out.println(user.getBatchId());
		System.out.println(user.getStatusId());
		System.out.println(user.getRoleId());
		return true;
	}

	@Override
	public boolean findUserByUserName(String userName) {
		String sql="select * from users where login=?";
		
		List<User> users = jdbcTemplate.query(sql, new Object[] {userName}, new UserRowMapper());
		//If users more than 0
		return users.size() > 0? true: false;
	}
}
