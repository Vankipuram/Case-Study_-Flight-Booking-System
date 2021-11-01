package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.flight.entity.Flights;
import com.flight.repo.FlightRepo;
import com.flight.service.FlightService;

@RunWith(SpringRunner.class)
@SpringBootTest
class FlightSericeApplicationTests {
	
	@Autowired
	private FlightService flight;
	
	@MockBean                  
	private FlightRepo repo;
	
	@Test
	public void addflightTest() {
		Flights temp = new Flights(100,"RewaAirIndia","Rewa","Bhopal","01-nov-2021",900.00);
		when(repo.save(temp)).thenReturn(temp);
		assertEquals(temp, flight.addFlight(temp));   //check the whether the two values are equal or not
	}
	
	@Test
	public void deleteflightTest() {
		Flights temp = new Flights(100,"RewaAirIndia","Rewa","Bhopal","01-nov-2021",900.00);
		flight.deleteFlight(temp);
		verify(repo,times(1)).delete(temp);
	}
	
	@Test
    public void deleteflightByIdTest() {
    	Flights temp = new Flights(100,"RewaAirIndia","Rewa","Bhopal","01-nov-2021",900.00);
    	flight.deleteFlightbyId(temp.getFlightId());
    	verify(repo,times(1)).deleteById(100);
    }
	
	@Test
    public void updateflightTest() {
    	Flights temp = new Flights(101,"RewaAirIndia","Rewa","Bhopal","02-nov-2021",990.00);
    	when(repo.insert(temp)).thenReturn(temp);
    	assertEquals(temp, flight.updateFlight(temp)); 
    }
	
	 @Test
	    public void findbyidTest() {
	    	Flights temp = new Flights(101,"RewaAirIndia","Rewa","Bhopal","02-nov-2021",990.00);
	    	when(repo.findByFlightId(temp.getFlightId())).thenReturn(temp);
	    	assertEquals(temp, flight.findflightbyId(101));
	 }
	 
	 @Test
	    public void getFlightTest() {
	    	List<Flights> temp = new ArrayList<>();
	    	Flights lst = new Flights(102,"RewaAirIndia","Rewa","Bhopal","01-nov-2021",900.00);
	    	temp.add(lst);
	    	when(repo.findAll()).thenReturn(temp);
	    	assertEquals(temp, flight.getFlights("Rewa","Bhopal","01-nov-2021"));
	    }

}
