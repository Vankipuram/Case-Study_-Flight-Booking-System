package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.user.dao.UserDao;
import com.user.entity.User;
import com.user.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/user")
	public String addUserDetails(@RequestBody UserDao dao) {
		User entity = new User();
		entity = dao.getObject(dao);
		userService.addUserDetails(entity);
		return "User details added successfully";
		
	}
	@GetMapping("/userdetails/{id}")
	public User showUserDetailsById(@PathVariable("id") Integer id) {
		return userService.showUserDetailsById(id);
	}

}
