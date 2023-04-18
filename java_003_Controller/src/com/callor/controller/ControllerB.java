package com.callor.controller;

public class ControllerB {
	
	public static void main(String[] args) {
		/*
		 * int index = 0
		 * for() 반복문에서 사용할 변수 선언
		 * for() 반복문이 시작될때 최초에 한번 실행
		 * 실행횟수에 관계없이 1번만 실행
		 * for(안)이 아닌 밖에 있으면 계속 적용되는 변수 선언 
		 */
		int sum = 0;
		for(int index = 0 ; index < 10 ; index++) {
			System.out.print(index + 1 + "\t");
			// 누적연산
			// 한 변수에 다른변수의 변화되는 값을 계속
			// 덧셈하여 쌓는 연산 1+2+3+......+10   index +1 을 하고있어서 10까지 +
			sum += (index + 1);
			
		}
		System.out.println();
		System.out.println(sum); // 밖에 int sum 있어서 for()문 밖에서도 답을 출력
		//System.out.println(index); for()문 안에 int index = 0 이 있어서 밖에서 출력 xxxx
	}
}
