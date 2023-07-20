package lesson_17.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task03 {
    public static void main(String[] args) throws IOException {
        // Задача 3
        // Новая задача: Программа должна работать не с номерами домов, а с городами:
        // Пример ввода:
        //   Москва -  Ивановы
        //   Киев - Петровы
        //   Лондон - Абрамовичи
        //
        // Пример ввода: Лондон
        // Пример вывода: Абрамовичи
        //
        // public static void main(String[] args) throws IOException {
        //        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //        Map<String, String> map = new HashMap<>();
        //        while (true) {
        //            String city = reader.readLine();
        //            if (city.isEmpty()) {
        //                break;
        //            }
        //            String family = reader.readLine();
        //            map.put(city, family);
        //        }
        //        String city = reader.readLine();
        //        if (map.containsKey(city)) {
        //            String familyName = map.get(city);
        //            System.out.println(familyName);
        //        }
        //    }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> mapTF = new HashMap<>();

        while (true) {
            System.out.println("Введите название города: ");
            String city = reader.readLine();
            if (city.isEmpty()) {
                System.out.println("Ввод завершен!");
                break;
            }
            System.out.println("Введите фамилию, проживающих в городе " + city + ": ");
            String surname = reader.readLine();
            mapTF.put(city, surname);
        }

        System.out.println("Введите название города: ");
        String city = reader.readLine();

        if (mapTF.containsKey(city)) {
            String familyName = mapTF.get(city);
            System.out.println("В городе " + city + " проживают с фамилией " + familyName);
        } else {
            System.out.println("по нашим данным в городе " + city + " никто не проживает!");
        }
    }
}
