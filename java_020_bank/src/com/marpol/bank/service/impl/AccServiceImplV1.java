package com.marpol.bank.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.marpol.bank.model.AccDto;
import com.marpol.bank.service.AccService;

public class AccServiceImplV1 implements AccService {
	
	protected List<AccDto> AccList;
	protected Scanner scan;
	
	public AccServiceImplV1() {

		AccList = new ArrayList<>();
		scan = new Scanner(System.in);
		
		
	
	}
		
	public void acInit() {
		
	}

	public void inout() {
		while(true) {
        System.out.print("입금 또는 출금을 선택하세요 (입금: 1, 출금: 2): ");
        int inOut = scan.nextInt();

        if (inOut == 1) {
            System.out.print("입금할 금액을 입력하세요: ");
            int amount = scan.nextInt();
            AccList.remove(amount);
        } else if (inOut == 2) {
            System.out.print("출금할 금액을 입력하세요: ");
            int amount = scan.nextInt();
            AccList.remove(amount);
        } else {
            System.out.println("잘못된 선택입니다.");
        }
		}
		
		
		
		
		
		
		
		
		
	}

	public void printAccList() {
		
	}

	public void saveAccList() {
		
	}

	public void loadAccList() {
		
	}

}
