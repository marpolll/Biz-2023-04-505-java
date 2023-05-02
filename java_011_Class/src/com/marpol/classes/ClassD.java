package com.marpol.classes;

import java.util.Scanner;

public class ClassD {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열 입력 >> ");  // prompt
		scan.nextLine(); 	  // 모든 문자열 입력받기
		
		System.out.print("정수 입력 >> ");    // prompt
		scan.nextInt(); 	  // 정수만 입력받기
		
		System.out.println("실수 입력 >> ");    // prompt    println 으로 하면 입력할때 아래에서 입력된다.
		scan.nextFloat();     // float 실수만 입력받기
		
	}

}
