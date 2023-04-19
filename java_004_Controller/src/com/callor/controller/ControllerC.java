package com.callor.controller;

public class ControllerC {
	/*
	 * 100 개의 랜덤수를 생성하기
	 * 생성된 랜덤수가 3의 배수인가 판별
	 * 아니면 2의 배수인가 판별
	 */
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int intS = (int) (Math.random() * 50) + 51;
			if (intS % 3 == 0) {
				System.out.println(intS + " 3의배수");
			} else if (intS % 2 == 0) {
				System.err.println(intS + " \t\t2의배수");  
			}

		}
	}
}

// 3의 배수인지 아니면 2의배수 인지 판별
