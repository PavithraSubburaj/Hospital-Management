package com.model;

import java.time.LocalDate;

public class Appointment {
	private int id;
	private int patientid;
	private int doctorid;
	private LocalDate AppointmentDate;
	private String description;
	public Appointment(int id, int patientid, int doctorid, LocalDate appointmentDate, String description) {
		super();
		this.id = id;
		this.patientid = patientid;
		this.doctorid = doctorid;
		AppointmentDate = appointmentDate;
		this.description = description;
	}
	public Appointment(int patientid, int doctorid, LocalDate appointmentDate, String description) {
		super();
		this.patientid = patientid;
		this.doctorid = doctorid;
		AppointmentDate = appointmentDate;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public int getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}
	public LocalDate getAppointmentDate() {
		return AppointmentDate;
	}
	public void setAppointmentDate(LocalDate appointmentDate) {
		AppointmentDate = appointmentDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + ", patientid=" + patientid + ", doctorid=" + doctorid + ", AppointmentDate="
				+ AppointmentDate + ", description=" + description + ", getId()=" + getId() + ", getPatientid()="
				+ getPatientid() + ", getDoctorid()=" + getDoctorid() + ", getAppointmentDate()=" + getAppointmentDate()
				+ ", getDescription()=" + getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
