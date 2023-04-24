package lesson_10;

public class dog extends animal{
    // приносит палку
    private boolean isBringsAStick;

    public boolean isBringsAStick() {
        return isBringsAStick;
    }

    @Override
    public String toString(){
        return "Собака";
    }

    @Override
    public void makeNoise(){
        System.out.printf("Собака %S лает (гав-гав!)", getnName());
    }

    @Override
    public void eat(){
        System.out.printf("Собака %S ест %s",getnName(),getFood());
    }

}
