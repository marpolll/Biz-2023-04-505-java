package com.callor.controller;

public class ControllerD {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100 까지의 숫자를 가로방향으로 일렬로 나열하기
		 * 
		 * 1   2   3   4   5 
		 * 6   7   8   9   10
		 * 96  97  98  99  100
		 * 할때는 아래식
		 * for 문에서 1~100까지 띄어서 나열한다
		 * 그리고 if문에서 만약 i+1 가 5의 배수 가 맞으면
		 * println 하라
		 */
		int last = 100;
		for (int i = 0; i < last; i++) {
			// i+1(1~100까지) 숫자를 일렬로 나열하기
			System.out.print((i + 1) + "\t");
				
			// 나열을 하다가 출력한 숫자가 5의 배수이면
			// Enter(줄바꿈) 을 하여라
			if ((i + 1) % 5 == 0) {
					System.out.println();
				}
		}
	}

}
