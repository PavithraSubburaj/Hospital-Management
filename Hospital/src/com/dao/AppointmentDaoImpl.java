package com.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.util.List;

import com.model.Appointment;
import com.util.DBUtil;

public class AppointmentDaoImpl implements AppointmentDao {

	@Override
	public List<Appointment> getAppointmentByPatientId(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAppointmentByDoctorId(int did) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void AddAppointment(int aid, int patid, int doid, Date date, String desc) {
Connection conn=DBUtil.getDBConn();
		
		String sql="insert into appointment(id,patient_id,doctor_id,appointment_date,description) values(?,?,?,?,?)";
		
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, aid);
		pstmt.setInt(2, patid );
		pstmt.setInt(3, doid );
		pstmt.setDate(4, date);
		pstmt.setString(5,desc );
		
		pstmt.executeUpdate();
		
	}
		
	}

}
