package lesson_13bj.entities;

import lesson_13bj.interfaces.Card;
import lesson_13bj.interfaces.Player;

import java.util.Scanner;

@SuppressWarnings("checkstyle:LocalVariableName")
public abstract class PlayerImpl implements Player {
    private final String name;
    private boolean inGame;

    public PlayerImpl(String name, boolean inGame) {
        this.name = name;
        this.inGame = inGame;
    }

    @Override
    public void takeCard(Card card) {
/*          for (Card crd : cardsOnHand) {
            if (crd == null) {
                crd = card;
                break;
            }
        }*/
    }

    @Override
    public int countOfCardPointsOnHand() {
        int result = 0;
       /* for (Card crd : cardsOnHand) {
            if (crd != null) {
                result += crd.getCardName();
            }
        }*/
        return result;
    }

    @Override
    public boolean isNeededAnotherCard() {
        System.out.println("<----------Ваши карты: ------------->");
        this.showCardsOnHand();
        System.out.println("У вас на руках сейчас столько очков: "+this.countOfCardPointsOnHand());
        System.out.println("Если нужна введите \"да\", если нет, просто нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            return true;
        }
        return false;
    }

    @Override
    public void showCardsOnHand() {
        /*for (Card crd : cardsOnHand) {
            if (crd != null) {
                crd.printCard();

            }
        }*/
    }

    @Override
    public Boolean isInGame() {
        return true;
    }


    public void setInGame(Boolean inGame) {
        this.inGame = inGame;
    }
}
