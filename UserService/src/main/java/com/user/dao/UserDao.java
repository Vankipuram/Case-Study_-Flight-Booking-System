package com.user.dao;

import com.user.entity.User;

public class UserDao {
	private Integer flightId;
	private String firstName;
	private String lastName;
	private String gender;
	private Integer age;
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public User getObject(UserDao userDao) {
		User obj = new User();
		obj.setFlightId(userDao.getFlightId());
		obj.setFirstName(userDao.getFirstName());
		obj.setLastName(userDao.getLastName());
		obj.setGender(userDao.getGender() );
		obj.setAge(userDao.getAge());
		return obj;
	}

}
