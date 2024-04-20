package Animals.herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.PLANTS;

public class Goat extends Animals {
    public Goat() {
        super("\\uD83D\\uDC10\\", 60, 10, 3, 1, AnimalSpecies.GOAT);
        setMaxAnimal(140);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of(100));
    }
}
