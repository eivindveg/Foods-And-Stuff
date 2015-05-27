package ninja.eivind.ta.eating.foods;

public abstract class Food implements Nutritious {

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
