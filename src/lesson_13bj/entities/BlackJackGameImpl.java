package lesson_13bj.entities;

import lesson_13bj.interfaces.BlackJackGame;
import lesson_13bj.interfaces.DeckOfCards;
import lesson_13bj.interfaces.Player;

public class BlackJackGameImpl implements BlackJackGame {

    Player[] playersGame = new Player[3];
    DeckOfCards deckOfCards = new DeckOfCardsImpl();

    @Override
    public void addPlayerInGame(Player player) {
        for (int i = 0; i < playersGame.length; i++) {
            if (playersGame[i] == null) {
                playersGame[i] = player;
                break;
            }
        }

    }

    @Override
    public void giveTwoCardsToEachPlayer() {
        for (Player player : playersGame) {
            if (player != null) {
                //       player.takeCard(deckOfCards.getCardFromDeck());
                //       player.takeCard(deckOfCards.getCardFromDeck());
            }
        }
    }

    @Override
    public void giveCardIfPlayerNeeded() {
        for (Player player : playersGame) {
            if (player != null) {
                while (player.isNeededAnotherCard()) {
                    //          player.takeCard(deckOfCards.getCardFromDeck());
                }
            }
        }
    }

    @Override
    public void printWinner() {
        // отсечь всех игроков, у которых на руках уже больше 21
        for (Player player : playersGame) {
            if (player != null) {
                if (player.countOfCardPointsOnHand() > 21) {
                    player.setInGame(false);
                }
            }

            if (countAllPlayersInGame() == 0) {
                System.out.println("Победила игра!");
            }

            if (countAllPlayersInGame() == 1) {
                System.out.println("У нас есть один победитель!");
                for (Player plr : playersGame) {
                    if (plr != null && plr.isInGame()) {
                        plr.ShowCardsOnHand();
                        System.out.println("Выиграл игрок с " + player.countOfCardPointsOnHand()
                                + "очков на руках!");
                    }
                }
            }
        }
    }

    @Override
    public int setCountOfPlayers() {
        return 0;
    }

    @Override
    public int countAllPlayersInGame() {
        return 0;
    }


}
