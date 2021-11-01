package com.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repo.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public void adduserdetails(User user) {
		userRepo.save(user);
	}
	
	public List<User> showuserdetailsbyId (String email) {
		return userRepo.findByemail(email);
	}
	
	public void deleteUserDetails(String email) {
		 userRepo.deleteByemail(email);
	}
}
