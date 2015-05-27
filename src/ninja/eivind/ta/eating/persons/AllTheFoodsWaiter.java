package ninja.eivind.ta.eating.persons;

import ninja.eivind.ta.eating.foods.Food;
import ninja.eivind.ta.eating.foods.fruits.Apple;
import ninja.eivind.ta.eating.foods.fruits.Citrus;
import ninja.eivind.ta.eating.foods.fruits.Orange;
import ninja.eivind.ta.eating.foods.meats.Beef;
import ninja.eivind.ta.eating.foods.meats.Chicken;
import ninja.eivind.ta.eating.persons.traits.FoodServer;

import java.util.Random;

public class AllTheFoodsWaiter implements FoodServer {

    Random random = new Random();

    Class<? extends Food>[] foods = new Class[] {
            Apple.class, Citrus.class, Beef.class, Chicken.class, Orange.class
    };
    @Override
    public Food serve() {
        int i = random.nextInt(foods.length);
        try {
            return foods[i].newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            return null;
        }
    }
}
