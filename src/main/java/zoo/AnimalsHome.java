package zoo;


public class AnimalsHome {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "черный");
        Dog dog = new Dog("Шарик", "белый");
        Parrot parrot = new Parrot("Кеша","пестрый");

        cat.voiceact();
        cat.catrunning();
        cat.catswimming();
        dog.voiceact();
        dog.dogrunning();
        dog.dogswimming();
        parrot.voiceact();
        parrot.parrotfluing();
        parrot.parrotvoice();
        Animals.Animalss();

    }
}
