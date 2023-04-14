package com.callor.system.var;

public class VarAB {
	
	public static void main(String[] args) {
		// 변수이기 때문데 각 보관되어 있는 값을 바꿔서 콘솔답이 달라진다
		// var는 = 이후에 값에 따라 성질이 바뀐다 (0 = 정수 , 1.0 = 실수)
		// 정수 타입 변수를 만들고 실수 타입으로 입력을하면 오류발생
		// 반대로 실수 타입 만들고 정수 입력하면 오류발생 안한다
		// 이는 정수에서 실수가는 과정에서 소수점 오차가 발생할수 있다
		// 그래서 경고문이 나온다
		var num1 = 0;
		var num2 = 1.0;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = 100;
		num2 = 100.0;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = 200;
		num2 = 200.0;
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = 0;
		num2 = 0.0;
		System.out.println(num1);
		System.out.println(num2);
	}

}
