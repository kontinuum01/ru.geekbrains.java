package generalizations;

import java.util.Arrays;
import static generalizations.ArayLists.asList;

public class BoxDemoApp {
    public static void main(String[] args) {
//1 задание...
        Numbers<Integer> intStats = new Numbers<Integer>(1, 2, 3, 4, 5);
        System.out.println("Origin Massive " + Arrays.toString(intStats.getNumbers()));
        System.out.println("Reverse Massive " + Arrays.toString(intStats.reverse()));
        System.out.println("-------------------------------------");

        Numbers<Double> doubleStats = new Numbers<Double>(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println("Origin Massive " + Arrays.toString(doubleStats.getNumbers()));
        System.out.println("Reverse Massive " + Arrays.toString(doubleStats.reverse()));
        System.out.println("--------------------------------------");

        Words<String> stringAccount = new Words<>("A","B","C","D","E");
        System.out.println("Origin Massive " + Arrays.toString(stringAccount.getNumbers()));
        System.out.println("Reverse Massive " + Arrays.toString(stringAccount.reverse()));
        System.out.println("---------------------------------------");
//2 задание...
        System.out.println("Massive converting ArrayList");
        String[] arrayToarrayList = {"A", "B", "C", "D"};
        asList(arrayToarrayList);



    }
}

