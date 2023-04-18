package com.callor.var.controller;

public class ControlI {
	public static void main(String[] args) {
		int index = 1;

		for (; index < 10; index++) {
			// index < 10 >>> index >>> index++ >>> index < 10 이런 순서로 코드작동
			// index < 10 이 거짓이 될때 까지 실행 10되면 거짓
			// 참인 9까지 실행된다.
			System.out.println(5 * index);
		}
			// 선언하면 한번만 작동한다. i라는 변수 선언 scope 안에서 한번만 작동
			// i < 10 >>> i >>> i++ >>> i < 10
			// 위와 동일
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}

}