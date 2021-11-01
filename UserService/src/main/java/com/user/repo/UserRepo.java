package com.user.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.User;

@Repository
public interface UserRepo extends MongoRepository<User, Integer>{
	
	public List<User> findByemail(String email);
	public List<User> deleteByemail(String email);

}
