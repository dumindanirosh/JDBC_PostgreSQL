/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Duminda
 */

public class DBConnection {

	private static final String URL = "jdbc:postgresql://localhost:5432/mytestdb";
	private static final String DRIVER_NAME = "org.postgresql.Driver";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "1234";

	public static Connection getConnection() {

		try {
			Class.forName(DRIVER_NAME);

			Connection conn = DriverManager.getConnection(URL, USERNAME,
					PASSWORD);

			System.out.println("Connection Success");
                        return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
}
