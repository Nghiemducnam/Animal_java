package nam.org;

import edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    String makeSound() {
        return "cục tác...cục tác ";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
