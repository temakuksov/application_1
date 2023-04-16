package lesson_9;

public class myNinthClass {
    public static void main(String[] args) {
        int f = 5; // размер игрового поля
        int l = 4; // длина ряда для победы
        myTicTacToe ticTacToe = new myTicTacToe(f, l);
        ticTacToe.playGame(f, l);
    }
}

