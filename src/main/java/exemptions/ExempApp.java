package exemptions;


public class ExempApp {
    public static void main(String[] args) {


        String[][] arr1;
        arr1 = new String[][]{
                {"1", "2", "4", "4", "5"},
                {"1", "2", "3", "4", "7"},
                {"1", "4", "4", "1", "3"},
                {"1", "2", "3", "4", "6"},
                {"5", "9", "1", "0", "4"}
        };
        String[][] arr2;
        arr2 = new String[][]{
                {"1", "2", "3", "5"},
                {"1", "2", "3", "4"},
                {"1", "2", "5", "1"},
                {"1", "2", "3", "н"}
        };
        String[][] arr3;
        arr3 = new String[][]{
                {"1", "2", "3", "5"},
                {"1", "2", "3", "4"},
                {"2", "2", "5", "1"},
                {"1", "2", "3", "7"}

        };

        try {
            Exemp.sum(arr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            Exemp.sum(arr2);
        } catch (Exception | MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            Exemp.sum(arr3);
        } catch (Exception | MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}

