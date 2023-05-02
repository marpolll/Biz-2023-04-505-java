package com.marpol.classes;

import java.util.Scanner;

public class ClassI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;

		while(true) {
			System.out.println("두 개의 정수를 입력하세요.");
			System.out.println("-1 을 입력하면 종료합니다. ");
			System.out.print("정수 1 >> ");
			num1 = scan.nextInt();

			if(num1 == -1 ) { 
				System.out.println("GAME OVER");
			}

			System.out.print("정수 2 >> ");
			num2 = scan.nextInt();		
			
			if(num2 == -1 ) {  
				System.out.println("GAME OVER");
			}
			
			System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);
			
			scan.close();
		}
	}
}