package com.flight.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flight.entity.Flight;


public interface FlightRepo extends MongoRepository<Flight, Integer>{
	

}
