package com.login.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.login.entity.Admin;

@Repository
public interface AdminRepo extends MongoRepository<Admin, String>{

	public Admin findByAdminemail(String adminemail);
}
