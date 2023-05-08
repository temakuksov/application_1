package lesson_12.task_1;

public class Product {
    // Создать класс Товар, имеющий переменные имя, цена, рейтинг
    private String name;
    private double price;
    private int rating;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
