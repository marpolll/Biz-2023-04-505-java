package com.marpol.scanner.exec;

import java.util.Scanner;

public class ScannerA {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력 하세요");
		
		while (true) {
			System.out.print("정수 ( STOP : 종료 ) >>  ");
			String  strNum1 = scan.nextLine();
			if (strNum1.equals("STOP")) {
				break;
			}
			try {
			int	num1 = Integer.valueOf(strNum1);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수는 정수값만 입력해야 합니다.");
				continue;
			}
			break;
		}
		
	}

}
