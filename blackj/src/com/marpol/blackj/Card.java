package com.marpol.blackj;

	public class Card {
	    public static void main(String[] args) {
	    	String[][] cardArray = new String[62][7];
	    	
	    	
	    	cardArray[0][0] = "┌─────────┐";
	    	cardArray[0][1] = "│A        │";
	    	cardArray[0][2] = "│         │";
	    	cardArray[0][3] = "│    ♠    │";
	    	cardArray[0][4] = "│         │";
	    	cardArray[0][5] = "│        A│";
	    	cardArray[0][6] = "└─────────┘";
	    	
	    	 
	    	cardArray[1][0] = "┌─────────┐";
	    	cardArray[1][1] = "│2        │";
	    	cardArray[1][2] = "│    ♠    │";
	    	cardArray[1][3] = "│         │";
	    	cardArray[1][4] = "│    ♠    │";
	    	cardArray[1][5] = "│        2│";
	    	cardArray[1][6] = "└─────────┘";
	    	for(int i = 0 ; i < 2 ; i ++) {
	    	for(String line : cardArray[i] ) {
	    		System.out.println(line);
	    	}
	    	}
	    	
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
	       String[][] arry = new String[3][7];
	        
//	        for(String lineA : cardA ) {
//	            System.out.println(lineA);
//	        }
//	        
//	        for( String line2 : card2) {
//	        	System.out.println(line2);
//	        }
        }
    }

	