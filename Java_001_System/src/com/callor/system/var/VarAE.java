package com.callor.system.var;

public class VarAE {
	
	public static void main(String[] args) {
		int num1 = 0;
		num1 = 20 + 30;
		
		int num2 = 20;
		num1 = num2 + 20;   // num1 = 40 , num2 = 20
		
		num2 = num1 + num2; // num2 = 60
		num2 = num2 + 10;   // num2 = 70, num2 의 값을 10 증가 시켰다
		
	}

}
