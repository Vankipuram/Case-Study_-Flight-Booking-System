package com.flight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.flight.entity.Flight;
import com.flight.repo.FlightRepo;

@Service
public class FlightService {
	@Autowired 
	private FlightRepo flightRepo;
	
	public Flight addFlight(Flight flight) {
		return flightRepo.save(flight);
	}
	
	public void deleteFlight(Integer flightId) {
		flightRepo.deleteById(flightId);
	}
	
	public Flight updateFlight(Flight flight) {
		Integer id = flight.getFlightId();
		Flight obj1 = flightRepo.findById(id).get();
		obj1.setFlightId(flight.getFlightId());
		obj1.setFlightName(flight.getFlightName());
		obj1.setFlightFrom(flight.getFlightFrom());
		obj1.setFlightTo(flight.getFlightTo());
		obj1.setDate(flight.getDate());
		obj1.setFare(flight.getFare());
		return flightRepo.save(obj1);
		
	}
	public List<Flight> getFlight(){
		return (List<Flight>) flightRepo.findAll();
	}
	
	


}
