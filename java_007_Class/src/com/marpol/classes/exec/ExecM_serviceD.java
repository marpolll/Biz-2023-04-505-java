package com.marpol.classes.exec;

import com.marpol.classes.module.ServiceD;

public class ExecM_serviceD {
	public static void main(String[] args) {
		int sum1 = (int) (Math.random() * 50) + 51;
		int sum2 = (int) (Math.random() * 50) + 51;
		ServiceD serviceD = new ServiceD();
		serviceD.add(sum1, sum2);
		System.out.printf("%d + %d = %d\n", sum1, sum2, sum1+sum2);
	}

}
