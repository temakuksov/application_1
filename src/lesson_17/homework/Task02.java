package lesson_17.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // Задача 2
        // Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: "May is the 5 month".
        // Используй коллекции.
        Map<String, Integer> year = new HashMap<>();
        year.put("january", 1);
        year.put("february", 2);
        year.put("march", 3);
        year.put("april", 4);
        year.put("may", 5);
        year.put("june", 6);
        year.put("july", 7);
        year.put("august", 8);
        year.put("september", 9);
        year.put("october", 10);
        year.put("november", 11);
        year.put("december", 12);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите название месяца\n (january, february, march, april, may, june, july, august, september, october, november, december): ");
        String mnth = scan.next().toLowerCase();
        if (year.get(mnth) != null) {
            System.out.printf("%s is the %s month", mnth, year.get(mnth));
        } else {
            System.out.printf("month %s - is noe exist!", mnth);
        }
    }
}
