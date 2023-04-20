package com.marpol.controller;

public class ControllerH {
// 중복 선언 (over loading)  prime(int rndNum) , prime()
	
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
		int index;
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
				break;
			}
		}
		boolean yesPrime = rndNum <= index;

		return yesPrime;
	}
    /*
     *  java 에서는 method 의 이름을 매개변수의 type 로 본다
     *  prime(int rndNum) 는 prime(int) 라는 이름으로 선언되고
     *  prime() 는 prime() 라는 이름으로 선언된다.
     *  따라서 prime(int) 와 prime() 은 전혀 다른 method 로 인식한다.
     *  이것을 java 의 특징중에 중복선언(over loading)이라고 한다.
     *  
     *   호출하는 곳에서
     *   prime(30) 과 같이 호출하면 prime(int)가 실행되고
     *   prime() 과 같이 호출하면 prime() 가 실행된다.
     */ 
	
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
// 아래 prime() 을 double로 바꿔보자!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 안될수도있다!!!!!!!!
