package com.marpol.classes.exec;

public class ClassA {

	public static void main(String[] args) {

		int[] nums = new int[10];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				System.out.printf("처음 짝수 값 %d\n처음 짝수 값 저장된 곳 %d", nums[i], i);
				break;	
			}
		}
	}
}
