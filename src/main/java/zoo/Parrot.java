package zoo;
import java.util.Random;

public class Parrot extends Animals {
    static Random random = new Random();
    int x = random.nextInt(10);
    String[] words = {"Попка дурак", "Свистать всех навверх","Суши весла","Лови шляпу капитана","Тащи бочку с ромом"};
    String wordsparrot = words[random.nextInt(words.length)];

    public Parrot(String name, String color) {
        super(name, color);

    }
    public void voiceact() {
        System.out.printf("%s попугай %s летает и говорит; \n", this.color, this.name);
    }

    public void parrotfluing() {
        System.out.println("Кеша пролетел " + x + " метра/ов;");
    }

    public void parrotvoice() {
        System.out.println("Кеша говорит:" + wordsparrot + ".");

    }
}