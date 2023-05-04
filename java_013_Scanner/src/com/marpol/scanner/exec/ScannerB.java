package com.marpol.scanner.exec;

import java.util.Scanner;

public class ScannerB {

	private static int getNum() {

		Scanner scan = new Scanner(System.in);
		int num = 0;

		while (true) {
			System.out.println("3이상 양의 정수를 입력 하세요");
			System.out.print("정수 >> (STOP : 종료) ");
			String strnum = scan.nextLine();
			if (strnum.equals("STOP")) {
				return -1;
			}

			try {
				num = Integer.valueOf(strnum);
//				if (num < 3) {
//					continue;
//				}
				// continue 키워드를 사용하고 싶지 않으면
				if (num >= 3) {
					break;
				}
				break;
			} catch (Exception e) {
				System.out.println("정수값만 입력해야 합니다.");
			}
			scan.close();
		}
		return num;
	}

	
	// 매개변수를 통하여 전달받은 num 변수의 값이
	// dl dkslaus -1 을 리턴 프라임 이면 num 변수의 값을 리턴
	public static int prime(int num) {
		int i = 0;

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				return -1;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int num = getNum();
		if (num < 0) {
			System.out.println("GAME OVER");
			// main() method 에서 return 명령이 실행되면
			// 프로젝트 코드 전체를 중단하라는 것이다.
			return;
		}
		
		// prime() method 는 전달받은 num "변수의 값" 이
		// prime 이면 num 를 return, 아니면 -1 을 
		num = prime(num);
		
		if (num > 0) {
			System.out.println(" 이 정수는 소수 ");
		} else {
			System.out.println(" 이 정수는 소수아님");
		}
	}
}
