package com.marpol.scanner.exec;

import com.marpol.scanner.service.PrimeServiceV1;

public class ScannerC {

	public static void main(String[] args) {

		PrimeServiceV1 Service = new PrimeServiceV1();

		while (true) {
			
			int num = Service.getNum();
			if (num < 0) {
				System.out.println("GAME OVER");
				return;
			}
			
			int result = Service.prime(num);
			if (result > 0) {
				System.out.println(" 이 정수는 소수 ");
			} else {
				System.out.println(" 이 정수는 소수아님");
			}
		}
	}
}
