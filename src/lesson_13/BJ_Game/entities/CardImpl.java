package lesson_13.BJ_Game.entities;

import lesson_13.BJ_Game.interfaces.Card;

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
    public int getCard() {
        return value;
    }
}
