package com.v1.ecommerce.common.model;

public class Contact {
	private String address;
	private String email;
	private String mobileNumber;
	private String phoneNumber;

	public Contact() {

	}

	public Contact(String address, String email, String phoneNumber,String mobileNumber) {

		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.mobileNumber=mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
