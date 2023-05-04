package com.marpol.scanner.exec;

import java.util.Scanner;

public class ScannerE2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[6];
		
		for(int i = 0 ; i < nums.length; i++) {
			
			System.out.println();
			System.out.println("GMAE START");
			
			int num = (int) (Math.random() * 6) + 1;
			for(int u = 0; u < nums.length ; u++ ) {
				if(nums[u] == num) {
					System.out.println("재생성");
					num = (int) (Math.random() * 6) + 1;
					u = -1;
				}
			}

			while (true) {
				System.out.println("랜덤수");
				System.out.print("정수 >>  ");
				String strnum = scan.nextLine();

				if (strnum.equals("STOP")) {
					System.out.printf("GMAE OVER");
					return;
				}

				try {
					int intnum = Integer.valueOf(strnum);
	
					if (num == intnum) {
						System.out.println("참 잘했어요");
						break;
					}	
					else if (num > intnum) {
						System.out.println();
						System.out.println("더 큰 정수 입력");
					}
					else if (num < intnum){
						System.out.println();
						System.out.println("더 작은 정수 입력\n");
					}
				} catch (Exception e) {
					System.out.println("정수를 정확히 입력하세요");
				}
			}
		}
	}
}
