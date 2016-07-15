package com.microrefit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microrefit.dao.UserDao;
import com.microrefit.entity.User;
import com.microrefit.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public User findById(Integer id) {
		return userDao.findOne(id);
	}

	@Override
	public User save(String name) {
		return userDao.save(new User(name));
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public List<User> findByNameLike(String name) {
		return userDao.findByNameLike(name + "%");
	}
}