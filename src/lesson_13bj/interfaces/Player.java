package lesson_13bj.interfaces;

public interface Player {
    // взятие карты из колоды
    void takeCard(Card card);

    // подсчет суммы своих карт
    int countOfCardPointsOnHand();

    // нужна ли еще одна карта
    boolean isNeededAnotherCard();

    // вывод карт который у игрока на руках
    void ShowCardsOnHand();

    void showCardsOnHand();

    Boolean isInGame();

   void setInGame(Boolean inGame);


}
