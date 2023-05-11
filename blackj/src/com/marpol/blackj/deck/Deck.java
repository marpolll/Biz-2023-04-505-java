package com.marpol.blackj.deck;

import java.util.ArrayList;
import java.util.Collections;

import com.marpol.blackj.card.Card;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

		
//		      _____
//	         |A_ _ |
//	         |( v )|
//	         | \ / |
//	         |  .  |
//	         |____V|
//		
//	         
//	         private static final String[] ASCII_CARDS = {
//	        	        "┌─────┐\n│%s    │\n│  %s  │\n│    %s│\n└─────┘",
//	        	        "┌─────┐\n│%s     │\n│  %s  │\n│     %s│\n└─────┘",
//	        	        "┌─────┐\n│%s     │\n│  %s  │\n│    %s│\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│  %s  │\n│%s    │\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│  %s  │\n│%s   │\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│ %s %s │\n│%s   │\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│ %s %s │\n│%s %s │\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│ %s %s │\n│%s%s │\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│%s %s %s│\n│%s%s │\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│%s %s %s│\n│%s%s%s│\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│%s%s%s│\n│%s%s%s│\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│%s%s%s│\n│%s%s%s│\n└─────┘",
//	        	        "┌─────┐\n│%s    │\n│%s%s%s│\n│%s%s%s│\n└─────┘"
//	        	    };
//		
		
		
		
		
		cards = new ArrayList<Card>();
		for (String suit : suits) {
			for (int i = 0; i < ranks.length; i++) {
				int value = i + 1;
				if (value > 10) {
					value = 10;
				}
				cards.add(new Card(suit, ranks[i], value));
			}
		}
		shuffle();
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card drawCard() {
		Card card = cards.get(0);
		cards.remove(0);
		return card;
	}

}
