package ninja.eivind.ta.eating.persons.traits;

import ninja.eivind.ta.eating.foods.Food;

public interface Eater<T extends Food> {

    boolean canEat(Food food);

}
