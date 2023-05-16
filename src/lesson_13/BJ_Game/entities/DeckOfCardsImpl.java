package lesson_13.BJ_Game.entities;

import lesson_13.BJ_Game.interfaces.Card;
import lesson_13.BJ_Game.interfaces.DeckOfCards;

public class DeckOfCardsImpl implements DeckOfCards {
    Card[] cards = new Card[52];

    public DeckOfCardsImpl() {

    }

    @Override
    public Card getRandomCard() {
        return null;
    }
}
