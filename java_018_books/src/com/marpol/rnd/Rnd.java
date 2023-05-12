package com.marpol.rnd;

public class Rnd {

	public static int prime() {
		int rndNum = (int) (Math.random() * 50) + 51;
		for (int i = 2; i < rndNum; i++) {
			if (rndNum % i == 0) {
				return 0; 
			}
		}
		return rndNum; 
	}

	public static void main(String[] args) {
		int rndCount = 0;
		int rndSum = 0;
		for (int i = 0; i < 100; i++) {
			int rndNum = prime();
			if (rndNum > 0) {
				rndCount ++;
				rndSum += rndNum;
				System.out.println(rndNum);
			}
		} 
		System.out.printf("소수의 개수 : %d, 소ssssss수의 합 : %d\n" , rndCount , rndSum);
		System.out.printf("소수의 개수 : %d, 소수의 합 : %d\n" , rndCount , rndSum);
	}
}
