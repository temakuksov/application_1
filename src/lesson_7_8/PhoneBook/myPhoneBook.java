package lesson_7_8.PhoneBook;

import java.util.Scanner;

public class myPhoneBook {
    public static void main(String[] args) {
        Contact vasya = new Contact("Vasilij", "89851212121", "vasil@narod.ru");
        Contact marina = new Contact("Marina", "89524656123", "marishka1994@mail.ru");
        Contact kolya = new Contact("Nikolay", "89028012534", "kolyan_2002@gmail.ru");
        Contact natasha = new Contact("Nataliya", "89514632131", "nata_1985@yandex.ru");
        Contact vova = new Contact("Vladimir", "89122601022", "vovchik@post.ru");
        Contact vitya = new Contact("Victor", "899048315473", "vic-tor@host.ru");

        ContactList contactList = new ContactList();

        contactList.addContact(vasya);
        contactList.addContact(marina);
        contactList.addContact(kolya);
        contactList.addContact(natasha);
        contactList.addContact(vova);
        contactList.addContact(vitya);

        contactList.printContactList(contactList.contacts);

        Scanner scan1 = new Scanner(System.in);

        //проверка поиска контакта по имени
        System.out.print("Введите имя контакта для поиска: ");
        String searchName = scan1.nextLine();
        Contact findContact;
        findContact = contactList.searchContact(searchName);
        if (findContact != null) {
            System.out.println("Найден контакт: "+findContact.name+" "+findContact.phoneNumber+" "+findContact.email);
        } else {
            System.out.println("Контакт с именем "+searchName+" не найден!");
        }

        //проверка удаление контакта по имени
        System.out.print("Введите имя контакта для удаления: ");
        String delName = scan1.nextLine();
        contactList.deleteContact(delName);
        contactList.printContactList(contactList.contacts);

        //проверка редактирования контакта
        System.out.print("Введите имя контакта для редактирования: ");
        String editName = scan1.nextLine();
        System.out.print("Введите имя контакта, на которое нужно заменить: ");
        String editNewName = scan1.nextLine();
        contactList.editContact(editName, editNewName);
        contactList.printContactList(contactList.contacts);

        scan1.close();
    }
}
