package com.microrefit.service;

import java.util.List;

import com.microrefit.entity.User;

public interface UserService {
	
	User findById(Integer id);

	User save(String name);

	List<User> findAll();

	List<User> findByNameLike(String name);
}