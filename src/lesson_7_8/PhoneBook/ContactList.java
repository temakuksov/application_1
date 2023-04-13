package lesson_7_8.PhoneBook;

public class ContactList {
    // поля
    Contact[] contacts = new Contact[100];

    // конструктор
    public ContactList() {
    }

    // методы
    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    public Contact searchContact(String nameOfContact) {
        int i = 0;
        boolean unSearched = true;
        while (contacts[i] != null) {
            if (contacts[i].name.equalsIgnoreCase(nameOfContact)) {
                return contacts[i];
            }
            i++;
        }
        return null;
    }

    public void deleteContact(String nameOfContact) {
        int i = 0;
        int s = 0;
        while (contacts[i] != null) {
            if (contacts[i].name.equalsIgnoreCase(nameOfContact)) {
                contacts[i] = null;
                s = i;
            }
            i++;
        }
        // сдвигаем все контакты к началу, чтобы все не пустые контакты были в начале массива
        for (int j = s + 1; j < contacts.length; j++) {
            if (contacts[j - 1] == null && contacts[j] != null) {
                contacts[j - 1] = contacts[j];
                contacts[j] = null;
            }
        }
    }

    public Contact editContact(String searchName, String newNameOfContact) {
        int i = 0;
        while (contacts[i] != null) {
            if (contacts[i].getName().equalsIgnoreCase(searchName)) {
                contacts[i].setName(newNameOfContact);
                return contacts[i];
            }
            i++;
        }
        return null;
    }

    // дополнительный метод вывода в консоль всего списка контактов
    public void printContactList(Contact[] contacts) {
        System.out.println("--- Список контактов:\nИмя\t\tТелефон\t\tэл.почта");
        int i = 0;
        while (contacts[i] != null) {
            System.out.println(contacts[i].name + "\t" + contacts[i].phoneNumber + "\t" + contacts[i].email);
            i++;
        }
        System.out.println();
    }

}
