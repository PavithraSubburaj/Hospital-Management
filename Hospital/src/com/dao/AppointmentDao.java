package com.dao;

import java.sql.Date;

import java.util.List;

import com.model.Appointment;

public interface AppointmentDao {

	public List<Appointment> getAppointmentByPatientId(int pid);

	public Appointment getAppointmentById(int id);

	public List<Appointment> getAppointmentByDoctorId(int did);

	

	void AddAppointment(int aid, int patid, int doid, Date date, String desc);

}
