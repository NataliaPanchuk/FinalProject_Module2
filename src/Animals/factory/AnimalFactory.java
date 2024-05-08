package Animals.factory;

import Animals.AnimalSpecies;
import Animals.Animals;
import Animals.herbivores.*;
import Animals.plants.Plants;
import Animals.predators.*;

public class AnimalFactory {
    public Animals createAnimal(AnimalSpecies type){
        Animals animal =
                switch(type){
                    case BEAR -> new Bear();
                    case BOA -> new Boa();
                    case EAGLE -> new Eagle();
                    case FOX -> new Fox();
                    case WOLF -> new Wolf();
                    case BOAR -> new Boar();
                    case BUFFALO -> new Buffalo();
                    case CATERPILLAR -> new Caterpillar();
                    case DEER -> new Deer();
                    case DUCK -> new Duck();
                    case GOAT -> new Goat();
                    case HORSE -> new Horse();
                    case MOUSE -> new Mouse();
                    case RABBIT -> new Rabbit();
                    case SHEEP -> new Sheep();
                    case PLANTS -> new Plants();
                    default -> null;
                };
        return animal;
    }
}
