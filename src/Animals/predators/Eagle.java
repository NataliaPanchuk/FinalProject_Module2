package Animals.predators;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.*;

public class Eagle extends Animals {
    public Eagle() {
        super(" \\uD83E\\uDD85\\", 6, 1, 3, 1, AnimalSpecies.EAGLE);
        setMaxAnimal(20);
        setListHunting(List.of(FOX, RABBIT, MOUSE, DUCK));
        setListHuntingPresent(List.of(10, 90, 90, 80));
    }
}
