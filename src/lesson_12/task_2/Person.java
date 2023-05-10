package lesson_12.task_2;

public class Person {
    /*  Создать класс Person, который содержит:
        переменные fullName, age;
        методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
        Добавьте два конструктора  - Person() и Person(fullName, age).   */
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println("Такой-то " + this.fullName + " говорит");
    }

    public void talk() {
        System.out.println("Такой-то " + this.fullName + " говорит");
    }

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
