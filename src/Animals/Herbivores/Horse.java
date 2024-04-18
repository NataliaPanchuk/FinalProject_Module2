package Animals.Herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.PLANTS;

public class Horse extends Animals {
    public Horse() {
        super("\\uD83D\\uDC0E\\", 400, 60, 4, 1, AnimalSpecies.HORSE);
        setMaxAnimal(20);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of(100));
    }
}
