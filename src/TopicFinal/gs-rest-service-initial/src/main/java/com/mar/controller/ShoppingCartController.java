package com.mar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mar.model.ShoppingCart;

import com.mar.service.ShoppingCartService;


@Controller
public class ShoppingCartController {

	
	private ShoppingCartService service;
	
	@RequestMapping("/indexshoppingcart")
	public String setupForm(Map<String,Object>map){
		ShoppingCart sc = new ShoppingCart();
		map.put("shoppingcart", sc);
		map.put("shoppingcartList", service.findAll());
		return"shoppingcart";
	}
	
	@RequestMapping(value="/shoppingcart.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute ShoppingCart sc, BindingResult resut, 
			@RequestParam String action, Map<String,Object>map){
		
		ShoppingCart cartResult = new ShoppingCart();
		switch(action.toLowerCase()){
		case "add":
			service.addShoppingCart(sc);
			cartResult=sc;
			break;
		case "edit":
			service.editShoppingCart(sc);
			cartResult=sc;
			break;
		case "delete":
			service.deleteShoppingCart(sc.getId());
			cartResult=sc;
			break;
		case"search":
			ShoppingCart searchedSC =service.findById(sc.getId());
			cartResult= searchedSC!=null ? searchedSC : new ShoppingCart();
			break;
			
		}
		map.put("shoppingcart", cartResult);
		map.put("shoppingcartList", service.findAll());
		return "shopingcart";
	}
}
