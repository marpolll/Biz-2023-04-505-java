package com.marpol.controller;

public class ControllerI {
// 보고 넘기자
	
	public static boolean prime(int rndNum) {
		int index;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		boolean yesPrime = rndNum <= index;

		return yesPrime;
	}
	public static boolean prime() {
		int rndNum = (int)(Math.random() * 50) +51;
		return prime(rndNum);
	}

	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			int mainRndNum = (int) (Math.random() * 50) + 51;
			if (prime(mainRndNum)) {
				System.out.println(mainRndNum + " 소수");
			} else {
				System.err.println(mainRndNum + " 소수아님");
			}
			if (prime()) {
				System.out.println("소수");
			}
		}
	}
}
// 보고 넘기자
