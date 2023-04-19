package com.callor.controller;

public class ControllerB {

	// public static void main(String[] args) {

	// for (int i = 0; i < 100; i++) {
	// int intS = (int) (Math.random() * 50 + 51);
	// if (intS % 2 == 0) {
	// System.out.println(intS);
	// }
	// }
	// }

// 51 ~ 100 랜덤수 100개중 짝수만 출력해보자

//	public static void main(String[] args) {
//
//		for (int i = 0; i < 100; i++) {
//			int intS = (int) (Math.random() * 50) + 51;
//			if (intS % 2 == 0) {
//				System.out.println(intS + " 짝수");
//			} else {
//				System.err.println(intS + " 짝수아님");
//			}
//
//		}
//	}
//
//}

// 짝수는 짝수라 표시 아닌거는 짝수아님 표시

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			int intS = (int) (Math.random() * 50) + 51;
			if (intS % 2 == 0) {
				System.out.println(intS + " 짝수");
			}
			else if (intS % 2 == 1) {					// 여기 코드는 괜찮은데 많은 경우의 수가 있을때는  else if 사용
				System.err.println(intS + " 홀수");
			}
		}
	}
}

// 짝수는 짝수 홀수는 홀수라 표시
