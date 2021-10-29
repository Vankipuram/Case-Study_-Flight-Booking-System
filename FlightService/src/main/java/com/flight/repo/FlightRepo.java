package com.flight.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flight.entity.Flights;

public interface FlightRepo extends MongoRepository<Flights, Integer>{

	Flights findById(String date);

	//Flights findByIdDate();

	Flights findFlight(String from, String to, String date);

	Flights findByIdDate();

	;

}
