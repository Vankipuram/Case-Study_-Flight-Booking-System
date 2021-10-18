package com.booking.dao;

import com.booking.entity.Booking;

public class BookingDao {
	private Integer flightId;
	private String date;
	
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "BookingDao [flightId=" + flightId + ", date=" + date + "]";
	}
	public Booking getbookigOblect(BookingDao bookdao) {
		Booking bd = new Booking();
		int min = 200;  
		int max = 400;
		Integer a = Integer.valueOf((int)Math.random()*(max-min+1)+min);  
		bd.setPnr(a);
		bd.setDate(bookdao.getDate());
		bd.setFlightId(bookdao.getFlightId());
		return bd;
	}
	

}
