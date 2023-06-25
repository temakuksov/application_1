package lesson_14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        // Задача 2
        // 1. Создай список строк.
        // 2. Считай с клавиатуры 5 строк и добавь в список.
        // 3. Используя цикл, найди самую длинную строку в списке.
        // 4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

        ArrayList<String> arrList = new ArrayList<>();
        ArrayList<String> resList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите 1-ю строку: ");
        arrList.add(scan.nextLine());
        int max = arrList.get(0).length();

        for (int i = 1; i < 5; i++) {
            System.out.printf("Введите %s-ю строку: ", i + 1);
            arrList.add(scan.nextLine());
            if (arrList.get(i).length() > max) {
                max = arrList.get(i).length();
            }
        }

        System.out.println("Список строк максимальной длины:");
        for (String st : arrList) {
            if (st.length() == max) {
                resList.add(st);   // в принципе можно итоговую коллекцию resList не создавать и не заполнять
                System.out.println(st);
            }
        }

    }
}
