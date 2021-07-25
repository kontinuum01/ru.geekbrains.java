package collectoon;

import java.util.LinkedHashMap;

public class NumberBook {
    public static void main(String[] args) {
        LinkedHashMap<String, String> nb = new LinkedHashMap<>();

        //добавляем запись
        nb.put("Ivanov", "9291367472");
        nb.put("Ekimov", "9266343247");
        nb.put("Petrenko", "9773646464");
        nb.put("Protasov", "9606347623");
        nb.put("Petrov", "9226347373");
        nb.put("Petrov", "9226346372");


        //Поиск по фамилии
        String result = nb.get("Petrov");
        if (result == nb.get("Petrov"))
            System.out.println("Number: " + result);
        else if (result == null) {
            System.out.println("not found");

        }
    }
}









