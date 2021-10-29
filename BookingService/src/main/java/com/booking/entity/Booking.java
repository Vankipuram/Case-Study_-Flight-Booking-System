package com.booking.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Booking")
public class Booking {
	@Id
	private Integer pnr;
	private Integer flightId;
	private String date;
	
	public Booking() {
		super();
	}
	public Booking(Integer pnr, Integer flightId, String date) {
		super();
		this.pnr = pnr;
		this.flightId = flightId;
		this.date = date;
	}
	public Integer getPnr() {
		return pnr;
	}
	public void setPnr(Integer pnr) {
		this.pnr = pnr;
	}
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

}
