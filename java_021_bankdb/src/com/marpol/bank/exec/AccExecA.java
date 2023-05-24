package com.marpol.bank.exec;

import com.marpol.bank.service.impl.AccServiceImplV1;

public class AccExecA {
	public static void main(String[] args) {

		AccServiceImplV1 accService = new AccServiceImplV1();

		accService.selectAll();
		accService.findById(null);
		
		
	}

}
