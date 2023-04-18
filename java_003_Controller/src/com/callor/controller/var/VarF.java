package com.callor.controller.var;

public class VarF {

	public static void main(String[] args) {
		
		String str = "Republic of Korea";
		char cVar = str.charAt(3); //java 는 0부터 시작하여 R=0번째 u=3번째 빈칸도 갯수 포함한다.
		System.out.println(cVar);
		System.out.println(str.length()); // 17
		for(int i = 0 ; i < str.length() ; i++) { //length 는 str 문자열의 개수를 알려준다. (99까지)
			System.out.print(str.charAt(i) + "\t");
		}
	}
}
