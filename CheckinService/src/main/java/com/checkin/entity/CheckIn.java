package com.checkin.entity;

import org.springframework.data.annotation.Id;

public class CheckIn {
	@Id
	private Integer seatnumber;

	public Integer getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(Integer seatnumber) {
		this.seatnumber = seatnumber;
	}

}
