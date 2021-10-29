package com.booking;


//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.booking.entity.Booking;
import com.booking.repo.BookingRepository;
import com.booking.services.BookingServices;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookingServiceApplicationTests {

	@Autowired
	private BookingServices bookingServices;
	
	@MockBean
	private BookingRepository bookingRepository;
	
	
	
	
	public void addIdDateTest() {
		Booking obj = new Booking(1,100,"21/10/2021");
		when(bookingRepository.save(obj)).thenReturn(obj);
		//assertEquals(obj, bookingServices.addIdDate(obj));
		
	}
	public void deletebypnrTest() {
		//Booking obj1 = new Booking(2,101,"22/10/2021");
		Integer id=101;
		bookingServices.deletebypnr(id);
		verify(bookingRepository,times(1)).deletebypnr(id);
	}

}
