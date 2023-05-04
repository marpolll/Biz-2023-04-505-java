package com.marpol.scanner.exec;

import java.util.Scanner;

import com.marpol.scanner.config.PublicConfig;

public class ScannerF2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int lottoGameNums = 45;
		
		int[] nums = new int[6];
		int numsI = 0; // nums 의 `어느 위치`를 알려줄 변수
		
		// nums 배열요소 한번도 저장되지 않은 rndNum 값 찾기(만들기)
		while(true) {
			int rndNum = (int)(Math.random()*lottoGameNums)+1;
			int serchI;
			for(serchI = 0 ; serchI < nums.length ; serchI++) {
				if(nums[serchI] == rndNum) {
					break;
				}
			}
			
//			if(serchI >= nums.length) {
//				break;
//			}
			// rndNum 에 저장된 값이 nums 요소에 있으면 다시 while() 처음으로
			if(serchI < nums.length) {
				continue;
			}
			
			
			
			// 여기에 도달하면 rndNum 는 중복되지 않은 랜덤수
			
			while(true) {
				
				System.out.println(PublicConfig.dLine);
				System.out.println(rndNum);
				
				System.out.println("정수입력(STOP : 종료 >>");
				String stNum = scan.nextLine();
				if (stNum.equals("STOP")) {
					System.out.printf("GMAE OVER");
					return ;
				}
				int intNum = 0;
				try {
					intNum = Integer.valueOf(stNum);
				} catch (Exception e) {
					System.out.println("입력값 오류!!");
					System.out.println("정수만 입력하세요");
					continue;
				}
				System.out.println(PublicConfig.sLine);
				if(intNum <0 || intNum > 45) {
					System.out.println("1 ~ 45 범위의 정수 값을 입력 하세요");
				}else if (rndNum == intNum) {
					System.out.println("참 잘했어요");
					// nums 배열의 `어느 위치`에 rndNum 를 저장해야 한다.
					nums[numsI] = rndNum;
					break;
				} else if (rndNum > intNum) {
					System.out.printf("%d, 입력값이 작아요\n",intNum);
				}  else if (rndNum < intNum) {
					System.err.printf("%d, 입력값이 커요\n",intNum);
				}
			} // 숫자 맞추기 while
			// `참 잘했어요` break 를 만났을때 진행 하는곳
			if(numsI >= nums.length) {
				break;
			}
		} // 1st while
		System.out.println("GAME OVER");
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.printf("%d\t" , nums[i]);
		}
	}
}





