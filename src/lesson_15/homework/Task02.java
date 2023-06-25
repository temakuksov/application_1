package lesson_15.homework;

import java.util.ArrayList;

public class Task02 {
    public static void main(String[] args) {
        // Задача 2
        // 1. Создай список из слов "мама", "мыла", "раму".
        // 2. После каждого слова вставь в список строку, содержащую слово "именно".
        // 3. Вывести результат на экран, каждый элемент списка с новой строки.

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("мама");
        arrList.add("мыла");
        arrList.add("раму");

        for (int i = 0; i <= arrList.size(); i++) {
            if (i % 2 == 1) {
                arrList.add(i, "именно");
            }
        }

        System.out.println(arrList);
    }
}
