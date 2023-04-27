package com.marpol.classes.arrays;

public class ArrayA2 {

	public static void main(String[] args) {
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 50) + 51;

		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%3d\t", nums[i]);
		}
		System.out.println();

		for (int out = 0; out < nums.length; out++) {
			for (int in = out + 1; in < nums.length; in++) {
				if (nums[out] > nums[in]) {
					int _tmp = nums[in];
					nums[in] = nums[out];
					nums[out] = _tmp;
					for (int i = 0; i < nums.length; i++) {
						System.out.printf("%3d\t", nums[i]);
					}
					System.out.println();
				}

			}
		}
	}
}
