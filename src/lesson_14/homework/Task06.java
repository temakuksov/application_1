package lesson_14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        // Задача 6
        // 1. Создай список строк.
        // 2. Добавь в него 10 строчек с клавиатуры.
        // 3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
        //    Если таких строк несколько, то должны быть учтены самые первые из них.
        // 4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

        ArrayList<String> arrList = new ArrayList<>();
        int n = 10;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите 1-ю строку: ");
        arrList.add(scan.nextLine());
        int min = arrList.get(0).length();
        int max = min;
        int indMin = 0;
        int indMax = 0;

        for (int i = 1; i < n; i++) {
            System.out.printf("Введите %s-ю строку: ", i+1);
            arrList.add(scan.nextLine());
            if (arrList.get(i).length() < min) {
                min = arrList.get(i).length();
                indMin = i;
            }
            if (arrList.get(i).length() > max) {
                max = arrList.get(i).length();
                indMax = i;
            }
        }
        if (indMin < indMax) {
            System.out.println("Самая короткая строка встретилась раньше: " + arrList.get(indMin));
        } else if (indMin > indMax) {
            System.out.println("Самая длинная строка встретилась раньше " + arrList.get(indMax));
        } else {
            System.out.println("Самая самая короткая строка совпадает с самой длинной строкой: " + arrList.get(indMin));
        }

    }
}
