package com.callor.var;

public class VarJ {

	public static void main(String[] args) {

		int dan = 5;
		int index = 1;

		System.out.printf("%d x %d = %d\n", dan, index, dan * index++); // 이 코드 실행중에는 index++ 여도 
		                                                                // 현재 코드가 아닌 다음 코드에 영향을 준다.
                                                                        // 5 X 1 = 5
		index++;                                                         
		System.out.printf("%d x %d = %d\n", dan, index, dan * index); // 5 X 3 = 15  두번 1이 증가
		
		
		int result = index + 1;
		index++;
		
		System.out.println(result); // 4
		System.out.println(index);  // 4
		
	}

}
