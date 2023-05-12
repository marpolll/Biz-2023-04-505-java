package com.marpol.rnd;

import java.util.ArrayList;
import java.util.List;

public class Prime {

	public static int prime() {
		
		List<Integer> numList = new ArrayList<>();
		
		int rndNum = 0;
		
		for(int i = 0 ; i < 30 ; i++) {
			rndNum = (int)(Math.random()*50)+51;
		numList.add(rndNum);
		}
	
		
		for (int i = 2; i < numList.size() ;i++) {
			if (rndNum % i == 0) {
				return 0; 
			}
		}
		return rndNum;
	}
	

	public static void main(String[] args) {
		
		
		
		
		int rndCount = 0;
		int rndSum = 0;
		for (int i = 0; i < 30; i++) {
			int rndNum = prime();
			if (rndNum > 0) {
				rndCount ++;
				rndSum += rndNum;
				System.out.println(rndNum);
			}
		} 
		System.out.printf("소수의 개수 : %d, 소수의 합 : %d\n" , rndCount , rndSum);
		System.out.printf("소수의 개수 : %d, 소수의 합 : %d\n" , rndCount , rndSum);
	}

}
