package lesson_10;

public class horse extends animal{
    private boolean hasASaddle;

    public boolean isHasASaddle() {
        return hasASaddle;
    }

    @Override
    public String toString(){
        return "Лошадь";
    }

    @Override
    public void makeNoise(){
        System.out.printf("Лошадь %S ржет (иго-го!)\n", getNName());
    }

    @Override
    public void eat(){
        System.out.printf("Лошадь %S ест %s\n",getNName(),getFood());
    }

}
