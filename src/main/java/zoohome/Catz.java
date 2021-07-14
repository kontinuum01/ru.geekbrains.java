package zoohome;

public class Catz {
    private String name;
    private int appetite;
    private boolean fullness;


    public Catz(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public boolean eat(Plate plate) {
        if (plate.eatfromPlate(appetite)) {
            System.out.printf("Кот %s съел %d ед. еды.\n", this.name, this.appetite);
            this.fullness = true;
            return true;
        }
        System.out.printf("Коту %s не хватает еды\n", this.name);
        return false;
    }

    public String toString(){
        return "кот '" +  name + '\''+ ", сытость = " + fullness;
    }

}





