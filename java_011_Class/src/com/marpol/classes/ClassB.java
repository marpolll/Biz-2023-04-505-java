package com.marpol.classes;

import java.util.Scanner;

public class ClassB {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이름? : >> ");
		String strName = scan.nextLine();
		System.out.println("입력한 이름은 : " + strName);
		scan.close();
	}
}
