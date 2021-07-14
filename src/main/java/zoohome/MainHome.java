package zoohome;


public class MainHome {

    public static void main(String[] args) {
        Catz[] cats = {
                new Catz("Базилио", 5),
                new Catz("Ученый", 4),
                new Catz("Матросскин", 4),
        };
        Plate plate = new Plate();
        plate.addinPlate(10);
        for (Catz cat : cats) {
            cat.eat(plate);

        }
        plate.getFood();

        for (Catz cat : cats) {
            System.out.println(cat);
        }

    }
}





