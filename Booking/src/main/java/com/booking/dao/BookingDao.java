package com.booking.dao;

import java.io.File;
import java.util.Date;

import com.booking.entity.Booking;

public class BookingDao {
	private Integer pnr;
	private Integer flightId;
	private String from;
	private String toflight;
	private String fname;
	private String lname;
	private Date dob;
	private Date bdate;
	private Date jdate;
	private String flightname;
	private Integer phonenumber;
//	private File proof;
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
	@Override
	public String toString() {
		return "BookingDao [pnr=" + pnr + ", flightId=" + flightId + ", from=" + from + ", toflight=" + toflight
				+ ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", bdate=" + bdate + ", jdate=" + jdate
				+ ", flightname=" + flightname + ", phonenumber=" + phonenumber + "]";
	}
	
	public Booking getbookigOblect(BookingDao bookdao) {
		Booking bd = new Booking();
		int min = 200;  
		int max = 400;
		Integer a = Integer.valueOf((int)Math.random()*(max-min+1)+min);  
		bd.setPnr(a);
		bd.setFlightId(bookdao.getFlightId());
		bd.setFrom(bookdao.getFrom());
		bd.setToflight(bookdao.getToflight());
		bd.setFname(bookdao.getFname());
		bd.setLname(bookdao.getLname());
		bd.setDob(bookdao.getDob());
		bd.setBdate(bookdao.getBdate());
		bd.setJdate(bookdao.getJdate());
		bd.setFname(bookdao.getFname());
		bd.setFlightname(bookdao.getFlightname());
		bd.setPhonenumber(bookdao.getPhonenumber());
		//bd.setProof(bookdao.getProof());
		return bd;
	}

}
