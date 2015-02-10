package com.mar.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mar.dao.UserDao;
import com.mar.model.User;
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory session;
	@Override
	public void addUser(User user) {
		session.getCurrentSession().save(user);

	}

	@Override
	public void editUser(User user) {
		session.getCurrentSession().update(user);

	}

	@Override
	public void deleteUser(long id) {
		session.getCurrentSession().delete(findById(id));

	}

	@Override
	public User findById(Long id) {
		return (User)session.getCurrentSession().get(User.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return (List<User>) session.getCurrentSession().createQuery("from user").list();
		
	}

}
