package com.marpol.memo.config;

/*
 * DB 와 연결하는 세션(통로)를 만든 클래스 도구
 */

public class DBContract {
	
	public static final String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
	public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String USER_NAME = "memo";
	public static final String PASSWORD = "12341234";
	
	
	public static class MEMO {
		
		public static final int SEQ = 1;
		public static final int WRITER = 2;
		public static final int DATE = 3;
		public static final int SUBJECT = 4;
		public static final int CONTENT = 5;
		
	}
	
	
	
//	public static String[] ACC_DIV = {
//			"입출금계좌","적금계좌","대출계좌"
//	};
//	
//	public static String[] ACC_LISTDIV = {
//			"계좌번호","날짜","시간","구분","입금","출금","잔액"
//	};
	

}
