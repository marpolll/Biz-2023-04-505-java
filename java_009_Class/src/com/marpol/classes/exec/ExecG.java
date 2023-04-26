package com.marpol.classes.exec;

public class ExecG {

	// 매개변수 num 변수로 전달받은 값이
	// prime 이면 num 을 아니면 0을 return 하는 method 선언
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
			// prime method 야 nums 배열의index 번째 요소(값)을
			// 너에게 보내니(전달하니) 그 값이 prime 수 인지 알려줘
			// 만약 nums[index] 
			//       값이 prime 이라면 
			//          result 에 저장된 값?? num[index] 값과 같은 값
			//       값이 prime 아니라면
			//			result  에 저장된 값?? 0
			//    int result = prime(nums[index]);
			//    if (result > 0) 
			
			if (prime(nums[i]) > 0) {
				System.out.println(nums[i] + " : prime");
			} else {
				System.err.println(nums[i] + " : 소수아님 ");
			}
		}
	}
}
