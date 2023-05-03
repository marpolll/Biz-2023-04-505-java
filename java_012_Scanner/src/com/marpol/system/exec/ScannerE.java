package com.marpol.system.exec;

import java.util.Scanner;

public class ScannerE {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		String strNum1 = "";
		String strNum2 = "";
		
		while (true) {
			System.out.println("두 개의 정수를 입력하세요");
			
			while (true) {
				System.out.print("정수1 ( STOP : 종료 ) >>  ");
				strNum1 = scan.nextLine();
				if (strNum1.equals("STOP")) {
					break;
				}
				try {
					num1 = Integer.valueOf(strNum1);
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("정수1은 정수값만 입력해야 합니다.");
					continue;
				}
				break;
			}
			if (strNum1.equals("STOP")) {
				break;
			}
			
				while (true) {
					System.out.print("정수2 ( STOP : 종료 ) >>  ");
					strNum2 = scan.nextLine();
					if (strNum2.equals("STOP")) {
						break;
					}
					try {
						num2 = Integer.valueOf(strNum2);
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("정수2는 정수값만 입력해야 합니다.");
						continue;
					}
					break;
				}
				if (strNum2.equals("STOP")) {
					break;
				}

				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
				System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
				System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);

			}
			System.out.println("GAME OVER");
			scan.close();
		}
	}
