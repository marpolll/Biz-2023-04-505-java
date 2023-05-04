package com.marpol.scanner.exec;

import java.util.Scanner;

import com.marpol.scanner.config.PublicConfig;

public class ScannerFA {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int lottoGameNums = 45;
		
		int[] nums = new int[6];
		int numsI = 0;

		while (true) {
			int rndNum = (int) (Math.random() * lottoGameNums) + 1;
			
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == rndNum) {
					rndNum = (int) (Math.random() * lottoGameNums) + 1;
					i = -1;
				}
			}
			
			System.out.println(rndNum);

			while (true) {
				System.out.println(PublicConfig.dLine(100));
				
				System.out.println("정수입력(STOP : 종료 >>");
				String stNum = scan.nextLine();
				if (stNum.equals("STOP")) {
					System.out.printf("GMAE OVER");
					return;
				}
				int intNum = 0;
				try {
					intNum = Integer.valueOf(stNum);
				} catch (Exception e) {
					System.out.println("입력값 오류!!");
					System.out.println("정수만 입력하세요");
					continue;
				}
				System.out.println(PublicConfig.sLine(100));
				if (intNum < 0 || intNum > 45) {
					System.out.println("1 ~ 45 범위의 정수 값을 입력 하세요");
				} else if (rndNum == intNum) {
					System.out.println("참 잘했어요");
					nums[numsI++] = rndNum;
					break;
				} else if (rndNum > intNum) {
					System.out.printf("%d, 입력값이 작아요\n", intNum);
				} else if (rndNum < intNum) {
					System.err.printf("%d, 입력값이 커요\n", intNum);
				}
			} // 숫자 맞추기 while
			if (numsI >= nums.length) {
				break;
			}
		} // 1st while
		System.out.println("GAME OVER");
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d\t", nums[i]);
		}
		System.out.println();
	}
}
