package generalizations;

import java.util.Arrays;
import java.util.ArrayList;

class ArayLists {

    public static <T> void asList(T[]arr) {

        //Преобразование массива в ArrayList
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println(alt);

    }
}





