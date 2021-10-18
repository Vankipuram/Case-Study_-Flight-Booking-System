package com.booking.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.booking.entity.Booking;

public interface BookingRepository extends MongoRepository<Booking, String>{

}
