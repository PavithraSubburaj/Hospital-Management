package com.util;

import java.sql.*;

public class DBUtil {

	private static Connection conn;

	public static Connection getDBConn() {
		/* Step 1: Defined all DB variable */
		String usernameDb = "root";
		String passwordDb = "";
		String urlDb = "jdbc:mysql://localhost:3306/Hospital";
		String driverName = "com.mysql.jdbc.Driver"; //com.mysql.cj.jdbc.Driver - for sql connector 8.0.33

		/* Step 2: Load The driver */
		try {
			Class.forName(driverName);
			//System.out.println("Driver loaded successfully..");
		} catch (ClassNotFoundException e) {
			//System.out.println("Driver could not be loaded");
			e.printStackTrace();
		}

		/* Step 3: Establish the connection */
		try {
			conn = DriverManager.getConnection(urlDb, usernameDb, passwordDb);
			//System.out.println("Connection established..");
		} catch (SQLException e) {
			//System.out.println("Connection could not be established");
			e.printStackTrace();
		}

		return conn;
	}
	public static void dbClose() {
		try {
			conn.close();
			//System.out.println("Connection closed..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
