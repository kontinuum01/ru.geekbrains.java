package zoo;
import java.util.Random;

public class Dog extends Animals {
    static Random random = new Random();
    int x = random.nextInt(500);
    int y = random.nextInt(10);

    public Dog(String name, String color) {
        super(name, color);

    }
    public void voiceact() {
        System.out.printf("%s пес %s бежит и плывет; \n", this.color, this.name);
    }

    public void dogrunning() {
        System.out.println("Шарик пробежал " + x + " метра/ов;");
    }

    public void dogswimming() {
        System.out.println("Шарик проплыл " + y + " метра/ов.");

    }
}