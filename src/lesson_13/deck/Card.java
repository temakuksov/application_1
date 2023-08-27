package lesson_13.deck;

public class Card {
    // Каждая карта должна имеет (CardSuit) и ранг (CardRank)
    private CardSuit suit;
    private CardRank rank;

    public Card(CardSuit suit, CardRank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // для карт создаём только геттеры (т.к. мы не можем переопределять карты, сеттеры не создаем)
    public CardSuit getSuit() {
        return suit;
    }

    public CardRank getRank() {
        return rank;
    }

    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }
    public int getValue() {
        return rank.rankValue;
    }

    @Override
    public String toString() {
        return ("[" + rank + " " + suit + "] (" + this.getValue() + ")");
    }
}
