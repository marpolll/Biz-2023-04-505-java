package com.marpol.classes.exec;

import com.marpol.classes.module.ServiceA;

public class ExecJ_ServiceA {
	public static void main(String[] args) {
		ServiceA serA = new ServiceA();
		int rndNum1 = (int) (Math.random() * 50) + 51;
		int rndNum2 = (int) (Math.random() * 50) + 51;
		int result = serA.add(rndNum1, rndNum2);
		System.out.printf("%d + %d = %d\n",rndNum1,rndNum2,result);
	}
}
