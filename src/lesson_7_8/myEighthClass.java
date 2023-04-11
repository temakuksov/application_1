package lesson_7_8;

import java.util.Scanner;

public class myEighthClass {

    public static void main(String[] args) {
        System.out.println("Задача 1: " + inCube(3));
        System.out.println("Задача 2: " + isNumGreaterFive(4));
        System.out.println("Задача 3: " + minVal(4, -1));
        System.out.print("Задача 4: ");
        inSumSq(5, -8);
        System.out.println("\nЗадача 5 (Калькулятор)");
        int n1 = getInt();
        int n2 = getInt();
        char op = getOperation();
        calc(n1, n2, op);

    }

    // Задача 1
    // Напишите метод, с помощью которого можно было бы возводить число, переданное в сигнатуру метода, в куб
    public static int inCube(int x) {
        return x * x * x;
    }

    // Задача 2
    // Напишите метод, который бы возвращал в консоль: true, если число больше 5 и false, если число меньше 5
    public static boolean isNumGreaterFive(int x) {
        return x > 5;
    }

    // Задача 3
    // Написать метод, который бы возвращал из 2 чисел меньшее число
    public static int minVal(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    // Задача 4
    // Необходимо написать метод, который бы возводил число в степень.
    // И далее два числа, возведенные в степень, должны быть просуммированы, а результат выведен в консоль.
    public static int inSquare(int x) {
        return x * x;
    }

    public static void inSumSq(int x, int y) {
        int sum = inSquare(x) + inSquare(y);
        System.out.println(sum);
    }

    // Задача 5
    // Необходимо написать простой консольный калькулятор на Java
    public static int getInt() {
        System.out.print("Введите число: ");
        Scanner scan1 = new Scanner(System.in);
        return scan1.nextInt();
    }

    public static char getOperation() {
        System.out.print("1 - сложение\n2 - вычитание\n3 - умножение\n4 - деление\nВыберите действие (введите 1,2,3 или 4): ");
        Scanner scan1 = new Scanner(System.in);
        int operand = scan1.nextInt();
        switch (operand) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                return '0';
        }
    }

    public static void calc(int x, int y, char operand) {
        double res = 0;
        switch (operand) {
            case '+' -> res = x + y;
            case '-' -> res = x - y;
            case '*' -> res = x * y;
            case '/' -> res = (double) x / y;
            default -> System.out.println("Не верно указано действие!");
        }
        System.out.println("Результат " + x + " " + operand + " " + y + " = " + res);
    }

}