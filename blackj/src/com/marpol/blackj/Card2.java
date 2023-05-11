package com.marpol.blackj;

	public class Card2 {
	    public static void main(String[] args) {
	        String[] card2 = new String[7];
	        card2[0] = "┌─────────┐";
	        card2[1] = "│2        │";
	        card2[2] = "│    ♠    │";
	        card2[3] = "│         │";
	        card2[4] = "│    ♠    │";
	        card2[5] = "│        2│";
	        card2[6] = "└─────────┘";

	        for (String line2 : card2) {
	            System.out.println(line2);
	        }
	    }
	}