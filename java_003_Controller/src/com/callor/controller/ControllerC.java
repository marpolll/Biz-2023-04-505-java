package com.callor.controller;

public class ControllerC {

	public static void main(String[] args) {
		
		// 홀수 구할때 처음 식이 좋다 두번째는 불편한 코드다
		// i++; for {  } 내에서 index 값 변경하기는
		// 가급적 사용하지 않는 것이 좋다
		for(int i = 0 ; i < 20 ; i++) {
			if((i + 1) % 2 == 1) {
				System.out.print(i + 1 + ", ");
			}
		}
		
		for(int i = 0 ; i < 20 ; i += 2) { 
			System.out.print(i+1 + "\t");
		}
		
		// 이렇게 하는게 좋다.
		for(int i = 0 ; i < 20 ; i += 2) {
			if((i+1) % 2 == 1) {
				System.out.print(i+1+", ");
			}
		}
	}
}
