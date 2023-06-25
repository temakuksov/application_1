package lesson_14.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Task07 {
    public static void printList(ArrayList<Integer> arrayList) {
        System.out.println("*--------------*");
        for (Integer m : arrayList) {
            System.out.println(m);
        }
        System.out.println("*--------------*");
    }

    public static void main(String[] args) {
        // Задача 7
        // 1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
        //    Число нацело делится на 3 (x%3==0), нацело делится на 2 (x%2==0) и все остальные.
        //    Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
        //    Порядок объявления списков очень важен.
        // 1.1 Создай метод printList
        // 2. Метод printList должен выводить на экран все элементы списка с новой строки.
        // 3. Используя метод printList выведи эти три списка на экран.
        // Сначала тот, который для x%3, потом тот, который для x%2, потом последний

        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> resList2 = new ArrayList<>();
        ArrayList<Integer> resList3 = new ArrayList<>();
        ArrayList<Integer> resListRest = new ArrayList<>();

        int n = 20;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %s число: ", i+1);
            arrList.add(scan.nextInt());
            // arrList.add(i+1);
            if (arrList.get(i) % 2 == 0) {
                resList2.add(arrList.get(i));
            }
            if (arrList.get(i) % 3 == 0) {
                resList3.add(arrList.get(i));
            }
            if ((arrList.get(i) % 2 != 0) && (arrList.get(i) % 3 != 0)) {
                resListRest.add(arrList.get(i));
            }
        }

        System.out.println("/nСписок чисел, которые делятся на 3:");
        printList(resList3);
        System.out.println("Список чисел, которые делятся на 2:");
        printList(resList2);
        System.out.println("Список всех остальных чисел:");
        printList(resListRest);

    }
}
