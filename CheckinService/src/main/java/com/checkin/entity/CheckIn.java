package com.checkin.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sheet")
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
