package com.microrefit.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microrefit.entity.User;

public interface UserDao extends JpaRepository<User, Serializable> {

	List<User> findByNameLike(String string);
	
}