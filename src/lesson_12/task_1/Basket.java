package lesson_12.task_1;

public class Basket {
    // Создать класс Basket, содержащий массив купленных товаров
    private Product[] listOfPurchProducts;

    public Product[] getListOfPurchProducts() {
        return listOfPurchProducts;
    }

    public void setListOfPurchProducts(Product[] listOfPurchProducts) {
        this.listOfPurchProducts = listOfPurchProducts;
    }
}
