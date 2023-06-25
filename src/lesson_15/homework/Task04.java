package lesson_15.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task04 {
    public static void doubleValues(ArrayList<String> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            if (i % 2 == 0) {
                arrList.add(i, arrList.get(i));
            }
        }
    }

    public static void main(String[] args) {
        // Задача 4
        // 1. Введи с клавиатуры 10 слов в список строк.
        // 2. Метод doubleValues должен удваивать слова по принципу:
        //    "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
        // 3. Выведи результат на экран, каждое значение с новой строки.

        ArrayList<String> strList = new ArrayList<>();
        int n = 10;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Введите %s слов:\n", n);
        for (int i = 0; i < n; i++) {
            strList.add(scan.next());
            // strList.add(Integer.toString(10 * i + 1));
        }

        doubleValues(strList);
        System.out.println("Результат:");
        for (String s : strList) {
            System.out.println(s);
        }
    }
}
