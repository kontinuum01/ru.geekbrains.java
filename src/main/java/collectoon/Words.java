package collectoon;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Words {
    public static void main(String[] args) {
        Set<String> words = new LinkedHashSet<>((Arrays.asList("Always", "Never", "Kat", "Wonder", "Never", "Hello", "Storm", "Kat","Devil","Book","Kat","Desk")));
        words.add("Never");
        words.add("Phone");

             System.out.println(words);
             System.out.println(words.contains("Devil"));
             System.out.println("Unique words: " + words.size());


            }

        }




