package com.marpol.classes.exec;

public class ExecH {
	
	public static void main(String[] args) {
		

		int[] nums = new int[50];
		
		for (int i = 0; i < nums.length ; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		
		// 조건에 맞는 개수와 조건에 맞는 값의 합계를 계산
		int sum = 0;
		int count = 0;
		for (int i = 0; i < nums.length ; i++) {
			if(nums[i] % 3 ==0) {
				sum += nums[i];
				count ++;
			} 
		}
		System.out.println("3의 배수 합계 : " + sum);
		System.out.println("3의 배수 개수 : " + count);
	}
}
