package lesson_12.task_1;

public class ProductCat {
    //Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
    private String name;
    private Product[] listOfProducts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product[] getListOfProducts() {
        return listOfProducts;
    }

    public void setListOfProducts(Product[] listOfProducts) {
        this.listOfProducts = listOfProducts;
    }
}

