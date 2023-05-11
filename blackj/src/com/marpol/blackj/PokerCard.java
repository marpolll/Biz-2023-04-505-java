package com.marpol.blackj;

public class PokerCard {
    public static void main(String[] args) {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13"};

        // 카드 그리기
        String[][] cards = new String[4][13];
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                String suit = suits[i];
                String rank = ranks[j];
                String rankSymbol = rank;
                if (rank.equals("10")) {
                    rankSymbol = "T";
                }
                String[] card = new String[8];
                card[0] = "┌─────────┐";
                card[1] = "│" + rankSymbol + "        │";
                card[2] = "│         │";
                card[3] = "│    " + suit + "    │";
                card[4] = "│         │";
                card[5] = "│        " + rankSymbol + "│";
                card[6] = "└─────────┘";

                // 중앙에 문양 출력하기
                if (!rank.equals("10")) {
                    int numSymbols = Integer.parseInt(rank);
                    StringBuilder sb = new StringBuilder();
                    for (int k = 0; k < numSymbols; k++) {
                        sb.append(suit);
                    }
                    int midRow = card.length / 2;
                    card[midRow - 1] = "│    " + sb.toString() + "    │";
                } else {
                    int midRow = card.length / 2;
                    card[midRow - 1] = "│   " + suit + " " + suit + "   │";
                }

                cards[i][j] = String.join("\n", card);
            }
        }

        // 카드 출력
        for (int i = 0; i < cards[0].length; i++) {
            for (int j = 0; j < cards.length; j++) {
                System.out.print(cards[j][i] + " ");
            }
            System.out.println();
        }
    }
}
	
