package com.marpol.bank.exec;

import java.text.BreakIterator;
import java.util.Scanner;

import com.marpol.bank.service.BankService;

public class DBExecE {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankService bankService = new BankService();	
		
		while(true) {
			
			System.out.println("=".repeat(100));
			System.out.println("대한은행 고객관리 시스템");
			System.out.println("=".repeat(100));
			System.out.println("수행할 업무를 선택하세요");
			System.out.println("  1. 고객 추가");
			System.out.println("  2. 고객정보 수정");
			System.out.println("  3. 고객정보 삭제");
			System.out.println("  4. 고객 리스트");
			System.out.println("  9. 업무종료");
			System.out.println("-".repeat(100));
			System.out.print("업무 선택 >>>> ");
			String strSelect = scan.nextLine();
			int intSelect = 0;
			try {
				intSelect = Integer.valueOf(strSelect);
			} catch (Exception e) {
				System.out.printf("업무선택을 잘못 하였습니다.(%s)\n", strSelect);
				continue;
			}
			if(intSelect == 9) break;
			else if(intSelect == 1) bankService.insertBuyer();
			else if(intSelect == 2) bankService.upDate();
			else if(intSelect == 3) bankService.delete();
			else if(intSelect == 4) bankService.printBuyerList();
		}
			System.out.println("집에가자");
	}
	
}
