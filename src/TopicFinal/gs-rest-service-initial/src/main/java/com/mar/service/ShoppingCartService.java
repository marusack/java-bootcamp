package com.mar.service;

import java.util.List;
import com.mar.model.*;



public interface ShoppingCartService  {
	public void addShoppingCart(ShoppingCart sc);
	public void editShoppingCart(ShoppingCart sc);
	public void deleteShoppingCart(long id);
	public ShoppingCart findById(Long id);
	public List<ShoppingCart> findAll(); 
	
}
