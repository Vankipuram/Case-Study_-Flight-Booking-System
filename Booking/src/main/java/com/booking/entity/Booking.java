package com.booking.entity;

import java.io.File;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Booking")
public class Booking {
	@Id
	private Integer pnr;
	private Integer flightId;
	private String from;
	private String toflight;
	private String fname;
	private String lname;
	private Date dob;
	private Date bdate;//booking date
	private Date jdate;//journey date
	private String flightname;
	private Integer phonenumber;
//	private File proof;
	
	//un parameterized type construtor
	public Booking() {
		super();
	}
	
	//parameterized type construtor
	public Booking(Integer pnr, Integer flightId, String from, String toflight, String fname, String lname, Date dob,
			Date bdate, Date jdate, String flightname, Integer phonenumber, File proof) {
		super();
		this.pnr = pnr;
		this.flightId = flightId;
		this.from = from;
		this.toflight = toflight;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.bdate = bdate;
		this.jdate = jdate;
		this.flightname = flightname;
		this.phonenumber = phonenumber;
//		this.proof = proof;
	}
	
	//getters and setters 
	
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
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getToflight() {
		return toflight;
	}
	public void setToflight(String toflight) {
		this.toflight = toflight;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public Integer getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
//	public File getProof() {
//		return proof;
//	}
//	public void setProof(File proof) {
//		this.proof = proof;
//	}

	
	

}
