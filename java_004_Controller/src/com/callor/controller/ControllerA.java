package com.callor.controller;

public class ControllerA {

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			int intScore = (int) (Math.random() * 50 + 51);
			System.out.print(intScore);
			if ((intScore < 51 || intScore > 100)) {
				System.err.println(" over");
			} else {
				System.out.println(" ok");
			}
		}
	}
}

// 검증 까지 하는 코드  51 ~ 100 까지 숫자 랜덤 하게 100개 만들고
// if 로 검증까지 한다.