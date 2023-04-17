package com.callor.var;

public class VarK {
	public static void main(String[] args) {
		int num = 0;
		System.out.println(num++); // 0
		System.out.println(++num); // 2
		// num++ 는 다음 코드에 영향을 주지만
		// ++num 는 지금 현재 코드에 영향을 주어서 1증가
}
}
