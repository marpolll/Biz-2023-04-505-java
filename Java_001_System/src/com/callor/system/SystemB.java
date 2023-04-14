package com.callor.system;

public class SystemB {
	
	public static void main(String[] args) {
		// f = form의 약자 "%d + %d = %d" 라는 폼으로 출력하겠다 printf(method)
		// 형식 문자열=%d   30   40  30+40
		// 여기에 ln이 없어서 한줄에 입력이 된다
		// 역슬래시\n = ln 이랑 같은 작동 계속 ln을 입력하면 복잡해진다
		System.out.printf("%d + %d = %d\n",30,40,30+40);
		System.out.println();
		System.out.printf("%d x %d = %d",99,77,77*99);
		System.out.println();
		System.out.print("\n");
		System.out.print("대한민국\n우리나라\nRepublic of korea");
		
	}

}
