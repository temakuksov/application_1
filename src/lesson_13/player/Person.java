package lesson_13.player;

import lesson_13.deck.Deck;

public class Person {
    private String name;
    private Hand hand;

    public Person() {
        this.name = "";
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void printHand() {
        System.out.println("Игрок " + this.name + "\n - карты: " + this.hand);
        System.out.println(" - сумма очков: " + this.hand.calculatedValue());
    }

    public boolean hasBlackjack() {
        return this.getHand().calculatedValue() == 21;
    }

    public void hit(Deck deck, Deck discard) {
        if (!deck.hasCards()) {
            deck.reloadDeckFromDiscard(discard);
        }
        this.hand.takeCardFromDeck(deck);
        System.out.println("Игрок " + this.name + " взял карту: " + hand.getCard(hand.getHandSize() - 1));
        this.printHand();
    }

}
