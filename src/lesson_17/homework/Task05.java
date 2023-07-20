package lesson_17.homework;

import java.util.HashMap;
import java.util.Map;

public class Task05 {
    public static void main(String[] args) {
        // Задача 5
        // Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар объектов.
        // Вывести содержимое коллекции на экран, каждый элемент с новой строки.
        // Пример вывода (тут показана только одна строка):
        // Sim - 5
        // public static void main(String[] args) {
        //      Map<String, Object> map = new HashMap<>();
        //      map.put("Sim", 5);
        //      map.put("Tom", 5.5);
        //      map.put("Arbus", false);
        //      map.put("Baby", null);
        //      map.put("Cat", "Cat");
        //      map.put("Eat", new Long(56));
        //      map.put("Food", new Character('3'));
        //      map.put("Gevey", '6');
        //      map.put("Hugs", 111111111111L);
        //      map.put("Comp", (double) 123);
        //     //напишите тут ваш код
        //  }
        Map<String, Object> map = new HashMap<>();

        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", 56L);
        map.put("Food", '3');
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);
        for (Map.Entry<String, Object> mObj : map.entrySet()) {
            System.out.println(mObj.getKey()+" - "+mObj.getValue());
        }
    }
}
