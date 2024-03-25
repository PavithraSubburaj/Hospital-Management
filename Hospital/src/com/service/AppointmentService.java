package com.service;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.dao.AppointmentDao;
import com.dao.AppointmentDaoImpl;
import com.model.Appointment;

public class AppointmentService {
	static AppointmentDao AppointmentDao=new AppointmentDaoImpl();

	

	public List<Appointment> getAppointmentByPatientId(int pid)throws SQLException {
	 return AppointmentDao.getAppointmentByPatientId(pid);
	}

	

	public static Appointment getAppointmentById(int id)throws SQLException  {
		return AppointmentDao.getAppointmentById(id);
	}



	public List<Appointment> getAppointmentByDoctorId(int did)throws SQLException {
		return AppointmentDao.getAppointmentByDoctorId(did);
	}



	public static void AddAppointment(int aid, int patid, int doid, Date date, String desc)throws SQLException {
		AppointmentDao.AddAppointment(aid,patid,doid,date,desc);
		
	}

}
