package com.callor.hello.algebra;

/*
 * 블린연산(부울연산)
 * 어떤 연산의 결과가 true 또는 false 인 경우만
 * 존재하는 연산
 * 여러개의 연산의 결과를 AND(&&), OR(||) 으로 연결하여
 * 최종 결과를 판단한다.
 * 연산식을 AND, OR 연산자로 연결하여 비교할때는
 * 판단하는 결과식이 2의 연산식 
 * 		개수 승 만큼 비교해야 한다
 */
public class BooleanB {
	
	public static void main(String[] args) {
		// &&(and) 둘다 참이어야 true 
		// 하나만 거짓이여도 false 
		// 아래 첫번째 노란밑줄은 이미 false인데 또 물어서 , 
		// ||(OR) 하나만 참이여도 true
		// 아래 두번째 노란 밑줄은 이미 앞에서 true여서 뒤 볼 필요 없다
		// 세번째 노란밑줄 역시 앞에서 이미 true 라서 이미 볼 필요 없다
		System.out.println(30 > 40 || 40 < 30);
		System.out.println(30 > 40 && 40 < 30);
		System.out.println(30 > 40 || 40 < 30);
		System.out.println(30 < 40 || 40 < 30);
		System.out.println(30 > 40 || 40 < 30 || 20 > 10);
		System.out.println(30 < 40 || 40 < 30 || 20 > 10);
		// != 다르다
		System.out.println(30 != 40);
	}

}
