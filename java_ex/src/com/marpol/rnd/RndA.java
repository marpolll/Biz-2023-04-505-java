package com.marpol.rnd;

public class RndA {

	public static void main(String[] args) {
		int rndNum = 0;
		int count = 0;
		int i = 0;
		for ( i = 0; i < 100; i++) {
			rndNum = (int) (Math.random() * 100) + 10;
			count++;
		}
		System.out.println("테스트 횟수 :"+count);
		if (rndNum < 1 || rndNum > 100) {
			System.err.printf("100 번 테스트를 수행하려고 했으나 %d 번째에서 테스트에 실패함 ", i);
		}else {
			System.out.println("100번 테스트 수행 결과 1 ~ 100 까지 범위의 랜덤수를 만들어 내고있음");
		}

	}

}
