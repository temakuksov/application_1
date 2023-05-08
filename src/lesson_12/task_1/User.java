package lesson_12.task_1;

public class User {
    // Создать класс User, содержащий логин, пароль и объект класса Basket
    private String login;
    private String passw;
    private Basket userBasket;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public Basket getUserBasket() {
        return userBasket;
    }

    public void setUserBasket(Basket userBasket) {
        this.userBasket = userBasket;
    }
}
