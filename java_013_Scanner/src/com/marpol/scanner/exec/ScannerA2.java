package com.marpol.scanner.exec;

import java.util.Scanner;

public class ScannerA2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = 0;
		int i = 0;

		while (true) {
			System.out.println("정수를 입력 하세요");
			System.out.print("정수 >>  ");
			String strnum = scan.nextLine();

			try {
				num = Integer.valueOf(strnum);
				break;
			} catch (Exception e) {
				System.out.println("정수값만 입력해야 합니다.");
			}

			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					break;
				}
			}

			// for() 반복문이 끝났을때
			// num가 소수와 num 소수가 아난경우

			if (i >= num) {
				System.out.println(" 이 정수는 소수 ");
			} else {
				System.out.println(" 이 정수는 소수아님");
			}
		}
	}
}
