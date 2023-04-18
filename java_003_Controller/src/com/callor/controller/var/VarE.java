package com.callor.controller.var;

public class VarE {
	
	public static void main(String[] args) {
		
		String str = "Republic of Korea";
		String nation = "";
		nation = str.substring(12); // Rok의 서브스트링 R앞이 1,
								    // 12번째  앞에서 잘라서 nation에 담아라
									// 문자열을 자르는 도구
		System.out.println(nation);

		System.out.println(str.substring(9,11)); // 9번째에서 한번 자르고 11번째 에서 또 자른다
												 // 그사이 문자열 출력
												 // 9번째는 o의 앞 11번째는 f다음 java에서
												 // 다른 프로그램 언어에서는
		 										 // 9,11 는 9번째 글자부터 11글자 잘라주라
		
												 
	}

}
