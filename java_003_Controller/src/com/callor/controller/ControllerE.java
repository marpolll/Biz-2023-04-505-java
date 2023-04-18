package com.callor.controller;

public class ControllerE {

	public static void main(String[] args) {

		for (int i = 0; i < 1000; i++) {
			int intScore = (int) (Math.random() * 50 + 51);
			// if(intScore < 51 || intScore > 100) {
			if (!(intScore >= 51 && intScore <= 100)) {
				System.out.println(intScore);
			}
		}
		
		System.out.println("Test End");
		
		int num1 = 100;
		int num2 = 100;
		if(++num1 > 100 || ++num2 > 100) {
			System.out.println("ok");
		// 앞에서 이미 101 > 100 으로 계산하여 true 가 되어서 || or 에서는 하나만 true여도 
		// 되기 때문에 굳이 뒤에 가서 num2를 계산 안하고 넘어간다
		}
		if(--num1 > 100 && --num2 > 100 ) {
			System.out.println("Hello");
		// 계산 안하고 넘어온 상태로 진행되는데 101 - 1 이 100 이되어 (num1) 100 > 100 은 틀려서 
			// && and 연산에서는 하나만 틀려도 끝나기때문에 굳이 뒤에 식을 계산안한다
			// 그래서 num2 는 100 이 유지된다.
		}
	}
}