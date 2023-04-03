package com.revature.service;

import java.util.List;

import com.revatue.model.User;
import com.revature.repository.UserRepository;

public class UserService {
	private UserRepository repo;

	public UserService(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<User> getAllUsers(){
		return repo.findAll();
	}

}
