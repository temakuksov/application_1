package lesson_13bj;

import lesson_13bj.entities.DeckOfCardsImpl;
import lesson_13bj.interfaces.DeckOfCards;

public class MainBJ {
    @SuppressWarnings("checkstyle:LocalVariableName")
    public static void main(String[] args) {
        // 1) Добавить имена игрока
        // 2) Регулировать кол-во игроков
        // 3) Отрегулировать процесс выявления победителя, разбирали на уроке, что последний шаг проверки барахлит
        // 4*) Добавить символ каждой карты и выводить саму карту с её символом + текстовое описание


        int currentCardNum = 0;
        // создать игру
        DeckOfCards deckOfCards = new DeckOfCardsImpl();
        deckOfCards.getRandomCardFromDeck(currentCardNum).printCard();
        currentCardNum++;
        deckOfCards.getRandomCardFromDeck(currentCardNum).printCard();

    }
}
