package com.mar.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mar.dao.ProductDao;

import com.mar.model.Product;
@Repository
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private SessionFactory session;
	@Override
	public void addProduct(Product product) {
		session.getCurrentSession().save(product);

	}

	@Override
	public void editProduct(Product product) {
		session.getCurrentSession().update(product);
	}

	@Override
	public void deleteProduct(long id) {
		session.getCurrentSession().delete(findById(id));

	}

	@Override
	public Product findById(Long id) {
		
		return (Product)session.getCurrentSession().get(Product.class, id);
	}

	@Override
	public List<Product> findAll() {
		@SuppressWarnings("unchecked")
		List<Product> list = (List<Product>) session.getCurrentSession().createQuery("from product").list();
		return list;
	}

}
