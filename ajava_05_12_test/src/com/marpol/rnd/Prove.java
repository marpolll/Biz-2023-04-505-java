package com.marpol.rnd;

public class Prove {

		public static void main(String[] args) {
			
			int rndNum = 0;
			int i = 0;
			
			for (i = 0; i < 100; i++) {
				rndNum = (int) (Math.random() * 200) + 1;
			}
			
			System.out.println("테스트 횟수 : " + i);

			if (rndNum < 1 || rndNum > 100) {
				System.err.printf("100번 수행하려고 하였으나 %s\n번째에서 테스트를 실패하습니다", i);

			} else {
				System.out.println("100번 수행 결과 1 ~ 100까지 범위의 "
						+ "랜덤수를 만들어 내고 있습니다");
			}
		}
	}