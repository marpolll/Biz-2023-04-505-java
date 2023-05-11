package com.marpol.blackj;

import java.util.*;

public class Play {
    private List<String> deck;
    private List<String> playerCards;
    private List<String> dealerCards;
    private static final List<String> RANKS = Arrays.asList("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King");
    private static final List<String> SUITS = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
    private static final String[] ASCII_CARDS = {
        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│  %s  │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",

        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│ %s%s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",

        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│ %s%s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",

        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│ %s%s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",

        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│ %s%s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",

        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│%s %s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",

        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│%s %s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",

        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│%s %s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",

        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│%s %s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n",
        
        "┌─────┐\n" +
        "│%s    │\n" +
        "│     │\n" +
        "│%s %s │\n" +
        "│     │\n" +
        "│    %s│\n" +
        "└─────┘\n"
        
    }
    

}
    


public Play() {
    deck = new ArrayList<>();
    playerCards = new ArrayList<>();
    dealerCards = new ArrayList<>();
    for (String suit : SUITS) {
        for (int i = 0; i < RANKS.size(); i++) {
            String card;
            if (i == 0) {
                card = RANKS.get(i) + " of " + suit + " (value: 1 or 11)";
            } else if (i >= 9) {
                card = RANKS.get(i) + " of " + suit + " (value: 10)";
            } else {
                card = RANKS.get(i) + " of " + suit + " (value: " + (i + 1) + ")";
            }
            deck.add(card);
        }
    }
    Collections.shuffle(deck);
}

private int calculateHandValue(List<String> cards) {
    int sum = 0;
    int aceCount = 0;
    for (String card : cards) {
        String rank = card.split(" ")[0];
        if (rank.equals("Ace")) {
            aceCount++;
        } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
            sum += 10;
        } else {
            sum += Integer.parseInt(rank);
        }
    }
    for (int i = 0; i < aceCount; i++) {
        if (sum + 11 <= 21) {
            sum += 11;
        } else {
            sum += 1;
        }
    }
    return sum;
}

private void printCards(List<String> cards) {
    for (String card : cards) {
        String rank = card.split(" ")[0];
        String suit = card.split(" ")[2];
        int rankIndex = RANKS.indexOf(rank);
        int suitIndex = SUITS.indexOf(suit);
        System.out.printf(ASCII_CARDS[suitIndex * 13 + rankIndex], rank, getSuitSymbol(suit), getSuitSymbol(suit), getSuitSymbol(suit));
    }
    System.out.println();
}

private String getSuitSymbol(String suit) {
    switch (suit) {
        case "Hearts":
            return "♥";
        case "Diamonds":
            return "♦";
        case "Clubs":
            return "♣";
        case "Spades":
            return "♠";
        default:
            return "";
    }
}

public void play() {
    Scanner scanner = new Scanner(System.in);
    int playerHandValue = 0;
    int dealerHandValue = 0;
    boolean playerBust = false;
    boolean dealerBust = false;

    // Deal initial cards
    playerCards.add(deck.remove(0));
    dealerCards.add(deck.remove(0));
    playerCards.add(deck.remove(0));
    dealerCards.add(deck.remove(0));

    // Print cards
    System.out.println("Your cards:");
    printCards(playerCards);
    playerHandValue = calculateHandValue(playerCards);
    System.out.println("Your current hand value: " + playerHandValue);
    System.out.println();
    System.out.println("Dealer's cards:");
    System.out.printf(ASCII_CARDS[0], dealerCards.get(0).split(" ")[0], getSuitSymbol(dealerCards.get(0).split(" ")[2]), getSuitSymbol(dealerCards.get(0).split(" ")[2]), getSuitSymbol(dealerCards.get(0).split(" ")[2]));

    // Player's turn
    while (true) {
        System.out.println("Hit or stand? (h/s)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("h")) {
            playerCards.add(deck.remove(0));
            System.out.println("Your cards:");
            printCards(playerCards);
            playerHandValue = calculateHandValue(playerCards);
            System.out.println("Your current hand value: " + playerHandValue);
            if (playerHandValue > 21) {
                System.out.println("Bust!");
                playerBust = true;
                break;
            }
        } else if (input.equalsIgnoreCase("s")) {
            break;
        }
    }

    // Dealer's turn
    if (!playerBust) {
        System.out.println();
        System.out.println("Dealer's cards:");
        printCards(dealerCards);
        dealerHandValue = calculateHandValue(dealerCards);
        System.out.println("Dealer's current hand value: " + dealerHandValue);
        while (dealerHandValue < 17) {
            dealerCards.add(deck.remove(0));
            System.out.println("Dealer hits.");
            printCards(dealerCards);
            dealerHandValue = calculateHandValue(dealerCards);
            System.out.println("Dealer's current hand value: " + dealerHandValue);
            if (dealerHandValue > 21) {
                System.out.println("Dealer busts!");
                dealerBust = true;
                break;
            }
        }
    }

    // Determine winner
    System.out.println();
    System.out.println("Your cards:");
    printCards(playerCards);
    System.out.println("Your final hand value: " + playerHandValue);
    System.out.println();
    System.out.println("Dealer's cards:");
    printCards(dealerCards);
    System.out.println("Dealer's final hand value: " + dealerHandValue);
    if (playerBust) {
        System.out.println("You lose!");
    } else if (dealerBust) {
        System.out.println("You win!");
    } else if (playerHandValue > dealerHandValue) {
        System.out.println("You win!");
    } else if (dealerHandValue > playerHandValue) {
        System.out.println("You lose!");
    } else {
        System.out.println("It's a tie!");
    }
}

public static void main(String[] args) {
    Play blackjack = new Play();
    blackjack.play();
}
}
