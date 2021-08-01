package generalizationss;

public class BoxFruitApp {
    public static void main(String args[]) {
//3 задание.
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();

        System.out.println("Add Fruit to boxes ");
        or.addFruit(new Orange(),5);
        or1.addFruit(new Orange(),3);
        ap.addFruit(new Apple(),7);
        ap1.addFruit(new Apple(),4);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("_____________________________________");
        System.out.println("Compare boxes");
        System.out.println("Box 1 compare with box 3: "+or.compare(ap));
        System.out.println("Box 2 compare with box 4: "+or1.compare(ap1));
        System.out.println("_____________________________________");
        or.pourTo(or1);
        ap.pourTo(ap1);
        System.out.println("Pour into another box: ");
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("_____________________________________");
        System.out.println("Compare boxes after pouring");
        System.out.println("Box 1 compare with box 3: "+or.compare(ap));
        System.out.println("Box 2 compare with box 4: "+or1.compare(ap1));

    }
}

