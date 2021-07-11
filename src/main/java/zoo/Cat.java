package zoo;
import java.util.Random;

public class Cat extends Animals {
    static Random random = new Random();
    int x = random.nextInt(200);

    public Cat(String name, String color) {
        super(name, color);

    }

    public void voiceact() {
        System.out.printf("%s кот %s бежит; \n", this.color, this.name);
    }

    public void catrunning() {
        System.out.println("Барсик пробежал " + x + " метра/ов;");
    }
    public  void catswimming(){
       System.out.println("Барсик не умеет плавать.");
    }
}
