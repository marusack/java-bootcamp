package com.mar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.mar.model.Product;
import com.mar.service.ProductService;
@Controller
public class ProductController {


	
	private ProductService service;
	
	@RequestMapping("/indexproduct")
	public String setupForm(Map<String,Object>map){
		Product prod = new Product();
		map.put("product", prod);
		map.put("productList", service.findAll());
		return"product";
	}
	
	@RequestMapping(value="/product.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute Product prod, BindingResult resut, 
			@RequestParam String action, Map<String,Object>map){
		
		Product Result = new Product();
		switch(action.toLowerCase()){
		case "add":
			service.addProduct(prod);
			Result=prod;
			break;
		case "edit":
			service.editProduct(prod);
			Result=prod;
			break;
		case "delete":
			service.deleteProduct(prod.getId());
			Result=prod;
			break;
		case"search":
			Product searchedprod =service.findById(prod.getId());
			Result= searchedprod!=null ? searchedprod : new Product();
			break;
			
		}
		map.put("product", Result);
		map.put("productList", service.findAll());
		return "product";
	}
}
