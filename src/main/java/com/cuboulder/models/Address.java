package com.cuboulder.models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Address {
	
	@Id
	private String id;

	
	private String steetLine1;
	
	private String steetLine2;
	
	private String city;
	
	private String state;
	
	private String pinCode;
	
//	public Address() {
//		
//	}
//
//	public Address(String id, String steetLine1, String steetLine2, String city, String state, String pinCode) {
//		super();
//		this.id = id;
//		this.steetLine1 = steetLine1;
//		this.steetLine2 = steetLine2;
//		this.city = city;
//		this.state = state;
//		this.pinCode = pinCode;
//	}

	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}

	public String getSteetLine1() {
		return steetLine1;
	}

	public void setSteetLine1(String steetLine1) {
		this.steetLine1 = steetLine1;
	}

	public String getSteetLine2() {
		return steetLine2;
	}

	public void setSteetLine2(String steetLine2) {
		this.steetLine2 = steetLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	

}
