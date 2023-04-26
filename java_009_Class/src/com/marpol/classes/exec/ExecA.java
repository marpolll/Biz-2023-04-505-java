package com.marpol.classes.exec;

/*
 * Java의 class는
 * 객체지향 프로그래밍 방법론적인 부분에서
 * 가장 표준적인 코딩 스타일
 * 
 * Java는 모든 코드(파일)가 기본적으로 class 로 부터
 * 시작한다.
 * 
 * Java의 소스코드는 ooo.java 라는 이름으로 파일이 저장되지만
 * "Java 클래스 파일" 이라고 명명한다.
 * 
 * method 들이 포함되고, 변수들이 포함된다.
 * method 만 있는 클래스 파일이 있고,
 * 변수들만 있는 클래스 파일이 있고,
 * method 와 변수가 함께 있는 파일이 있다.
 * 
 * 코드를 테스트 하고 실행하기 위해 main() method 를 작성한다.
 * main() method 를 진입점, 시작점 method 라고 하며
 * main() method 를 포함하는 java class 코드를
 * 진입점 코드라고 한다.
 * 
 */

public class ExecA {
	
	public static void main(String[] args) {
		
		// 한개의 정수형 변수를 만들고
		// 51 ~ 100 까지 랜덤수로 초기화 하기
		int num1 = (int)(Math.random() * 50) + 51;
		
		// 여러개의 정수형 변수 배열(묶음)을 선언하고
		// 10개를 생성하여 배열을 만든다.
		int[] nums = new int[10];
		
		// 생성된 배열(공간)에 정수값을 저장하기
		// 배열의 값을 저장하기 위해서는 배열의 index를 지정
		// 배열[index]
		// 배열의 index는 항상 0 부터 시작한다.
		// 배열의 index 끝 값은 배열의 길이 -1 까지이다.
		nums[0] = 100; // nums 배열 0번 위치에 정수 100저장
		nums[1] = 21;
		nums[2] = 10;
		nums[3] = 80;
		nums[4] = 86;
		nums[5] = 52;
		nums[6] = 23;
		nums[7] = 99;
		nums[8] = 87;
		nums[9] = 91;
		
		// nums 배열의 3번 index 에 저장된 값을 읽어서
		// num1 변수에 저장하라
		num1 = nums[3];
		
		// nums 배열의 5번 index 에 저장된 값을 읽어서
		// Console 에 출력하라.
		 System.out.println(nums[5]);
	}
}





















