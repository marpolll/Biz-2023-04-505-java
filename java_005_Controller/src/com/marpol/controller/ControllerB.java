package com.marpol.controller;

public class ControllerB {
	public static void main(String[] args) {
		/*
		 * 51 ~ 100 까지 수를 변수 1개에 저장하고
		 * 변수에 저장된 수가 소수 인가를 판별
		 */
		int rndNum = (int) (Math.random() * 50) + 51;

		for (int index = 2; index < rndNum; index ++) {
			if (rndNum % index == 0) {
				System.out.println(rndNum + " 소수아님");
			} else {
				System.out.println(rndNum + " 소수");
			}
			break;
		}
	}
}
// 내가 만든거