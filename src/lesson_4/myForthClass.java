package lesson_4;

import java.util.Scanner;

public class myForthClass {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("1) введите стороны прямоугольника m и n: ");
        System.out.print("сторона m=");
        Scanner scan1 = new Scanner(System.in);
        int m = scan1.nextInt();
        System.out.print("сторона n=");
        int n = scan1.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        //Задача 2
        byte a = 10;
        System.out.println("2) Прямоугольный равнобедренный треугольник cо стороной " + a + ":");
        for (int i1 = 1; i1 <= a; i1++) {
            for (int j1 = 1; j1 <= i1; j1++) {
                System.out.print("8");
            }
            System.out.println();
        }

        //Задача 3
        System.out.println("3) Введите три числа:");
        Scanner scan3 = new Scanner(System.in);
        int num1 = scan3.nextInt();
        int num2 = scan3.nextInt();
        int num3 = scan3.nextInt();
        System.out.print("Среднее из них: ");
        if (num1 == num2 && num2 == num3) {
            System.out.println(num1);
        } else if (num1 == num2 && num2 != num3) {
            System.out.println(num1);
        } else if (num1 == num3 && num1 != num2) {
            System.out.println(num1);
        } else if (num2 == num3 && num2 != num1) {
            System.out.println(num2);
        } else if ((num1 > num2 && num2 > num3) || (num3 > num2 && num2 > num1)) {
            System.out.println(num2);
        } else if ((num1 > num3 && num3 > num2) || (num2 > num3 && num3 > num1)) {
            System.out.println(num3);
        } else if ((num3 > num1 && num1 > num2) || (num2 > num1 && num1 > num3)) {
            System.out.println(num1);
        }

        //Задача 4
        byte x = 1;
        byte y = 1;
        System.out.println("4) Таблица умножения 10x10:");
        while (x <= 10) {
            while (y <= 10) {
                System.out.print(x * y + " ");
                y++;
            }
            y = 1;
            x++;
            System.out.println();
        }

        //Задача 5
        System.out.println("5) Введите имя: ");
        Scanner scan5 = new Scanner(System.in);
        String name = scan5.nextLine();
        System.out.println("Введите дату рождения (год, месяц, день): ");
        System.out.print("год=");
        short y1 = scan5.nextShort();
        System.out.print("месяц=");
        byte m1 = scan5.nextByte();
        System.out.print("день=");
        byte d1 = scan5.nextByte();
        System.out.println("Меня зовут " + name + ".\n" + "Я родился " + d1 + "." + m1 + "." + y1);
    }
}
