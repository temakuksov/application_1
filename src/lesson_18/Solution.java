package lesson_18;

import org.jetbrains.annotations.Contract;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Задача 1
        // 1) Ввести с клавиатуры число N.
        // 2) Считать N целых чисел и заполнить ими список - метод getIntegerList.
        // 3) Найти минимальное число среди элементов списка - метод getMinimum.
        System.out.println("*----- Задача 1 -----*");
        List<Integer> integerList = getIntegerList();
        System.out.println("Минимальное число: " + getMinimum(integerList));

        // Задача 2
        // 1) Внутри класса Solution создать public static классы Cat, Dog без конструктора или с конструктором без параметров.
        // 2) Реализовать метод createCats, который должен возвращать множество с 4 котами.
        // 3) Реализовать метод createDogs, который должен возвращать множество с 3 собаками.
        // 4) Реализовать метод join, который должен возвращать объединенное множество всех животных - всех котов и собак.
        // 5) Реализовать метод removeCats, который должен удалять из множества pets всех котов, которые есть в множестве cats.
        // 6) Реализовать метод printPets, который должен выводить на экран всех животных, которые в нем есть.
        // Каждое животное с новой строки.

        System.out.println("*----- Задача 2 -----*");
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();
        Set<Object> pets = join(cats, dogs);
        System.out.println("Множество котов и собак:");
        printPets(pets);
        System.out.println("Множество собак:");
        removeCats(pets, cats);
        printPets(pets);


        // Задача 3
        // 1) Инициализируй поле wheels используя данные из loadWheelNamesFromDB.
        // 2) Выкинь исключение в случае некорректных данных.
        // Подсказка: если что-то не то с колесами, то это не машина!
        // Сигнатуры не менять
        System.out.println("*----- Задача 3 -----*");
        Car car = new Car();
        System.out.println(car);
        System.out.println(" ");


    }

    // для задачи 1
    public static int getMinimum(List<Integer> list) {
        list.sort(Comparator.naturalOrder());
        return list.get(0);
    }

    public static List<Integer> getIntegerList() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество чисел (N>0): ");
        int numN = scan.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numN; i++) {
            System.out.print("Введите " + (i + 1) + " число: ");
            result.add(scan.nextInt());
        }
        return result;
    }

    // для задачи 2
    public static class Cat {
        public Cat() {
        }

        @Override
        public String toString() {
            return "Кошка @";
        }
    }

    public static class Dog {
        public Dog() {
        }

        @Override
        public String toString() {
            return "Собака #";
        }
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        Set<Dog> result = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            result.add(new Dog());
        }
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        return Stream.of(cats, dogs).flatMap(Collection::stream).collect(Collectors.toSet());
    }

    public static void removeCats(Set<Object> animals, Set<Cat> cats) {
        animals.removeAll(cats);
    }

    public static void printPets(Set<Object> animals) {
        animals.forEach(System.out::println);
    }

    // для задачи 3

    public enum Wheel {
        FRONT_LEFT("FL"), FRONT_RIGHT("FR"), BACK_LEFT("BL"), BACK_RIGHT("BR");
        private final String name;

        @Contract(pure = true)
        Wheel(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Car {
        protected List<Wheel> wheels;

        public List<Wheel> getWheels() {
            return wheels;
        }

        public void setWheels(List<Wheel> wheels) {
            this.wheels = wheels;
        }

        public Car() {
            //init wheels here
            try {
                this.setWheels(Arrays.stream(loadWheelNamesFromDB()).
                        map(Wheel::valueOf).collect(Collectors.toList()));
            } catch (Exception ex) {
                System.out.println("Что-то не то с колесами, это не машина!");
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }

    }

}

