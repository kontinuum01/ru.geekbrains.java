package zoohome;

public class Plate {
    private int food;

    public void addinPlate(int amount) {
        this.food += amount;
        System.out.printf("Миска пополнена на %d ед. еды.\n", amount, this.food);
    }

    public boolean eatfromPlate(int amount) {
        if (this.food < amount) {
            System.out.println("Мало еды.");
            return false;
        }
        this.food -= amount;
        System.out.printf("Еды уменьшилось на %d ед., теперь в миске: %d ед. еды;\n", amount, this.food);
        return true;
    }


    public int getFood() {
        System.out.printf("В миске осталось:  %d  ед. еды.\n", this.food);
        return food;
    }
}

