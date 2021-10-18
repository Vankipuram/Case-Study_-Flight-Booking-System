package com.booking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Booking;
import com.booking.repo.BookingRepository;

@Service
public class BookingServices {
	@Autowired
	private BookingRepository bookrepo;
	
	public void addIdDate(Booking book) {
		bookrepo.save(book);
	}
	
	public void deletebypnr(Integer pnr) {
		bookrepo.deleteById(String.valueOf(pnr));
	}

}
