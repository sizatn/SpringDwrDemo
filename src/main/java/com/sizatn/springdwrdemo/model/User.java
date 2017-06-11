package com.sizatn.springdwrdemo.model;

import org.directwebremoting.annotations.DataTransferObject;

@DataTransferObject
public class User {

	private String userno;
	private String username;
	private String address;

	public String getUserno() {
		return userno;
	}

	public void setUserno(String userno) {
		this.userno = userno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
