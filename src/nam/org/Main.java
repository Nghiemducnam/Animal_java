package nam.org;
import Fruit.Fruit;
import edible.Edible;
import Fruit.Apple;
import Fruit.Orange;

public class Main {

    public static void main(String[] args) {
        Animal animalsList[] = new Animal[2];
        animalsList[0] = new Chicken();
        animalsList[1] = new Tiger();
        for (Animal animal: animalsList){
            System.out.println(animal.makeSound());

            if(animal instanceof Chicken){
                Edible edibler = (Chicken)animal;
                System.out.println(edibler.howToEat());
            }
        }

        Fruit fruitList[] = new Fruit[2];
        fruitList[0] = new Apple();
        fruitList[1] = new Orange();
        for (Fruit fruit:fruitList ){
            System.out.println(fruit.howToEat());
        }
    }
}
