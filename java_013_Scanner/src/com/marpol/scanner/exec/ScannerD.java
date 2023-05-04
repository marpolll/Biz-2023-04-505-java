package com.marpol.scanner.exec;

import java.util.Scanner;

public class ScannerD {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println();
			System.out.println("GMAE START");
			int num = (int) (Math.random() * 10) + 1;

			while (true) {
				System.out.println();
				System.out.println("랜덤수");
				System.out.print("정수 >>  ");
				String strnum = scan.nextLine();

				if (strnum.equals("STOP")) {
					System.out.printf("GMAE OVER");
					return;
				}

				try {
					int intnum = Integer.valueOf(strnum);
					if (num > intnum) {
						System.out.printf("%d > %d 이므로 더 큰 정수 입력",num,intnum);
					}
					else {
						System.out.printf("%d < %d 이므로 더 작은 정수 입력\n",num,intnum);
					}
					if (num == intnum) {
						System.out.println("참 잘했어요");
						break;
					}
				} catch (Exception e) {
					System.out.println("정수를 정확히 입력하세요");
				}
			}
			scan.close();
		}
	}
}
