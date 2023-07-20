package lesson_17.homework;

import java.util.HashMap;
import java.util.Map;

public class Task04 {
    public static void main(String[] args) {
        // Задача 4
        // Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
        // арбуз - ягода,
        // банан - трава,
        // вишня - ягода,
        // груша - фрукт,
        // дыня - овощ,
        // ежевика - куст,
        // жень-шень - корень,
        // земляника - ягода,
        // ирис - цветок,
        // картофель - клубень.
        // Вывести содержимое коллекции на экран, каждый элемент с новой строки.
        // Пример вывода (тут показана только одна строка):
        // картофель - клубень
        Map<String, String> vegs = new HashMap<>();
        vegs.put("арбуз", "ягода");
        vegs.put("банан", "трава");
        vegs.put("вишня", "ягода");
        vegs.put("груша", "фрукт");
        vegs.put("дыня", "овощь");
        vegs.put("ежевика", "куст");
        vegs.put("жень-шень", "корень");
        vegs.put("земляника", "ягода");
        vegs.put("ирис", "цветок");
        vegs.put("картофель", "клубень");
        for(Map.Entry<String,String> v : vegs.entrySet()){
            System.out.println(v.getKey()+" - "+v.getValue());
        }
    }
}
