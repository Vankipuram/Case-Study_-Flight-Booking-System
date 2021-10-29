package com.flight.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.dao.BookingDao;
import com.flight.dao.FlightDao;
import com.flight.entity.Flights;
import com.flight.services.FlightService;

@RestController
public class FlightController {
	@Autowired 
	private FlightService flightSer;
	
	FlightDao flightDao = new FlightDao();
	
	@GetMapping("/flight")
	public String show() {
		return "It's working";
	}
	
	@PostMapping("/addflight")
	public String addFlight(@RequestBody FlightDao flightDao) {
		Flights object = flightDao.getFlightObject(flightDao);
		flightSer.addFlight(object);
		return "Flight added";
	}
	
	@GetMapping("/showflights/{from}/{to}/{date}")
	public ResponseEntity<?> showFlights(@PathVariable String from, @PathVariable String to, @PathVariable String date) {
	 List<Flights> lst =flightSer.getFlights(from, to, date);
	 if(lst.size() == 0)
	 return new ResponseEntity<>("No Flights Available " + from +" to " + to, HttpStatus.OK);
		else 
			return new ResponseEntity<>(lst, HttpStatus.OK);
	}
	@PostMapping("del/{id}")
	public String deleteFlight(@PathVariable("id") Integer flightId) {
		flightSer.deleteFlightbyId(flightId);
		return "flight deleted successfully";
	}
	@PostMapping("/deleteAll")
	public String deleteFlight(Flights flight) {
		flightSer.deleteFlight(flight);
		return "flight deleted successfully";
	}
	
	@PostMapping("/updateflight/{id}")
	public String updateFlight(@PathVariable("id") Flights flight) {
		flightSer.updateFlight(flight);
		return "Flight updated";
	}
//	@GetMapping("/getflightIdAll")
//	public List<Integer> getIdAll(){
//		return flightSer.getFlightbyId();
//	}
	
	@GetMapping("/getIdDate")
	public BookingDao getFlightid() {
		BookingDao bookdao = new BookingDao();
		bookdao = flightSer.getIdDate();
		return bookdao;
		
	}
	

}
