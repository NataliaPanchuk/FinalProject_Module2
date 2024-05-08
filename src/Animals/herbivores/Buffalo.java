package Animals.herbivores;

import Animals.AnimalSpecies;
import Animals.Animals;

import java.util.List;

import static Animals.AnimalSpecies.PLANTS;

public class Buffalo extends Animals {
    public Buffalo() {
        super("\\uD83D\\uDC03\\", 700, 100, 3, 1, AnimalSpecies.BUFFALO);
        setMaxAnimal(10);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of(100));

    }
}
