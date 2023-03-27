package lesson_5;

import java.util.Scanner;

public class myFifthClass {
    public static void main(String[] args) {

        // Задача 1
        String[] mas1 = new String[10];
        System.out.println("Введите элементы массива (8 строк):");
        Scanner scan1 = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            mas1[i] = scan1.nextLine();
        }
        System.out.println("Массив из " + mas1.length + " строк:");
        for (int i = 0; i < mas1.length; i++) {
            System.out.println(mas1[i]);
        }

        // Задача 2
        System.out.println("-------------------------------------------------------");
        int[] mas2 = new int[10];
        System.out.println("Введите элементы массива (10 чисел):");
        Scanner scan2 = new Scanner(System.in);
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = scan2.nextInt();
        }
        int maxMas2 = mas2[0];
        for (int i = 1; i < mas2.length; i++) {
            if (mas2[i] > maxMas2) {
                maxMas2 = mas2[i];
            }
        }
        System.out.println("Максимальное число из элементов масива: " + maxMas2);
    }
}
