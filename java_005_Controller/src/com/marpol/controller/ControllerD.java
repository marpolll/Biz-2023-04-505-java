package com.marpol.controller;

public class ControllerD {
	// 51 ~ 100 범위의 랜덤수 수를 100개 생성하고 
	// 생성된 100개중 소수만 판별하여 출력 2중for문 사용
	public static void main(String[] args) {
		int index;
		for (index = 1; index < 100; index++) {
			int rndNum = (int) (Math.random() * 50) + 51;
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
// 내가 한거 실행하지마 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!