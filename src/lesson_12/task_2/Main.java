package lesson_12.task_2;

public class Main {
    public static void main(String[] args) {
        // Задача № 2
        // Создать класс Person, который содержит:
        // переменные fullName, age;
        // методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
        // Добавьте два конструктора  - Person() и Person(fullName, age).
        // Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)

        Person Juli = new Person();
        Juli.setFullName("Сокольсткая Юлия");
        Juli.setAge(31);

        Person Aleksandr = new Person("Иванов Александр", 34);

        Juli.move();
        Aleksandr.talk();
    }
}
