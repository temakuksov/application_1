package lesson_13bj.entities;

import lesson_13bj.interfaces.Card;

public class CardImpl implements Card {
    private int value;
    private String nameOfCard;

    public CardImpl(int value, String nameOfCard) {
        this.value = value;
        this.nameOfCard = nameOfCard;
    }

    @Override
    public void printCard() {
        System.out.println(nameOfCard);
    }

    @Override
    public int getCardValue() {
        return value;
    }

    @Override
    public String getCardName() {
        return nameOfCard;
    }
}
