package generalizations;

public class Numbers<T extends Number> {
    private T[] number;

    public Numbers(T... number) {
        this.number = number;
    }


    public T[] getNumbers() {
        for (T element : number) ;
        for (int i = 0; i < number.length; i++) ;
        return number;
    }
// реверс элементов в массиве
    public T[] reverse() {
            for (T element : number) {
                for (int i = 0; i < number.length ; i++) {
                    T rev = number[0];
                    number[0] = number[1];
                    number[1] = rev;
                }
            }
            return number;
    }

    }





























