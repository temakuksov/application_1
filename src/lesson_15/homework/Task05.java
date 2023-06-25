package lesson_15.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        // Задача 5
        // 1. Введи с клавиатуры 10 слов в список строк.
        // 2. Определить, является ли список упорядоченным по возрастанию длины строки.
        // 3. В случае отрицательного ответа вывести на экран индекс первого элемента,
        //    нарушающего такую упорядоченность.

        ArrayList<String> strList = new ArrayList<>();
        int n = 10;
        Scanner scan = new Scanner(System.in);

        System.out.printf("Введите %s слов:\n", n);
        for (int i = 0; i < n; i++) {
            strList.add(scan.next());
            // strList.add(Integer.toString( 10 * i));
        }

        boolean isSort = true;

        for (int i = 1; i < strList.size(); i++) {
            if (strList.get(i-1).length() > strList.get(i).length())  {
                System.out.printf("Элемент %s нарушает упорядоченность по возрастанию!\n",i+1);
                isSort = false;
                break;
            }
        }
        if (isSort) {
            System.out.println("Cписок упорядочен по возрастанию длины строки!");
        }
        // System.out.println(strList);

    }
}
