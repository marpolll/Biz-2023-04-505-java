package com.callor.var.controller;

public class ControlE {
	public static void main(String[] args) {
		int intRnd = (int) (Math.random() * 10) + 1;

		if (intRnd % 3 == 0) {
			System.out.println(intRnd + "(은)는 3의 배수이다.");
		}
		// intRnd 값이 3의 배수인 경우도 한번 아닌가를 확인하여
		// 다고 비효율적인 코드 진행이 된다.(사용할때도 있다.)
		if (intRnd % 3 != 0) {
			System.err.println(intRnd + "은(는) 3의 배수가 아님.");
		}
		
		// 위처럼 두가지 if() {  } 보다는 아래처럼 else{  } 사용한다
		// if() {  } 이외에 나머지는 "3의 배수 아님"
		// 위는 목적 달성 하고 못하고 2가지 경우를 저장하여 출력
		// 되기 때문에 총 4가지 경우가 생기는데
		// 아래는 2가지 경우로만 원한는 답을 얻는다.
		
		// 내가 원하는 목적 : 3의 배수 찾기
		if(intRnd % 3 ==0) {
			System.out.println(intRnd + "은(는) 3의 배수");
		// 내가 원하는 목적을 달성하지 못했을 경우
		} else {
			System.err.println(intRnd + "은(는) 3의 배수 아님");
		}
	}

}
