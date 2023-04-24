package com.marpol.classes.exec;

import com.marpol.classes.module.ServiceB;

public class ExecK_serviceB {
	public static void main(String[] args) {
		String name1 = "홍길동";
		int intKor1= (int) (Math.random() * 50) + 51;
		int intEng1= (int) (Math.random() * 50) + 51;
		int intMath1= (int) (Math.random() * 50) + 51;
		
		ServiceB serviceb= new ServiceB();
		serviceb.scorePrint(name1, intKor1, intEng1, intMath1);
	}
	
	
}
