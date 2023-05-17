package com.marpol.bank.exec;

import com.marpol.bank.service.BuyerService;
import com.marpol.bank.service.impl.BuyerServiceImplV1;

public class BuyerExecA {
	
	public static void main(String[] args) {
		
		BuyerService buService = new BuyerServiceImplV1();
		
		buService.inputBuyer();
		System.out.println(buService.toString());
		
		
	}

}
