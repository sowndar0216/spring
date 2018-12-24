package com.bridgeit.springfrom;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Dao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {    
	    this.template = template;    
	}    
	
	public int save(User user){    
		System.out.println(user.getFirstName()+" "+user.getLastName());
	    String sql="insert into account1(firstName,lastName,email,password) values('"+user.getFirstName()+"','"+user.getLastName()+"','"+user.getEmail()+"','"+user.getPassword()+"')";    

	    return template.update(sql);    
	}    
	
	public List<User> getUsers(){
			return template.query("select * from account1",new RowMapper<User>() {
				public User mapRow(ResultSet set,int row) throws SQLException {
					User u=new User();
					u.setEmail(set.getString(4));
					u.setPassword(set.getString(5));
					return u;
				}
			});
	}
	
	
	
	
	
	
	
	
}
