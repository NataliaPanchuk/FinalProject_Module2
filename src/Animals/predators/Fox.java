package Animals.predators;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.*;

public class Fox extends Animals {
    public Fox() {
        super("\\uD83E\\uDD8A\\", 8, 2, 2, 1, AnimalSpecies.FOX);
        setMaxAnimal(30);
        setListHunting(List.of(RABBIT, MOUSE, DUCK, CATERPILLAR));
        setListHuntingPresent(List.of(60, 80, 40, 40));
    }
}
