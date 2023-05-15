package lesson_13.BJ_Game.entities;

import lesson_13.BJ_Game.interfaces.Card;
import lesson_13.BJ_Game.interfaces.Player;

public class PlayerImpl implements Player {
    @Override
    public void takeCard(Card card) {

    }

    @Override
    public int countOfCardPointsOnHand() {
        return 0;
    }

    @Override
    public boolean isNeededAnotherCard() {
        return false;
    }

    @Override
    public void ShowCardsOnHand() {

    }
}
