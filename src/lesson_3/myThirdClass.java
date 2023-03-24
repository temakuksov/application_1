package lesson_3;
import java.util.Scanner;
public class myThirdClass {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("1) введите целое число: ");
        Scanner scan1 = new Scanner(System.in);
        int n = scan1.nextInt();
        if (n < 5) {
            System.out.println("Число меньше 5");
        } else if (n > 5) {
            System.out.println("Число больше 5");
        } else {
            System.out.println("Число равно 5");
        }

        //Задача 2
        System.out.println("2) введите целое число для проверки его принадлежности интервалу (50;100): ");
        Scanner scan2 = new Scanner(System.in);
        int k = scan2.nextInt();
        if ((k > 50) && (k < 100)) {
            System.out.println("Число "+k+" содержится в интервале (50;100).");
        } else {
            System.out.println("Число "+k+" не содержится в интервале (50;100).");
        }

        //Задача 3
        System.out.println("3) введите порядковый номер месяца: ");
        Scanner scan3 = new Scanner(System.in);
        byte month = scan3.nextByte();
        if ((month >= 3) && (month<=5)) {
            System.out.println("Весна");
        } else if ((month >= 6) && (month<=8)) {
            System.out.println("Лето");
        } else if ((month >= 9) && (month<=11)) {
            System.out.println("Осень");
        } else if ((month == 1) || (month==2) || (month==12)) {
            System.out.println("Зима");
        } else {
            System.out.println("Месяц введен не верно!");
        }

        //Задача 4
        System.out.println("4) введите целое число: ");
        Scanner scan4 = new Scanner(System.in);
        int d = scan4.nextInt();
        if (d > 0) {
            d=d*2;
        } else if (d < 0) {
            d=d+1;
        }
            System.out.println("Число: "+d);

        //Зачача 5
        System.out.println("5) Задача 5 - отсутствует!");

        //Задача 6
        System.out.println("6) введите год для проверки вискосный он или нет: ");
        Scanner scan6 = new Scanner(System.in);
        int year = scan6.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("366");
        } else {
            System.out.println("365");
        }

        //Задача 7
        System.out.println("7) введите стороный треугольника (a,b,c):");
        System.out.print("сторона a=");
        Scanner scan71 = new Scanner(System.in);
        int a = scan71.nextInt();
        System.out.print("сторона b=");
        Scanner scan72 = new Scanner(System.in);
        int b = scan72.nextInt();
        System.out.print("сторона c=");
        Scanner scan73 = new Scanner(System.in);
        int c = scan73.nextInt();
        if ((a+b > c) && (a+c > b) && (b+c > a)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

        //Задача 8
        byte sigGrn=3;  // кол-во минут в течении которого горит зеленый сигнал
        byte sigYlw=1;  // кол-во минут в течении которого горит желтый сигнал
        byte sigRed=1;  // кол-во минут в течении которого горит красный сигнал
        System.out.println("8) введите кол-во минут для светофора (дробное положительное число с запятой):");
        Scanner scan8 = new Scanner(System.in);
            float t = scan8.nextFloat();
        System.out.println("Светофор:");
        t = t % (sigGrn+sigRed+sigYlw);
        if (t >= 0 && t < sigGrn) {
            System.out.println("зелёный");
        }  else if (t >= sigGrn && t < (sigGrn+sigYlw)) {
            System.out.println("жёлтый");
        }  else if (t >= (sigGrn+sigYlw) && t < (sigGrn+sigYlw+sigRed)) {
            System.out.println("красный");
        }
    }
}
