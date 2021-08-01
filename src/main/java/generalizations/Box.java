package generalizations;

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> box = new ArrayList<>();

    //Добавляем фрукты в коробку
    public void addFruit(T fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            box.add(fruit);
        }
    }

    //Высчитываем массу коробки
    public float getWeight() {
        float weight = 0.0f;
        for (T o : box) {
            weight += o.getWeight();
        }
        return weight;
    }

    // Сравниваем коробки
    public boolean compare(Box anotherBox) {
        if (getWeight() == anotherBox.getWeight())
            return true;
        return false;
    }

    //Пересыпаем фрукты
    public void pourTo(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }
}





