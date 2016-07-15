package com.microrefit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.microrefit.service.UserService;

@Controller
@RequestMapping("/")
public class TestController extends BaseController{
	
	@Autowired
	UserService userService;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/info")
	public String info() {
		return "info";
	}

	@RequestMapping("/findall")
	@ResponseBody
	public Map<String, Object> getUser() {
		return successJsonData(userService.findAll());
	}

	@RequestMapping("/findbyid")
	@ResponseBody
	public Map<String, Object> findById(Integer id) {
		return successJsonData(userService.findById(id));
	}

	@RequestMapping("/add")
	@ResponseBody
	public Map<String, Object> save(String name) {
		return successJsonData(userService.save(name));
	}
	
	@RequestMapping("/findWithLike")
	@ResponseBody
	public Map<String, Object> findWithLike(String name){
		return successJsonData(userService.findByNameLike(name));
	}
}