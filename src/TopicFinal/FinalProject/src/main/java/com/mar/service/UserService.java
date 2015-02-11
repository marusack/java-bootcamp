package com.mar.service;
import com.mar.model.*;
import java.util.List;



public interface UserService  {
	public void addUser(User user);
	public void editUser(User user);
	public void deleteUser(long id);
	public User findById(Long id);
	public List<User> findAll(); 
	
	
	
}
