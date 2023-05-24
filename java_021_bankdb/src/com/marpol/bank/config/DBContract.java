package com.marpol.bank.config;

/*
 * DB 와 연결하는 세션(통로)를 만든 클래스 도구
 */

public class DBContract {
	
	public static final String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "C##myuser";
	public static final String PASSWORD = "12341234";
	
	
	// 여기에서는 1번부터 시작
	public static class BUYER {
		
		public static final int BUID = 1;
		public static final int BINAME = 2;
		public static final int BUTEL = 3;
		public static final int BUADDR = 4;
		public static final int BUBIRTH = 5;
		public static final int BUJOB = 6;
		
	}
	
	
	public static class ACC {
		
		public static final int ACC_NUM = 1;
		public static final int ACC_DATE = 2;
		public static final int ACC_ID = 3;
		public static final int ACC_BALANCE = 4;
		
	}
	
	
	public static String[] ACC_DIV = {
			"입출금계좌","적금계좌","대출계좌"
	};
	

}
