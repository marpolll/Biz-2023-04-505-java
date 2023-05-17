package com.marpol.bank.exec;

import com.marpol.bank.service.AccService;
import com.marpol.bank.service.impl.AccServiceImplV1;

public class AccExecA {

	public static void main(String[] args) {

		AccService accService = new AccServiceImplV1();

		accService.inout();
		
//		System.out.println(accService.toString());

	}

}