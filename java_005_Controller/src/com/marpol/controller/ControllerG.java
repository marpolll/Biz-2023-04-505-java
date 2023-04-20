package com.marpol.controller;

public class ControllerG {
	
	/*
	 * prime() method 의 코드를 수정하여
	 * 생성된 랜덤수가 소수인지 아닌지 판별하는 코드로 변경
	 * 
	 * void type 의 prime() method 를
	 * boolean type 의 prime() method 로 변경
	 * 
	 * method 를 선언할때 void type 이외의 type 으로 선언하면
	 * method {  } 내에서 반드시 return 명령문이 있어야 한다.
	 * 
	 * 
	 * prime() method {  } 내에서 선언했던 rndNum 변수를
	 * 매개변수(parameter) 로 변경하였다.
	 * 매개변수는 스스로 초기화 할수 없다.
	 * 누군가 prime() method 를 호출하면서
	 * 값을 전달해주어야만 그 값으로 초기화 할수 있다.
	 * prime(int rndNum = 0 ) 과 같은 코드 사용불가   스스로 초기화 xxxxxx
	 * 
	 * main() 에서 prime(55) 와 같은 코드가 실행될때
	 * 매개변수 값이 초기화 된다. 아래 prime(mainRndNum)
	 * int type 이기 때문에 int type 만 가능하다
	 * 0.125는 안된다.
	 */
	
	public static boolean prime(int rndNum) {            // void   -->> boolean type의 prime method                 
//		int rndNum = (int) (Math.random() * 50) + 51;    // main method 는 prime 안에 있는 내용을 모른다.
		int index;										 // 어떤 '수' 가 소수인지 아닌지 모른다 그냥 소수 소수아님만 안다
														 // 이를 블랙박스 method 
		for (index = 2; index < rndNum; index++) {
			if (rndNum % index == 0) {
//				break;
				return false; //false 일때 종료 , 좋은 코드는 아니다.  break; 쓰고 마지막에 하는게 좋다
			}
		}
//		if (rndNum <= index) {
//			System.out.println(rndNum + " 는 소수");
//		}else {
//			System.err.println(rndNum + " 는 소수아님");
//		}
//		 reyurn; 생략가능
		
		boolean yesPrime = rndNum <= index;
		
		return yesPrime; // 위에 public static boolean prime() 이면 return 명령 이 필수 void 에서만 생략 이외는 무조건 포함
	}

	public static void main(String[] args) {

		for (int i = 1; i < 100; i++) {
			// main 은 prime 의 수를 모르니
			// main 에서 랜덤수를 만들고
			int mainRndNum = (int) (Math.random() * 50) + 51;
			
			// prime() method 에게 "전달해 주기"
			// prime() method 에게 mainRndNum 변수에 저장된
			//                     값을 "전달해 주기"
			// 이때 mainRndNum 를 argument 라고 한다
			if(prime(mainRndNum)) {                      // 위에 boolean prime(int rndNum) ()안에 를 선언
																			// int rndNum = mainRndNum 
				System.out.println(mainRndNum + " 소수");
			}else {
				System.err.println(" 소수아님");
			}
		}
	}
}
