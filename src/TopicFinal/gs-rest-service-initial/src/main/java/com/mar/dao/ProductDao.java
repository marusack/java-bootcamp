package com.mar.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mar.model.Product;


@Repository
public interface ProductDao  {
	public void addProduct(Product product);
	public void editProduct(Product product);
	public void deleteProduct(long id);
	public Product findById(Long id);
	public List<Product> findAll(); 
}
