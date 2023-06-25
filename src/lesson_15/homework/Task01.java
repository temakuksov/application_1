package lesson_15.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Задача 1
        // Ввести с клавиатуры 5 слов в список строк.
        // Удали 3-й элемент списка, и выведи оставшиеся элементы в обратном порядке.

        ArrayList<String> strs = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите 5 слов через пробел: ");
        for (int i = 0; i < 5; i++) {
            strs.add(scan.next());
        }
        strs.remove(2);
        Collections.reverse(strs);
        // System.out.println(strs);
        System.out.println("Результат:");
        for (String s : strs) {
            System.out.println(s);
        }
    }
}
