package com.marpol.classes.exec;

import com.marpol.classes.module.ServiceE;

public class ExecN_serviceE {
	public static void main(String[] args) {
		int intKor1 = (int) (Math.random() * 50) + 51;
		int intEng1 = (int) (Math.random() * 50) + 51;
		int intMath1 = (int) (Math.random() * 50) + 51;

		ServiceE serviceE = new ServiceE();
		serviceE.score(intKor1, intEng1, intMath1);
	}
}
