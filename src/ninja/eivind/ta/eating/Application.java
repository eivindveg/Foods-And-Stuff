package ninja.eivind.ta.eating;

import ninja.eivind.ta.eating.foods.Food;
import ninja.eivind.ta.eating.persons.AllTheFoodsWaiter;
import ninja.eivind.ta.eating.persons.SourFruitEater;
import ninja.eivind.ta.eating.persons.traits.Eater;
import ninja.eivind.ta.eating.persons.traits.FoodServer;

public class Application {

    public static void main(String[] args) {
        FoodServer waiter = new AllTheFoodsWaiter();
        Eater eater = new SourFruitEater();


        for (int i = 0; i < 10; i++) {
            Food serve = waiter.serve();
            System.out.println("The eater can eat " + serve + ":" + " " + eater.canEat(serve));
        }
    }
}
