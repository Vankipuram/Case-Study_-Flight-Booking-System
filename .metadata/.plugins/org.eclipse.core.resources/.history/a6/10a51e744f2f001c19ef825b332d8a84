package com.flight.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.dao.BookingDao;
import com.flight.entity.Flights;
import com.flight.repo.FlightRepo;

@Service
public class FlightService {
	@Autowired 
	private FlightRepo flightRepo;
	
	public void addFlight(Flights flight) {
		flightRepo.save(flight);
	}
	public void deleteFlight(Flights flight) {
		flightRepo.delete(flight);
	}
	public void deleteFlightbyId(Integer flightId) {
		flightRepo.deleteById(flightId);
	}
	public void updateFlight(Flights flight) {
		flightRepo.insert(flight);
	}
	public BookingDao getIdDate() {
		List<Flights> lst = flightRepo.findAll();
		BookingDao bd = new BookingDao();
		bd.setFlightId(lst.get(0).getFlightId());
		bd.setDate(lst.get(0).getDate());
		return bd;
	}
	public List<Integer> getFlightbyId(){
		List<Flights> lst = flightRepo.findAll();
		List<Integer> out = new ArrayList<>();
		for(int i = 0; i < lst.size(); i ++)
			out.add(lst.get(i).getFlightId());
		return out;
		}
	public List<Flights> getFlights(String flightFrom, String flightTo, String date){
		List<Flights> lst = flightRepo.findAll();
		return lst.stream()
				.filter(flight-> (flight.getFlightFrom().equals(flightFrom) && flight.getFlightTo().equals(flightTo)&& flight.getDate().equals(date)))
				.toList();
	}

}
