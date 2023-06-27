package lesson_16.homework;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    // Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
    // Удалить из множества все числа больше 10.
    // Требования:
    // - Программа не должна выводить текст на экран.
    // - Программа не должна считывать значения с клавиатуры.
    // - Класс Solution должен содержать только три метода.
    // - Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
    // - Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.

    public static Set<Integer> createSet() {
        // Random rnd = new Random();
        int rnd;
        Set<Integer> trSet = new TreeSet<>();
        while (trSet.size() < 20) {
            rnd = (int) (Math.random() * 100);
            trSet.add(rnd);
        }
        return trSet;
    }


    public static void main(String[] args) {
        Set<Integer> ints = createSet();
        System.out.println(ints);
    }

}
