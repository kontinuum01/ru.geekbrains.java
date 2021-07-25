package collectoon;

import java.util.*;

public class Methods {
    private static LinkedHashMap<String, String> pb = new LinkedHashMap<>();
//метод добавления в книгу
    public static void addpb(String name, String phone) {
        pb.put(name, phone);
    }

//метод поиска по фамилии
    public static void searhname(String name) {
        String result = pb.get(name);
        if (result == null ) System.out.println("not found");
         else if (result == pb.get(name))
            System.out.println("number: "+ result);

        }
    }


















