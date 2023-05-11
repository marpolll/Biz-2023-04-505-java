package com.callor.hello.algebra;

public class Home {
	
	public static void main(String[] args) {
		
		for ( int i = 0 ; i < 100 ; i ++) {
			int intRnd = (int)(Math.random()*50) +51;
			if(intRnd < 51 || intRnd > 100) {
				System.err.println(intRnd + "over");
			}else {
				System.out.println(intRnd + "good");
			}
			
		}
		
	}

}
