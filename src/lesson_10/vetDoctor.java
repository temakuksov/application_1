package lesson_10;

public class vetDoctor {
    public static void treatAnimal(animal pet) {
        System.out.printf("На приеме у ветеринара %s %s живет в %s, обычно ест %s.\n", pet.kindOfAnimal(pet), pet.getNName(), pet.getLocation(), pet.getFood());
    }
}
