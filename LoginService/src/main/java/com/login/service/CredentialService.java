package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.entity.Credential;
import com.login.repo.CredentialRepo;

@Service
public class CredentialService {
	
	@Autowired
	private CredentialRepo credentialRepo;
	
	public Credential saveuser(Credential user) {
		return credentialRepo.save(user);
	}
	
	public Credential fetchuserId(String useremail) {
		return credentialRepo.findByUseremail(useremail);
		
	}
	
	public Credential fetchuserIdAndPassword(String useremail,Integer password) {
		return credentialRepo.findByUseremailAndPassword(useremail, password);
		
	}

}
