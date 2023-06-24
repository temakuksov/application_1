package lesson_13.BJ_Game.entities;

import lesson_13.BJ_Game.interfaces.Card;
import lesson_13.BJ_Game.interfaces.DeckOfCards;

public class DeckOfCardsImpl implements DeckOfCards {
    Card[] cards = new Card[52];

    public DeckOfCardsImpl() {
        String[] cardSuits = {"♥", "♦", "♣", "♠"};
        int[] cardValues;
        cardValues = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
        String[] cardNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "В", "Д", "К", "Т"};
        for (int i = 0; i < cardSuits.length; i++) {
            for (int j = 0; j < cardValues.length; j++) {
                cards[i * 13 + j] = new CardImpl(cardValues[j], cardNames[j].concat(cardSuits[i]));
            }
        }

    }

    @Override
    public Card getRandomCard() {
        return null;
    }
}
