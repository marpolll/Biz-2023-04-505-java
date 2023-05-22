package com.marpol.blackjack.service;


import com.marpol.blackjack.models.CardDto;

public interface PlayerService {

	public void hit(CardDto card);
	public void showDeck();
	public int getScore() ;
	public String getPlayName();

}
