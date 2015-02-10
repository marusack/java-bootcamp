package com.mar.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mar.dao.ShoppingCartDao;
import com.mar.model.ShoppingCart;
@Repository
public class ShoppingCartDaoImpl implements ShoppingCartDao {

	@Autowired
	private SessionFactory session;
	@Override
	public void addShoppingCart(ShoppingCart sc) {
		session.getCurrentSession().save(sc);

	}

	@Override
	public void editShoppingCart(ShoppingCart sc) {
		session.getCurrentSession().update(sc);

	}

	@Override
	public void deleteShoppingCart(long id) {
		session.getCurrentSession().delete(findById(id));

	}

	@Override
	public ShoppingCart findById(Long id) {

		return (ShoppingCart)session.getCurrentSession().get(ShoppingCart.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ShoppingCart> findAll() {
		return (List<ShoppingCart>) session.getCurrentSession().createQuery("from shoppingcart").list();
	}

}
