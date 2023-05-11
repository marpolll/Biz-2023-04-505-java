package com.marpol.blackj;

	public class Card {
	    public static void main(String[] args) {
	        String[] cardA = new String[7];
	        cardA[0] = "┌─────────┐";
	        cardA[1] = "│A        │";
	        cardA[2] = "│         │";
	        cardA[3] = "│    ♠    │";
	        cardA[4] = "│         │";
	        cardA[5] = "│        A│";
	        cardA[6] = "└─────────┘";
	        
	        String[] card2 = new String[7];
	        card2[0] = "┌─────────┐";
	        card2[1] = "│2        │";
	        card2[2] = "│    ♠    │";
	        card2[3] = "│         │";
	        card2[4] = "│    ♠    │";
	        card2[5] = "│        2│";
	        card2[6] = "└─────────┘";
	       
	        
	        for(String lineA : cardA ) {
	            System.out.println(lineA);
	        }
	        
	        for( String line2 : card2) {
	        	System.out.println(line2);
	        }
        }
    }

	