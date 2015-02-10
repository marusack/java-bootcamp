package com.mar.dao;

import java.util.List;
import com.mar.model.*;

import org.springframework.stereotype.Repository;


@Repository
public interface ShoppingCartDao  {
	public void addShoppingCart(ShoppingCart sc);
	public void editShoppingCart(ShoppingCart sc);
	public void deleteShoppingCart(long id);
	public ShoppingCart findById(Long id);
	public List<ShoppingCart> findAll(); 
	
}
