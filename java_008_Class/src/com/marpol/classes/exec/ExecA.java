package com.marpol.classes.exec;

import com.marpol.classes.module.ServiceA;

public class ExecA {
	public static void main(String[] args) {
		int intKor1 = (int) (Math.random() * 50) + 51;
		int intEng1 = (int) (Math.random() * 50) + 51;
		int intMath1 = (int) (Math.random() * 50) + 51;
		int intHis1 = (int) (Math.random() * 50) + 51;
		int intMuc1 = (int) (Math.random() * 50) + 51;
		int intArt1 = (int) (Math.random() * 50) + 51;
		int intSpo1 = (int) (Math.random() * 50) + 51;
		ServiceA servicea = new ServiceA();
		servicea.score(intKor1, intEng1, intMath1, intHis1, intMuc1, intArt1, intSpo1); 
		
		
	}

}
