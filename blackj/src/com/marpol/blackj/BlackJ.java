package com.marpol.blackj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BlackJ {
    public static void main(String[] args) {
        playGame();
    }

    private static void playGame() {
        List<String> deck = createDeck();
        List<String> playerHand = new ArrayList<>();
        List<String> dealerHand = new ArrayList<>();

        shuffleDeck(deck);
        initialDeal(deck, playerHand, dealerHand);

        boolean playerBust = false;
        boolean dealerBust = false;

        System.out.println("블랙잭 게임을 시작합니다!");

        while (true) {
            System.out.println("\n당신의 패: " + playerHand);
            System.out.println("딜러의 첫 번째 카드: " + dealerHand.get(0));
            System.out.println("현재 점수: " + calculateScore(playerHand));

            if (playerBust || dealerBust)
                break;

            if (isBlackjack(playerHand)) {
                System.out.println("블랙잭입니다! 당신이 이겼습니다!");
                break;
            }

            if (isBlackjack(dealerHand)) {
                System.out.println("딜러가 블랙잭입니다! 딜러가 이겼습니다!");
                break;
            }

            if (isBust(playerHand)) {
                System.out.println("패배했습니다. 버스트!");
                playerBust = true;
                continue;
            }

            if (isBust(dealerHand)) {
                System.out.println("승리했습니다! 딜러 버스트!");
                dealerBust = true;
                continue;
            }

            String action = getPlayerAction();

            if (action.equalsIgnoreCase("h")) {
                hit(deck, playerHand);
            } else if (action.equalsIgnoreCase("s")) {
                while (calculateScore(dealerHand) < 17) {
                    hit(deck, dealerHand);
                }
                break;
            }
        }

        System.out.println("\n게임 종료");
        System.out.println("당신의 패: " + playerHand);
        System.out.println("딜러의 패: " + dealerHand);
        System.out.println("당신의 점수: " + calculateScore(playerHand));
        System.out.println("딜러의 점수: " + calculateScore(dealerHand));

        if (!playerBust && !dealerBust) {
            int playerScore = calculateScore(playerHand);
            int dealerScore = calculateScore(dealerHand);

            if (playerScore > dealerScore)
                System.out.println("축하합니다! 당신이 이겼습니다!");
            else if (playerScore < dealerScore)
                System.out.println("패배했습니다. 딜러가 이겼습니다!");
            else
                System.out.println("무승부입니다.");
        }
    }

    private static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"스페이드", "다이아몬드", "하트", "클로버"};
        String[] ranks = {"2", "3", "4", "5", "6"};
        }
}
    
        