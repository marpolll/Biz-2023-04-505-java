package com.callor.var.controller;

public class ControlC {
	public static void main(String[] args) {
		// 0 ~9 까지 중에서 임의의 정수 1개 생성
		int intRnd = (int) (Math.random() * 10);

		boolean bEven = intRnd % 2 == 0;

		if (bEven) {
			System.out.println(intRnd + "은(는) 짝수야!!!");
		}

		if (!bEven) {
			System.err.println(intRnd + "은(는) 짝수가 아니야!!!");
		}
	}
}
