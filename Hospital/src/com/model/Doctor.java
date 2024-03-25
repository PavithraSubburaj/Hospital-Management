package com.model;


public class Doctor {
	private int id;
	private String firstname;
	private String lastname;
	private String specialisation;
	private int contactnumber;
	public Doctor(int id, String firstname, String lastname, String specialisation, int contactnumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialisation = specialisation;
		this.contactnumber = contactnumber;
	}
	public Doctor(String firstname, String lastname, String specialisation, int contactnumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.specialisation = specialisation;
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
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public int getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(int contactnumber) {
		this.contactnumber = contactnumber;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", specialisation="
				+ specialisation + ", contactnumber=" + contactnumber + ", getId()=" + getId() + ", getFirstname()="
				+ getFirstname() + ", getLastname()=" + getLastname() + ", getSpecialisation()=" + getSpecialisation()
				+ ", getContactnumber()=" + getContactnumber() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
