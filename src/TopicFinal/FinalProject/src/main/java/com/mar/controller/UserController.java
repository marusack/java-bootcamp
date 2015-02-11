package com.mar.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.mar.model.User;
import com.mar.service.UserService;

@Controller
public class UserController {
		

	
	private UserService service;
	
	@RequestMapping("/indexuser")
	public String setupForm(Map<String,Object>map){
		User user = new User();
		map.put("user", user);
		map.put("userList", service.findAll());
		return"user";
	}
	
	@RequestMapping(value="/user.do", method=RequestMethod.POST)
	public String doActions(@ModelAttribute User user, BindingResult resut, 
			@RequestParam String action, Map<String,Object>map){
		
		User Result = new User();
		switch(action.toLowerCase()){
		case "add":
			service.addUser(user);
			Result=user;
			break;
		case "edit":
			service.editUser(user);
			Result=user;
			break;
		case "delete":
			service.deleteUser(user.getId());
			Result=user;
			break;
		case"search":
			User searcheduser =service.findById(user.getId());
			Result= searcheduser!=null ? searcheduser : new User();
			break;
			
		}
		map.put("user", Result);
		map.put("userList", service.findAll());
		return "user";
	}
}
