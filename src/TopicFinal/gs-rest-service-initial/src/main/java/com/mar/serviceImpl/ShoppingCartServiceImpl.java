package com.mar.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mar.dao.ShoppingCartDao;
import com.mar.model.ShoppingCart;
import com.mar.service.ShoppingCartService;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

	@Autowired
	private ShoppingCartDao scdao;
	
	@Transactional
	public void addShoppingCart(ShoppingCart sc) {
		scdao.addShoppingCart(sc);
		
	}

	@Transactional
	public void editShoppingCart(ShoppingCart sc) {
		scdao.editShoppingCart(sc);
		
		
	}

	@Transactional
	public void deleteShoppingCart(long id) {
		scdao.deleteShoppingCart(id);
		
	}

	@Transactional
	public ShoppingCart findById(Long id) {
		
		return scdao.findById(id);
	}

	@Transactional
	public List<ShoppingCart> findAll() {
		
		return scdao.findAll();
	}

}
