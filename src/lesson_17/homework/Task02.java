package lesson_17.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // Задача 2
        // Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
        // Используй коллекции.
        Map<String, Integer> months = new HashMap<>();
        months.put("january", 1);
        months.put("february", 2);
        months.put("march", 3);
        months.put("april", 4);
        months.put("may", 5);
        months.put("june", 6);
        months.put("july", 7);
        months.put("august", 8);
        months.put("september", 9);
        months.put("october", 10);
        months.put("november", 11);
        months.put("december", 12);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название месяца\n (january, february, march, april, may, june, july, august, september, october, november, december): ");
        String mnth = scan.next().toLowerCase();
        System.out.println(months.get(mnth));
    }
}
