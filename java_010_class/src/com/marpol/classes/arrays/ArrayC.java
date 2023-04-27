package com.marpol.classes.arrays;

public class ArrayC {
	public static void main(String[] args) {
		int[] lottos = new int[45];
		// 배열에 1 ~ 45까지 숫자 저장
		for (int index = 0; index < lottos.length; index++) {
			lottos[index] = index + 1;
		}

		for (int i = 0; i < 45; i++) {
			lottos[i] = (int) (Math.random() * lottos.length);
		}

		for (int out = 0; out < lottos.length; out++) {
			for (int in = out + 1; in < lottos.length; in++){
			if (lottos[out] > lottos[in]) {
				int _tmp = lottos[in];
				lottos[in] = lottos[out];
				lottos[out] = _tmp;
			}
			for (int i = 0; i < 6; i++) {
				System.out.printf("%d\t", lottos[i]);

				System.out.println();
			}
		}
	}
}
}
