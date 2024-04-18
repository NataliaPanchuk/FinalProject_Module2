package Animals.Herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.PLANTS;


public class Caterpillar extends Animals {
    public Caterpillar() {
        super(" \\uD83D\\uDC1B\\", 0.01, 0, 0, 1, AnimalSpecies.CATERPILLAR);
        setMaxAnimal(100);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of(100));
    }
}
