package lesson_12.task_1;

public class Main {
    public static void main(String[] args) {
        // Задача № 1
        // Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        // Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
        // Создать класс Basket, содержащий массив купленных товаров.
        // Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.

        Product prod1 = new Product();
        prod1.setName("Скумбрия");
        prod1.setPrice(170.0);
        prod1.setRating(5);

        Product prod2 = new Product();
        prod2.setName("Минтай");
        prod2.setPrice(149.5);
        prod2.setRating(4);

        Product prod3 = new Product();
        prod3.setName("Свинина");
        prod3.setPrice(260.0);
        prod3.setRating(3);

        Product prod4 = new Product();
        prod4.setName("говядина");
        prod4.setPrice(320.0);
        prod4.setRating(5);

        Product[] fish = new Product[]{prod1, prod2};
        ProductCat cat1 = new ProductCat();
        cat1.setName("Рыба");
        cat1.setListOfProducts(fish);

        Product[] meat = new Product[]{prod3, prod4};
        ProductCat cat2 = new ProductCat();
        cat2.setName("Мясо");
        cat2.setListOfProducts(fish);

        Basket basket1 = new Basket();
        Product[] purchProducts1 = new Product[]{prod1, prod3, prod4};
        basket1.setListOfPurchProducts(purchProducts1);

        User customer1 = new User();
        customer1.setLogin("sidorov_ivan");
        customer1.setPassw("Q2wertyU");
        customer1.setUserBasket(basket1);

    }
}
