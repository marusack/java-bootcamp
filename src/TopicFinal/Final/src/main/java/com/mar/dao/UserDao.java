package com.mar.dao;
import com.mar.model.*;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface UserDao  {
	public void addUser(User user);
	public void editUser(User user);
	public void deleteUser(long id);
	public User findById(Long id);
	public List<User> findAll(); 
	
	
	
}
