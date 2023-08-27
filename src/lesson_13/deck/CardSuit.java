package lesson_13.deck;

public enum CardSuit {
    //масти
    HEART("♥ Черви"),
    DIAMOND("♦ Буби"),
    CLUB("♣ Крести"),
    SPADE("♠ Пики");
    private final String suitName;

    CardSuit(String suitName) {
        this.suitName = suitName;
    }

    @Override
    public String toString() {
        return suitName;
    }

}
