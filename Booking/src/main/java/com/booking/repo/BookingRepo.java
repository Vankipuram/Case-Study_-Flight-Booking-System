package com.booking.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.booking.entity.Booking;

public interface BookingRepo extends MongoRepository<Booking, String>{

	public Booking deleteBypnr(Integer pnr);

}
