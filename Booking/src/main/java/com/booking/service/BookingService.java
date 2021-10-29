package com.booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Booking;
import com.booking.repo.BookingRepo;

@Service
public class BookingService {
	@Autowired
	private BookingRepo bookrepo;
	
	public void addIdDate(Booking book) {
		bookrepo.save(book);
	}
	
	public void deletebypnr(Integer pnr) {
		bookrepo.deleteById(String.valueOf(pnr));
	}
	public Booking book(Booking booking) {
		return bookrepo.save(booking);
	}

}
