package com.callor.var.controller;

public class ControlB {
	public static void main(String[] args) {
		
		double douRnd = Math.random();
		douRnd = douRnd * 10;
		
		System.out.println(douRnd);
		
		// 실수에서 정수로 바꾸려면 (int)입력하여
		// 정수로 변경 할수 있게 한다.
		int intRnd = (int)douRnd;
		System.out.println(intRnd);
		
		// x 10과 정수(int) 변환을 한번에 할수 있다.
		intRnd = ((int)Math.random() * 10);
		
		
	}

}
