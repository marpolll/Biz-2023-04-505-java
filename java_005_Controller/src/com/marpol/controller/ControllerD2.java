package com.marpol.controller;

public class ControllerD2 {

	public static void main(String[] args) {
		// 51 ~ 100 범위의 랜덤수 수를 100개 생성하고 
		// 생성된 100개중 소수만 판별하여 출력 2중for문 사용
		for (int i = 1; i < 100; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			int index;
			for (index = 2; index < rndNum; index++) {
				if (rndNum % index == 0) {
					break;
				}
			}
			if (rndNum <= index) {
				System.out.println(rndNum + " 는 소수");
			}

		}
	}
}
