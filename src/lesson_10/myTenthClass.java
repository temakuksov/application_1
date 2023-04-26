package lesson_10;

public class myTenthClass {
    public static void main(String[] args) {

        dog dog1 = new dog();
        dog1.setNName("Полкан");
        dog1.setFood("кости");
        dog1.setLocation("Пермь");

        dog dog2 = new dog();
        dog2.setNName("Джек");
        dog2.setFood("мясо");
        dog2.setLocation("Кунгур");

        cat cat1 = new cat();
        cat1.setNName("Васька");
        cat1.setFood("рыба");
        cat1.setLocation("Краснокамск");

        cat cat2 = new cat();
        cat2.setNName("Плюша");
        cat2.setFood("perfect fit");
        cat2.setLocation("Пермь");

        horse horse1 = new horse();
        horse1.setNName("Ветер");
        horse1.setFood("овес");
        horse1.setLocation("пос.Ферма");

        horse horse2 = new horse();
        horse2.setNName("Сивый");
        horse2.setFood("сено");
        horse2.setLocation("пос.Курья");

        animal[] anList = new animal[6];
        anList[0] = dog1;
        anList[1] = cat1;
        anList[2] = horse1;
        anList[3] = dog2;
        anList[4] = cat2;
        anList[5] = horse2;

        for (animal pet : anList) {
            pet.makeNoise();
            pet.eat();
            pet.sleep();
        }
        System.out.println("\nВетеринарный кабинет:");
        for (animal pet : anList) {
            vetDoctor.treatAnimal(pet);
        }

    }
}
