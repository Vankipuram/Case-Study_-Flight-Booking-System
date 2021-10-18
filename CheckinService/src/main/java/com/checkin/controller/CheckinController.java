package com.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.checkin.entity.CheckIn;
import com.checkin.service.CheckInService;

public class CheckinController {
	@Autowired
	CheckInService checkser;

	@PostMapping("/addsheet")
	public String addsheetno(@RequestBody CheckIn obj) {
		checkser.getsheet(obj);
		return "done";
	}

}
