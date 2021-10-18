package com.booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.booking.dao.BookingDao;
import com.booking.dao.UserDao;
import com.booking.entity.Booking;
import com.booking.services.BookingServices;

@RestController
public class BookingController {
	@Autowired
	BookingServices bookser;
	
	@GetMapping("/booking")
	public UserDao booking(@RequestBody UserDao userdao) { 
		RestTemplate rest = new RestTemplate();
		BookingDao bd = rest.getForObject("http://localhost:8001/getIdDate",BookingDao.class);
		Booking book = bd.getbookigOblect(bd);
		bookser.addIdDate(book);
		userdao.setFlightId(bd.getFlightId());
		return userdao;
	}

}
