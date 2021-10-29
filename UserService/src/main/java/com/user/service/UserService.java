package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public void addUserDetails(User user) {
		userRepo.save(user);
	}
	public User showUserDetailsById(Integer id) {
		return userRepo.findById(id).get();
	}

}
