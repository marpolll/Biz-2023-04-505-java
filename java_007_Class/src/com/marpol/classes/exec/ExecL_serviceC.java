package com.marpol.classes.exec;

import com.marpol.classes.module.ServiceC;

public class ExecL_serviceC {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*10);
		ServiceC serviceC = new ServiceC();
		// num1 변수에 저장된 값을 전달하면서
		// 구구단을 출력해줘 라는 요청
		// ==> guguDan() method 호출
		if(num1 >=2 && num1 <= 9) {
		serviceC.guguDan(num1);
	}
	}
}
