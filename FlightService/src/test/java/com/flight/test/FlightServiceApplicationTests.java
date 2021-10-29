package com.flight.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.flight.entity.Flights;
import com.flight.repo.FlightRepo;
import com.flight.services.FlightService;

@RunWith(SpringRunner.class)
@SpringBootTest
class FlightServiceApplicationTests {
	@Autowired
	private FlightService flightService;
	
	@MockBean
	private FlightRepo flightRepo;
	
	@Test
	public void addFlightTest() {
		Flights obj = new Flights(100,"Indigo","Hyd","Chennai","20/10/2021", 4000.00);
		when(flightRepo.save(obj)).thenReturn(obj);
		
		//assertEquals(obj,flightService.addFlight(obj));
		
	}
	
	
	//@Test
	public void getIdDate() {
		
		when(flightRepo.findByIdDate()).thenReturn((Flights) Stream.of(new Flights(101,"Indigo","Delhi","Mumbai","4/2/2021",3000.00)).collect(Collectors.toList()));
		assertEquals(0,flightService.getIdDate());
	}
		
	
	//@Test
	public void getFlightByIdTest() {
		String date="20/10/2021";
		when(flightRepo.findById(date)).thenReturn((Flights) Stream.of( new Flights(100,"Air India","Banglore","Chennai","20/10/2021",5000.00),new Flights(101,"Indigo","Delhi","Mumbai","4/2/2021",3000.00)).collect(Collectors.toList()));
		//assertEquals(1,flightService.getFlightbyId(date));
		//assertEquals(1,flightService.getFlightbyId(date));
	}
	//@Test
	public void getFlightsTest() {
		String from="mumbai";
		String to="Delhi";
		String date="20/10/2021";
		when(flightRepo.findFlight(from,to,date)).thenReturn( (Flights) Stream.of(new Flights(101,"Indigo","Delhi","Mumbai","4/2/2021",3000.00)).collect(Collectors.toList()));
		assertEquals(0,flightService.getFlights(from, to, date));
		
	}
	//@Test
      public void deleteFlightTest() {
		Flights flights= new Flights(101,"Indigo","Delhi","Mumbai","4/2/2021",3000.00);
		flightService.deleteFlight(flights);
		verify(flightRepo,times(1)).delete(flights);
      }
	//@Test
      public void deleteFlightbyIdTest() {
    	  Integer id =100;
    	 // when(flightRepo.deleteById(id)).thenReturn( (Flights) Stream.of(new Flights(100,"Air India","Banglore","Chennai","20/10/2021",5000.00)));
    	  //when(flightRepo.deleteById(id)).thenReturn((Flights) Stream.of(new Flights(100,"Air India","Banglore","Chennai","20/10/2021",5000.00)).collect(Collectors.toList()));
    	  flightService.deleteFlightbyId(id);
    	  verify(flightRepo,times(1)).deleteById(id);
      }
     // @Test
	public void updateFlightTest() {
		Flights flight= new Flights();
		flight.setFlightId(102);
		flight.setFlightName("Spicejet");
		flight.setFlightFrom("Hyderabad");
		flight.setFlightTo("Banglore");
		flight.setDate("24/10/2021");
		flight.setFare(4000.00);
		flightService.updateFlight(flight);
		verify(flightRepo).save(flight);
	}
	
	

	

	
}
