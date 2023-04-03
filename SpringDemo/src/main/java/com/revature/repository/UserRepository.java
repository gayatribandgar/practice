package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revatue.model.User;

public interface UserRepository extends JpaRepository<User ,Integer> {

}
