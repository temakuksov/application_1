package lesson_14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // Задача 5
        // 1. Создай список строк.
        // 2. Добавь в него 5 строк с клавиатуры.
        // 3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
        // 4. Используя цикл выведи содержимое результирующего списка на экран, каждое значение с новой строки.

        ArrayList<String> arrList = new ArrayList<>();
        int n = 5;
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= n; i++) {
            System.out.printf("Введите %s-ю строку: ", i);
            arrList.add(scan.nextLine());
        }

        for (int j = 0; j < 13; j++) {
            arrList.add(0, arrList.get(n - 1));
            arrList.remove(n);
        }
        System.out.println("Итоговая коллекция строк:");
        for (String str : arrList) {
            System.out.println(str);
        }
    }
}
