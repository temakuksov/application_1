package lesson_10;

public class animal {
    // кличка животного
    private String nName;
    private String food;
    private String location;

    public void setnName(String nName) {
        this.nName = nName;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getnName() {
        return nName;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
    }

    public void eat() {
    }

    public void sleep() {
        System.out.println();
    }

}
