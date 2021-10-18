package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.flight.controller.FlightController;
import com.flight.entity.Flights;
import com.flight.services.FlightService;

@RunWith(SpringRunner.class)
@WebMvcTest(value=FlightController.class)
class FlightControllerTest {
	
	@Autowired
	private MockMvc mockMvc ;
	
	@MockBean
	private FlightService flightService;
	
	@Test
	public void testaddFlight() throws Exception{
		Flights mockFlight = new Flights();
		mockFlight.setFlightId(101);
		mockFlight.setFlightName("Air India");
		mockFlight.setFlightFrom("Delhi");
		mockFlight.setFlightTo("Chennai");
		mockFlight.setDate("18-10-2021");
		mockFlight.setFare(5000.00);
		
		String URI = "/addflight";
		
		//Mockito.when(flightService.addFlight(Mockito.any(Flights.class))).thenReturn(mockFlight);
	}

	

}
