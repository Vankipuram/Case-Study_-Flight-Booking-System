package com.login.dao;

import com.login.entity.Credential;

public class CredentialDao {
	
	private String userid;
	private Integer password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	public Credential getobject(CredentialDao cd) {
		Credential cred = new Credential();
		cred.setUserid(cd.getUserid());
		cred.setPassword(cd.getPassword());
		return cred;
	}

}
