package com.marpol.scanner.exec;

import java.util.Scanner;

public class ScannerF {

	public static int getNum() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int rndnum = (int) (Math.random() * 45) + 1;

			while (true) {
				System.out.println("1 ~ 45 범위의 정수를 입력하세요");
				System.out.print("정수 >>  ");
				String strnum = scan.nextLine();
				if (strnum.equals("STOP")) {
					System.out.printf("GMAE OVER");
					return -1;
				}
					try {
						int intnum = Integer.valueOf(strnum);
						if (rndnum < 0 || rndnum > 45) {
							System.out.println();
						} else if (rndnum == intnum) {
							System.out.println("참 잘했어요");
							System.out.println();
							break;
						} else if (rndnum > intnum) {
							System.out.println();
							System.out.println("더 큰 정수 입력");
						} else if (rndnum < intnum) {
							System.out.println();
							System.out.println("더 작은 정수 입력\n");
						}
					} catch (Exception e) {
						System.out.println("정수를 정확히 입력하세요");
					}
				}
				return rndnum;
			}
		}
	

	public static void main(String[] args) {
		int[] nums = new int[6];

		System.out.println("GMAE START");

//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] == rndNum) {
//				rndNum = (int) (Math.random() * 45) + 1;
//				i = -1;
// 아래 주석 처리하고 이걸로 해보자	ScannerFA 랑 비교하면서 ㄱㄱㄱㄱㄱㄱ	숫자가 겹치지 않는걸 목표로
		
		for (int i = 0; i < nums.length; i++) {
			 nums[i] = getNum();
		}
		
		
//		for (int out = 0; out < nums.length; out++) {
//			for (int in = out + 1; in < nums.length; in++) {
//				if (nums[out] > nums[in]) {
//					int _tmp = nums[in];
//					nums[in] = nums[out];                            // 오름차순
//					nums[out] = _tmp;

		
		
//					for (int i = 0; i < nums.length; i++) {            위에for 밖으로 빼자
//						System.out.printf("%3d\t", nums[i]);

//		for (int i = 0; i < nums.length; i++) {
		
		
		System.out.println();
		System.out.println("FINISH THE GAME");
		System.out.printf("%d\t%3d\t%3d\t%3d\t%3d\t%3d\t", 
				nums[0],nums[1],nums[2],nums[3],nums[4],nums[5]);
//		}
	}
}
//			}
//		}
//	}
//}
