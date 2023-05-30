package com.marpol.shop.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
	private static Connection dbConn = null;
	
	static {
		try {
			Class.forName(DBContract.jdbcDriver);
			dbConn = DriverManager.getConnection(
					DBContract.DB_URL,
					DBContract.USER_NAME,
					DBContract.PASSWORD
					);
			System.out.println("연결 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	} 
	
	public static Connection getDBConn() {
		return dbConn;
	}
	

}
