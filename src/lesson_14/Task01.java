package lesson_14;

import java.util.ArrayList;
import java.util.Collection;

public class Task01 {
    public static void main(String[] args) {

        // Задача 1
        // 1. Создай список строк.
        // 2. Добавь в него 5 различных строк.
        // 3. Выведи его размер на экран.
        // 4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

        Collection<String> arr = new ArrayList<>();
        arr.add("Строка Тест1");
        arr.add("Строка Тест2");
        arr.add("Строка Тест3");
        arr.add("Строка Тест4");
        arr.add("Строка Тест5");
        System.out.println("Размер коллекции: " + arr.size());

        for (String st : arr) {
            System.out.println(st);
        }
    }
}
