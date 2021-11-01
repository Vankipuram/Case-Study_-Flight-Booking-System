package com.flight.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.flight.entity.Flights;

@Repository
public interface FlightRepo extends MongoRepository<Flights, Integer>{
	
	public Flights findByFlightId(Integer flightid);

}
