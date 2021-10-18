package com.checkin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkin.entity.CheckIn;
import com.checkin.repo.CheckInRepository;

@Service
public class CheckInService {
	@Autowired
	CheckInRepository checkrepo;
	
	public void getsheet(CheckIn checkin) {
		checkrepo.insert(checkin);
	}

}
