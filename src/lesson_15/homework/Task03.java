package lesson_15.homework;

import java.util.ArrayList;

public class Task03 {
    public static void fix(ArrayList<String> strList) {
        for (int i = 0; i < strList.size(); i++){
            if (strList.get(i).contains("р") && !strList.get(i).contains("л")) {
                strList.remove(i);
            }
            if (strList.get(i).contains("л")) {
                strList.add(i, strList.get(i));
            }
        }
    }
    public static void main(String[] args) {
        //  Задача 3:
        //  1. Создай список слов, заполни его самостоятельно.
        //  2. Метод fix должен:
        //  2.1. удалять из списка строк все слова, содержащие букву "р"
        //  2.2. удваивать все слова содержащие букву "л".
        //  2.3. если слово содержит и букву "р" и букву "л", то оставить это слово без изменений.
        //  2.4. с другими словами ничего не делать.

        ArrayList<String> strings = new ArrayList<>();
        strings.add("узор");
        strings.add("стоп");
        strings.add("ралли");
        strings.add("зола");
        strings.add("акция");
        strings.add("рация");

        fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

}
