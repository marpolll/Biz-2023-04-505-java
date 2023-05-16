package com.marpol.exec;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class AAAAAA  {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Console con = System.console();
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("\033[H\033[2J");
//			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			String st = scan.nextLine();
			System.out.println("num : " + st);
//			con.flush();
			
//			scan.close();
		}
	}
}
