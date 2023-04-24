package com.marpol.classes.exec;

import com.marpol.classes.module.MyClassC;

public class ExecI_MyClassC {
	public static void main(String[] args) {

		MyClassC myC = new MyClassC();
		int rndCount = 0;
		for (int i = 0; i < 100; i++) {
			int rndNum = (int) (Math.random() * 50) + 51;
			int result = myC.prime(rndNum);
			if (result > 0) {
				rndCount++;
				System.out.println(rndNum);
			}
		}
		System.out.printf("소수의 갯수 : %d\n", rndCount );
	}

}