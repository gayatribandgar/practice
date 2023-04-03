package com.revature.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revatue.model.User;
import com.revature.service.UserService;

@RestController
public class UserController {
	private UserService service;

	public UserController(UserService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/userlist")
	public List<User> getAll(){
		return service.getAllUsers();
	}
}
