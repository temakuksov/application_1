package lesson_6;

import java.util.Locale;
import java.util.Scanner;

public class mySixthClass {
    public static void main(String[] args) {

        // Задача 1
        // Удвоил строку если чётное число букв, строка удваивается, утроил если нечётное
        // и одновременно конвертировал строки в верхний регистр
        System.out.println("1)-------------------------------------------------------");
        String[] mas1 = new String[100];
        String str;
        int i = 0;
        System.out.println("Введите элементы массива - строки (пустая строка - конец ввода):");
        Scanner scan1 = new Scanner(System.in);
        do {
            mas1[i] = scan1.nextLine();
            mas1[i] = mas1[i].toUpperCase();
            str = mas1[i];
            if (mas1[i].length() % 2 == 1) {
                mas1[i] = mas1[i].concat(str);
            }
            mas1[i] = mas1[i].concat(str);
            i++;
        } while (mas1[i - 1] != "" && i < 100);
        System.out.println("Полученный массив:");
        for (int j = 0; j < i; j++) {
            System.out.println(mas1[j]);
        }

        // Задача 2
        System.out.println("2)-------------------------------------------------------");
        String[] mas2 = new String[5];
        int k = 1;
        String maxSt, minSt;
        System.out.println("Введите 5 строк:");
        Scanner scan2 = new Scanner(System.in);
        mas2[k - 1] = scan2.nextLine();
        maxSt = mas2[k - 1];
        minSt = maxSt;
        while (k < 5) {
            mas2[k] = scan2.nextLine();
            if (minSt.length() > mas2[k].length()) {
                minSt = mas2[k];
            }
            if (maxSt.length() < mas2[k].length()) {
                maxSt = mas2[k];
            }
            k++;
        }
        System.out.println("Строка с максимальной длиной \"" + maxSt + "\" - длина " + maxSt.length());
        System.out.println("Строка с минимальной длиной \"" + minSt + "\" - длина " + minSt.length());

        // Задача 3
        System.out.println("3)-------------------------------------------------------");
        String[] mas3 = new String[10];
        System.out.println("Введите элементы массива (8 строк):");
        Scanner scan3 = new Scanner(System.in);
        for (int l = 0; l < 8; l++) {
            mas3[l] = scan3.nextLine();
        }
        System.out.println("Массив из " + mas3.length + " строк в обратном порядке:");
        for (int l = mas3.length - 1; l >= 0; l--) {
            System.out.println(mas3[l]);
        }

        // Задача 4
        System.out.println("4)-------------------------------------------------------");
        String[] mas4 = new String[10];
        int[] num4 = new int[10];
        System.out.println("Введите элементы массива (10 строк):");
        Scanner scan4 = new Scanner(System.in);
        for (int m = 0; m < mas4.length; m++) {
            mas4[m] = scan4.nextLine();
            num4[m] = mas4[m].length();
        }
        System.out.println("Длины введенных строк:");
        for (int m = 0; m < mas4.length; m++) {
            System.out.print(num4[m] + " ");
        }
        System.out.println();

        // Задача 5
        System.out.println("5)-------------------------------------------------------");
        String[] mas5 = new String[6];
        System.out.println("Введите элементы массива (6 строк):");
        Scanner scan5 = new Scanner(System.in);
        for (int n = 0; n < mas5.length; n++) {
            mas5[n] = scan5.nextLine();
        }
        for (int n = 0; n < mas5.length - 1; n++) {
            for (int g = n + 1; g < mas5.length; g++) {
                if (mas5[n] != null && mas5[g] != null) {
                    if (mas5[g].equals(mas5[n])) {
                        mas5[g] = null;
                    }
                }
            }
        }
        System.out.println("Массив без повторяющихся строк:");
        for (int n = 0; n < mas5.length; n++) {
            System.out.println(mas5[n]);
        }
    }
}
