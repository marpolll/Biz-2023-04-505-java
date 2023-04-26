package com.marpol.classes.exec;

public class ExecJ {
	public static int prime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return 0;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[] nums = new int[50];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				System.out.println("최초의 소수 위치 : " + i);
				System.out.println("최초의 소수 값 : " + nums[i]);
				break;
			}
		}
		int lastprime = 0;
		int lastindex = -1;
		for (int i = 0; i < nums.length; i++) {
			if (prime(nums[i]) > 0) {
				lastprime = nums[i];
				lastindex = i;
			}
		}
		if(lastindex > -1) {
			System.out.println("마지막 소수 위치 : " + lastindex);
			System.out.println("마지막 소수 값 : " + lastprime);
		}
		
		int firstIndex = -1;
		lastindex = -1;
		for (int i = 0; i < nums.length; i++) {
			if(firstIndex < 0 && prime(nums[i]) > 0) {
				firstIndex = 1;
			}
			if(prime(nums[i]) > 0 ) {
				lastindex = 1;
			}
		}
		if(lastindex > 0) {
			System.out.println("최초 :" + firstIndex);
			System.out.println("최초 :" + nums[firstIndex]);
			System.out.println("마지막 :" + lastindex);
			System.out.println("마지막 :" + nums[lastindex]);
			
		}   // 다시보기 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
}