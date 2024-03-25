package com.model;

import java.time.LocalDate;

public class Patient {
	private int id;
	private String firstname;
    private String lastname;
	private String gender;
	private LocalDate dateofbirth;
	private String address;
	private int contactnumber;
	public Patient(int id, String firstname, String lastname, String gender, LocalDate dateofbirth, String address,
			int contactnumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.address = address;
		this.contactnumber = contactnumber;
	}
	public Patient(String firstname, String lastname, String gender, LocalDate dateofbirth, String address,
			int contactnumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.address = address;
		this.contactnumber = contactnumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(int contactnumber) {
		this.contactnumber = contactnumber;
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender=" + gender
				+ ", dateofbirth=" + dateofbirth + ", address=" + address + ", contactnumber=" + contactnumber
				+ ", getId()=" + getId() + ", getFirstname()=" + getFirstname() + ", getLastname()=" + getLastname()
				+ ", getGender()=" + getGender() + ", getDateofbirth()=" + getDateofbirth() + ", getAddress()="
				+ getAddress() + ", getContactnumber()=" + getContactnumber() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
