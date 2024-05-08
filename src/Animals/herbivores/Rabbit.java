package Animals.herbivores;

import Animals.Animals;
import Animals.AnimalSpecies;

import java.util.List;

import static Animals.AnimalSpecies.PLANTS;

public class Rabbit extends Animals {
    public Rabbit() {
        super("\\uD83D\\uDC07\\", 2, 0.45, 2, 1, AnimalSpecies.RABBIT);
        setMaxAnimal(150);
        setListHunting(List.of(PLANTS));
        setListHuntingPresent(List.of(100));
    }
}
