package com.marpol.classes;

import java.util.Scanner;

public class ClassE {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("정수를 입력하세요");
		System.out.println();
		System.out.println("+ 연산");
		System.out.print("정수1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		num2 = scan.nextInt();
		System.out.printf("%d + %d = %d\n", 
				num1, num2, num1 + num2);
		System.out.println();
		System.out.println("- 연산");
		System.out.print("정수1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		num2 = scan.nextInt();
		System.out.printf("%d - %d = %d\n", 
				num1, num2, num1 - num2);
		System.out.println();
		System.out.println("x 연산");
		System.out.print("정수1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		num2 = scan.nextInt();
		System.out.printf("%d * %d = %d\n", 
				num1, num2, num1 * num2);
		System.out.println();
		System.out.println("/ 연산");
		System.out.print("정수1 >> ");
		num1 = scan.nextInt();
		System.out.print("정수2 >> ");
		num2 = scan.nextInt();
		System.out.printf("%d / %d = %d\n", 
				num1, num2, num1 / num2);
		
		scan.close();
	}

}
