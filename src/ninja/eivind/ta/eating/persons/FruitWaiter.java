package ninja.eivind.ta.eating.persons;

import ninja.eivind.ta.eating.foods.fruits.Apple;
import ninja.eivind.ta.eating.foods.fruits.Citrus;
import ninja.eivind.ta.eating.foods.fruits.Fruit;
import ninja.eivind.ta.eating.persons.traits.FoodServer;

import java.util.Random;

public class FruitWaiter implements FoodServer<Fruit> {

    Random random = new Random();

    @Override
    public Fruit serve() {
        if(random.nextBoolean()) {
            return new Apple();
        } else {
            return new Citrus();
        }
    }
}
