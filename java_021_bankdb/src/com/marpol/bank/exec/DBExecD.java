package com.marpol.bank.exec;

import com.marpol.bank.service.BankService;

public class DBExecD {
	
	public static void main(String[] args) {
		
		BankService bankService = new BankService();	

		
		bankService.printBuyerList();
		
		bankService.findByBuyer();
		
	}
	
}
