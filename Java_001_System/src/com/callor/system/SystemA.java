package com.callor.system;

// class 이름은 반드시 첫글자 대문자
// 두단어 이상을 조합하는 것을 권장
// Camel case 로 작성한다
	// SystemA 라고 이름을 정한 이유는 이미 System이 있어서
	// 오류가 발생할수 있어서 A를 뒤에 붙인다
public class SystemA {
	
		// public static void는 키워드라 한다(안변함)
	public static void main(String[] args) {
		// System은 class(첫글자가 대문자면 class)
		// . 다음은(out) object
		// 또 . 다음은(println) method
		// 이 . 들을 Dat 연산자 이라 한다
		// . 사이에는 빈칸 금지 가독성 생각하면 안된다
		// ()안 수식을 = arguments
		// 레고박스라 생각 class는 레고 큰박스 ob는 박스안 비닐들 met는 비닐안 부품들
		System.out.println("Hello");
		System.err.println("반갑습니다");
		System.out.println(); //ln은 엔터기능 그래서 한줄식 생성된다
		System.out.print(30);
		System.out.print("+");
		System.out.print(40);
		System.out.print("=");
		System.out.print(30 + 40); // 위 코드는 ln이 없어서 엔터가 없어서 한줄입력됨 
		System.out.println("안녕하세요"); // 여기에 ln 이 붙었으므로 다음부터 다음줄에 입력된다
		// System.out.println(); 은 괄호 안에 수식이 없어도 실행되나 엔터기능
		// print는 반드시 괄호안에 수식이 있어야한다. 아니면 식은 성립되나 빨간밑줄이 생긴다
		System.out.print(0);
	}
	

}
