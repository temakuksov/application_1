package lesson_10;

public class dog extends animal{
    // приносит палку
    private boolean bringsAStick;

    public boolean isBringsAStick() {
        return bringsAStick;
    }

    @Override
    public String toString(){
        return "Собака";
    }

    @Override
    public void makeNoise(){
        System.out.printf("Собака %S лает (гав-гав!)\n", getNName());
    }

    @Override
    public void eat(){
        System.out.printf("Собака %S ест %s\n",getNName(),getFood());
    }

}
