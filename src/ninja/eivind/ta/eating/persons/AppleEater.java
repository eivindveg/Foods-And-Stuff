package ninja.eivind.ta.eating.persons;

import ninja.eivind.ta.eating.foods.Food;
import ninja.eivind.ta.eating.foods.fruits.Apple;
import ninja.eivind.ta.eating.persons.traits.FruitEater;

public class AppleEater implements FruitEater<Apple> {
    @Override
    public boolean canEat(final Food food) {
        return food instanceof Apple;
    }
}
