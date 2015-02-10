package com.mar.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mar.dao.ProductDao;
import com.mar.model.Product;
import com.mar.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao pdao;  
	
	
	
	
	@Transactional
	public void addProduct(Product product) {
		pdao.addProduct(product);

	}

	@Transactional
	public void editProduct(Product product) {
		pdao.editProduct(product);

	}

	@Transactional
	public void deleteProduct(long id) {
		pdao.deleteProduct(id);

	}

	@Transactional
	public Product findById(Long id) {
		
		return pdao.findById(id);
	}

	@Transactional
	public List<Product> findAll() {
		return pdao.findAll();
	}

}
