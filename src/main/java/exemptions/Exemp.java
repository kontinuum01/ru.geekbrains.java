package exemptions;

public class Exemp extends Throwable {

    public static int SIZE = 4;

    public static int sum(String[][]arr)
            throws MyArrayDataException, MyArraySizeException {

        if (arr.length != SIZE) throw new MyArraySizeException("Create arrays size 4*4");
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            if (arr[y].length != SIZE) throw new MyArraySizeException("Create arrays size 4*4");
            for (int x = 0; x < arr[y].length; x++) {
                try {
                    sum += Integer.parseInt(arr[y][x]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В яйчеке [%d][%d] отсутствует число.", x+1, y+1 ));
                }
            }
        }
        System.out.println(sum);
        return sum;
    }
}
