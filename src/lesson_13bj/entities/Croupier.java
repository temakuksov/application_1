package lesson_13bj.entities;

public abstract class Croupier extends PlayerImpl {

    public Croupier(String name, boolean inGame) {
        super(name, inGame);
    }

    @Override
    public boolean isNeededAnotherCard() {
        if (countOfCardPointsOnHand() >= 17) {
            return false;
        }
        return true;
    }

}
