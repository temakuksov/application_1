package lesson_1;

public class MyFirstCLass {
    public static void main(String[] args) {
        // Задача 1
        int sum=5;
        int n=2;
        float inKassa;
        inKassa=(float)sum/n;
        System.out.println("В каждой кассе по "+inKassa+" рубл(я,ей)!");

        // Задача 2
        int rectA=50;
        int rectB=20;
        int Square;
        Square=rectA*rectB;
        System.out.println("Площадь прямоугольника: "+Square);

        // Задача 3
        int bananas=3;
        int hungryVasya=9;
        int fullVasya=15;
        float delta;
        delta=(float)(fullVasya-hungryVasya)/bananas;
        System.out.println("Вася съедает один банан голодным на "+delta+" мин. быстрее чем сытым!");
    }
}
