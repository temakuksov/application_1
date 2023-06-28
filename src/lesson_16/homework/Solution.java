package lesson_16.homework;

import java.util.LinkedHashSet;
import java.util.Set;

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
        Set<Integer> trSet = new LinkedHashSet<>();
        while (trSet.size() < 20) {
            trSet.add((int) (Math.random() * 20));  // решил использовать класс Math вместо Random
        }
        return trSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> localSet) {
        localSet.removeIf(a -> a > 10);
        return localSet;
    }

    public static void main(String[] args) {
        Set<Integer> ints = createSet();
        System.out.println(ints);
        System.out.println("Результат (множество где удалены все числа больше 10):");
        System.out.println(removeAllNumbersGreaterThan10(ints));

    }
}
