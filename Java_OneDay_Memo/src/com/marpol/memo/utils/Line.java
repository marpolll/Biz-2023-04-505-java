package com.marpol.memo.utils;

public class Line {
	
	public static final String dLine = "=".repeat(60);
	public static final String sLine = "-".repeat(60);
	
	public static final String dLine(int length) {
		return "=".repeat(length);
	}
	public static final String sLine(int length) {
		return "-".repeat(length);
	}
	
	
}
