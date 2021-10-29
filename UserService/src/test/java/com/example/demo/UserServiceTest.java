package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.user.entity.User;
import com.user.repo.UserRepo;
import com.user.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
	@Autowired
	private UserService service;
	
	@MockBean
	private UserRepo userRepo1;
	
	@Test
	public void addUserDetailsTest() {
		User user1 = new User(100,"ghjkl","dfgh","Female",35);
		when(userRepo1.save(user1)).thenReturn(user1);
		
		//assertEquals(user, service.addUserDetails(user));
		//assertEquals(user,service.addUserDetails(user));
		//assertEquals(user, service.addUserDetails(user));
	}
	@Test
	public void showUserDetailsByIdTest() {
		Integer id = 100;
		//when(userRepo1.findById(id)).thenReturn(Stream.of(new User(100,"ghjkl","dfgh","Female",35)).collect(Collectors.toList()));
		//assertEquals(1,service.showUserDetailsById(id).size());
	}
	

	
}
