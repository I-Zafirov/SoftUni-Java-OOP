package T11Polymorphism.exercise.E03WildFarm.Animal;

import T11Polymorphism.exercise.E03WildFarm.Food.Food;
import T11Polymorphism.exercise.E03WildFarm.Food.Vegetable;
import T11Polymorphism.exercise.E03WildFarm.Messages;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(Messages.TIGER_SOUND);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            throw new IllegalArgumentException(String.format(Messages.WRONG_FOOD, getAnimalType() + "s"));
        }
        super.eat(food);
    }
}
