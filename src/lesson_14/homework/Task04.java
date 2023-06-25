package lesson_14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // Задача 4
        // 1. Создай список строк в методе main.
        // 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
        // 3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("Первая Строка");
        arrList.add("Вторая Строка");
        arrList.add("Третья Строка");

        Scanner scan = new Scanner(System.in);

        for (int i = 3; i < 13; i++) {
            System.out.printf("Введите 1-ю строку (осталось: %s): ", 13-i);
            arrList.add(0, scan.nextLine());
        }

        System.out.println("Итоговая коллекция строк:");
        for (String st : arrList) {
            System.out.println(st);
        }
    }
}
