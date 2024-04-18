package Animals.Herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.CATERPILLAR;
import static Animals.AnimalSpecies.PLANTS;

public class Mouse extends Animals {
    public Mouse() {
        super(" \\uD83D\\uDC01\\", 0.5, 0.1, 1, 1, AnimalSpecies.MOUSE);
        setMaxAnimal(500);
        setListHunting(List.of(CATERPILLAR, PLANTS));
        setListHuntingPresent(List.of(90, 100));
    }
}
