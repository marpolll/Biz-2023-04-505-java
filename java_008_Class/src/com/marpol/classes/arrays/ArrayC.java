package com.marpol.classes.arrays;

public class ArrayC {

	public static void main(String[] args) {
		int[] nums = new int[10];

		nums[0] = (int) (Math.random() * 50) + 51;
		nums[1] = 21;
		nums[2] = 95;
		nums[3] = 12;
		nums[4] = 73;
		nums[5] = 35;
		nums[6] = 72;
		nums[7] = 42;
		nums[8] = 32;
		nums[9] = 35;

//		System.out.println(nums[0]);
//		System.out.println(nums[1]);
//		System.out.println(nums[2]);
//		System.out.println(nums[3]);
//		System.out.println(nums[4]);
//		System.out.println(nums[5]);
//		System.out.println(nums[6]);
//		System.out.println(nums[7]);
//		System.out.println(nums[8]);
//		System.out.println(nums[9]);

		// num0 ,num1, num2
		for (int index = 0; index < 10; index++) {
			System.out.println(nums[index]);
			// System.out.println(numindex); 안된다.!!!!!!!!!!!!!!!!!!!!!!
		}

	}
}
