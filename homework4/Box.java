package homework4;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    // Нужно реализовать хранение фрукто в коробке Box

    private ArrayList<T> fruitBox;

    Box() {
        this.fruitBox = new ArrayList<T>();
    }

    public void add(T fruit) {
        fruitBox.add(fruit);
    }

    public double getWeight() {
        double weight = 0;
        for (T fruit : fruitBox) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void moveTo(Box<? super T> anotherBox) {
        for (T fruit : this.fruitBox) {
            anotherBox.add(fruit);
        }
        this.fruitBox.clear();
    }
}