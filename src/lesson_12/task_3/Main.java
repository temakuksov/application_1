package lesson_12.task_3;

public class Main {
    public static void main(String[] args) {
        // Задача № 3
        // Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
        // Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
        // Вывести объекты на экран.
        // Примечание: Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
        // Пример вывода:
        // Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
        // Имя: Катя, пол: женский, возраст: 55
        // Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня

        // дедушка
        Human ivan = new Human();
        ivan.setName("Иван Николаевич");
        ivan.setAge(60);
        ivan.setGend(true);
        // бабушка
        Human olga = new Human();
        olga.setName("Ольга Валерьевна");
        olga.setAge(58);
        olga.setGend(false);

        // дедушка
        Human pavel = new Human();
        pavel.setName("Павел Петрович");
        pavel.setAge(60);
        pavel.setGend(true);
        // бабушка
        Human irina = new Human();
        irina.setName("Ольга Валерьевна");
        irina.setAge(58);
        irina.setGend(false);


    }
}
