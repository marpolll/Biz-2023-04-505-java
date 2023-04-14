package com.callor.system.var;

public class VarBA {

	public static void main(String[] args) {
		int intNum1 = 0;
		// 작은 정수

		float floatNum1 = 0.0f;
		// 작은 실수 실수 0. 소수 부분 6자리까지 오차없이 표현할 수 있음.
		// 단정도 실수

		long longNum1 = 0;
		// int 보다 큰 정수를 저장가능 이거는 뒤에 l 안쓴다
		// int 형식을 쓰는데 굳이 뒤에 붙일필요 없다.

		double douNum1 = 0.0;
		// 큰 실수 0. 소수 부분 15자리까지 오차없이 표현할 수 있음
		// 배정도 실수

		// longNum1 = intNum1; 가능하나 intNum1 = longNum1;는 불가능
		// int 작은 거는 long 큰 으로 변경가능하나 반대로
		// long 큰 거에서 int 작은거로는 숫자가 짤리니 안된다.
		// 그래서 강제적으로 (int)로 변환하여 변경할수있다.(인식가능하게 변환)
		// 데이터의 형변환(type case, convert)
		
		longNum1 = intNum1; //자동형변환, 암시적형변환
		// int 형 데이터를 long 형 변수에 저장
		intNum1 = (int)longNum1; //강제형변환, 명시적형변환
		// long 형 데이터를 int 형 변수에 저장
		
		// douNum1 = floatNum1; 가능하나 floatNum1 = douNum1;는 불가능
		// float 작은 거는 dou 큰 으로 변경가능하나 반대로
		// dou 큰 거에서 float 작은거로는 숫자가 짤리니 안된다.
		// 그래서 강제적으로 (float)로 변환하여 변경할수있다.(인식가능하게 변환)
		// 데이터의 형변환(type case, convert)
		
		douNum1 = floatNum1; //자동형변환, 암시적형변환
		// float 형 데이터를 dou 형 변수에 저장
		floatNum1 = (float)douNum1;  //강제형변환, 명시적형변환
		// dou 형 데이터를 float 형 변수에 저장
		
		
	}

}
