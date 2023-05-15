package com.marpol.rnd;

import java.util.ArrayList;
import java.util.List;

public class Prime {
     
	public static int prime(){
		
		int rndNum = (int)(Math.random()*50)+51;
		
		for(int i = 2 ; i < rndNum ; i++) {
			if (rndNum % i == 0 ) {
				return 0;
			}
		}
		return rndNum;
	}
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		int count = 0;
		int sum = 0;
		
		for(int i = 0 ; i < 30 ; i ++) {
			numList.add(prime());
			if(numList.get(i) > 0) {
				System.out.println(numList.get(i));
				count++;
				sum += numList.get(i);
			}
		}
		System.out.printf("소수의 개수 : %d\n",count);
		System.out.printf("소수의 합계 : %d\n",sum);
		
		
	}

}
