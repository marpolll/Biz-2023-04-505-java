package com.callor.controller;

public class ControllerE_For_Random_소수_kakao {
	public static void main(String[] args) {
		
		// 51 ~ 100 까지의 랜덤 변수를 생성하고
		// 변수 안에 수가 소수가 아닌지 판별
		
		int num = (int) (Math.random() * 50) + 51;
		boolean isPrime = true;
		if (num < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					System.out.println(num + "은(는)" + i + "x" + num / i + "를 표현될수 있다");
					break;
				}
			}
		}
		if (isPrime) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
	}

}
