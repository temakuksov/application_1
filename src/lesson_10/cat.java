package lesson_10;

public class cat extends animal {
    // играет мячом
    private boolean playingWithABall;

    public boolean isPlayingWithABall() {
        return playingWithABall;
    }
    @Override
    public String toString(){
        return "Кошка";
    }

    @Override
    public void makeNoise(){
        System.out.printf("Кошка %S мяукает (мяяу!)\n", getNName());
    }

    @Override
    public void eat(){
        System.out.printf("Кошка %S ест %s\n",getNName(),getFood());
    }


}
