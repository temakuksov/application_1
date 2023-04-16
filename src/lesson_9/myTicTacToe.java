package lesson_9;

import java.util.Random;
import java.util.Scanner;

public class myTicTacToe {
    Scanner scan;
    char[][] table;
    Random rnd;

    public myTicTacToe(int f, int l) {
        scan = new Scanner(System.in);
        rnd = new Random();
        table = new char[f][f];
    }

    public void playGame(int f, int l) {
        System.out.println("Игра началась! \nВы - X \nКомпьютер - O");
        initTable();
        printTable();
        while (true) {
            turnUser();
            if (checkWin('X', f, l)) {
                printTable();
                System.out.println("Вы выиграли!");
                break;
            }

            if (isTableFull()) {
                System.out.println("Ничья");
                break;
            }
            turnAI();
            printTable();
            if (checkWin('O', f, l)) {
                printTable();
                System.out.println("Вы проиграли!");
                break;
            }
        }
    }

    public void initTable() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                table[x][y] = '.';
            }
        }
    }

    public void printTable() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    public void turnUser() {
        int x, y;
        do {
            System.out.print("Введите координаты хода X и Y (от 0 до 4): ");
            x = scan.nextInt();
            y = scan.nextInt();
        } while (!isCellValid(x, y));
        table[x][y] = 'X';
    }

    public void turnAI() {
        int x, y;
        do {
            x = rnd.nextInt(0, table.length - 1);
            y = rnd.nextInt(0, table[x].length - 1);
        } while (!isCellValid(x, y));
        table[x][y] = 'O';
    }

    public boolean checkWin(char symb, int f, int l) {
        boolean win;
        // проверяем все вертикали, для этого пробегаем первые (f-l+1) строки матрицы и из каждого элемента строим вертикаль вниз
        for (int i = 0; i < (f - l + 1); i++) {
            for (int j = 0; j < f; j++) {
                win = true;
                for (int k = i; k < i + l; k++) {
                    if (table[k][j] != symb) {
                        win = false;
                    }
                }
                if (win) return true;
            }
        }
        // проверяем все горизонтали, для этого пробегаем первые (f-l+1) столбцы матрицы и из каждого элемента строим горизонталь вправо
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < (f - l + 1); j++) {
                win = true;
                for (int k = j; k < j + l; k++) {
                    if (table[i][k] != symb) {
                        win = false;
                    }
                }
                if (win) return true;
            }
        }

        // проверяем все главные диагонали (\), для этого пробегаем все элементы верхнего левого квадрата размера (f-l+1) на (f-l+1)
        // в угле матрицы, и из каждого элемента строим диагональ влево-вниз,
        for (int i = 0; i < (f - l + 1); i++) {
            for (int j = 0; j < (f - l + 1); j++) {
                win = true;
                for (int k = 0; k < l; k++) {
                    if (table[i + k][j + k] != symb) {
                        win = false;
                    }
                }
                if (win) return true;
            }
        }

        // проверяем остальные диагонали (/), для этого пробегаем все элементы верхнего правого квадрата размера (f-l+1) на (f-l+1)
        // в угле матрицы, и из каждого элемента строим диагональ вправо-вниз,
        for (int i = 0; i < (f - l + 1); i++) {
            for (int j = (l - 1); j < f; j++) {
                win = true;
                for (int k = 0; k < l; k++) {
                    if (table[i + k][j - k] != symb) {
                        win = false;
                    }
                }
                if (win) return true;
            }
        }
        return false;
    }

    public boolean isCellValid(int x, int y) {
        if (x < 0 || (x > table.length - 1) || y < 0 || (y > table[x].length - 1)) {
            return false;
        }
        return table[x][y] == '.';
    }

    public boolean isTableFull() {
        for (int x = 0; x < table.length; x++) {
            for (int y = 0; y < table[x].length; y++) {
                if (table[x][y] == '.') return false;
            }
        }
        return true;
    }
}
