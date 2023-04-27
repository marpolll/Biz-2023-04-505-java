package com.marpol.classes.arrays;

public class ArrayC2 {
	public static void main(String[] args) {
		int[] nums = new int[45];
		for (int index = 0; index < nums.length; index++) {
			nums[index] = index + 1;
		}
		for (int i = 0; i < 45; i++) {
			nums[i] = (int) (Math.random() * nums.length);
		}
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", nums[i]);

			System.out.println();
		}

		int[] lottos = new int[6];

		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = nums[1];
		}
		for (int out = 0; out < lottos.length; out++) {
			for (int in = out + 1; in < lottos.length; in++) {
				if (lottos[out] > lottos[in]) {
					int _tmp = lottos[in];
					lottos[in] = lottos[out];
					lottos[out] = _tmp;
					for (int i = 0; i < lottos.length; i++) {
						System.out.printf("%3d\t", lottos[i]);
					}
					System.out.println();
				}
			}
		}
	}
}
