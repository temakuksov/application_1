package lesson_5;

import java.util.Arrays;
import java.util.Scanner;

public class myFifthClass {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("1)-------------------------------------------------------");
        String[] mas1 = new String[10];
        System.out.println("Введите элементы массива (8 строк):");
        Scanner scan1 = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            mas1[i] = scan1.nextLine();
        }
        System.out.println("Массив из " + mas1.length + " строк в обратном порядке:");
        for (int i = mas1.length - 1; i >= 0; i--) {
            System.out.println(mas1[i]);
        }

        // Задача 2
        System.out.println("2)-------------------------------------------------------");
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

        // Задача 3
        System.out.println("3)-------------------------------------------------------");
        String[] mas31 = new String[10];
        int[] mas32 = new int[10];
        System.out.println("Введите элементы массива (10 строк):");
        Scanner scan3 = new Scanner(System.in);
        for (int i = 0; i < mas31.length; i++) {
            mas31[i] = scan3.nextLine();
            mas32[i] = mas31[i].length();
        }
        System.out.println("Массив длин строк:");
        for (int i = 0; i < mas32.length; i++) {
            System.out.print(mas32[i] + " ");
        }
        System.out.println();

        // Задача 4
        System.out.println("4)-------------------------------------------------------");
        int[] mas4 = new int[10];
        System.out.println("Введите элементы массива (10 чисел):");
        Scanner scan4 = new Scanner(System.in);
        for (int i = 0; i < mas4.length; i++) {
            mas4[i] = scan4.nextInt();
        }
        System.out.println("Элементы массива в обратном порядке:");
        for (int i = mas4.length - 1; i >= 0; i--) {
            System.out.println(mas4[i]);
        }

        // Задача 5
        System.out.println("5)-------------------------------------------------------");
        int[] mas5 = new int[20];
        int[] m51 = new int[10];
        int[] m52 = new int[10];
        System.out.println("Введите элементы массива (20 чисел):");
        Scanner scan5 = new Scanner(System.in);
        for (int i = 0; i < mas5.length; i++) {
            mas5[i] = scan5.nextInt();
            if (i < (mas5.length / 2)) {
                m51[i] = mas5[i];
            } else if (i >= (mas5.length / 2 - 1)) {
                m52[i - mas5.length / 2] = mas5[i];
            }
        }
        System.out.println("Вторая половина введеного массива:");
        for (int i = 0; i < m52.length; i++) {
            System.out.println(m52[i]);
        }

        // Задача 6
        System.out.println("6)-------------------------------------------------------");
        int[] mas6 = new int[20];
        int maxval, minval;
        System.out.println("Введите элементы массива (20 чисел):");
        Scanner scan6 = new Scanner(System.in);
        mas6[0] = scan6.nextInt();
        maxval = mas6[0];
        minval = mas6[0];
        for (int i = 1; i < mas6.length; i++) {
            mas6[i] = scan6.nextInt();
            if (maxval < mas6[i]) {
                maxval = mas6[i];
            }
            if (minval > mas6[i]) {
                minval = mas6[i];
            }
        }
        System.out.println("Максимальное и минимальное числа соответсвенно:" + maxval + " " + minval);

        // Задача 7
        System.out.println("7)-------------------------------------------------------");
        int[] mas7 = new int[20];
        System.out.println("Введите элементы массива (20 чисел):");
        Scanner scan7 = new Scanner(System.in);
        for (int i = 0; i < mas7.length; i++) {
            mas7[i] = scan7.nextInt();
        }
        int val;
        // сортитовка массива по убывнию, хотя можно было так Arrays.sort(mas7) и вывести в отратном порядке;
        for (int i = 0; i < mas7.length - 1; i++) {
            for (int j = 1; j < mas7.length - i; j++) {
                if (mas7[j - 1] < mas7[j]) {
                    val = mas7[j];
                    mas7[j] = mas7[j - 1];
                    mas7[j - 1] = val;
                }
            }
        }
        System.out.println("Элементы массива в убывающем порядке:");
        System.out.println(Arrays.toString(mas7));


    }
}
