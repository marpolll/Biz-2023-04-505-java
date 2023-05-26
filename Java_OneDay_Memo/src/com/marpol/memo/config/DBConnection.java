package com.marpol.memo.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	// DB에 연결할 컨넥션 객체를 미리 준비해 놓기
	private static Connection dbConn = null;
	
	// static 초기화 블럭
	//        으로 선언된 변수, 객체 등을 초기화 시키기 위한 코드 블럭
	// 프로젝트가 시작되면 항상 자동으로 실행되는 코드 블럭
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
	
	// dbConn 을 다른 객체에서 참조할때 사용할 getter method
	public static Connection getDBConn() {
		return dbConn;
	}

}
