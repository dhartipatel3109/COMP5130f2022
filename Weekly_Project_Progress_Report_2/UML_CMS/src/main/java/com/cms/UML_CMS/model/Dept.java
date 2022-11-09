package com.cms.UML_CMS.model;

import java.math.BigInteger;

import javax.persistence.Entity;

@Entity
public class Dept {

	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private BigInteger mobileNo;

	public Dept() {

	}

	public Dept(String email, String password, String firstName, String lastName, BigInteger mobileNo) {
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public BigInteger getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(BigInteger mobileNo) {
		this.mobileNo = mobileNo;
	}

}
