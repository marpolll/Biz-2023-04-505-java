package com.marpol.blackj;


	import java.util.Scanner;

import com.marpol.blackj.card.Card;
import com.marpol.blackj.deck.Deck;

	public class BlackJack {
	    private Deck deck;
	    private Scanner scanner;
	    private int playerScore;
	    private int dealerScore;

	    public BlackJack() {
	        deck = new Deck();
	        scanner = new Scanner(System.in);
	        playerScore = 0;
	        dealerScore = 0;
	    }

	    public void play() {
	        System.out.println("Welcome to BlackJack!");
	        while (true) {
	            // 플레이어가 카드를 뽑는다.
	            Card playerCard1 = deck.drawCard();
	            Card playerCard2 = deck.drawCard();
	            System.out.println("You drew a " + playerCard1.getRank() + " of " + playerCard1.getSuit() + " and a " + playerCard2.getRank() + " of " + playerCard2.getSuit() + ".");
	            playerScore += playerCard1.getValue() + playerCard2.getValue();
	            System.out.println("Your current score is " + playerScore + ".");

	            // 딜러가 카드를 뽑는다.
	            Card dealerCard1 = deck.drawCard();
	            dealerScore += dealerCard1.getValue();
	            System.out.println("The dealer drew a " + dealerCard1.getRank() + " of " + dealerCard1.getSuit() + ".");
	            System.out.println("The dealer's current score is " + dealerScore + ".");

	            // 플레이어가 카드를 더 뽑을지 묻는다.
	            while (true) {
	                System.out.print("Do you want to draw another card? (y/n) ");
	                String answer = scanner.nextLine();
	                if (answer.equals("y")) {
	                    Card playerCard = deck.drawCard();
	                    System.out.println("You drew a " + playerCard.getRank() + " of " + playerCard.getSuit() + ".");
	                    playerScore += playerCard.getValue();
	                    System.out.println("Your current score is " + playerScore + ".");
	                    if (playerScore > 21) {
	                        System.out.println("You busted! The dealer wins.");
	                        return;
	                    }
	                } else {
	                    break;
	                }
	            }

	            // 딜러가 카드를 더 뽑는다.
	            while (dealerScore < 17) {
	                Card dealerCard = deck.drawCard();
	                dealerScore += dealerCard.getValue();
	                System.out.println("The dealer drew a " + dealerCard.getRank() + " of " + dealerCard.getSuit() + ".");
	                System.out.println("The dealer's current score is " + dealerScore + ".");
	            }

	            // 결과를 비교한다.
	            if (dealerScore > 21) {
	                System.out.println("The dealer busted! You win!");
	            } else if (playerScore > dealerScore) {
	                System.out.println("You win!");
	            } else if (playerScore == dealerScore) {
	                System.out.println("It's a tie.");
	            } else {
	                System.out.println("The dealer wins.");
	            }

	            // 다시 게임을 할지 묻는다.
	            System.out.print("Do you want to play again? (y/n) ");
	            String answer = scanner.nextLine();
	            if (!answer.equals("y")) {
	                break;
	            }

	            // 점수를 초기화한다.
	            playerScore = 0;
	            dealerScore = 0;
	        }
	    }

	    public static void main(String[] args) {
	        BlackJack game = new BlackJack();
	        game.play();
	    }
	}

	                



