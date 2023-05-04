package com.marpol.scanner.service;

import java.util.Scanner;

public class PrimeServiceV1 {
	private Scanner scan = new Scanner(System.in);
	public  int getNum() {

		int num = 0;

		while (true) {
			System.out.println();
			System.out.println("3이상 양의 정수를 입력 하세요");
			System.out.print("정수 >> (STOP : 종료) ");
			String strnum = scan.nextLine();
			if (strnum.equals("STOP")) {
				return -1;
			}

			try {
				num = Integer.valueOf(strnum);
				if (num >= 3) {
					break;
				}
				break;
			} catch (Exception e) {
				System.out.println();
				System.out.println("정수값만 입력해야 합니다.");
			}
		}
		return num;
	}
	
	public int prime(int num) {
		int i = 0;

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}

}
