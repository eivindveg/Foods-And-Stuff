package ninja.eivind.ta.eating.persons.traits;

import ninja.eivind.ta.eating.foods.Food;

public interface FoodServer<T extends Food> {

    T serve();
}
