package com.marpol.classes.config;

/*
 * 코드에서 라인 그리기 코드를 자주 사용해야 할 것으로 예상되어
 * 미리 static 변수와, static method 롤 생성해 두고
 * 필요할때 호출하여 사용한다.
 */

public class Line {
	
	// 60개 짜리 고정 길이로 LINE 문자열 만들기
	public static final String dLine = "=".repeat(60);
	public static final String sLine = "-".repeat(60);
	
	public static final String dLine(int lenght) {
		return "=".repeat(lenght);
	}
	
	public static final String sLine(int lenght) {
		return "-".repeat(lenght);
	}

}
