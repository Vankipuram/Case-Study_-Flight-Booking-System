package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoForMongodbApplication implements CommandLineRunner{
	
	private final UserRepo userRepo;
	@Autowired
	public DemoForMongodbApplication(UserRepo userRepo) {
		this.userRepo=userRepo;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoForMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(userRepo.findAll().isEmpty()) {
			userRepo.save( new User());
			userRepo.save(new User());
		}
		for(User user:userRepo.findAll()) {
			System.out.println(user);
		}
	}

}
