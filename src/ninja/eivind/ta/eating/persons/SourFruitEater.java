package ninja.eivind.ta.eating.persons;

import ninja.eivind.ta.eating.foods.Food;
import ninja.eivind.ta.eating.foods.fruits.Fruit;
import ninja.eivind.ta.eating.foods.taste.Sour;
import ninja.eivind.ta.eating.persons.traits.Eater;

public class SourFruitEater implements Eater<Fruit>{
    @Override
    public boolean canEat(final Food food) {
        return food instanceof Fruit && food instanceof Sour;
    }
}
