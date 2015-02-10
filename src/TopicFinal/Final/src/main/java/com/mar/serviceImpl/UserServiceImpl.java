package com.mar.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mar.dao.UserDao;
import com.mar.model.User;
import com.mar.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao udao;
	
	
	@Transactional
	public void addUser(User user) {
		udao.addUser(user);
		
	}

	@Transactional
	public void editUser(User user) {
		udao.editUser(user);
		
	}

	@Transactional
	public void deleteUser(long id) {
		udao.deleteUser(id);
		
	}

	@Transactional
	public User findById(Long id) {
		
		return udao.findById(id);
	}

	@Transactional
	public List<User> findAll() {
		
		return udao.findAll();
	}

}
