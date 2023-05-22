package com.marpol.blackjack.service;

import java.util.List;

import com.marpol.blackjack.models.CardDto;


public interface DeckService {
	
	public List<CardDto> newCardDeck();
	public CardDto getDeck();
	public void makeDeckList();
		

}
