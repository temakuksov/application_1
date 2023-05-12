package lesson_12.task_3;

public class Human {
    // Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human)
    private String name;
    private boolean gend;
    private int age;
    private Human father;
    private Human mother;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGend() {
        return gend;
    }

    public void setGend(boolean gend) {
        this.gend = gend;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human(String name, boolean gend, int age, Human father, Human mother) {
        this.name = name;
        this.gend = gend;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Имя: " + name +", пол:" + (gend ? " мужской" : " женский") +
               ", возраст: " + age + ", отец: " + father.name + ", мать: " + mother.name + '}';

    }

}
