package com.marpol.blackj;

	public class Card4 {
	    public static void main(String[] args) {
	        String[] card = new String[7];
	        card[0] = "┌─────────┐";
	        card[1] = "│4        │";
	        card[2] = "│  ♠   ♠  │";
	        card[3] = "│         │";
	        card[4] = "│  ♠   ♠  │";
	        card[5] = "│        4│";
	        card[6] = "└─────────┘";

	        for (String line : card) {
	            System.out.println(line);
	        }
	    }
	}