package com.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.flight.dao.FlightDao;
import com.flight.entity.Flight;
import com.flight.service.FlightService;


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
	@CrossOrigin(origins="http://localhost:4200")
	public Flight addFlight(@RequestBody Flight obj) {
		return flightSer.addFlight(obj);
	}
	
	@GetMapping("/getFlight")
	@CrossOrigin(origins="http://localhost:4200")
	public List<Flight> getFlight(){
		return flightSer.getFlight();
	}
	
	@DeleteMapping("/deleteFlight")
	@CrossOrigin(origins="http://localhost:4200")
	public void deleteflight(@RequestParam Integer flightId) {
		flightSer.deleteFlight(flightId);
	}
	
	@PutMapping("/updateFlight")
	@CrossOrigin(origins="http://localhost:4200")
	public Flight updateflight(@RequestBody Flight flight) {
		return flightSer.updateFlight(flight);
	}
	
		
//		
	
//	@GetMapping("/showflights/{from}/{to}/{date}")
//	@CrossOrigin(origins="http://localhost:4200")
//	public ResponseEntity<?> showFlights(@PathVariable String from, @PathVariable String to, @PathVariable String date ) {
//	 List<Flight> lst =flightSer.getFlights(from, to, date);
//	 if(lst.size() == 0)
//	 return new ResponseEntity<>("No Flights Available " + from +" to " + to, HttpStatus.OK);
//		else 
//			return new ResponseEntity<>(lst, HttpStatus.OK);
//	}
//	@PostMapping("del/{id}")
//	
//	public String deleteFlight(@PathVariable("id") Integer flightId) {
//		flightSer.deleteFlightbyId(flightId);
//		return "flight deleted successfully";
//	}
//	@PostMapping("/deleteAll")
//	@CrossOrigin(origins="http://localhost:4200")
//	public String deleteFlight(Flight flight) {
//		flightSer.deleteFlight(flight);
//		return "flight deleted successfully";
//	}
//	
//	@PostMapping("/updateflight/{id}")
//	@CrossOrigin(origins="http://localhost:4200")
//	public String updateFlight(@PathVariable("id") Flight flight) {
//		flightSer.updateFlight(flight);
//		return "Flight updated";
//	}
////	@GetMapping("/getflightIdAll")
////	public List<Integer> getIdAll(){
////		return flightSer.getFlightbyId();
////	}
//	
//	@GetMapping("/getIdDate")
//	public BookingDao getFlightid() {
//		BookingDao bookdao = new BookingDao();
//		bookdao = flightSer.getIdDate();
//		return bookdao;
//		
//	}

}
