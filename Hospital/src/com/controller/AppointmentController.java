package com.controller;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.model.Appointment;

import com.service.AppointmentService;


public class AppointmentController {
	public static void main(String[] args, String date)  {
		Scanner s=new Scanner(System.in);
		AppointmentService appointmentService=new AppointmentService();
		while(true)
		{
			System.out.println("Press 1. GetAppointmentForId");
			System.out.println("Press 2. GetAppointmentForPatientId");
			System.out.println("Press 3. GetAppointmentForDoctorId");
			System.out.println("Press 4. ScheduleAppointment");
			System.out.println("Press 5. UpdateAppointment");
			System.out.println("Press 6. CancelAppointment");
			System.out.println("Press 0. Exit");
			int input=s.nextInt();
			if(input==0)
			{
				System.out.println("Exiting... Thank you");
				break;
			}
			DateTimeFormatter formatter;
			switch(input)
			{
			case 1:
				System.out.println("Enter Tax Id");
				int id = s.nextInt();
				try {
					Appointment a = AppointmentService.getAppointmentById(id);
					System.out.println("********************************* Tax of id: "+id+" *******************************");
					System.out.println();
					System.out.println("appointment_id "+" patient_id "+" doctor_id "+" appointment_date "+" description");
					System.out.println(a.getId()+"\t\t"+a.getPatientid()+"\t\t"+a.getDoctorid()+"\t"+a.getAppointmentDate()+"\t   "+a.getDescription());
					
					System.out.println();
					System.out.println("*****************************************************************************");
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
				break;	
				case 2:
						System.out.println("Enter the Patient Id");
						int pid = s.nextInt();
						try {
							List<Appointment> list = appointmentService.getAppointmentByPatientId(pid);
							System.out.println("**************************** Appointment of Patient Id: "+pid+" *************************");
							System.out.println();
							System.out.println("appointment_id "+" patient_id "+" doctor_id "+" appointment_date "+" description");
							for(Appointment a:list)
							{
								System.out.println(a.getId()+"\t\t"+a.getPatientid()+"\t\t"+a.getDoctorid()+"\t"+a.getAppointmentDate()+"\t   "+a.getDescription());
								
								}
							System.out.println();
							System.out.println("*******************************************************************************");
					} catch (SQLException  e) {
						System.out.println(e.getMessage());
					}
					break;
				case 3:
					System.out.println("Enter the Doctor Id");
					int did = s.nextInt();
					try {
						List<Appointment> list = appointmentService.getAppointmentByDoctorId(did);
						System.out.println("**************************** Appointment of Patient Id: "+did+" *************************");
						System.out.println();
						System.out.println("appointment_id "+" patient_id "+" doctor_id "+" appointment_date "+" description");
						for(Appointment a:list)
						{
							System.out.println(a.getId()+"\t\t"+a.getPatientid()+"\t\t"+a.getDoctorid()+"\t"+a.getAppointmentDate()+"\t   "+a.getDescription());
							
							}
						System.out.println();
						System.out.println("*******************************************************************************");
				} catch (SQLException  e) {
					System.out.println(e.getMessage());
				}
				break;
				case 4:
					System.out.println("Enter Appointment Id");
					int aid=s.nextInt();
					System.out.println("Enter Patient Id");
					int patid=s.nextInt();
					System.out.println("Enter Doctor Id");
					int doid=s.nextInt();
					System.out.println("Enter Appointment Date");
					date=s.next();
					formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			        LocalDate Date = LocalDate.parse(date, formatter);
					System.out.println("Enter Description");
					String desc=s.toString();
					
					try {
						AppointmentService.AddAppointment(aid, patid, doid, Date,desc);
						System.out.println("Appointment Inserted");
					} catch (SQLException e) {
						System.out.println(e.getMessage());
					}
					break;
				default:
					System.out.println("Invalid Input");
					break;
				
				
				
}
}
		s.close();
		}}