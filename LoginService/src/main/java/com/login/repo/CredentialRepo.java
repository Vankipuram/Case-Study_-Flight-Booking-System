package com.login.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.login.entity.Credential;

@Repository
public interface CredentialRepo extends MongoRepository<Credential, String>{
	
	public Credential findByUseremail(String useremail);
	public Credential findByUseremailAndPassword(String useremail,Integer password);
	

}
