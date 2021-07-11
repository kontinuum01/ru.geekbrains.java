package zoo;

public class Animals extends Object {
    protected static int counter;
    protected String color;
    protected String name;


    public Animals(String name, String color) {

        this.color = color;
        this.name = name;
        counter++;

    }

    public static int getCounter() {
        return counter;
    }
    public static void Animalss(){
        System.out.println("Колличество животных на корабле: " + Animals.getCounter());
    }

}



