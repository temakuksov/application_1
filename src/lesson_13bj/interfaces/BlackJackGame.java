package lesson_13bj.interfaces;

public interface BlackJackGame {
    // добавление игрока в игру
    void addPlayerInGame(Player player);

    // выдача всем по 2 карты
    void giveTwoCardsToEachPlayer();

    // выдача дополнительно карты по необходимости
    void giveCardIfPlayerNeeded();

    // определение победителя и его выдача на печать
    void  printWinner();

    int setCountOfPlayers();

    int countAllPlayersInGame();

}
