package lesson_17.homework;

import java.util.HashMap;
import java.util.Map;

public class Task01 {
    public static void main(String[] args) {
        // Задача 1
        // 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде "Фамилия"-"Имя".
        // 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
        // 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
        // 4. Вывести содержимое Map на экран.

        HashMap<String, String> mans = new HashMap<>();
        mans.put("Туголуков", "Антон");
        mans.put("Светлаков", "Никита");
        mans.put("Москвина", "Светлана");
        mans.put("Фокин", "Артём");
        mans.put("Куксов", "Артём");
        mans.put("Петров", "Никита");
        mans.put("Стельцова", "Светлана");
        mans.put("Решетников", "Антон");
        mans.put("Струев", "Никита");
        mans.put("Сидоров", "Антон");

        for (Map.Entry<String, String> m : mans.entrySet()) {
            System.out.println(m.getKey()+ " - "+m.getValue());
        }
    }
}
