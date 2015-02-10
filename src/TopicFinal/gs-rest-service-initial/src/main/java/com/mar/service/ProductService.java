package com.mar.service;

import java.util.List;

import com.mar.model.Product;



public interface ProductService  {
	public void addProduct(Product product);
	public void editProduct(Product product);
	public void deleteProduct(long id);
	public Product findById(Long id);
	public List<Product> findAll(); 
}
