package com.marpol.controller;

public class ControllerC {

	public static int prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		int index = 0;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return 0; // 소수아니면 0 리턴
			}
		}
		return rndNum; // 소수이면 rndNum 리턴
	}

	public static void main(String[] args) {
		for (int i = 0 ; i < 100; i++) {
			int rndNum = prime();
			if (rndNum > 0) {
				System.out.println(rndNum + " 는 소수");
			} else {
				System.err.println("소수 아님");
			}
		}
	}
}
