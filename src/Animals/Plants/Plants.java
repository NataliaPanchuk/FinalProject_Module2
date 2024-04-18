package Animals.Plants;

import Animals.Animals;
import Animals.AnimalSpecies;

public class Plants extends Animals {
    public Plants() {
        super("\\uD83C\\uDF3E\\", 1, 0, 0, 1, AnimalSpecies.PLANTS);
        setMaxAnimal(200);
        setMove(0);
    }
}
